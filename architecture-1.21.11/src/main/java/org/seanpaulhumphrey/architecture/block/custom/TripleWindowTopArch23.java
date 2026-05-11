package org.seanpaulhumphrey.architecture.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.level.LevelProperties.*;
import org.jetbrains.annotations.Nullable;
import net.minecraft.util.math.Direction;
import org.seanpaulhumphrey.architecture.block.entity.custom.TripleWindowTopArch23Entity;

public class TripleWindowTopArch23 extends BlockWithEntity implements BlockEntityProvider {
    public static final MapCodec<TripleWindowTopArch23> CODEC = TripleWindowTopArch23.createCodec(TripleWindowTopArch23::new);
    public TripleWindowTopArch23(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HorizontalFacingBlock.FACING, Direction.NORTH));
    }



    //the rest
    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TripleWindowTopArch23Entity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos,
                                         PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(world.getBlockEntity(pos) instanceof TripleWindowTopArch23Entity TripleWindowTopArch23BlockEntity) {
            if(TripleWindowTopArch23BlockEntity.isEmpty() && !stack.isEmpty()) {
                TripleWindowTopArch23BlockEntity.setStack(0, stack.copyWithCount(1));
                world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 2f);
                stack.decrement(1);

                TripleWindowTopArch23BlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
            } else if(stack.isEmpty() && !player.isSneaking()) {
                ItemStack stackOnQuartzPillar = TripleWindowTopArch23BlockEntity.getStack(0);
                player.setStackInHand(Hand.MAIN_HAND, stackOnQuartzPillar);
                world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 1f);
                TripleWindowTopArch23BlockEntity.clear();

                TripleWindowTopArch23BlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
            } else if(player.isSneaking() && !world.isClient()) {
                player.openHandledScreen(TripleWindowTopArch23BlockEntity);
            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(HorizontalFacingBlock.FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HorizontalFacingBlock.FACING);
    }

    //collision detection part
    protected static final VoxelShape NORTH_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape EAST_SHAPE =
            Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape WEST_SHAPE =
            Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    protected static final VoxelShape NORTH_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SOUTH_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    protected static final VoxelShape EAST_HALFSHAPE =
            VoxelShapes.cuboid(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    protected static final VoxelShape WEST_HALFSHAPE =
            VoxelShapes.cuboid(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(HorizontalFacingBlock.FACING)) {
            case SOUTH -> SOUTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case WEST -> WEST_SHAPE;
            default -> NORTH_SHAPE;
        };
    }
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(HorizontalFacingBlock.FACING)) {
            case SOUTH -> SOUTH_HALFSHAPE;
            case EAST -> EAST_HALFSHAPE;
            case WEST -> WEST_HALFSHAPE;
            default -> NORTH_HALFSHAPE;
        };
    }
}
    