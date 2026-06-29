package net.minecraft.block.entity.custom;

import net.minecraft.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class OakLogBlockEntity extends BlockEntity {
    public OakLogBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.OAK_LOG_BLOCK_ENTITY, pos, state);
    }
}
        
