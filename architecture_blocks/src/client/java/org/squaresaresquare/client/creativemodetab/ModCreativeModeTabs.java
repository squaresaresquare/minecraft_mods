package org.squaresaresquare.client.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.Architecture_blocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab ARCHITECTURE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "architecture_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARBLE_PLINTH_BLOCK))
                    .title(Component.translatable("creativemodetab.architecture_blocks.marble_plinth_block"))
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

    public static final CreativeModeTab TRIPLE_WINDOW = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "triple_window"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.TRIPLE_WIND0W_COMPLETE))
                    .title(Component.translatable("creativemodetab.architecture_blocks.triple_window_complete"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModBlocks.TRIPLE_WINDOW_0_1);
                        output.accept(ModBlocks.TRIPLE_WINDOW_0_2);
                        output.accept(ModBlocks.TRIPLE_WINDOW_0_3);
                        output.accept(ModBlocks.TRIPLE_WINDOW_0_4);

                        output.accept(ModBlocks.TRIPLE_WINDOW_1_1);
                        output.accept(ModBlocks.TRIPLE_WINDOW_1_2);
                        output.accept(ModBlocks.TRIPLE_WINDOW_1_3);
                        output.accept(ModBlocks.TRIPLE_WINDOW_1_4);

                        output.accept(ModBlocks.TRIPLE_WINDOW_2_0);
                        output.accept(ModBlocks.TRIPLE_WINDOW_2_1);
                        output.accept(ModBlocks.TRIPLE_WINDOW_2_2);
                        output.accept(ModBlocks.TRIPLE_WINDOW_2_3);
                        output.accept(ModBlocks.TRIPLE_WINDOW_2_4);
                        output.accept(ModBlocks.TRIPLE_WINDOW_2_5);

                        output.accept(ModBlocks.TRIPLE_WINDOW_3_0);
                        output.accept(ModBlocks.TRIPLE_WINDOW_3_1);
                        output.accept(ModBlocks.TRIPLE_WINDOW_3_2);
                        output.accept(ModBlocks.TRIPLE_WINDOW_3_3);
                        output.accept(ModBlocks.TRIPLE_WINDOW_3_4);
                        output.accept(ModBlocks.TRIPLE_WINDOW_3_5);

                        output.accept(ModBlocks.TRIPLE_WINDOW_4_0);
                        output.accept(ModBlocks.TRIPLE_WINDOW_4_1);
                        output.accept(ModBlocks.TRIPLE_WINDOW_4_2);
                        output.accept(ModBlocks.TRIPLE_WINDOW_4_3);
                        output.accept(ModBlocks.TRIPLE_WINDOW_4_4);
                        output.accept(ModBlocks.TRIPLE_WINDOW_4_5);

                        output.accept(ModBlocks.TRIPLE_WINDOW_5_0);
                        output.accept(ModBlocks.TRIPLE_WINDOW_5_1);
                        output.accept(ModBlocks.TRIPLE_WINDOW_5_2);
                        output.accept(ModBlocks.TRIPLE_WINDOW_5_3);
                        output.accept(ModBlocks.TRIPLE_WINDOW_5_4);
                        output.accept(ModBlocks.TRIPLE_WINDOW_5_5);

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
