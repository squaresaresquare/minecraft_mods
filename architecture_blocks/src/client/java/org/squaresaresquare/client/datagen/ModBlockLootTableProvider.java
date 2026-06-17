package org.squaresaresquare.client.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import org.squaresaresquare.client.block.ModBlocks;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }
    @Override
    public void generate() {
    dropSelf(ModBlocks.WHITE_MARBLE_BLOCK);
    dropSelf(ModBlocks.MARBLE_PILLAR);
    dropSelf(ModBlocks.MARBLE_PILLAR_BASE);
    dropSelf(ModBlocks.QUAD_WINDOW_0_1);
    dropSelf(ModBlocks.QUAD_WINDOW_0_2);
    dropSelf(ModBlocks.QUAD_WINDOW_0_3);
    dropSelf(ModBlocks.QUAD_WINDOW_0_4);
    dropSelf(ModBlocks.QUAD_WINDOW_1_4);
    dropSelf(ModBlocks.QUAD_WINDOW_1_2);
    dropSelf(ModBlocks.QUAD_WINDOW_1_3);
    dropSelf(ModBlocks.QUAD_WINDOW_1_1);
    dropSelf(ModBlocks.QUAD_WINDOW_2_1);    //::new block here
    }
}