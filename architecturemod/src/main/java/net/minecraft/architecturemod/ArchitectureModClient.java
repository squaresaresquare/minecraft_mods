package net.minecraft.architecturemod;

import com.mojang.serialization.MapCodec;
import com.sun.jna.platform.win32.WinGDI;
import net.minecraft.architecturemod.block.ModBlocks;
import net.minecraft.client.renderer.rendertype.RenderType;

import java.awt.image.ColorModel;
import java.util.List;
import java.util.TreeSet;

import net.minecraft.client.color.block.BlockTintSource;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.color.item.ItemTintSources;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.block.FluidModel;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.TintedGlassBlock;
import net.minecraft.world.level.block.TransparentBlock;
import net.minecraft.world.level.block.state.BlockState;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.architecturemod.ArchitectureMod;
import org.w3c.dom.css.RGBColor;

import javax.swing.text.AttributeSet;

import static com.mojang.serialization.codecs.RecordCodecBuilder.instance;
import static com.mojang.serialization.codecs.RecordCodecBuilder.mapCodec;
import static org.apache.commons.lang3.function.Functions.apply;


public class ArchitectureModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //ItemTintSources.ID_MAPPER.put(Identifier.fromNamespaceAndPath(ArchitectureMod.MOD_ID,"color"));
        BlockColorRegistry.register(List.of(new BlockTintSource() {
            @Override
            public int colorInWorld(BlockState state, BlockAndTintGetter level, BlockPos pos) {
                BlockState stateBelow = level.getBlockState(pos.below());

                if (stateBelow.is(Blocks.GRASS_BLOCK)) {
                    return 0xFF98FB98; // Color code in hex format
                }

                return 0xFFFFDAB9; // Color code in hex format
            }

            @Override
            public int color(BlockState state) {
                return 0xFFFFDAB9; // Color code in hex format
            }
        }), ModBlocks.QUARTZ_PILLAR_BLOCK);
    }
}