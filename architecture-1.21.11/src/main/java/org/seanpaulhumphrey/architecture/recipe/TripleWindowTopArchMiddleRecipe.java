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

public record TripleWindowTopArchMiddleRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowTopArchMiddleRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowTopArchMiddleRecipe

    @Override
    public boolean matches(TripleWindowTopArchMiddleRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowTopArchMiddleRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowTopArchMiddleRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_MIDDLE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowTopArchMiddleRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_MIDDLE_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowTopArchMiddleRecipe> {
        public static final MapCodec<TripleWindowTopArchMiddleRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowTopArchMiddleRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowTopArchMiddleRecipe::output)
        ).apply(inst, TripleWindowTopArchMiddleRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowTopArchMiddleRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowTopArchMiddleRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowTopArchMiddleRecipe::output,
                        TripleWindowTopArchMiddleRecipe::new);

        @Override
        public MapCodec<TripleWindowTopArchMiddleRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowTopArchMiddleRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}