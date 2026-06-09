package net.minecraft.architecturemod.block.entity.custom;

import net.minecraft.architecturemod.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class QuartzPillarBaseBlockEntity extends BlockEntity {
    public QuartzPillarBaseBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.QUARTZ_PILLAR_BASE_BLOCK_ENTITY, pos, state);
    }
}
