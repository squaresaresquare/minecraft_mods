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

public record QuartzPillarRecipe(Ingredient inputItem, ItemStack output) implements Recipe<QuartzPillarRecipeInput> {
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    // read Recipe JSON files --> new QuartzPillarRecipe

    @Override
    public boolean matches(QuartzPillarRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(QuartzPillarRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<QuartzPillarRecipeInput>> getSerializer() {
        return ModRecipes.QUARTZ_PILLAR_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<QuartzPillarRecipeInput>> getType() {
        return ModRecipes.QUARTZ_PILLAR_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return IngredientPlacement.forSingleSlot(inputItem);
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<QuartzPillarRecipe> {
        public static final MapCodec<QuartzPillarRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(QuartzPillarRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(QuartzPillarRecipe::output)
        ).apply(inst, QuartzPillarRecipe::new));

        public static final PacketCodec<RegistryByteBuf, QuartzPillarRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, QuartzPillarRecipe::inputItem,
                        ItemStack.PACKET_CODEC, QuartzPillarRecipe::output,
                        QuartzPillarRecipe::new);

        @Override
        public MapCodec<QuartzPillarRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, QuartzPillarRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
    