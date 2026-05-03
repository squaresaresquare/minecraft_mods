package org.seanpaulhumphrey.architecture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.item.ModItems;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
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
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.HALF_QUARTZ_PILLAR, RecipeCategory.DECORATIONS, ModBlocks.HALF_QUARTZ_PILLAR_BLOCK);

                createShaped(RecipeCategory.MISC, ModBlocks.HALF_QUARTZ_PILLAR_BLOCK)
                        .pattern("XXX")
                        .pattern("XQX")
                        .pattern("XXX")
                        .input('Q', ModItems.QUARTZ_PILLAR)
                        .criterion(hasItem(ModItems.QUARTZ_PILLAR), conditionsFromItem(ModItems.QUARTZ_PILLAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.QUARTZ_PILLAR, 9)
                        .input(ModBlocks.QUARTZ_PILLAR_BLOCK)
                        .criterion(hasItem(ModBlocks.QUARTZ_PILLAR_BLOCK), conditionsFromItem(ModBlocks.QUARTZ_PILLAR_BLOCK))
                        .offerTo(exporter); */


            }
        };
    }

    @Override
    public String getName() {
        return "Architecture Recipes";
    }
}
