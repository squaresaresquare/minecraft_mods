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

public record TripleWindowTopCapMiddleRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowTopCapMiddleRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowTopCapMiddleRecipe

    @Override
    public boolean matches(TripleWindowTopCapMiddleRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowTopCapMiddleRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowTopCapMiddleRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_TOP_CAP_MIDDLE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowTopCapMiddleRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_TOP_CAP_MIDDLE_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowTopCapMiddleRecipe> {
        public static final MapCodec<TripleWindowTopCapMiddleRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowTopCapMiddleRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowTopCapMiddleRecipe::output)
        ).apply(inst, TripleWindowTopCapMiddleRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowTopCapMiddleRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowTopCapMiddleRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowTopCapMiddleRecipe::output,
                        TripleWindowTopCapMiddleRecipe::new);

        @Override
        public MapCodec<TripleWindowTopCapMiddleRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowTopCapMiddleRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}