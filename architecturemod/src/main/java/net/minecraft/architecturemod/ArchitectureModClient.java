package net.minecraft.architecturemod;

import net.minecraft.architecturemod.block.ModBlocks;
import java.util.List;
import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;

public class ArchitectureModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //ItemTintSources.ID_MAPPER.put(Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID,"color"));
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
        }), ModBlocks.QUARTZ_PILLAR);
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
        }), ModBlocks.QUARTZ_PILLAR_BASE);
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
        }), ModBlocks.QUARTZ_PILLAR_CAP);

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
        }), ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1);
                

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
        }), ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1);
                
        //::new block here
    }
}