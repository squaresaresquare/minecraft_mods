package org.squaresaresquare.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import org.squaresaresquare.Architecture_blocks;
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
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR, ModBlocks.WHITE_MARBLE_BLOCK);
                //this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR, ModBlocks.WHITE_MARBLE_BLOCK);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_BLOCK, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', Blocks.QUARTZ_BLOCK)
                        .pattern("'   '")
                        .pattern("' 01'")
                        .pattern("'   '")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_white_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR, 2)
                        .define('0',ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("' 0 '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR_BASE, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.POLISHED_GRANITE)
                        .pattern("' 0 '")
                        .pattern("' 1 '")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_polished_granite", this.has(Blocks.POLISHED_GRANITE))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_0_1, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .define('2', Blocks.POLISHED_ANDESITE_SLAB)
                        .pattern("'10 '")
                        .pattern("'10 '")
                        .pattern("'222'")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_polished_andesite_slab", this.has(Blocks.POLISHED_ANDESITE_SLAB))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_0_4, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .define('2', Blocks.POLISHED_ANDESITE_SLAB)
                        .pattern("' 01'")
                        .pattern("' 01'")
                        .pattern("'222'")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_polished_andesite_slab", this.has(Blocks.POLISHED_ANDESITE_SLAB))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_0_3, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .define('2', Blocks.POLISHED_ANDESITE_SLAB)
                        .pattern("'001'")
                        .pattern("'001'")
                        .pattern("'222'")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_polished_andesite_slab", this.has(Blocks.POLISHED_ANDESITE_SLAB))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_0_2, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .define('2', Blocks.POLISHED_ANDESITE_SLAB)
                        .pattern("'100'")
                        .pattern("'100'")
                        .pattern("'222'")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_polished_andesite_slab", this.has(Blocks.POLISHED_ANDESITE_SLAB))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_3, 1)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .pattern("'01'")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_2, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .pattern("' 10'")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_1, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .pattern("'10 '")
                        .pattern("'10 '")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_1_4, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .pattern("' 01'")
                        .pattern("' 01'")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_2_1, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .define('1', Blocks.TINTED_GLASS)
                        .define('2', ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("'000'")
                        .pattern("'02 '")
                        .pattern("'12'")
                        .unlockedBy("has_marble_pillar", this.has(Blocks.QUARTZ_BRICKS))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_2_2, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .define('1', Blocks.TINTED_GLASS)
                        .define('2', ModBlocks.WHITE_MARBLE_BLOCK)
                        .pattern("'000'")
                        .pattern("'121'")
                        .pattern("' 2 '")
                        .unlockedBy("has_marble_pillar", this.has(Blocks.QUARTZ_BRICKS))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_block", this.has(ModBlocks.WHITE_MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_2_4, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .define('2', Blocks.QUARTZ_BRICKS)
                        .pattern("'222'")
                        .pattern("' 12'")
                        .pattern("'  0'")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_2_3, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .define('2', Blocks.QUARTZ_BRICKS)
                        .pattern("'222'")
                        .pattern("' 12'")
                        .pattern("' 0 '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_2_0, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_3_0, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_3_1, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'00  '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_3_2, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'00 '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_4_0, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_4_1, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'00 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUAD_WINDOW_4_2, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 00'")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                //::new block here
            }
        };
    }

    public String getName() {
        return "Architecture_blocks Recipes";
    }

}
