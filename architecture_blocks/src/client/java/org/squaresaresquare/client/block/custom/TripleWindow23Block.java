package org.squaresaresquare.client.block.custom;

import com.mojang.serialization.MapCodec;
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
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.TripleWindow23BlockEntity;

import javax.swing.text.html.BlockView;

public class TripleWindow23Block extends BaseEntityBlock {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public TripleWindow23Block(BlockBehaviour.Properties properties) {
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

    public VoxelShape makeShape() {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.125, 1, 0.75, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5625, 0, 0.375, 0.6875, 0.125, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6875, 0, 0.4375, 0.75, 0.125, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5, 0, 0.4375, 0.5625, 0.125, 0.5625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.75, 0.125, 1, 0.875, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.3125, 0.25, 0.875, 0.375, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.1875, 0.25, 0.8125, 0.3125, 0.6875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.5, 0.125, 0.25, 0.75, 0.1875, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.375, 0.25, 0.875, 0.4375, 0.8125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.1875, 0.6875, 0.25, 1, 0.75, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 0.625, 0.25, 0.9375, 0.6875, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.4375, 0.4375, 0.25, 0.8125, 0.5625, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.375, 0.5625, 0.25, 0.875, 0.625, 0.75), BooleanOp.OR);

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
        return simpleCodec(TripleWindow23Block::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new TripleWindow23BlockEntity(pos, state);
    }

    public void onInitialize() {
        ModBlocks.initialize();
    }
}
        
