package net.minecraft;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.block.ModBlocks;
import net.minecraft.block.entity.ModBlockEntities;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.squaresaresquare.Architecture_blocks;

public class Client implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Architecture_blocks.MOD_ID);

    private void registerBlockColor(Block CUSTOM_BLOCK) {
    }

    public void onInitializeClient() {
        //initialize the stuffs
        ModBlocks.initialize();
        ModBlockEntities.initialize();
        LOGGER.info("Initialize the Architecture blocks mod");
    }
}
