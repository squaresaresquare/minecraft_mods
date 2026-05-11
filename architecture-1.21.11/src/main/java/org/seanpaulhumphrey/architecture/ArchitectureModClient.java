package org.seanpaulhumphrey.architecture;

import net.fabricmc.api.ClientModInitializer;
import org.seanpaulhumphrey.architecture.block.ModBlocks;
import org.seanpaulhumphrey.architecture.block.entity.ModBlockEntities;
import org.seanpaulhumphrey.architecture.block.entity.renderer.*;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import org.seanpaulhumphrey.architecture.screen.ModScreenHandlers;
import net.minecraft.client.render.BlockRenderLayer;
import org.seanpaulhumphrey.architecture.screen.custom.*;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class ArchitectureModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_1, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_ARCH_1_1_BE, TripleWindowTopArch11EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_ARCH_1_1_SCREEN_HANDLER, TripleWindowTopArch11Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_LEFT_BOTTOM, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_LEFT_BOTTOM_BE, TripleWindowLeftBottomEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_LEFT_BOTTOM_SCREEN_HANDLER, TripleWindowLeftBottomScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_2, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_2_2_BE, QuadWindowTopArch22EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_2_2_SCREEN_HANDLER, QuadWindowTopArch22Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_MIDDLE_LEFT, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_MIDDLE_LEFT_BE, TripleWindowMiddleLeftEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_MIDDLE_LEFT_SCREEN_HANDLER, TripleWindowMiddleLeftScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.THIN_QUARTZ_BASE, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.THIN_QUARTZ_BASE_BE, ThinQuartzBaseEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.THIN_QUARTZ_BASE_SCREEN_HANDLER, ThinQuartzBaseScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_6, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_1_6_BE, QuadWindowTopArch16EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_1_6_SCREEN_HANDLER, QuadWindowTopArch16Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_3, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_2_3_BE, QuadWindowTopArch23EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_2_3_SCREEN_HANDLER, QuadWindowTopArch23Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TWIN_COLUMN_CAPITAL, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TWIN_COLUMN_CAPITAL_BE, TwinColumnCapitalEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TWIN_COLUMN_CAPITAL_SCREEN_HANDLER, TwinColumnCapitalScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_CAP_LEFT, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_CAP_LEFT_BE, TripleWindowCapLeftEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_CAP_LEFT_SCREEN_HANDLER, TripleWindowCapLeftScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_4, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_2_4_BE, QuadWindowTopArch24EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_2_4_SCREEN_HANDLER, QuadWindowTopArch24Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_CAP_MIDDLE, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_CAP_MIDDLE_BE, TripleWindowTopCapMiddleEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_CAP_MIDDLE_SCREEN_HANDLER, TripleWindowTopCapMiddleScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_1, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_1_1_BE, QuadWindowTopArch11EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_1_1_SCREEN_HANDLER, QuadWindowTopArch11Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_MIDDLE, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_ARCH_MIDDLE_BE, TripleWindowTopArchMiddleEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_ARCH_MIDDLE_SCREEN_HANDLER, TripleWindowTopArchMiddleScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_MIDDLE_BOTTOM, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_MIDDLE_BOTTOM_BE, TripleWindowMiddleBottomEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_MIDDLE_BOTTOM_SCREEN_HANDLER, TripleWindowMiddleBottomScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_RIGHT_BOTTOM, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_RIGHT_BOTTOM_BE, TripleWindowRightBottomEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_RIGHT_BOTTOM_SCREEN_HANDLER, TripleWindowRightBottomScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_2, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_ARCH_2_2_BE, TripleWindowTopArch22EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_ARCH_2_2_SCREEN_HANDLER, TripleWindowTopArch22Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_LEFT, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_ARCH_LEFT_BE, TripleWindowTopArchLeftEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_ARCH_LEFT_SCREEN_HANDLER, TripleWindowTopArchLeftScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.THIN_QUARTZ_COLUMN, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.THIN_QUARTZ_COLUMN_BE, ThinQuartzColumnEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.THIN_QUARTZ_COLUMN_SCREEN_HANDLER, ThinQuartzColumnScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_2_3, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_ARCH_2_3_BE, TripleWindowTopArch23EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_ARCH_2_3_SCREEN_HANDLER, TripleWindowTopArch23Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_5, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_2_5_BE, QuadWindowTopArch25EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_2_5_SCREEN_HANDLER, QuadWindowTopArch25Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_3, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_1_3_BE, QuadWindowTopArch13EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_1_3_SCREEN_HANDLER, QuadWindowTopArch13Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_6, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_2_6_BE, QuadWindowTopArch26EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_2_6_SCREEN_HANDLER, QuadWindowTopArch26Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TWIN_COLUMNS, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TWIN_COLUMNS_BE, TwinColumnsEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TWIN_COLUMNS_SCREEN_HANDLER, TwinColumnsScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUARTZ_PILLAR, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUARTZ_PILLAR_BE, QuartzPillarEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUARTZ_PILLAR_SCREEN_HANDLER, QuartzPillarScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.HALF_QUARTZ_PILLAR, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.HALF_QUARTZ_PILLAR_BE, HalfQuartzPillarEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.HALF_QUARTZ_PILLAR_SCREEN_HANDLER, HalfQuartzPillarScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_2, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_1_2_BE, QuadWindowTopArch12EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_1_2_SCREEN_HANDLER, QuadWindowTopArch12Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TWIN_COLUMN_BASE, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TWIN_COLUMN_BASE_BE, TwinColumnBaseEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TWIN_COLUMN_BASE_SCREEN_HANDLER, TwinColumnBaseScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_3, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_ARCH_1_3_BE, TripleWindowTopArch13EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_ARCH_1_3_SCREEN_HANDLER, TripleWindowTopArch13Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_5, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_1_5_BE, QuadWindowTopArch15EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_1_5_SCREEN_HANDLER, QuadWindowTopArch15Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_2_1, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_2_1_BE, QuadWindowTopArch21EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_2_1_SCREEN_HANDLER, QuadWindowTopArch21Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.QUAD_WINDOW_TOP_ARCH_1_4, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.QUAD_WINDOW_TOP_ARCH_1_4_BE, QuadWindowTopArch14EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.QUAD_WINDOW_TOP_ARCH_1_4_SCREEN_HANDLER, QuadWindowTopArch14Screen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_MIDDLE_MIDDLE, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_MIDDLE_MIDDLE_BE, TripleWindowMiddleMiddleEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_MIDDLE_MIDDLE_SCREEN_HANDLER, TripleWindowMiddleMiddleScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.THIN_QUARTZ_CAPITAL, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.THIN_QUARTZ_CAPITAL_BE, ThinQuartzCapitalEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.THIN_QUARTZ_CAPITAL_SCREEN_HANDLER, ThinQuartzCapitalScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_CAP_RIGHT, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_CAP_RIGHT_BE, TripleWindowTopCapRightEntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_CAP_RIGHT_SCREEN_HANDLER, TripleWindowTopCapRightScreen::new);
    
        BlockRenderLayerMap.putBlock(ModBlocks.TRIPLE_WINDOW_TOP_ARCH_1_2, BlockRenderLayer.CUTOUT);
        BlockEntityRendererFactories.register(ModBlockEntities.TRIPLE_WINDOW_TOP_ARCH_1_2_BE, TripleWindowTopArch12EntityRenderer::new);
        HandledScreens.register(ModScreenHandlers.TRIPLE_WINDOW_TOP_ARCH_1_2_SCREEN_HANDLER, TripleWindowTopArch12Screen::new);
    
    }
}
