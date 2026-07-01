package org.squaresaresquare.client.block.custom;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class HayBlockBlock extends Block {
    public HayBlockBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        // Return MODEL for standard rendering or ENTITYBLOCK_ANIMATED for block entities
        return RenderShape.MODEL;
    }
}