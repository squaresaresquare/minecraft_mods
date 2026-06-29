
package org.squaresaresquare.client.block.custom;

import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.swing.text.html.BlockView;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.squaresaresquare.Architecture_blocks;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.SixBlockArch45BlockEntity;

public class SixBlockArch45Block extends BaseEntityBlock {
        public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public SixBlockArch45Block(BlockBehaviour.Properties properties) {
        super(properties);
        // stateDefinition.any() returns a random BlockState from an internal set,
        // we don't care because we're setting all values ourselves anyway
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
        );
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public VoxelShape makeShape(){
    	VoxelShape shape = Shapes.empty();
    	shape = Shapes.join(shape, Shapes.box(0, 0, 0, 1, 1, 1), BooleanOp.OR);
    
    	return shape;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {
        return this.makeShape();
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {
        return this.makeShape();
    }


    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return simpleCodec(SixBlockArch45Block::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SixBlockArch45BlockEntity(pos, state);
    }

    public void onInitialize() {
        ModBlocks.initialize();
    }
}
        
