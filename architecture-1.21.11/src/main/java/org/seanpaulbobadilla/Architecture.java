package org.seanpaulbobadilla;

import net.fabricmc.api.ModInitializer;
import org.seanpaulbobadilla.blocks.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Architecture implements ModInitializer {
	public static final String MOD_ID = "architecture";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModBlocks.registerModBlocks();
	}
}