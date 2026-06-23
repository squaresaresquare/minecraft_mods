package org.squaresaresquare.client;

import net.minecraft.util.ARGB;
import net.minecraft.world.level.block.Block;
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
import net.minecraft.world.level.block.Blocks.*;
import net.minecraft.world.level.block.state.BlockState;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import org.squaresaresquare.client.block.entity.ModBlockEntities;
import org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs;

public class Architecture_blocksClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Architecture_blocks.MOD_ID);
    private void registerBlockColor(Block CUSTOM_BLOCK) {
    }
	public void onInitializeClient() {
        /*registerBlockColor(Blocks.QUARTZ_BLOCK);
        registerBlockColor(ModBlocks.MARBLE_BLOCK);
        registerBlockColor(ModBlocks.MARBLE_PILLAR);
        registerBlockColor(ModBlocks.OAK_LOG);
        registerBlockColor(ModBlocks.MARBLE_PILLAR_BASE);
        registerBlockColor(ModBlocks.PILLAR_CAP);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_0_1);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_0_2);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_0_3);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_0_4);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_1_1);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_1_2);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_1_3);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_1_4);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_2_0);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_2_1);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_2_2);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_2_3);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_2_4);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_3_0);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_3_1);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_3_2);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_3_3);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_3_4);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_4_0);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_4_1);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_4_2);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_4_3);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_4_4);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_5_0);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_5_1);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_5_2);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_5_3);
        registerBlockColor(ModBlocks.TRIPLE_WINDOW_5_4);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_MIDDLE_CAP);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_MIDDLE_COLUMN);
        registerBlockColor(ModBlocks.ARCHED_WINDOW_MIDDLE_BASE);
        //::new block here         //::new block here*/
        //initialize the stuffs
        ModBlocks.initialize();
        ModCreativeModeTabs.registerModCreativeModeTabs();
        ModBlockEntities.initialize();
        LOGGER.info("Initialize the Architecture blocks mod");
	}
}
