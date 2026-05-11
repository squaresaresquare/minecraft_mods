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

public record TwinColumnBaseRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TwinColumnBaseRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TwinColumnBaseRecipe

    @Override
    public boolean matches(TwinColumnBaseRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TwinColumnBaseRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TwinColumnBaseRecipeInput>> getSerializer() {
        return ModRecipes.TWIN_COLUMN_BASE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TwinColumnBaseRecipeInput>> getType() {
        return ModRecipes.TWIN_COLUMN_BASE_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TwinColumnBaseRecipe> {
        public static final MapCodec<TwinColumnBaseRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TwinColumnBaseRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TwinColumnBaseRecipe::output)
        ).apply(inst, TwinColumnBaseRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TwinColumnBaseRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TwinColumnBaseRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TwinColumnBaseRecipe::output,
                        TwinColumnBaseRecipe::new);

        @Override
        public MapCodec<TwinColumnBaseRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TwinColumnBaseRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    