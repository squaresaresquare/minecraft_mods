package org.squaresaresquare.client.creativemodetab;
import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.Architecture_blocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

import javax.sql.RowSet;
import java.util.HashMap;
import java.util.Map;

public class ModCreativeModeTabs {
    public static final DataComponentType<Integer> MY_INT_COMPONENT = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "my_integer"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT) // Makes sure the integer saves to the item NBT on disk
                    .build()
    );
    // 1. Create a registration key using your Mod ID

    public static final ResourceKey<CreativeModeTab> TRIPLE_WINDOWS_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "triple_windows_tab")
    );

    public static final CreativeModeTab TRIPLE_WINDOWS_TAB = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.four_arched_windows_tab"))
            .icon(() -> new ItemStack(ModBlocks.TRIPLE_WIND0W_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                //row 1 (0-8)
                TabLayout.put(2, ModBlocks.TRIPLE_WINDOW_5_0);     // Row 1, Slot 3
                TabLayout.put(3, ModBlocks.TRIPLE_WINDOW_5_1);     // Row 1, Slot 4
                TabLayout.put(4, ModBlocks.TRIPLE_WINDOW_5_2);     // Row 1, Slot 5
                TabLayout.put(5, ModBlocks.TRIPLE_WINDOW_5_3);     // Row 1, Slot 6
                TabLayout.put(6, ModBlocks.TRIPLE_WINDOW_5_4);     // Row 1, Slot 7
                TabLayout.put(7, ModBlocks.TRIPLE_WINDOW_5_5);      // Row 1, Slot 8
                //row 2 (9-17)
                TabLayout.put(11, ModBlocks.TRIPLE_WINDOW_4_0);     // Row 1, Slot 3
                TabLayout.put(12, ModBlocks.TRIPLE_WINDOW_4_1);     // Row 1, Slot 4
                TabLayout.put(13, ModBlocks.TRIPLE_WINDOW_4_2);     // Row 1, Slot 5
                TabLayout.put(14, ModBlocks.TRIPLE_WINDOW_4_3);     // Row 1, Slot 6
                TabLayout.put(15, ModBlocks.TRIPLE_WINDOW_4_4);     // Row 1, Slot 7
                TabLayout.put(16, ModBlocks.TRIPLE_WINDOW_4_5);      // Row 1, Slot 8
                //row 2 (18-26)
                TabLayout.put(20, ModBlocks.TRIPLE_WINDOW_3_0);
                TabLayout.put(21, ModBlocks.TRIPLE_WINDOW_3_1);
                TabLayout.put(22, ModBlocks.TRIPLE_WINDOW_3_2);
                TabLayout.put(23, ModBlocks.TRIPLE_WINDOW_3_3);
                TabLayout.put(24, ModBlocks.TRIPLE_WINDOW_3_4);
                TabLayout.put(25, ModBlocks.TRIPLE_WINDOW_3_5);
                //row 3 (27-35)
                TabLayout.put(29, ModBlocks.TRIPLE_WINDOW_2_0);
                TabLayout.put(30, ModBlocks.TRIPLE_WINDOW_2_1);
                TabLayout.put(31, ModBlocks.TRIPLE_WINDOW_2_2);
                TabLayout.put(32, ModBlocks.TRIPLE_WINDOW_2_3);
                TabLayout.put(33, ModBlocks.TRIPLE_WINDOW_2_4);
                TabLayout.put(34, ModBlocks.TRIPLE_WINDOW_2_5);
                //row 4 (36-44)
                TabLayout.put(38, Blocks.QUARTZ_BRICKS);
                TabLayout.put(39, ModBlocks.TRIPLE_WINDOW_1_1);
                TabLayout.put(40, ModBlocks.TRIPLE_WINDOW_1_2);
                TabLayout.put(41, ModBlocks.TRIPLE_WINDOW_1_3);
                TabLayout.put(42, ModBlocks.TRIPLE_WINDOW_1_4);
                TabLayout.put(43, Blocks.QUARTZ_BRICKS);
                //row 5 (45-53)
                TabLayout.put(47, Blocks.QUARTZ_BRICKS);
                TabLayout.put(48, ModBlocks.TRIPLE_WINDOW_0_1);
                TabLayout.put(49, ModBlocks.TRIPLE_WINDOW_0_2);
                TabLayout.put(50, ModBlocks.TRIPLE_WINDOW_0_3);
                TabLayout.put(51, ModBlocks.TRIPLE_WINDOW_0_4);
                TabLayout.put(52, Blocks.QUARTZ_BRICKS);
                //row 6 (54-62)
                //row 6 (63-71)
                //row 7 (72-80)
                //row 8 (81-89)
                //row 9 (90 - 98)
                // 2. Find the highest slot index used to determine where to stop the loop
                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build();


    public static final CreativeModeTab ARCHITECTURE_BLOCK_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(
                    Architecture_blocks.MOD_ID,
                    "architecture_blocks"),
                     FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARBLE_PLINTH_BLOCK))
                             .title(Component.translatable("itemGroup." + Architecture_blocks.MOD_ID + ".ARCHITECTURE_BLOCK_TAB"))
                             .displayItems((parameters, output) -> {})
                    .displayItems((parameters, output) -> {

                        output.accept(ModBlocks.MARBLE_PLINTH_BLOCK);
                        output.accept(ModBlocks.INVISIBLE);
                        output.accept(ModBlocks.MARBLE_BLOCK);
                        output.accept(ModBlocks.MARBLE_PILLAR);
                        output.accept(ModBlocks.OAK_LOG);
                        output.accept(ModBlocks.MARBLE_PILLAR_BASE);
                        output.accept(ModBlocks.PILLAR_CAP);
                        output.accept(Blocks.QUARTZ_BRICKS);
                        //::new architecture_block here
                    }).build());

    public static final CreativeModeTab FOUR_ARCHED_WINDOWS = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
             Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "marble_pillar"),
             FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARBLE_PILLAR))
                     .title(Component.translatable("creativemodetab.architecture_blocks.marble_pillar"))
                     .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE);
                        output.accept(ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE);
                        output.accept(ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE);
                        output.accept(ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE);
                        output.accept(ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP);
                        output.accept(ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP);
                        output.accept(ModBlocks.ARCHED_WINDOW_MIDDLE_BASE);
                        output.accept(ModBlocks.ARCHED_WINDOW_MIDDLE_COLUMN);
                        output.accept(ModBlocks.ARCHED_WINDOW_MIDDLE_CAP);
                        //::new triple_window
    }).build());
    /*
    public static final CreativeModeTab DOUBLE_WINDOW = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "double_window"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DOUBLE_WIND0W_COMPLETE))
                    .title(Component.translatable("creativemodetab.architecture_blocks.triple_window_complete"))
                    .displayItems((parameters, output) -> {
                    output.accept(ModBlocks.TRIPLE_WINDOW_0_1);

                        //::new double_window
                    }).build());

    public static final CreativeModeTab DOUBLE_WINDOW = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "four_windows"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DOUBLE_WIND0W_COMPLETE))
                    .title(Component.translatable("creativemodetab.architecture_blocks.triple_window_complete"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.TRIPLE_WINDOW_0_1);

                        //::new double_window
                    }).build());
    */

    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "creative_tab")
    );
    public static void registerModCreativeModeTabs() {
        Architecture_blocks.LOGGER.info("Registering Creative Mode Tabs for " + Architecture_blocks.MOD_ID);
    }
}
