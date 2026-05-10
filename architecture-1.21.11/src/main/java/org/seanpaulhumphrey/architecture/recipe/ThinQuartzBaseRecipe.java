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

public record ThinQuartzBaseRecipe(Ingredient inputItem, ItemStack output) implements Recipe<ThinQuartzBaseRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new ThinQuartzBaseRecipe

    @Override
    public boolean matches(ThinQuartzBaseRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(ThinQuartzBaseRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<ThinQuartzBaseRecipeInput>> getSerializer() {
        return ModRecipes.THIN_QUARTZ_BASE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<ThinQuartzBaseRecipeInput>> getType() {
        return ModRecipes.THIN_QUARTZ_BASE_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<ThinQuartzBaseRecipe> {
        public static final MapCodec<ThinQuartzBaseRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(ThinQuartzBaseRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(ThinQuartzBaseRecipe::output)
        ).apply(inst, ThinQuartzBaseRecipe::new));

        public static final PacketCodec<RegistryByteBuf, ThinQuartzBaseRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, ThinQuartzBaseRecipe::inputItem,
                        ItemStack.PACKET_CODEC, ThinQuartzBaseRecipe::output,
                        ThinQuartzBaseRecipe::new);

        @Override
        public MapCodec<ThinQuartzBaseRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, ThinQuartzBaseRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}