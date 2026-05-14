package org.seanpaulhumphrey.architecture;

import net.fabricmc.api.ModInitializer;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.block.entity.ModBlockEntities;
import org.seanpaulhumphrey.architecture.component.ModDataComponentTypes;
import org.seanpaulhumphrey.architecture.item.ModItemGroups;
import org.seanpaulhumphrey.architecture.item.ModItems;
import org.seanpaulhumphrey.architecture.particle.ModParticles;
import org.seanpaulhumphrey.architecture.recipe.ModRecipes;
import org.seanpaulhumphrey.architecture.screen.ModScreenHandlers;
import org.seanpaulhumphrey.architecture.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class Architecture implements ModInitializer {
	public static final String MOD_ID = "architecture";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModDataComponentTypes.registerDataComponentTypes();
		ModSounds.registerSounds();
		ModParticles.registerParticles();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		ModRecipes.registerRecipes();
	}
}

