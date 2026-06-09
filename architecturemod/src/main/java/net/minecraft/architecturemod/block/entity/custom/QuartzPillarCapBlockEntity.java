package net.minecraft.architecturemod.block.entity.custom;

import net.minecraft.architecturemod.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class QuartzPillarCapBlockEntity extends BlockEntity {
    public QuartzPillarCapBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.QUARTZ_PILLAR_CAP_BLOCK_ENTITY, pos, state);
    }
}
