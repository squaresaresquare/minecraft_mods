package org.seanpaulbobadilla.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.seanpaulbobadilla.Architecture;

public class ModBlocks {
    public static final Block HALF_QUARTZ_PILLAR = registerBlock("half_quartz_pillar",
            new Block(AbstractBlock.Settings.create().
                    strength(4.0f).
                    requiresTool().
                    sounds(BlockSoundGroup.POLISHED_DEEPSLATE)
            )
    );
    /* public static final Block QUARTZ_PILLAR = registerBlock("quartz_pillar",
            new Block(AbstractBlock.Settings.create().
                    strength(4.0f).
                    requiresTool().
                    sounds(BlockSoundGroup.POLISHED_DEEPSLATE)
            )
    ); */
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK,
                Identifier.of(Architecture.MOD_ID, name),
                block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Architecture.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        Architecture.LOGGER.info("Registering Mod Blocks for " + Architecture.MOD_ID + ModBlocks.HALF_QUARTZ_PILLAR.toString());
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> fabricItemGroupEntries.add(ModBlocks.HALF_QUARTZ_PILLAR));
    }
}
