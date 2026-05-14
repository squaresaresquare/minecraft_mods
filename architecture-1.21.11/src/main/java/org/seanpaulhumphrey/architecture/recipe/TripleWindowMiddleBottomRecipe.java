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

public record TripleWindowMiddleBottomRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowMiddleBottomRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowMiddleBottomRecipe

    @Override
    public boolean matches(TripleWindowMiddleBottomRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowMiddleBottomRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowMiddleBottomRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_MIDDLE_BOTTOM_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowMiddleBottomRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_MIDDLE_BOTTOM_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowMiddleBottomRecipe> {
        public static final MapCodec<TripleWindowMiddleBottomRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowMiddleBottomRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowMiddleBottomRecipe::output)
        ).apply(inst, TripleWindowMiddleBottomRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowMiddleBottomRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowMiddleBottomRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowMiddleBottomRecipe::output,
                        TripleWindowMiddleBottomRecipe::new);

        @Override
        public MapCodec<TripleWindowMiddleBottomRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowMiddleBottomRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    