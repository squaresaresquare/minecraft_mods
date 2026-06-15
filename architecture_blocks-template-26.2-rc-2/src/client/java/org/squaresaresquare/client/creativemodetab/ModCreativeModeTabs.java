package org.squaresaresquare.client.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.resources.ResourceKey;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.Architecture_blocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
//import org.objectweb.asm.tree.analysis.Value;

public class ModCreativeModeTabs {
    public static final CreativeModeTab ARCHITECTURE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "architecture_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARBLE_PLINTH_BLOCK))
                    .title(Component.translatable("creativemodetab.architecture_blocks.marble_plinth_block"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.MARBLE_PLINTH_BLOCK);
                        output.accept(ModBlocks.WHITE_MARBLE_BLOCK);
                        output.accept(ModBlocks.QUAD_WINDOW_1_1);
                        output.accept(ModBlocks.QUAD_WINDOW_1_2);
                        output.accept(ModBlocks.QUAD_WINDOW_1_3);
                        output.accept(ModBlocks.QUAD_WINDOW_1_4);
                        output.accept(ModBlocks.QUAD_WINDOW_1_5);
                        //::new block here
                    }).build());
    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Architecture_blocks.MOD_ID, "creative_tab")
    );
    public static void registerModCreativeModeTabs() {
        Architecture_blocks.LOGGER.info("Registering Creative Mode Tabs for " + Architecture_blocks.MOD_ID);
    }
}
