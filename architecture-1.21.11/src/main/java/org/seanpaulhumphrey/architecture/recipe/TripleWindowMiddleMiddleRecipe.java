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

public record TripleWindowMiddleMiddleRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowMiddleMiddleRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowMiddleMiddleRecipe

    @Override
    public boolean matches(TripleWindowMiddleMiddleRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowMiddleMiddleRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowMiddleMiddleRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_MIDDLE_MIDDLE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowMiddleMiddleRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_MIDDLE_MIDDLE_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowMiddleMiddleRecipe> {
        public static final MapCodec<TripleWindowMiddleMiddleRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowMiddleMiddleRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowMiddleMiddleRecipe::output)
        ).apply(inst, TripleWindowMiddleMiddleRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowMiddleMiddleRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowMiddleMiddleRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowMiddleMiddleRecipe::output,
                        TripleWindowMiddleMiddleRecipe::new);

        @Override
        public MapCodec<TripleWindowMiddleMiddleRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowMiddleMiddleRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}