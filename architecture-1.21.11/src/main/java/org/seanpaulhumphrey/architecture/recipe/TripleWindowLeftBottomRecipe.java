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

public record TripleWindowLeftBottomRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowLeftBottomRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowLeftBottomRecipe

    @Override
    public boolean matches(TripleWindowLeftBottomRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowLeftBottomRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowLeftBottomRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_LEFT_BOTTOM_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowLeftBottomRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_LEFT_BOTTOM_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowLeftBottomRecipe> {
        public static final MapCodec<TripleWindowLeftBottomRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowLeftBottomRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowLeftBottomRecipe::output)
        ).apply(inst, TripleWindowLeftBottomRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowLeftBottomRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowLeftBottomRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowLeftBottomRecipe::output,
                        TripleWindowLeftBottomRecipe::new);

        @Override
        public MapCodec<TripleWindowLeftBottomRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowLeftBottomRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    