package org.seanpaulhumphrey.architecture.block.entity.renderer;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.seanpaulhumphrey.architecture.block.entity.custom.*;
import net.minecraft.client.item.ItemModelManager;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.world.LightType;

public class TripleWindowTopArchLeftEntityRenderer implements BlockEntityRenderer<TripleWindowTopArchLeftEntity, BlockEntityRenderState> {
    private final ItemModelManager itemModelManager;

    public TripleWindowTopArchLeftEntityRenderer(BlockEntityRendererFactory.Context context) {
        itemModelManager = context.itemModelManager();
    }

    @Override
    public TripleWindowTopArchLeftEntityRenderState createRenderState() {
        return new TripleWindowTopArchLeftEntityRenderState();
    }

    @Override
    public void render(BlockEntityRenderState state, MatrixStack matrices, OrderedRenderCommandQueue queue, CameraRenderState cameraRenderState) {

    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}
    