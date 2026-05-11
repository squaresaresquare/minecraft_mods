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

public record TripleWindowTopArch22Recipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowTopArch22RecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowTopArch22Recipe

    @Override
    public boolean matches(TripleWindowTopArch22RecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowTopArch22RecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowTopArch22RecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_2_2_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowTopArch22RecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_2_2_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowTopArch22Recipe> {
        public static final MapCodec<TripleWindowTopArch22Recipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowTopArch22Recipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowTopArch22Recipe::output)
        ).apply(inst, TripleWindowTopArch22Recipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowTopArch22Recipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowTopArch22Recipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowTopArch22Recipe::output,
                        TripleWindowTopArch22Recipe::new);

        @Override
        public MapCodec<TripleWindowTopArch22Recipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowTopArch22Recipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    