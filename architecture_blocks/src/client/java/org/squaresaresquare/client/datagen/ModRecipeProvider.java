package org.squaresaresquare.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import org.squaresaresquare.client.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super();
    }


    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                //this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR, ModBlocks.MARBLE_BLOCK);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BLOCK, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', Blocks.QUARTZ_BLOCK)
                        .pattern("'   '")
                        .pattern("' 01'")
                        .pattern("'   '")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_marble_block", this.has(ModBlocks.MARBLE_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_0_1, 2)
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

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_0_4, 2)
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
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_0_3, 2)
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
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_0_2, 2)
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
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_1_3, 1)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .pattern("'01'")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_1_2, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .pattern("' 10'")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_1_1, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .pattern("'10 '")
                        .pattern("'10 '")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_1_4, 2)
                        .define('0', ModBlocks.MARBLE_PILLAR)
                        .define('1', Blocks.TINTED_GLASS)
                        .pattern("' 01'")
                        .pattern("' 01'")
                        .pattern("'   '")
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_2_1, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .define('1', Blocks.TINTED_GLASS)
                        .define('2', ModBlocks.MARBLE_BLOCK)
                        .pattern("'000'")
                        .pattern("'02 '")
                        .pattern("'12'")
                        .unlockedBy("has_marble_pillar", this.has(Blocks.QUARTZ_BRICKS))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_block", this.has(ModBlocks.MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_2_2, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .define('1', Blocks.TINTED_GLASS)
                        .define('2', ModBlocks.MARBLE_BLOCK)
                        .pattern("'000'")
                        .pattern("'121'")
                        .pattern("' 2 '")
                        .unlockedBy("has_marble_pillar", this.has(Blocks.QUARTZ_BRICKS))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_block", this.has(ModBlocks.MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_2_4, 2)
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
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_2_3, 2)
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
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_2_0, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_3_0, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_3_1, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'00  '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_3_2, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'00 '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_4_0, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_4_1, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'00 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_4_2, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 00'")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_5_0, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_5_1, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_5_2, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_BLOCK, 1)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', Blocks.QUARTZ_BLOCK)
                        .pattern("' 10'")
                        .pattern("'222'")
                        .pattern("'222'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_quartz_block", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR, 1)
                        .define('0', ModBlocks.MARBLE_BLOCK)
                        .pattern("' 0 '")
                        .pattern("' 0 '")
                        .pattern("'111'")
                        .unlockedBy("has_marble_block", this.has(ModBlocks.MARBLE_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_4_4, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'111'")
                        .pattern("' 0 '")
                        .pattern("'111'")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_4_5, 1)
                        .define('0', Blocks.QUARTZ_BLOCK)
                        .pattern("' 0 '")
                        .pattern("'111'")
                        .pattern("'111'")
                        .unlockedBy("has_quartz_block", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);
                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_4_3, 1)
                        .define('0', Blocks.QUARTZ_BLOCK)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_block", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_2_5, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'111'")
                        .pattern("' 0 '")
                        .pattern("'111'")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_2_5, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_3_3, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_3_4, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_3_5, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_5_3, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_5_4, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRIPLE_WINDOW_5_5, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MARBLE_PILLAR_BASE, 1)
                        .define('0', Blocks.SMOOTH_SANDSTONE)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .pattern("'   '")
                        .pattern("' 1 '")
                        .pattern("' 0 '")
                        .unlockedBy("has_smooth_sandstone", this.has(Blocks.SMOOTH_SANDSTONE))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PILLAR_CAP, 1)
                        .define('0', Items.GLAZED_TERRACOTTA.lightBlue())
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_glazed_terracotta", this.has(Items.GLAZED_TERRACOTTA.lightBlue()))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', Blocks.TINTED_GLASS)
                        .define('2', ModBlocks.MARBLE_PILLAR)
                        .pattern("' 12'")
                        .pattern("' 12'")
                        .pattern("'000'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE, 3)
                        .define('0', Blocks.POLISHED_DIORITE)
                        .define('1', Blocks.TINTED_GLASS)
                        .define('2', ModBlocks.MARBLE_PILLAR)
                        .pattern("'21 '")
                        .pattern("'21 '")
                        .pattern("'000'")
                        .unlockedBy("has_polished_diorite", this.has(Blocks.POLISHED_DIORITE))
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .pattern("'001'")
                        .pattern("'001'")
                        .pattern("'   '")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .pattern("'100'")
                        .pattern("'100'")
                        .pattern("'   '")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .pattern("'001'")
                        .pattern("'001'")
                        .pattern("'   '")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .pattern("'001'")
                        .pattern("'001'")
                        .pattern("'   '")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_MIDDLE_BASE, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_BLOCK)
                        .define('2', ModBlocks.MARBLE_PILLAR)
                        .pattern("'020'")
                        .pattern("' 1 '")
                        .pattern("'111'")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble", this.has(ModBlocks.MARBLE_BLOCK))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_MIDDLE_COLUMN, 3)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', ModBlocks.MARBLE_PILLAR)
                        .pattern("'010'")
                        .pattern("'010'")
                        .pattern("'010'")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCHED_WINDOW_MIDDLE_CAP, 2)
                        .define('0', Blocks.TINTED_GLASS)
                        .define('1', Blocks.QUARTZ_BRICKS)
                        .define('2', ModBlocks.MARBLE_PILLAR)
                        .pattern("'111'")
                        .pattern("'010'")
                        .pattern("'020'")
                        .unlockedBy("has_tinted_glass", this.has(Blocks.TINTED_GLASS))
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .unlockedBy("has_marble_pillar", this.has(ModBlocks.MARBLE_PILLAR))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THATCH, 3)
                        .define('0', Blocks.HAY_BLOCK)
                        .pattern("'0  '")
                        .pattern("'00 '")
                        .pattern("'000'")
                        .unlockedBy("has_hay_block", this.has(Blocks.HAY_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.THATCH_PEAK, 4)
                        .define('0', Blocks.HAY_BLOCK)
                        .pattern("' 0 '")
                        .pattern("'000'")
                        .pattern("'   '")
                        .unlockedBy("has_hay_block", this.has(Blocks.HAY_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAY_BLOCK, 1)
                        .define('0', Blocks.WHEAT)
                        .pattern("'000'")
                        .pattern("'000'")
                        .pattern("'000'")
                        .unlockedBy("has_wheat", this.has(Blocks.WHEAT))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICKS, 4)
                        .define('0', Blocks.QUARTZ_BLOCK)
                        .pattern("'00 '")
                        .pattern("'00 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_blocks", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_1_1, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'000'")
                        .pattern("'000'")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_1_8, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_2_1, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'000'")
                        .pattern("'000'")
                        .pattern("'00 '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_2_8, 2)
                        .define('0', Blocks.QUARTZ_BLOCK)
                        .pattern("'000'")
                        .pattern("'00 '")
                        .pattern("'0  '")
                        .unlockedBy("has_quartz_block", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_2_1, 1)
                        .define('0', Blocks.QUARTZ_BLOCK)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_block", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_INNER_ARCH, 1)
                        .define('0', Blocks.QUARTZ_BLOCK)
                        .pattern("'000'")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_block", this.has(Blocks.QUARTZ_BLOCK))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_2_2, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'000'")
                        .pattern("'00 '")
                        .pattern("'0  '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_2_7, 2)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'000'")
                        .pattern("' 00'")
                        .pattern("'  0'")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_3_1, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_3_2, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_3_3, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_3_6, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_3_7, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_3_8, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_4_2, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_4_3, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_4_4, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_4_5, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_4_6, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SIX_BLOCK_ARCH_4_7, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_1_1, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_1_4, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_1_5, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_1_2, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("' 0 '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_2_1, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'0  '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_2_2, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'0  '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_2_3, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'0  '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_2_4, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'0  '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_2_5, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'   '")
                        .pattern("'0  '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIVE_BLOCK_ARCH_3_2, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'0  '")
                        .pattern("'   '")
                        .pattern("'   '")
                        .unlockedBy("has_quartz_bricks", this.has(Blocks.QUARTZ_BRICKS))
                        .save(this.output);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOUBLE_ARCHED_WINDOW_6_4, 1)
                        .define('0', Blocks.QUARTZ_BRICKS)
                        .pattern("'0  '")
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
