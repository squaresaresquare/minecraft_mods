package org.seanpaulhumphrey.architecture;

import net.fabricmc.api.ClientModInitializer;
import org.seanpaulhumphrey.architecture.block.entity.ModBlockEntities;
import org.seanpaulhumphrey.architecture.block.entity.renderer.QuartzPillarEntityRenderer;
import org.seanpaulhumphrey.architecture.screen.ModScreenHandlers;
import org.seanpaulhumphrey.architecture.screen.custom.PillarScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class ArchitectureModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.PILLAR_BE, QuartzPillarEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.PILLAR_SCREEN_HANDLER, PillarScreen::new);
    }
}
