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

public record TripleWindowTopArch12Recipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowTopArch12RecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowTopArch12Recipe

    @Override
    public boolean matches(TripleWindowTopArch12RecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowTopArch12RecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowTopArch12RecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_1_2_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowTopArch12RecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_1_2_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowTopArch12Recipe> {
        public static final MapCodec<TripleWindowTopArch12Recipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowTopArch12Recipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowTopArch12Recipe::output)
        ).apply(inst, TripleWindowTopArch12Recipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowTopArch12Recipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowTopArch12Recipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowTopArch12Recipe::output,
                        TripleWindowTopArch12Recipe::new);

        @Override
        public MapCodec<TripleWindowTopArch12Recipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowTopArch12Recipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}