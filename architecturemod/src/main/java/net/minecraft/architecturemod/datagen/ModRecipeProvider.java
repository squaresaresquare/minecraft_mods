package net.minecraft.architecturemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.architecturemod.block.ModBlocks;
//import net.minecraft.architecturemod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.block.Blocks;

//import java.util.function.Consumer;




import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR, Blocks.QUARTZ_BLOCK);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR, 2)
                        .define('#', Blocks.QUARTZ_BLOCK)
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_chiseled_quartz_block", this.has(Blocks.CHISELED_QUARTZ_BLOCK))
                        .unlockedBy("has_quartz_block", this.has(Blocks.QUARTZ_BLOCK))
                        .unlockedBy("has_quartz_pillar", this.has(ModBlocks.QUARTZ_PILLAR))
                        .save(this.output);
            }
        };
    }
    @Override
    public String getName() {
        return "ArchitectureMod Recipes";
    }
}
