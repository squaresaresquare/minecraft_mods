package org.squaresaresquare.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.squaresaresquare.client.block.entity.ModBlockEntities;

public class QuartzBricksBlockEntity extends BlockEntity {
    public QuartzBricksBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.QUARTZ_BRICKS_BLOCK_ENTITY, pos, state);
    }
}
        
