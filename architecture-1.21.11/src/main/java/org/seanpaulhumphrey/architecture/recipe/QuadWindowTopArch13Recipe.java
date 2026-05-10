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

public record QuadWindowTopArch13Recipe(Ingredient inputItem, ItemStack output) implements Recipe<QuadWindowTopArch13RecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new QuadWindowTopArch13Recipe

    @Override
    public boolean matches(QuadWindowTopArch13RecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(QuadWindowTopArch13RecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<QuadWindowTopArch13RecipeInput>> getSerializer() {
        return ModRecipes.QUAD_WINDOW_TOP_ARCH_1_3_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<QuadWindowTopArch13RecipeInput>> getType() {
        return ModRecipes.QUAD_WINDOW_TOP_ARCH_1_3_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<QuadWindowTopArch13Recipe> {
        public static final MapCodec<QuadWindowTopArch13Recipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(QuadWindowTopArch13Recipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(QuadWindowTopArch13Recipe::output)
        ).apply(inst, QuadWindowTopArch13Recipe::new));

        public static final PacketCodec<RegistryByteBuf, QuadWindowTopArch13Recipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, QuadWindowTopArch13Recipe::inputItem,
                        ItemStack.PACKET_CODEC, QuadWindowTopArch13Recipe::output,
                        QuadWindowTopArch13Recipe::new);

        @Override
        public MapCodec<QuadWindowTopArch13Recipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, QuadWindowTopArch13Recipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}