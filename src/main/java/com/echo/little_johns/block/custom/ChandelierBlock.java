package com.echo.little_johns.block.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.explosion.Explosion;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.ToIntFunction;

public class ChandelierBlock
        extends AbstractCandleBlock
        implements Waterloggable {
    public static final MapCodec<ChandelierBlock> CODEC = ChandelierBlock.createCodec(ChandelierBlock::new);
    public static final BooleanProperty LIT = AbstractCandleBlock.LIT;
    public static final BooleanProperty HANGING = Properties.HANGING;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final ToIntFunction<BlockState> STATE_TO_LUMINANCE =  state -> state.get(LIT) != false ? 15 : 0;
    private static final Int2ObjectMap<List<Vec3d>> CHANDELIER_STATE_TO_PARTICLE_OFFSETS = Util.make(() -> {
        Int2ObjectOpenHashMap int2ObjectMap = new Int2ObjectOpenHashMap();
        int2ObjectMap.defaultReturnValue(ImmutableList.of());
        int2ObjectMap.put(0, ImmutableList.of( new Vec3d(0.5, 0.9375, 0.1875), new Vec3d(0.1875, 0.9375, 0.5), new Vec3d(0.8125, 0.9375, 0.5), new Vec3d(0.5, 0.9375, 0.8125), new Vec3d(0.5, 1.0625, 0.5)));
        int2ObjectMap.put(1, ImmutableList.of( new Vec3d(0.5, 0.9375, 0.1875), new Vec3d(0.1875, 0.9375, 0.5), new Vec3d(0.8125, 0.9375, 0.5), new Vec3d(0.5, 0.9375, 0.8125)));
        return Int2ObjectMaps.unmodifiable(int2ObjectMap);
    });
    protected static final VoxelShape STANDING_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(4.5, 0.0, 4.5, 11.5, 4.0, 11.5),
            Block.createCuboidShape(8.0, 2.0, 0.0, 8.0, 5.0, 14.0),
            Block.createCuboidShape(7.0, 5.0, 2.0, 9.0, 13.0, 4.0),
            Block.createCuboidShape(12.0, 5.0, 7.0, 14.0, 13.0, 9.0),
            Block.createCuboidShape(7.0, 5.0, 12.0, 9.0, 13.0, 14.0),
            Block.createCuboidShape(2.0, 5.0, 7.0, 4.0, 13.0, 9.0),
            Block.createCuboidShape(7.0, 7.0, 7.0, 9.0, 15.0, 9.0));
    protected static final VoxelShape HANGING_SHAPE = VoxelShapes.union(
            Block.createCuboidShape(6.5, 3.0, 6.5, 9.5, 16.0, 9.5),
            Block.createCuboidShape(2.0, 2.0, 8.0, 14.0, 5.0, 8.0),
            Block.createCuboidShape(8.0, 2.0, 0.0, 8.0, 5.0, 14.0),
            Block.createCuboidShape(7.0, 5.0, 2.0, 9.0, 13.0, 4.0),
            Block.createCuboidShape(12.0, 5.0, 7.0, 14.0, 13.0, 9.0),
            Block.createCuboidShape(7.0, 5.0, 12.0, 9.0, 13.0, 14.0),
            Block.createCuboidShape(2.0, 5.0, 7.0, 4.0, 13.0, 9.0));

    public MapCodec<ChandelierBlock> getCodec() {
        return CODEC;
    }

    public ChandelierBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(LIT, false).with(HANGING, false)).with(WATERLOGGED, false));
    }






    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (stack.isEmpty() && player.getAbilities().allowModifyWorld && state.get(LIT).booleanValue()) {
            ChandelierBlock.extinguish(player, state, world, pos);
            return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
        }
        return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
    }






    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        for (Direction direction : ctx.getPlacementDirections()) {
            BlockState blockState;
            if (direction.getAxis() != Direction.Axis.Y || !(blockState = (BlockState)this.getDefaultState().with(HANGING, direction == Direction.UP)).canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) continue;
            return (BlockState)blockState.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        }
        return null;
    }

    /*
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        Direction[] var3 = ctx.getPlacementDirections();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Direction direction = var3[var5];
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockState = (BlockState)this.getDefaultState().with(HANGING, direction == Direction.UP);
                if (blockState.canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) {
                    return (BlockState)blockState.with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
                }
            }
        }

        return null;
    }

     */

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (Boolean)state.get(HANGING) ? HANGING_SHAPE : STANDING_SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{HANGING, LIT, WATERLOGGED});
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = ChandelierBlock.attachedDirection(state).getOpposite();
        return Block.sideCoversSmallSquare(world, pos.offset(direction), direction.getOpposite());
    }

    protected static Direction attachedDirection(BlockState state) {
        return (Boolean)state.get(HANGING) ? Direction.DOWN : Direction.UP;
    }













    protected BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if ((Boolean)state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        if (ChandelierBlock.attachedDirection(state).getOpposite() == direction && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }

        return attachedDirection(state).getOpposite() == direction && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }










    @Override
    protected FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }



    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (state.get(WATERLOGGED).booleanValue() || fluidState.getFluid() != Fluids.WATER) {
            return false;
        }
        BlockState blockState = (BlockState)state.with(WATERLOGGED, true);
        if (state.get(LIT).booleanValue()) {
            ChandelierBlock.extinguish(null, blockState, world, pos);
        } else {
            world.setBlockState(pos, blockState, Block.NOTIFY_ALL);
        }
        world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
        return true;
    }

    public static boolean canBeLit(BlockState state) {
        return  state.get(LIT) == false && state.get(WATERLOGGED) == false;
    }

    @Override
    protected Iterable<Vec3d> getParticleOffsets(BlockState state) {
        int hanging;
        if (state.get(HANGING) == false) {
            hanging = 0;
        } else {
            hanging = 1;
        }
        return (Iterable) CHANDELIER_STATE_TO_PARTICLE_OFFSETS.get(hanging);
    }

    @Override
    protected boolean isNotLit(BlockState state) {
        return !(Boolean)state.get(LIT) && state.get(WATERLOGGED) == false;
    }

    private static void setLit(WorldAccess world, BlockState state, BlockPos pos, boolean lit) {
        world.setBlockState(pos, state.with(LIT, Boolean.valueOf(lit)), Block.NOTIFY_ALL_AND_REDRAW);
    }

    @Override
    protected void onExploded(BlockState state, ServerWorld world, BlockPos pos, Explosion explosion, BiConsumer<ItemStack, BlockPos> stackMerger) {
        if (explosion.canTriggerBlocks() && (Boolean)state.get(LIT)) {
            extinguish(null, state, world, pos);
        }

        super.onExploded(state, world, pos, explosion, stackMerger);
    }

}
