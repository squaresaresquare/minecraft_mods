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

public record TripleWindowTopArchLeftRecipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowTopArchLeftRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowTopArchLeftRecipe

    @Override
    public boolean matches(TripleWindowTopArchLeftRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowTopArchLeftRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowTopArchLeftRecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_LEFT_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowTopArchLeftRecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_LEFT_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowTopArchLeftRecipe> {
        public static final MapCodec<TripleWindowTopArchLeftRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowTopArchLeftRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowTopArchLeftRecipe::output)
        ).apply(inst, TripleWindowTopArchLeftRecipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowTopArchLeftRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowTopArchLeftRecipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowTopArchLeftRecipe::output,
                        TripleWindowTopArchLeftRecipe::new);

        @Override
        public MapCodec<TripleWindowTopArchLeftRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowTopArchLeftRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    