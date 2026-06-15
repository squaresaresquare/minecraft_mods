package org.squaresaresquare.client;

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
import net.fabricmc.api.ClientModInitializer;
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
        }), ModBlocks.WHITE_MARBLE_BLOCK);
                

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
        }), ModBlocks.QUAD_WINDOW_1_1);
                

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
        }), ModBlocks.QUAD_WINDOW_1_2);
                

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
        }), ModBlocks.QUAD_WINDOW_1_3);
                

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
        }), ModBlocks.QUAD_WINDOW_1_4);
                

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
        }), ModBlocks.QUAD_WINDOW_1_5);
                

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
        }), ModBlocks.QUAD_WINDOW_1_6);
                

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
        }), ModBlocks.ARCHED_WINDOW_BASE_LEFT);
                
        //::new block here

        //initialize the stuffs
        ModBlocks.initialize();
        ModCreativeModeTabs.registerModCreativeModeTabs();
        ModBlockEntities.initialize();
        LOGGER.info("Initialize the Architecture blocks mod");


	}
}