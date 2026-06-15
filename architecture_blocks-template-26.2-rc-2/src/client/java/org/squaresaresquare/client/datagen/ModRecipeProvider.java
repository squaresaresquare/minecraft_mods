package org.squaresaresquare.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import org.squaresaresquare.client.block.ModBlocks;
//import org.squaresaresquare.client.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlazedTerracottaBlock;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super();
    }


    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                //this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_PILLAR, Blocks.QUARTZ_BLOCK);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_BLOCK, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', Blocks.QUARTZ_BLOCK)
                        .pattern("'   '")
                        .pattern("' 01'")
                        .pattern("'   '")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_white_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_1, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("'000'")
                        .pattern("'001'")
                        .pattern("'011'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_white_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_2, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("'001'")
                        .pattern("'011'")
                        .pattern("'111'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_white_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_3, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("'011'")
                        .pattern("'111'")
                        .pattern("'111'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_white_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_4, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("'110'")
                        .pattern("'111'")
                        .pattern("'111'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_white_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_5, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("'100'")
                        .pattern("'110'")
                        .pattern("'111'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_white_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_6, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("'111'")
                        .pattern("'111'")
                        .pattern("'110'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_white_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);

                //::new block here
            }
        };
    }

    public String getName() {
        return "Architecture_blocks Recipes";
    }

}
