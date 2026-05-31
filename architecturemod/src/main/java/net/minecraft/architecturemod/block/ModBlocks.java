package net.minecraft.architecturemod.block;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.architecturemod.ArchitectureMod;
import net.minecraft.architecturemod.creativemodetab.ModCreativeModeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class ModBlocks {
    public static final Logger LOGGER = LoggerFactory.getLogger(ArchitectureMod.MOD_ID);
    // Register blocks
    public static final Block QUARTZ_PILLAR_BLOCK = register(
            "quartz_pillar",
            Block::new,
            BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).noOcclusion(),
            true
    );

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        LOGGER.info(String.format("register {}", name));
        ResourceKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.setId(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, name));
    }

    public static void initialize() {
        setupItemGroups();
    }

    public static void setupItemGroups() {
        CreativeModeTabEvents.modifyOutputEvent(ModCreativeModeTabs.ARCHITECTURE_BLOCKS).register((creativeTab) -> {
            creativeTab.accept(ModBlocks.QUARTZ_PILLAR_BLOCK.asItem());
        });
    }
}