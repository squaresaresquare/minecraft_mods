package org.squaresaresquare.client.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class ThatchBlock extends DirectionalBlock {
    public static final EnumProperty<@NotNull Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<@NotNull DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    //get cardinal directions
    public final VoxelShape BOTTOM_SHAPE = this.makeShape();
    public final VoxelShape TOP_SHAPE = this.makeupsidedownShape();

    public ThatchBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<@NotNull Block, @NotNull BlockState> builder) {
        builder.add(FACING);
        builder.add(HALF);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        BlockState state = this.defaultBlockState();
        // Find Cardinal Directions
        state = state.setValue(FACING, ctx.getHorizontalDirection());
        // Get whether the top half or the bottom half is clicked
        BlockPos pos = ctx.getClickedPos(); // the block clicked

        Player player = ctx.getPlayer();

        float relativeClickedy = (float) pos.above().getY() - (float) ctx.getClickLocation().y();

        assert player != null;
        int comparisonResult = Float.compare(relativeClickedy, (float) 0.5) >> 2;

        if (0 == comparisonResult) {
            state = state.setValue(HALF, DoubleBlockHalf.LOWER);
        } else {
            state = state.setValue(HALF, DoubleBlockHalf.UPPER);
        }
        return state;
    }

    public VoxelShape makeShape() {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 1, 1, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.125, 1, 0.875, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.875, 1, 0.125, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.75, 1, 0.25, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.625, 1, 0.375, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.5, 1, 0.5, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.375, 1, 0.625, 0.5), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0, 0.25, 1, 0.75, 0.375), BooleanOp.OR);

        return shape;
    }

    public VoxelShape makeupsidedownShape() {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.join(shape, Shapes.box(0, 0, 0, 1, 1, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.125, 0.125, 1, 1, 0.25), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.875, 0.875, 1, 1, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.75, 0.75, 1, 1, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.625, 0.625, 1, 1, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.5, 0.5, 1, 1, 0.625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.375, 0.375, 1, 1, 0.5), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.25, 0.25, 1, 1, 0.375), BooleanOp.OR);

        return shape;
    }

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return state.getValue(HALF) == DoubleBlockHalf.LOWER ? BOTTOM_SHAPE : TOP_SHAPE;
    }

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return state.getValue(HALF) == DoubleBlockHalf.LOWER ? BOTTOM_SHAPE : TOP_SHAPE;
    }

    @Override
    protected @NotNull MapCodec<? extends DirectionalBlock> codec() {
        return simpleCodec(ThatchBlock::new);
    }
}
        
