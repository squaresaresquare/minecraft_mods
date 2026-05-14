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

public record TripleWindowTopCapRightRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowTopCapRightRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowTopCapRightRecipe

    @Override
    public boolean matches(TripleWindowTopCapRightRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowTopCapRightRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowTopCapRightRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_TOP_CAP_RIGHT_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowTopCapRightRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_TOP_CAP_RIGHT_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowTopCapRightRecipe> {
        public static final MapCodec<TripleWindowTopCapRightRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowTopCapRightRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowTopCapRightRecipe::output)
        ).apply(inst, TripleWindowTopCapRightRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowTopCapRightRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowTopCapRightRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowTopCapRightRecipe::output,
                        TripleWindowTopCapRightRecipe::new);

        @Override
        public MapCodec<TripleWindowTopCapRightRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowTopCapRightRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    