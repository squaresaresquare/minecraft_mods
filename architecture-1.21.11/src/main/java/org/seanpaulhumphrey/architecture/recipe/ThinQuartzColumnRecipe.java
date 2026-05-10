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

public record ThinQuartzColumnRecipe(Ingredient inputItem, ItemStack output) implements Recipe<ThinQuartzColumnRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new ThinQuartzColumnRecipe

    @Override
    public boolean matches(ThinQuartzColumnRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(ThinQuartzColumnRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<ThinQuartzColumnRecipeInput>> getSerializer() {
        return ModRecipes.THIN_QUARTZ_COLUMN_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<ThinQuartzColumnRecipeInput>> getType() {
        return ModRecipes.THIN_QUARTZ_COLUMN_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<ThinQuartzColumnRecipe> {
        public static final MapCodec<ThinQuartzColumnRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(ThinQuartzColumnRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(ThinQuartzColumnRecipe::output)
        ).apply(inst, ThinQuartzColumnRecipe::new));

        public static final PacketCodec<RegistryByteBuf, ThinQuartzColumnRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, ThinQuartzColumnRecipe::inputItem,
                        ItemStack.PACKET_CODEC, ThinQuartzColumnRecipe::output,
                        ThinQuartzColumnRecipe::new);

        @Override
        public MapCodec<ThinQuartzColumnRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, ThinQuartzColumnRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}