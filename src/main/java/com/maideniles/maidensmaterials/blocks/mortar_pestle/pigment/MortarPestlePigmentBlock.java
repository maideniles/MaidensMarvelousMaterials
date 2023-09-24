package com.maideniles.maidensmaterials.blocks.mortar_pestle.pigment;


import com.maideniles.maidensmaterials.blocks.mortar_pestle.chunk.MortarPestleChunkBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.init.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
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

public class MortarPestlePigmentBlock extends HorizontalDirectionalBlock {

    public static Item RESULT_ITEM;

    public static final IntegerProperty PIGMENT = IntegerProperty.create("pigment",0,20);

    private static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);


    public MortarPestlePigmentBlock(Properties p_54120_) {
        super(p_54120_);
        this.registerDefaultState(this.stateDefinition.any().setValue(PIGMENT, Integer.valueOf(0)));
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
        pBuilder.add(PIGMENT,FACING);
    }

    private int getDelay() {
        return  46;
    }

    public void doDelay(Level level, BlockPos pos){
        level.scheduleTick(pos, this, this.getDelay());
        level.playSound((Player)null, pos, ModSoundEvents.MORTAR_PESTLE_GRIND.get(), SoundSource.BLOCKS, 5.0F, 1.0F);
    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) {
        popResource(level,pos, new ItemStack(RESULT_ITEM,2));
        level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)));
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        boolean flag = false;
        if(!level.isClientSide() ){

    //BROWN PIGMENT COMBOS//

            if ( state.getValue(PIGMENT) == 0 && itemstack.getItem() == ModItems.GREEN_PIGMENT.get()) {
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 19));
            }

            if ( state.getValue(PIGMENT) == 2 && itemstack.getItem() == ModItems.RED_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 18));
            }

    //GRAY PIGMENT COMBO//

            if ( state.getValue(PIGMENT) == 7 && itemstack.getItem() == ModItems.WHITE_PIGMENT.get() ){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 17));
            }

            if ( state.getValue(PIGMENT) == 6 && itemstack.getItem() == ModItems.BLACK_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 16));
            }
    //LIGHT GRAY PIGMENT COMBO//

            if ( state.getValue(PIGMENT) == 20 && itemstack.getItem() == ModItems.WHITE_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 15));
            }

            if (  state.getValue(PIGMENT) == 6 && itemstack.getItem() == ModItems.GRAY_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 14));
            }


    //MAGENTA PIGMENT COMBO//

            if (state.getValue(PIGMENT) == 5 && itemstack.getItem() == ModItems.PURPLE_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 12));
            }

            if (state.getValue(PIGMENT) == 4 && itemstack.getItem() == ModItems.PINK_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 13));
            }

    //LIGHT BLUE PIGMENT COMBO//

            if ( state.getValue(PIGMENT) == 3 && itemstack.getItem() == ModItems.WHITE_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 11));
            }

            if (  state.getValue(PIGMENT) == 6 && itemstack.getItem() == ModItems.BLUE_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 10));
            }

    //LIME PIGMENT COMBO//

            if ( state.getValue(PIGMENT) == 2 && itemstack.getItem() == ModItems.YELLOW_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 8));
            }

            if ( state.getValue(PIGMENT) == 1 && itemstack.getItem() == ModItems.GREEN_PIGMENT.get()){
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.BIG_DRIPLEAF_TILT_DOWN, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestlePigmentBlock.FACING)).setValue(PIGMENT, 9));
            }
  //COMPLETE MIXES

            if ( state.getValue(PIGMENT) == 8 && itemstack.isEmpty() || state.getValue(PIGMENT) == 9 && itemstack.isEmpty()) {
              RESULT_ITEM = ModItems.LIME_PIGMENT.get();
                this.doDelay(level,pos);
                }

            if ( state.getValue(PIGMENT) == 10 && itemstack.isEmpty() || state.getValue(PIGMENT) == 11 && itemstack.isEmpty()) {
               RESULT_ITEM = ModItems.LIGHT_BLUE_PIGMENT.get();
                this.doDelay(level,pos);
              }

            if ( state.getValue(PIGMENT) == 12 && itemstack.isEmpty() || state.getValue(PIGMENT) == 13 && itemstack.isEmpty()) {
               RESULT_ITEM = ModItems.MAGENTA_PIGMENT.get();
                this.doDelay(level,pos);
                }

            if ( state.getValue(PIGMENT) == 14 && itemstack.isEmpty() || state.getValue(PIGMENT) == 15 && itemstack.isEmpty()) {
               RESULT_ITEM = ModItems.LIGHT_GRAY_PIGMENT.get();
                this.doDelay(level,pos);
                }

            if ( state.getValue(PIGMENT) == 16 && itemstack.isEmpty() || state.getValue(PIGMENT) == 17 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.GRAY_PIGMENT.get();
                this.doDelay(level,pos);
               }

            if ( state.getValue(PIGMENT) == 18 && itemstack.isEmpty() || state.getValue(PIGMENT) == 19 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.BROWN_PIGMENT.get();
                this.doDelay(level,pos);
                }
        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }


    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);

        if(blockstate.getValue(PIGMENT) == 0){popResource(level, pos, new ItemStack(ModItems.RED_PIGMENT.get()));}
        if(blockstate.getValue(PIGMENT) == 1){popResource(level, pos, new ItemStack(ModItems.YELLOW_PIGMENT.get()));}
        if(blockstate.getValue(PIGMENT) == 2){popResource(level, pos, new ItemStack(ModItems.GREEN_PIGMENT.get()));}
        if(blockstate.getValue(PIGMENT) == 3){popResource(level, pos, new ItemStack(ModItems.BLUE_PIGMENT.get()));}
        if(blockstate.getValue(PIGMENT) == 4){popResource(level, pos, new ItemStack(ModItems.PURPLE_PIGMENT.get()));}
        if(blockstate.getValue(PIGMENT) == 5){popResource(level, pos, new ItemStack(ModItems.PINK_PIGMENT.get()));}
        if(blockstate.getValue(PIGMENT) == 6){popResource(level, pos, new ItemStack(ModItems.WHITE_PIGMENT.get()));}
        if(blockstate.getValue(PIGMENT) == 7){popResource(level, pos, new ItemStack(ModItems.BLACK_PIGMENT.get()));}
        if(blockstate.getValue(PIGMENT) == 20){popResource(level, pos, new ItemStack(ModItems.GRAY_PIGMENT.get()));}

        if(blockstate.getValue(PIGMENT) == 8 || (blockstate.getValue(PIGMENT) == 9 )){
            popResource(level, pos, new ItemStack(ModItems.GREEN_PIGMENT.get()));
            popResource(level, pos, new ItemStack(ModItems.YELLOW_PIGMENT.get()));
        }

        if(blockstate.getValue(PIGMENT) == 10 || (blockstate.getValue(PIGMENT) == 11 )){
            popResource(level, pos, new ItemStack(ModItems.BLUE_PIGMENT.get()));
            popResource(level, pos, new ItemStack(ModItems.WHITE_PIGMENT.get()));
        }

        if(blockstate.getValue(PIGMENT) == 12 || (blockstate.getValue(PIGMENT) == 13 )){
            popResource(level, pos, new ItemStack(ModItems.PURPLE_PIGMENT.get()));
            popResource(level, pos, new ItemStack(ModItems.PINK_PIGMENT.get()));
        }

        if(blockstate.getValue(PIGMENT) == 14 || (blockstate.getValue(PIGMENT) == 15 )){
            popResource(level, pos, new ItemStack(ModItems.GRAY_PIGMENT.get()));
            popResource(level, pos, new ItemStack(ModItems.WHITE_PIGMENT.get()));
        }

        if(blockstate.getValue(PIGMENT) == 16 || (blockstate.getValue(PIGMENT) == 17 )){
            popResource(level, pos, new ItemStack(ModItems.BLACK_PIGMENT.get()));
            popResource(level, pos, new ItemStack(ModItems.WHITE_PIGMENT.get()));
        }

        if(blockstate.getValue(PIGMENT) == 18 || (blockstate.getValue(PIGMENT) == 19 )){
            popResource(level, pos, new ItemStack(ModItems.RED_PIGMENT.get()));
            popResource(level, pos, new ItemStack(ModItems.GREEN_PIGMENT.get()));
        }




    }



}