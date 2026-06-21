package org.squaresaresquare.client;

import net.minecraft.util.ARGB;
import org.squaresaresquare.Architecture_blocks;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.squaresaresquare.client.block.ModBlocks;
import java.util.List;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import org.squaresaresquare.client.block.entity.ModBlockEntities;
import org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs;

public class Architecture_blocksClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Architecture_blocks.MOD_ID);
	@Override
	public void onInitializeClient() {
        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return 0xFFFFDAB9; // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return 0xFFFFDAB9; // Color code in hex format
            }
        }), Blocks.QUARTZ_PILLAR);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return 0xFFFFDAB9; // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return 0xFFFFDAB9; // Color code in hex format
            }
        }), ModBlocks.MARBLE_BLOCK);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_0_1);
                

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_0_4);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_0_3);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_0_2);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_1_1);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_1_3);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_1_2);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_1_4);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_2_1);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_2_2);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_2_4);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_2_3);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_2_0);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_3_0);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_3_1);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_3_2);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_4_0);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_4_1);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_4_2);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_5_0);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_5_1);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_5_2);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.MARBLE_BLOCK);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.MARBLE_PILLAR);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_4_4);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_4_5);

        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_4_3);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_2_5);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_3_3);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_3_4);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_3_5);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_5_3);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_5_4);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.TRIPLE_WINDOW_5_5);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.MARBLE_PILLAR_BASE);


        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());
                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
            @Override
            public int color(BlockState state) {
                return ARGB.transparent(0xFFFFDAB9); // Color code in hex format
            }
        }), ModBlocks.PILLAR_CAP);
                                                                                                                                                                                                                                        //::new block here
        //initialize the stuffs
        ModBlocks.initialize();
        ModCreativeModeTabs.registerModCreativeModeTabs();
        ModBlockEntities.initialize();
        LOGGER.info("Initialize the Architecture blocks mod");
	}
}
