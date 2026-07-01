package org.squaresaresquare.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.ModBlockEntities;
import org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs;

import static org.squaresaresquare.client.creativemodetab.ModCreativeModeTabs.*;

public class Architecture_blocksClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Architecture_blocks.MOD_ID);

    public void onInitializeClient() {
        //initialize the stuffs
        ModBlocks.initialize();
        ModCreativeModeTabs.registerModCreativeModeTabs();
        ModBlockEntities.initialize();
        LOGGER.info("Initialize the Architecture blocks mod");
    }
}
