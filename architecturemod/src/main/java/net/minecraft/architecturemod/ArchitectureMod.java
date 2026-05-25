package net.minecraft.architecturemod;

//Classes from THIS project
import net.minecraft.architecturemod.block.ModBlocks;

//Fabric Classes
import net.fabricmc.api.ModInitializer;

// net.minecraft libraries

//Misc Libraries
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchitectureMod implements ModInitializer {
	public static final String MOD_ID = "architecturemod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModBlocks.initialize();
		LOGGER.info("Initialize the Architecture blocks mod");
	}
    /*@Override
    public void onInitialize() {

    }*/
}
