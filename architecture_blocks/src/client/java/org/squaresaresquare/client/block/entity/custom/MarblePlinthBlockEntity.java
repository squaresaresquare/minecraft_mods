package org.squaresaresquare.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.squaresaresquare.client.block.entity.ModBlockEntities;


public class MarblePlinthBlockEntity extends BlockEntity {
    public MarblePlinthBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MARBLE_PLINTH_BLOCK_ENTITY, pos, state);
    }
}
