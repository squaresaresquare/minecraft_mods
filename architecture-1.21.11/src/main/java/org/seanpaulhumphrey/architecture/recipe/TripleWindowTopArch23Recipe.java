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

public record TripleWindowTopArch23Recipe(Ingredient inputItem, ItemStack output) implements Recipe<TripleWindowTopArch23RecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new TripleWindowTopArch23Recipe

    @Override
    public boolean matches(TripleWindowTopArch23RecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(TripleWindowTopArch23RecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<TripleWindowTopArch23RecipeInput>> getSerializer() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_2_3_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<TripleWindowTopArch23RecipeInput>> getType() {
        return ModRecipes.TRIPLE_WINDOW_TOP_ARCH_2_3_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<TripleWindowTopArch23Recipe> {
        public static final MapCodec<TripleWindowTopArch23Recipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(TripleWindowTopArch23Recipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(TripleWindowTopArch23Recipe::output)
        ).apply(inst, TripleWindowTopArch23Recipe::new));

        public static final PacketCodec<RegistryByteBuf, TripleWindowTopArch23Recipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, TripleWindowTopArch23Recipe::inputItem,
                        ItemStack.PACKET_CODEC, TripleWindowTopArch23Recipe::output,
                        TripleWindowTopArch23Recipe::new);

        @Override
        public MapCodec<TripleWindowTopArch23Recipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, TripleWindowTopArch23Recipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}