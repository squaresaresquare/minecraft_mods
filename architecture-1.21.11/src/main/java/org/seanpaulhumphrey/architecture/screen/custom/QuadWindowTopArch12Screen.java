package org.seanpaulhumphrey.architecture.screen.custom;

    import net.minecraft.client.gl.RenderPipelines;
    import net.minecraft.client.gui.DrawContext;
    import net.minecraft.client.gui.screen.ingame.HandledScreen;
    import net.minecraft.entity.player.PlayerInventory;
    import net.minecraft.text.Text;
    import net.minecraft.util.Identifier;
    import org.seanpaulhumphrey.architecture.Architecture;

    public class QuadWindowTopArch12Screen extends HandledScreen<QuadWindowTopArch12ScreenHandler> {
        public static final Identifier GUI_TEXTURE =
                Identifier.of(Architecture.MOD_ID, "textures/gui/pillar/pillar_gui.png");

        public QuadWindowTopArch12Screen(QuadWindowTopArch12ScreenHandler handler, PlayerInventory inventory, Text title) {
            super(handler, inventory, title);
        }

        @Override
        protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
            int x = (width - backgroundWidth) / 2;
            int y = (height - backgroundHeight) / 2;

            context.drawTexture(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight, 256, 256);
        }

        @Override
            public void render(DrawContext context, int mouseX, int mouseY, float delta) {
            super.render(context, mouseX, mouseY, delta);
                drawMouseoverTooltip(context, mouseX, mouseY);
        }
    }