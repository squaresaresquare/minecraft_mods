package net.minecraft.architecturemod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.architecturemod.ArchitectureMod;
import net.minecraft.architecturemod.block.ModBlocks;
//import net.minecraft.architecturemod.item.ModItems;
import net.minecraft.architecturemod.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;


//import org.objectweb.asm.tree.analysis.Value;


public class ModCreativeModeTabs {
    public static final ResourceKey<@NotNull CreativeModeTab> ARCHITECTURE_BLOCKS = createKey("building_blocks");
    public static final CreativeModeTab ARCHITECTURE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID, "architecturemod_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GENERIC_ITEM))
                    .title(Component.translatable("block.architecturemod.quartz_pillar"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.QUARTZ_PILLAR_BLOCK);
                    }).build());

    public static void registerModCreativeModeTabs() {
        ArchitectureMod.LOGGER.info("Registering Creative Mode Tabs for " + ArchitectureMod.MOD_ID);
    }
    private static ResourceKey<CreativeModeTab> createKey(final String id) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.withDefaultNamespace(id));
    }
}
