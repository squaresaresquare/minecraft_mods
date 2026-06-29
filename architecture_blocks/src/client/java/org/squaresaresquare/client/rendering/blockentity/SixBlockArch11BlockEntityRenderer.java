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
import org.squaresaresquare.client.block.entity.custom.SixBlockArch11BlockEntity;

public class SixBlockArch11BlockEntityRenderer implements BlockEntityRenderer<SixBlockArch11BlockEntity, SixBlockArch11BlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public SixBlockArch11BlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public SixBlockArch11BlockEntityRenderState createRenderState() {
        return new SixBlockArch11BlockEntityRenderState();
    }

    @Override
    public void extractRenderState(SixBlockArch11BlockEntity blockEntity, SixBlockArch11BlockEntityRenderState state, float tickProgress, Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(SixBlockArch11BlockEntityRenderState state, PoseStack matrices, SubmitNodeCollector queue, CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(1, 1, 1);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
        
