package org.squaresaresquare.client.creativemodetab;

import com.mojang.serialization.Codec;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.ModBlocks;

import java.util.HashMap;
import java.util.Map;

public class ModCreativeModeTabs {
    public static final DataComponentType<@NotNull Integer> MY_INT_COMPONENT = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "my_integer"),
            DataComponentType.<Integer>builder()
                    .persistent(Codec.INT) // Makes sure the integer saves to the item NBT on disk
                    .build()
    );
    // 1. Create a registration key using your Mod ID
    public static final ResourceKey<@NotNull CreativeModeTab> ARCHITECTURE_BLOCK_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "architecture_block_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> DOUBLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "double_arched_window_tab")
    );
    public static final ResourceKey<@NotNull CreativeModeTab> TRIPLE_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "triple_arched_window_tab")
    );

    public static final ResourceKey<@NotNull CreativeModeTab> FOUR_ARCHED_WINDOW_TAB_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "four_arched_window_tab")
    );

    public static final CreativeModeTab ARCHITECTURE_BLOCK_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ARCHITECTURE_BLOCK_TAB_KEY,
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARBLE_PLINTH_BLOCK))
                    .title(Component.translatable("itemGroup." + Architecture_blocks.MOD_ID + ".architecture_block_tab"))
                    .displayItems((displayContext, output) -> {
                        output.accept(ModBlocks.MARBLE_PLINTH_BLOCK);
                        output.accept(ModBlocks.INVISIBLE);
                        output.accept(ModBlocks.MARBLE_BLOCK);
                        output.accept(ModBlocks.MARBLE_PILLAR);
                        output.accept(ModBlocks.OAK_LOG_BLOCK);
                        output.accept(ModBlocks.MARBLE_PILLAR_BASE);
                        output.accept(ModBlocks.PILLAR_CAP);
                        output.accept(ModBlocks.THATCH);
                        output.accept(ModBlocks.THATCH_PEAK);
                        output.accept(ModBlocks.HAY_BLOCK);
                        output.accept(ModBlocks.QUARTZ_BRICKS);
                        //::new architecture_block here
                    }).build());

    public static final CreativeModeTab DOUBLE_ARCHED_WINDOW_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            DOUBLE_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.architecture_blocks.double_arched_window_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.DOUBLE_ARCHED_WINDOW_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                // create a grid of where I want to put items
                //TabLayout.put(1, ModBlocks.five_block_arch_1_1);
                //row1
                TabLayout.put(3, ModBlocks.FIVE_BLOCK_ARCH_1_1);
                TabLayout.put(4, ModBlocks.FIVE_BLOCK_ARCH_1_2);
                TabLayout.put(5, ModBlocks.SIX_BLOCK_INNER_ARCH);
                TabLayout.put(6, ModBlocks.FIVE_BLOCK_ARCH_1_4);
                TabLayout.put(7, ModBlocks.FIVE_BLOCK_ARCH_1_5);
                //row2
                TabLayout.put(12, ModBlocks.FIVE_BLOCK_ARCH_2_1);
                TabLayout.put(13, ModBlocks.FIVE_BLOCK_ARCH_2_2);
                TabLayout.put(14, ModBlocks.FIVE_BLOCK_ARCH_2_3);
                TabLayout.put(15, ModBlocks.FIVE_BLOCK_ARCH_2_4);
                TabLayout.put(16, ModBlocks.FIVE_BLOCK_ARCH_2_5);

                //row3
                TabLayout.put(21, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(20, ModBlocks.FIVE_BLOCK_ARCH_3_2);
                TabLayout.put(21, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(20, ModBlocks.DOUBLE_ARCHED_WINDOW_6_4);
                TabLayout.put(21, ModBlocks.QUARTZ_BRICKS);


                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());

    public static final CreativeModeTab TRIPLE_WINDOWS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            TRIPLE_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.architecture_blocks.triple_arched_window_blocks_tab"))
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
                TabLayout.put(38, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(39, ModBlocks.TRIPLE_WINDOW_1_1);
                TabLayout.put(40, ModBlocks.TRIPLE_WINDOW_1_2);
                TabLayout.put(41, ModBlocks.TRIPLE_WINDOW_1_3);
                TabLayout.put(42, ModBlocks.TRIPLE_WINDOW_1_4);
                TabLayout.put(43, ModBlocks.QUARTZ_BRICKS);
                //row 5 (45-53)
                TabLayout.put(47, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(48, ModBlocks.TRIPLE_WINDOW_0_1);
                TabLayout.put(49, ModBlocks.TRIPLE_WINDOW_0_2);
                TabLayout.put(50, ModBlocks.TRIPLE_WINDOW_0_3);
                TabLayout.put(51, ModBlocks.TRIPLE_WINDOW_0_4);
                TabLayout.put(52, ModBlocks.QUARTZ_BRICKS);

                // 2. Find the highest slot index used to determine where to stop the loop
                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());

    public static final CreativeModeTab FOUR_ARCHED_WINDOW_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            FOUR_ARCHED_WINDOW_TAB_KEY,
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.architecture_blocks.four_arched_window_blocks_tab"))
            .icon(() -> new ItemStack(ModBlocks.FOUR_ARCHED_WINDOW_COMPLETE))
            .displayItems((displayContext, entries) -> {
                // create a grid of where I want to put items
                Map<Integer, Block> TabLayout = new HashMap<>();
                // create a grid of where I want to put items
                TabLayout.put(1, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(2, ModBlocks.TRIPLE_WINDOW_0_1);
                TabLayout.put(3, ModBlocks.TRIPLE_WINDOW_0_3);
                TabLayout.put(4, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_BASE);
                TabLayout.put(5, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_BASE);
                TabLayout.put(6, ModBlocks.TRIPLE_WINDOW_0_2);
                TabLayout.put(7, ModBlocks.TRIPLE_WINDOW_0_4);
                TabLayout.put(8, ModBlocks.QUARTZ_BRICKS);

                //row 2
                TabLayout.put(10, ModBlocks.SIX_BLOCK_ARCH_2_1);
                TabLayout.put(11, ModBlocks.TRIPLE_WINDOW_1_1);
                TabLayout.put(12, ModBlocks.TRIPLE_WINDOW_1_3);
                TabLayout.put(13, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_MIDDLE);
                TabLayout.put(14, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_MIDDLE);
                TabLayout.put(15, ModBlocks.TRIPLE_WINDOW_1_2);
                TabLayout.put(16, ModBlocks.TRIPLE_WINDOW_1_4);
                TabLayout.put(17, ModBlocks.SIX_BLOCK_ARCH_2_8);

                //row3
                TabLayout.put(19, ModBlocks.SIX_BLOCK_ARCH_1_1);
                TabLayout.put(20, ModBlocks.TRIPLE_WINDOW_2_1);
                TabLayout.put(21, ModBlocks.TRIPLE_WINDOW_2_3);
                TabLayout.put(22, ModBlocks.ARCHED_WINDOW_LEFT_HALF_COLUMN_CAP);
                TabLayout.put(23, ModBlocks.ARCHED_WINDOW_RIGHT_HALF_COLUMN_CAP);
                TabLayout.put(24, ModBlocks.TRIPLE_WINDOW_2_2);
                TabLayout.put(25, ModBlocks.TRIPLE_WINDOW_2_4);
                TabLayout.put(26, ModBlocks.SIX_BLOCK_ARCH_1_8);

                //row4
                TabLayout.put(28, ModBlocks.SIX_BLOCK_ARCH_2_1);
                TabLayout.put(29, ModBlocks.SIX_BLOCK_ARCH_2_2);
                TabLayout.put(30, ModBlocks.SIX_BLOCK_INNER_ARCH);
                TabLayout.put(31, ModBlocks.SIX_BLOCK_INNER_ARCH);
                TabLayout.put(32, ModBlocks.SIX_BLOCK_INNER_ARCH);
                TabLayout.put(33, ModBlocks.SIX_BLOCK_INNER_ARCH);
                TabLayout.put(34, ModBlocks.SIX_BLOCK_ARCH_2_7);
                TabLayout.put(35, ModBlocks.SIX_BLOCK_ARCH_2_8);

                //row5
                TabLayout.put(37, ModBlocks.SIX_BLOCK_ARCH_3_1);
                TabLayout.put(38, ModBlocks.SIX_BLOCK_ARCH_3_2);
                TabLayout.put(39, ModBlocks.SIX_BLOCK_ARCH_3_3);
                TabLayout.put(40, ModBlocks.SIX_BLOCK_INNER_ARCH);
                TabLayout.put(41, ModBlocks.SIX_BLOCK_INNER_ARCH);
                TabLayout.put(42, ModBlocks.SIX_BLOCK_ARCH_3_6);
                TabLayout.put(43, ModBlocks.SIX_BLOCK_ARCH_3_7);
                TabLayout.put(44, ModBlocks.SIX_BLOCK_ARCH_3_8);

                //row6
                TabLayout.put(46, ModBlocks.QUARTZ_BRICKS);
                TabLayout.put(47, ModBlocks.SIX_BLOCK_ARCH_4_2);
                TabLayout.put(48, ModBlocks.SIX_BLOCK_ARCH_4_3);
                TabLayout.put(49, ModBlocks.SIX_BLOCK_ARCH_4_4);
                TabLayout.put(50, ModBlocks.SIX_BLOCK_ARCH_4_5);
                TabLayout.put(51, ModBlocks.SIX_BLOCK_ARCH_4_6);
                TabLayout.put(52, ModBlocks.SIX_BLOCK_ARCH_4_7);
                TabLayout.put(53, ModBlocks.QUARTZ_BRICKS);

                //row7
                TabLayout.put(18, ModBlocks.ARCHED_WINDOW_MIDDLE_BASE);
                TabLayout.put(27, ModBlocks.ARCHED_WINDOW_MIDDLE_COLUMN);
                TabLayout.put(36, ModBlocks.ARCHED_WINDOW_MIDDLE_CAP);

                int maxSlot = TabLayout.keySet().stream().max(Integer::compare).orElse(0);
                for (int slotIndex = 0; slotIndex <= maxSlot; slotIndex++) {
                    ItemStack stack = TabLayout.containsKey(slotIndex)
                            ? new ItemStack(TabLayout.get(slotIndex))
                            : new ItemStack(ModBlocks.INVISIBLE);

                    stack.set(MY_INT_COMPONENT, slotIndex);
                    entries.accept(stack);
                }
            }).build());

    public static void registerModCreativeModeTabs() {
        Architecture_blocks.LOGGER.info("Registering Creative Mode Tabs for " + Architecture_blocks.MOD_ID);
    }
}
