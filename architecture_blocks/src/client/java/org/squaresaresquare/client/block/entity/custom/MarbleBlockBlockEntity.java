
package org.squaresaresquare.client.block.entity.custom;

import org.squaresaresquare.client.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MarbleBlockBlockEntity extends BlockEntity {
    public MarbleBlockBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MARBLE_BLOCK_BLOCK_ENTITY, pos, state);
    }
}
        
