package org.squaresaresquare.client.rendering.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.squaresaresquare.client.block.entity.custom.TripleWindow11BlockEntity;

public class TripleWindow11BlockEntityRenderer implements BlockEntityRenderer<TripleWindow11BlockEntity, TripleWindow11BlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public TripleWindow11BlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public TripleWindow11BlockEntityRenderState createRenderState() {
        return new TripleWindow11BlockEntityRenderState();
    }

    @Override
    public void extractRenderState(TripleWindow11BlockEntity blockEntity, TripleWindow11BlockEntityRenderState state, float tickProgress, Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(TripleWindow11BlockEntityRenderState state, PoseStack matrices, SubmitNodeCollector queue, CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
        
