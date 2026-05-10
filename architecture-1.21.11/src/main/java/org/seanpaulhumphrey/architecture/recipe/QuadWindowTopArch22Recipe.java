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

public record QuadWindowTopArch22Recipe(Ingredient inputItem, ItemStack output) implements Recipe<QuadWindowTopArch22RecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new QuadWindowTopArch22Recipe

    @Override
    public boolean matches(QuadWindowTopArch22RecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(QuadWindowTopArch22RecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<QuadWindowTopArch22RecipeInput>> getSerializer() {
        return ModRecipes.QUAD_WINDOW_TOP_ARCH_2_2_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<QuadWindowTopArch22RecipeInput>> getType() {
        return ModRecipes.QUAD_WINDOW_TOP_ARCH_2_2_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<QuadWindowTopArch22Recipe> {
        public static final MapCodec<QuadWindowTopArch22Recipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(QuadWindowTopArch22Recipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(QuadWindowTopArch22Recipe::output)
        ).apply(inst, QuadWindowTopArch22Recipe::new));

        public static final PacketCodec<RegistryByteBuf, QuadWindowTopArch22Recipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, QuadWindowTopArch22Recipe::inputItem,
                        ItemStack.PACKET_CODEC, QuadWindowTopArch22Recipe::output,
                        QuadWindowTopArch22Recipe::new);

        @Override
        public MapCodec<QuadWindowTopArch22Recipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, QuadWindowTopArch22Recipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}