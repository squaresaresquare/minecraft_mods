package net.minecraft.architecturemod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.architecturemod.ArchitectureMod;
import net.minecraft.architecturemod.block.ModBlocks;
//import net.minecraft.architecturemod.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
//import org.objectweb.asm.tree.analysis.Value;

public class ModCreativeModeTabs {
    public static final CreativeModeTab FLUORITE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, "architecturemod_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.QUARTZ_PILLAR))
                    .title(Component.translatable("creativemodetab.architecturemod.quartz_pillar"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.QUARTZ_PILLAR);
                        output.accept(ModBlocks.QUARTZ_PILLAR_CAP);
                        output.accept(ModBlocks.QUARTZ_PILLAR_BASE);
                        output.accept(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1);
                        //::new block here
                    }).build());

    public static void registerModCreativeModeTabs() {
        ArchitectureMod.LOGGER.info("Registering Creative Mode Tabs for " + ArchitectureMod.MOD_ID);
    }
}
