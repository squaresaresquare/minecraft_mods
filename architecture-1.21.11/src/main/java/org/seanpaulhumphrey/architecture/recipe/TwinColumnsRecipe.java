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

public record TwinColumnsRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TwinColumnsRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TwinColumnsRecipe

    @Override
    public boolean matches(TwinColumnsRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TwinColumnsRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TwinColumnsRecipeInput>> getSerializer() {
        return ModRecipes.TWIN_COLUMNS_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TwinColumnsRecipeInput>> getType() {
        return ModRecipes.TWIN_COLUMNS_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TwinColumnsRecipe> {
        public static final MapCodec<TwinColumnsRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TwinColumnsRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TwinColumnsRecipe::output)
        ).apply(inst, TwinColumnsRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TwinColumnsRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TwinColumnsRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TwinColumnsRecipe::output,
                        TwinColumnsRecipe::new);

        @Override
        public MapCodec<TwinColumnsRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TwinColumnsRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}