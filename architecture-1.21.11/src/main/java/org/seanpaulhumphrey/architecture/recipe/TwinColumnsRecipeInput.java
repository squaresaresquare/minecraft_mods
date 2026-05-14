package org.seanpaulhumphrey.architecture.recipe;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;

public record TwinColumnsRecipeInput(ItemStack input) implements RecipeInput {
    @Override
    public ItemStack getStackInSlot(int slot) {
        return input;
    }

    @Override
    public int size() {
        return 1;
    }
}
    