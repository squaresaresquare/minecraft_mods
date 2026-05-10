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

public record TripleWindowMiddleLeftRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowMiddleLeftRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowMiddleLeftRecipe

    @Override
    public boolean matches(TripleWindowMiddleLeftRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowMiddleLeftRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowMiddleLeftRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_MIDDLE_LEFT_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowMiddleLeftRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_MIDDLE_LEFT_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowMiddleLeftRecipe> {
        public static final MapCodec<TripleWindowMiddleLeftRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowMiddleLeftRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowMiddleLeftRecipe::output)
        ).apply(inst, TripleWindowMiddleLeftRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowMiddleLeftRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowMiddleLeftRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowMiddleLeftRecipe::output,
                        TripleWindowMiddleLeftRecipe::new);

        @Override
        public MapCodec<TripleWindowMiddleLeftRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowMiddleLeftRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}