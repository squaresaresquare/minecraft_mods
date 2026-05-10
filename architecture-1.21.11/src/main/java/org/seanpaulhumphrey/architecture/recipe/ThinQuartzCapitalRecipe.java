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

public record ThinQuartzCapitalRecipe(Ingredient inputItem, ItemStack output) implements Recipe<ThinQuartzCapitalRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new ThinQuartzCapitalRecipe

    @Override
    public boolean matches(ThinQuartzCapitalRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(ThinQuartzCapitalRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<ThinQuartzCapitalRecipeInput>> getSerializer() {
        return ModRecipes.THIN_QUARTZ_CAPITAL_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<ThinQuartzCapitalRecipeInput>> getType() {
        return ModRecipes.THIN_QUARTZ_CAPITAL_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<ThinQuartzCapitalRecipe> {
        public static final MapCodec<ThinQuartzCapitalRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(ThinQuartzCapitalRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(ThinQuartzCapitalRecipe::output)
        ).apply(inst, ThinQuartzCapitalRecipe::new));

        public static final PacketCodec<RegistryByteBuf, ThinQuartzCapitalRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, ThinQuartzCapitalRecipe::inputItem,
                        ItemStack.PACKET_CODEC, ThinQuartzCapitalRecipe::output,
                        ThinQuartzCapitalRecipe::new);

        @Override
        public MapCodec<ThinQuartzCapitalRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, ThinQuartzCapitalRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}