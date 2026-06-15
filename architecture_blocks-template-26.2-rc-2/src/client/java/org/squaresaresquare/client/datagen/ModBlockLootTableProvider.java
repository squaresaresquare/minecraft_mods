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
    dropSelf(ModBlocks.QUAD_WINDOW_1_1);
    dropSelf(ModBlocks.QUAD_WINDOW_1_2);
    dropSelf(ModBlocks.QUAD_WINDOW_1_3);
    dropSelf(ModBlocks.QUAD_WINDOW_1_4);
    dropSelf(ModBlocks.QUAD_WINDOW_1_5);
    dropSelf(ModBlocks.QUAD_WINDOW_1_6);
        //::new block here
    }
}