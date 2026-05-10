package org.seanpaulhumphrey.architecture.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeBookCategories;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public record TripleWindowRightBottomRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowRightBottomRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowRightBottomRecipe

    @Override
    public boolean matches(TripleWindowRightBottomRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowRightBottomRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowRightBottomRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_RIGHT_BOTTOM_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowRightBottomRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_RIGHT_BOTTOM_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowRightBottomRecipe> {
        public static final MapCodec<TripleWindowRightBottomRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowRightBottomRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowRightBottomRecipe::output)
        ).apply(inst, TripleWindowRightBottomRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowRightBottomRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowRightBottomRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowRightBottomRecipe::output,
                        TripleWindowRightBottomRecipe::new);

        @Override
        public MapCodec<TripleWindowRightBottomRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowRightBottomRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}