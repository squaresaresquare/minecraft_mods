package org.squaresaresquare.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.squaresaresquare.client.block.entity.ModBlockEntities;

public class OakLogBlockEntity extends BlockEntity {
    public OakLogBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.OAK_LOG_BLOCK_ENTITY, pos, state);
    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new OakLogBlockEntity(pos, state);
    }
}
        
