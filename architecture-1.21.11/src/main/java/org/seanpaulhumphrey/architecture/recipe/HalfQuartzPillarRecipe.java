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

public record HalfQuartzPillarRecipe(Ingredient inputItem, ItemStack output) implements Recipe<HalfQuartzPillarRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new HalfQuartzPillarRecipe

    @Override
    public boolean matches(HalfQuartzPillarRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(HalfQuartzPillarRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<HalfQuartzPillarRecipeInput>> getSerializer() {
        return ModRecipes.HALF_QUARTZ_PILLAR_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<HalfQuartzPillarRecipeInput>> getType() {
        return ModRecipes.HALF_QUARTZ_PILLAR_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<HalfQuartzPillarRecipe> {
        public static final MapCodec<HalfQuartzPillarRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(HalfQuartzPillarRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(HalfQuartzPillarRecipe::output)
        ).apply(inst, HalfQuartzPillarRecipe::new));

        public static final PacketCodec<RegistryByteBuf, HalfQuartzPillarRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, HalfQuartzPillarRecipe::inputItem,
                        ItemStack.PACKET_CODEC, HalfQuartzPillarRecipe::output,
                        HalfQuartzPillarRecipe::new);

        @Override
        public MapCodec<HalfQuartzPillarRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, HalfQuartzPillarRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    