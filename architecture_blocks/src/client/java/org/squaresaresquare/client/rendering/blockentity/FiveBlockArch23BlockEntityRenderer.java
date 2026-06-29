
package org.squaresaresquare.client.rendering.blockentity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import org.squaresaresquare.client.block.entity.custom.FiveBlockArch23BlockEntity;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class FiveBlockArch23BlockEntityRenderer implements BlockEntityRenderer<FiveBlockArch23BlockEntity, FiveBlockArch23BlockEntityRenderState> {
    private final Font font;
    private final ItemModel itemModel = null;

    public FiveBlockArch23BlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public FiveBlockArch23BlockEntityRenderState createRenderState() {
        return new FiveBlockArch23BlockEntityRenderState();
    }

    @Override
    public void extractRenderState(FiveBlockArch23BlockEntity blockEntity, FiveBlockArch23BlockEntityRenderState state, float tickProgress, Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);
    }

    @Override
    public void submit(FiveBlockArch23BlockEntityRenderState state, PoseStack matrices, SubmitNodeCollector queue, CameraRenderState cameraState) {
        matrices.pushPose();
        matrices.translate(0.5, 1, 0.5);
        matrices.mulPose(Axis.XP.rotationDegrees(90));
        matrices.scale(1 / 18f, 1 / 18f, 1 / 18f);
        matrices.popPose();
    }
}
        
