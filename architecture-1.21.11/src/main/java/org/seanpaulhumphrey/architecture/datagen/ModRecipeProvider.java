package org.seanpaulhumphrey.architecture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.item.ModItems;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HALF_QUARTZ_PILLAR, RecipeCategory.DECORATIONS, ModBlocks.HALF_QUARTZ_PILLAR);

                createShaped(RecipeCategory.MISC, ModBlocks.HALF_QUARTZ_PILLAR)
                        .pattern("XXX")
                        .pattern("XQX")
                        .pattern("XXX")
                        .input('Q', ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModBlocks.QUARTZ_PILLAR, 9)
                        .input(ModBlocks.QUARTZ_PILLAR)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR), conditionsFromItem(ModBlocks.QUARTZ_PILLAR))
                        .offerTo(exporter);


            }
        };
    }

    @Override
    public String getName() {
        return "Architecture Recipes";
    }
}
