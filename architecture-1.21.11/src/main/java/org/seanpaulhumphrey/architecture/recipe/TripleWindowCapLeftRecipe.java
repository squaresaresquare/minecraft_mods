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

public record TripleWindowCapLeftRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowCapLeftRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowCapLeftRecipe

    @Override
    public boolean matches(TripleWindowCapLeftRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowCapLeftRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowCapLeftRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_CAP_LEFT_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowCapLeftRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_CAP_LEFT_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowCapLeftRecipe> {
        public static final MapCodec<TripleWindowCapLeftRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowCapLeftRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowCapLeftRecipe::output)
        ).apply(inst, TripleWindowCapLeftRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowCapLeftRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowCapLeftRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowCapLeftRecipe::output,
                        TripleWindowCapLeftRecipe::new);

        @Override
        public MapCodec<TripleWindowCapLeftRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowCapLeftRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    