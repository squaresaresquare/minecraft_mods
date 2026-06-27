package org.squaresaresquare.client;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import org.squaresaresquare.Architecture_blocks;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.squaresaresquare.client.block.ModBlocks;
import net.minecraft.world.level.block.Blocks.*;
import org.squaresaresquare.client.block.entity.ModBlockEntities;
import org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs;
import static org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs.TRIPLE_WINDOWS_TAB;
import static org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs.TRIPLE_WINDOWS_TAB_KEY;
import static org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs.FOUR_ARCHED_WINDOW;
import static org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs.FOUR_ARCHED_WINDOW_TAB_KEY;

public class Architecture_blocksClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Architecture_blocks.MOD_ID);
    private void registerBlockColor(Block CUSTOM_BLOCK) {
    }
	public void onInitializeClient() {
       Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
               TRIPLE_WINDOWS_TAB_KEY,
               TRIPLE_WINDOWS_TAB
       );
        Registry.register(
                BuiltInRegistries.CREATIVE_MODE_TAB,
                FOUR_ARCHED_WINDOW_TAB_KEY,
                FOUR_ARCHED_WINDOW
        );

        //initialize the stuffs
        ModBlocks.initialize();
        ModCreativeModeTabs.registerModCreativeModeTabs();
        ModBlockEntities.initialize();
        LOGGER.info("Initialize the Architecture blocks mod");
	}
}
