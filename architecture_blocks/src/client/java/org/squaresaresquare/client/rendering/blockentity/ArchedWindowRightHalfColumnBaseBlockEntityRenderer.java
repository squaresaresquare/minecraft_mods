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
import org.squaresaresquare.client.block.entity.custom.ArchedWindowRightHalfColumnBaseBlockEntity;

public class ArchedWindowRightHalfColumnBaseBlockEntityRenderer implements BlockEntityRenderer<ArchedWindowRightHalfColumnBaseBlockEntity, ArchedWindowRightHalfColumnBaseBlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public ArchedWindowRightHalfColumnBaseBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public ArchedWindowRightHalfColumnBaseBlockEntityRenderState createRenderState() {
        return new ArchedWindowRightHalfColumnBaseBlockEntityRenderState();
    }

    @Override
    public void extractRenderState(ArchedWindowRightHalfColumnBaseBlockEntity blockEntity, ArchedWindowRightHalfColumnBaseBlockEntityRenderState state, float tickProgress, Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(ArchedWindowRightHalfColumnBaseBlockEntityRenderState state, PoseStack matrices, SubmitNodeCollector queue, CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
        
