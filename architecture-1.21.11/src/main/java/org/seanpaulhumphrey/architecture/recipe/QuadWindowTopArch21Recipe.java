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

public record QuadWindowTopArch21Recipe(Ingredient inputItem, ItemStack output) implements Recipe<QuadWindowTopArch21RecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new QuadWindowTopArch21Recipe

    @Override
    public boolean matches(QuadWindowTopArch21RecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(QuadWindowTopArch21RecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<QuadWindowTopArch21RecipeInput>> getSerializer() {
        return ModRecipes.QUAD_WINDOW_TOP_ARCH_2_1_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<QuadWindowTopArch21RecipeInput>> getType() {
        return ModRecipes.QUAD_WINDOW_TOP_ARCH_2_1_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<QuadWindowTopArch21Recipe> {
        public static final MapCodec<QuadWindowTopArch21Recipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(QuadWindowTopArch21Recipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(QuadWindowTopArch21Recipe::output)
        ).apply(inst, QuadWindowTopArch21Recipe::new));

        public static final PacketCodec<RegistryByteBuf, QuadWindowTopArch21Recipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, QuadWindowTopArch21Recipe::inputItem,
                        ItemStack.PACKET_CODEC, QuadWindowTopArch21Recipe::output,
                        QuadWindowTopArch21Recipe::new);

        @Override
        public MapCodec<QuadWindowTopArch21Recipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, QuadWindowTopArch21Recipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}