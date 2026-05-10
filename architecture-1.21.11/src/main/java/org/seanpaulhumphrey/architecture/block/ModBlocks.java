package org.seanpaulhumphrey.architecture.block;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.seanpaulhumphrey.architecture.Architecture;
import org.seanpaulhumphrey.architecture.block.custom.*;
import org.seanpaulhumphrey.architecture.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block QUARTZ_PILLAR = registerBlock("quartz_pillar",
            properties -> new QuartzPillar(properties.nonOpaque()));
    public static final Block HALF_QUARTZ_PILLAR = registerBlock("half_quartz_pillar",
            properties -> new HalfQuartzPillar(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_1_1 = registerBlock("quad_window_top_arch_1_1",
            properties -> new QuadWindowTopArch11(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_1_2 = registerBlock("quad_window_top_arch_1_2",
            properties -> new QuadWindowTopArch12(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_1_3 = registerBlock("quad_window_top_arch_1_3",
            properties -> new QuadWindowTopArch13(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_1_4 = registerBlock("quad_window_top_arch_1_4",
            properties -> new QuadWindowTopArch14(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_1_5 = registerBlock("quad_window_top_arch_1_5",
            properties -> new QuadWindowTopArch15(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_1_6 = registerBlock("quad_window_top_arch_1_6",
            properties -> new QuadWindowTopArch16(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_2_1 = registerBlock("quad_window_top_arch_2_1",
            properties -> new QuadWindowTopArch21(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_2_2 = registerBlock("quad_window_top_arch_2_2",
            properties -> new QuadWindowTopArch22(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_2_3 = registerBlock("quad_window_top_arch_2_3",
            properties -> new QuadWindowTopArch23(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_2_4 = registerBlock("quad_window_top_arch_2_4",
            properties -> new QuadWindowTopArch24(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_2_5 = registerBlock("quad_window_top_arch_2_5",
            properties -> new QuadWindowTopArch25(properties.nonOpaque()));
    public static final Block QUAD_WINDOW_TOP_ARCH_2_6 = registerBlock("quad_window_top_arch_2_6",
            properties -> new QuadWindowTopArch26(properties.nonOpaque()));
    public static final Block THIN_QUARTZ_BASE = registerBlock("thin_quartz_base",
            properties -> new ThinQuartzBase(properties.nonOpaque()));
    public static final Block THIN_QUARTZ_CAPITAL = registerBlock("thin_quartz_capital",
            properties -> new ThinQuartzCapital(properties.nonOpaque()));
    public static final Block THIN_QUARTZ_COLUMN = registerBlock("thin_quartz_column",
            properties -> new ThinQuartzColumn(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_CAP_LEFT = registerBlock("triple_window_cap_left",
            properties -> new TripleWindowCapLeft(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_LEFT_BOTTOM = registerBlock("triple_window_left_bottom",
            properties -> new TripleWindowLeftBottom(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_MIDDLE_BOTTOM = registerBlock("triple_window_middle_bottom",
            properties -> new TripleWindowMiddleBottom(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_MIDDLE_LEFT = registerBlock("triple_window_middle_left",
            properties -> new TripleWindowMiddleLeft(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_MIDDLE_MIDDLE = registerBlock("triple_window_middle_middle",
            properties -> new TripleWindowMiddleMiddle(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_RIGHT_BOTTOM = registerBlock("triple_window_right_bottom",
            properties -> new TripleWindowRightBottom(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_ARCH_1_1 = registerBlock("triple_window_top_arch_1_1",
            properties -> new TripleWindowTopArch11(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_ARCH_1_2 = registerBlock("triple_window_top_arch_1_2",
            properties -> new TripleWindowTopArch12(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_ARCH_1_3 = registerBlock("triple_window_top_arch_1_3",
            properties -> new TripleWindowTopArch13(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_ARCH_2_2 = registerBlock("triple_window_top_arch_2_2",
            properties -> new TripleWindowTopArch22(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_ARCH_2_3 = registerBlock("triple_window_top_arch_2_3",
            properties -> new TripleWindowTopArch23(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_ARCH_LEFT = registerBlock("triple_window_top_arch_left",
            properties -> new TripleWindowTopArchLeft(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_ARCH_MIDDLE = registerBlock("triple_window_top_arch_middle",
            properties -> new TripleWindowTopArchMiddle(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_CAP_MIDDLE = registerBlock("triple_window_top_cap_middle",
            properties -> new TripleWindowTopCapMiddle(properties.nonOpaque()));
    public static final Block TRIPLE_WINDOW_TOP_CAP_RIGHT = registerBlock("triple_window_top_cap_right",
            properties -> new TripleWindowTopCapRight(properties.nonOpaque()));
    public static final Block TWIN_COLUMN_BASE = registerBlock("twin_column_base",
            properties -> new TwinColumnBase(properties.nonOpaque()));
    public static final Block TWIN_COLUMN_CAPITAL = registerBlock("twin_column_capital",
            properties -> new TwinColumnCapital(properties.nonOpaque()));
    public static final Block TWIN_COLUMNS = registerBlock("twin_columns",
            properties -> new TwinColumns(properties.nonOpaque()));
private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Architecture.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(Architecture.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(Architecture.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Architecture.MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Architecture.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Architecture.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Architecture.LOGGER.info("Registering Mod Blocks for " + Architecture.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.QUARTZ_PILLAR);
            entries.add(ModBlocks.HALF_QUARTZ_PILLAR);
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_2 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_3 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_4 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_5 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_6 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_1 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_2 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_3 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_4 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_5 );
            entries.add(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_6 );
            entries.add(ModBlocks.THIN_QUARTZ_BASE );
            entries.add(ModBlocks.THIN_QUARTZ_CAPITAL );
            entries.add(ModBlocks.THIN_QUARTZ_COLUMN );
            entries.add(ModBlocks.TRIPLE_WINDOW_CAP_LEFT );
            entries.add(ModBlocks.TRIPLE_WINDOW_LEFT_BOTTOM );
            entries.add(ModBlocks.TRIPLE_WINDOW_MIDDLE_BOTTOM );
            entries.add(ModBlocks.TRIPLE_WINDOW_MIDDLE_LEFT );
            entries.add(ModBlocks.TRIPLE_WINDOW_MIDDLE_MIDDLE );
            entries.add(ModBlocks.TRIPLE_WINDOW_RIGHT_BOTTOM );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_1 );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_2 );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_3 );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_2 );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_3 );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_LEFT );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_MIDDLE );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_CAP_MIDDLE );
            entries.add(ModBlocks.TRIPLE_WINDOW_TOP_CAP_RIGHT );
            entries.add(ModBlocks.TWIN_COLUMN_BASE );
            entries.add(ModBlocks.TWIN_COLUMN_CAPITAL );
            entries.add(ModBlocks.TWIN_COLUMNS );
            });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModBlocks.QUARTZ_PILLAR);
        });
    }
}