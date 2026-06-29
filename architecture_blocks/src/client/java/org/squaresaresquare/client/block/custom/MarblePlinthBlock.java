package org.squaresaresquare.client.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.MarblePlinthBlockEntity;

import javax.swing.text.html.BlockView;

public class MarblePlinthBlock extends BaseEntityBlock {
    public MarblePlinthBlock(Properties settings) {
        super(settings);
    }

    public VoxelShape makeShape() {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.125, 0.875, 0.0625, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.1875, 0.0625, 0.1875, 0.8125, 0.1875, 0.8125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.9375, 0.125, 0.875, 1, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.1875, 0.8125, 0.1875, 0.8125, 0.9375, 0.8125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 0.1875, 0.3125, 0.6875, 0.8125, 0.6875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0.1875, 0.25, 0.3125, 0.8125, 0.375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0.1875, 0.625, 0.3125, 0.8125, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6875, 0.1875, 0.3125, 0.75, 0.8125, 0.375), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.6875, 0.1875, 0.625, 0.75, 0.8125, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 0.1875, 0.6875, 0.375, 0.8125, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.625, 0.1875, 0.6875, 0.6875, 0.8125, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.3125, 0.1875, 0.25, 0.375, 0.8125, 0.3125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.625, 0.1875, 0.25, 0.6875, 0.8125, 0.3125), BooleanOp.OR);

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
        return simpleCodec(MarblePlinthBlock::new);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MarblePlinthBlockEntity(pos, state);
    }

    public void onInitialize() {
        ModBlocks.initialize();
    }
}