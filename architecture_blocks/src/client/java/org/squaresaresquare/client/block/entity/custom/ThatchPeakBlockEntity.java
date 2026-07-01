package org.squaresaresquare.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.squaresaresquare.client.block.entity.ModBlockEntities;

public class ThatchPeakBlockEntity extends BlockEntity {
    public ThatchPeakBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.THATCH_PEAK_BLOCK_ENTITY, pos, state);
    }
}
        
