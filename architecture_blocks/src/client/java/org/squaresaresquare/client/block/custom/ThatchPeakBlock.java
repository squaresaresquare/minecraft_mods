package org.squaresaresquare.client.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.squaresaresquare.client.block.ModBlocks;
import org.squaresaresquare.client.block.entity.custom.ThatchPeakBlockEntity;

import javax.swing.text.html.BlockView;

public class ThatchPeakBlock extends RotatedPillarBlock {
    public static final MapCodec<RotatedPillarBlock> CODEC = simpleCodec(RotatedPillarBlock::new);

    public ThatchPeakBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape makeShape() {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0.375, 0, 0, 0.625, 0.5625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 0.125, 0.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0, 0, 1, 0.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0, 0.25, 0.25, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.75, 0, 0, 0.875, 0.25, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0, 0, 0.375, 0.375, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.625, 0, 0, 0.75, 0.375, 1), BooleanOp.OR);

        return shape;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {
        return this.makeShape();
    }

    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, CollisionContext context) {
        return this.makeShape();
    }

    @Override
    public MapCodec<? extends RotatedPillarBlock> codec() {
        return simpleCodec(ThatchPeakBlock::new);
    }

    @Nullable
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ThatchPeakBlockEntity(pos, state);
    }

    public void onInitialize() {
        ModBlocks.initialize();
    }
}