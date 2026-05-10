package org.seanpaulhumphrey.architecture.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(ModBlocks.QUARTZ_PILLAR);
        addDrop(ModBlocks.HALF_QUARTZ_PILLAR);
                addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_2);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_3);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_4);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_5);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_6);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_1);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_2);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_3);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_4);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_5);

        addDrop(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_6);

        addDrop(ModBlocks.THIN_QUARTZ_BASE);

        addDrop(ModBlocks.THIN_QUARTZ_CAPITAL);

        addDrop(ModBlocks.THIN_QUARTZ_COLUMN);

        addDrop(ModBlocks.TRIPLE_WINDOW_CAP_LEFT);

        addDrop(ModBlocks.TRIPLE_WINDOW_LEFT_BOTTOM);

        addDrop(ModBlocks.TRIPLE_WINDOW_MIDDLE_BOTTOM);

        addDrop(ModBlocks.TRIPLE_WINDOW_MIDDLE_LEFT);

        addDrop(ModBlocks.TRIPLE_WINDOW_MIDDLE_MIDDLE);

        addDrop(ModBlocks.TRIPLE_WINDOW_RIGHT_BOTTOM);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_1);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_2);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_3);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_2);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_3);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_LEFT);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_MIDDLE);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_CAP_MIDDLE);

        addDrop(ModBlocks.TRIPLE_WINDOW_TOP_CAP_RIGHT);

        addDrop(ModBlocks.TWIN_COLUMN_BASE);

        addDrop(ModBlocks.TWIN_COLUMN_CAPITAL);

        addDrop(ModBlocks.TWIN_COLUMNS);

    }
}

