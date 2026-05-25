package net.minecraft.architecturemod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.architecturemod.ArchitectureMod;
import net.minecraft.architecturemod.block.ModBlocks;
import net.minecraft.architecturemod.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
        public static final CreativeModeTab ARCHITECTURE_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, "architecture_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GENERIC_ITEM))
                    .title(Component.translatable("creativemodetab.ArchitectureMod.architecture_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.QUARTZ_PILLAR);
                    }).build());

        public static void registerModCreativeModeTabs() {
            ArchitectureMod.LOGGER.info("Registering Creative Mode Tabs for " + ArchitectureMod.MOD_ID);
        }
}
