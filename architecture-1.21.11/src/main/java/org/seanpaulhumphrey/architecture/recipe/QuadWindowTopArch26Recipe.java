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

public record QuadWindowTopArch26Recipe(Ingredient inputItem, ItemStack output) implements Recipe<QuadWindowTopArch26RecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new QuadWindowTopArch26Recipe

    @Override
    public boolean matches(QuadWindowTopArch26RecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(QuadWindowTopArch26RecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<QuadWindowTopArch26RecipeInput>> getSerializer() {
        return ModRecipes.QUAD_WINDOW_TOP_ARCH_2_6_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<QuadWindowTopArch26RecipeInput>> getType() {
        return ModRecipes.QUAD_WINDOW_TOP_ARCH_2_6_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<QuadWindowTopArch26Recipe> {
        public static final MapCodec<QuadWindowTopArch26Recipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(QuadWindowTopArch26Recipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(QuadWindowTopArch26Recipe::output)
        ).apply(inst, QuadWindowTopArch26Recipe::new));

        public static final PacketCodec<RegistryByteBuf, QuadWindowTopArch26Recipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, QuadWindowTopArch26Recipe::inputItem,
                        ItemStack.PACKET_CODEC, QuadWindowTopArch26Recipe::output,
                        QuadWindowTopArch26Recipe::new);

        @Override
        public MapCodec<QuadWindowTopArch26Recipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, QuadWindowTopArch26Recipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    