package org.seanpaulhumphrey.architecture.recipe;

import org.seanpaulhumphrey.architecture.Architecture;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static final RecipeSerializer<HalfQuartzRecipe> HALF_QUARTZ_PILLAR_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(Architecture.MOD_ID, "half_quartz_pillar"),
            new HalfQuartzRecipe.Serializer());
    public static final RecipeType<HalfQuartzRecipe> HALF_QUARTZ_PILLAR_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(Architecture.MOD_ID, "half_quartz_pillar"), new RecipeType<HalfQuartzRecipe>() {
                @Override
                public String toString() {
                    return "half_quartz_pillar";
                }
            });
    public static void registerRecipes() {
        Architecture.LOGGER.info("Registering Custom Recipes for " + Architecture.MOD_ID);
    }
}
