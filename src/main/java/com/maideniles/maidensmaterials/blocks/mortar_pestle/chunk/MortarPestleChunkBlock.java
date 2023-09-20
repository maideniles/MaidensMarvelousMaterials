package com.maideniles.maidensmaterials.blocks.mortar_pestle.chunk;


import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.init.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MortarPestleChunkBlock extends HorizontalDirectionalBlock {

    public static final IntegerProperty CHUNK = IntegerProperty.create("chunk",0,11);

    public static Item RESULT_ITEM;



    private static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);


    public MortarPestleChunkBlock(Properties p_54120_) {
        super(p_54120_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(CHUNK,0));
    }


    public VoxelShape getShape(BlockState state, BlockGetter p_48946_, BlockPos p_48947_, CollisionContext p_48948_) {
        return SHAPE;
    }


    /* FACING */

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(CHUNK,FACING);
    }

    private int getDelay() {
        return  46;
    }

    public void doDelay(Level level, BlockPos pos){
        level.scheduleTick(pos, this, this.getDelay());
        level.playSound((Player)null, pos, ModSoundEvents.MORTAR_PESTLE_GRIND.get(), SoundSource.BLOCKS, 5.0F, 1.0F);
    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) {
        popResource(level,pos, new ItemStack(RESULT_ITEM,8));
        level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleChunkBlock.FACING)));
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        boolean flag = false;
        if(!level.isClientSide() ){


            if ( state.getValue(CHUNK) == 0 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.JASPER_FRAGMENTS.get();
                this.doDelay(level,pos);
                 }

            if ( state.getValue(CHUNK) == 1 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.CARNELIAN_FRAGMENTS.get();
                this.doDelay(level,pos);
            }

            if ( state.getValue(CHUNK) == 2 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.CITRINE_FRAGMENTS.get();
                this.doDelay(level,pos);
            }

            if ( state.getValue(CHUNK) == 3 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.AVENTURINE_FRAGMENTS.get();
                this.doDelay(level,pos);
            }

            if ( state.getValue(CHUNK) == 4 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.JADE_FRAGMENTS.get();
                this.doDelay(level,pos);
            }

            if ( state.getValue(CHUNK) == 5 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.CHALCOPYRITE_FRAGMENTS.get();
                this.doDelay(level,pos);
            }

            if ( state.getValue(CHUNK) == 6 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.LABRADORITE_FRAGMENTS.get();
                this.doDelay(level,pos);
             }

            if ( state.getValue(CHUNK) == 7 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.MOONSTONE_FRAGMENTS.get();
                this.doDelay(level,pos);
             }

            if ( state.getValue(CHUNK) == 8 && itemstack.isEmpty()) {
                   RESULT_ITEM = ModItems.SODALITE_FRAGMENTS.get();
                this.doDelay(level,pos);
             }

            if ( state.getValue(CHUNK) == 9 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.AMETHYST_FRAGMENTS.get();
                this.doDelay(level,pos);
             }

            if ( state.getValue(CHUNK) == 10 && itemstack.isEmpty()) {
                  RESULT_ITEM = ModItems.ROSE_QUARTZ_FRAGMENTS.get();
                this.doDelay(level,pos);
            }

            if ( state.getValue(CHUNK) == 11 && itemstack.isEmpty()) {
                 RESULT_ITEM = ModItems.MICA_FRAGMENTS.get();
                this.doDelay(level,pos);
               }

        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);
        if(blockstate.getValue(CHUNK) == 0){popResource(level, pos, new ItemStack(ModItems.JASPER_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 1){popResource(level, pos, new ItemStack(ModItems.CARNELIAN_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 2){popResource(level, pos, new ItemStack(ModItems.CITRINE_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 3){popResource(level, pos, new ItemStack(ModItems.AVENTURINE_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 4){popResource(level, pos, new ItemStack(ModItems.JADE_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 5){popResource(level, pos, new ItemStack(ModItems.CHALCOPYRITE_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 6){popResource(level, pos, new ItemStack(ModItems.LABRADORITE_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 7){popResource(level, pos, new ItemStack(ModItems.MOONSTONE_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 8){popResource(level, pos, new ItemStack(ModItems.SODALITE_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 9){popResource(level, pos, new ItemStack(ModItems.AMETHYST_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 10){popResource(level, pos, new ItemStack(ModItems.ROSE_QUARTZ_CHUNK.get()));}
        if(blockstate.getValue(CHUNK) == 11){popResource(level, pos, new ItemStack(ModItems.MICA_CHUNK.get()));}
        super.playerWillDestroy(level, pos, state, player);
    }
}