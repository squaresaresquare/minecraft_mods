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

public record TwinColumnCapitalRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TwinColumnCapitalRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TwinColumnCapitalRecipe

    @Override
    public boolean matches(TwinColumnCapitalRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TwinColumnCapitalRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TwinColumnCapitalRecipeInput>> getSerializer() {
        return ModRecipes.TWIN_COLUMN_CAPITAL_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TwinColumnCapitalRecipeInput>> getType() {
        return ModRecipes.TWIN_COLUMN_CAPITAL_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TwinColumnCapitalRecipe> {
        public static final MapCodec<TwinColumnCapitalRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TwinColumnCapitalRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TwinColumnCapitalRecipe::output)
        ).apply(inst, TwinColumnCapitalRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TwinColumnCapitalRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TwinColumnCapitalRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TwinColumnCapitalRecipe::output,
                        TwinColumnCapitalRecipe::new);

        @Override
        public MapCodec<TwinColumnCapitalRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TwinColumnCapitalRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    