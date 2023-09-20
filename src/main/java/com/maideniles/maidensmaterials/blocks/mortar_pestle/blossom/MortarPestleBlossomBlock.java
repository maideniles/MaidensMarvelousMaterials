package com.maideniles.maidensmaterials.blocks.mortar_pestle.blossom;



import com.maideniles.maidensmaterials.blocks.mortar_pestle.MortarPestleBlock;
import com.maideniles.maidensmaterials.blocks.mortar_pestle.chunk.MortarPestleChunkBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.init.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
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

public class MortarPestleBlossomBlock extends HorizontalDirectionalBlock {

    public static Item RESULT_ITEM;

    public static final IntegerProperty BLOSSOM = IntegerProperty.create("blossom",0,11);

    private static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);


    public MortarPestleBlossomBlock(Properties p_54120_) {
        super(p_54120_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(BLOSSOM, 0));
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
        pBuilder.add(BLOSSOM,FACING);
    }

    private int getDelay() {
        return  46;
    }

    public void doDelay(Level level, BlockPos pos){
        level.scheduleTick(pos, this, this.getDelay());
        level.playSound((Player)null, pos, ModSoundEvents.MORTAR_PESTLE_GRIND.get(), SoundSource.BLOCKS, 5.0F, 1.0F);
    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) {
        popResource(level,pos, new ItemStack(RESULT_ITEM,4));
        level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlossomBlock.FACING)));
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        boolean flag = false;
        if(!level.isClientSide() ){


            if ( state.getValue(BLOSSOM) == 0 && itemstack.isEmpty()) {
               RESULT_ITEM = ModItems.RED_PIGMENT.get();
                this.doDelay(level,pos);
                  }

            if ( state.getValue(BLOSSOM) == 1 && itemstack.isEmpty()) {
              RESULT_ITEM =  ModItems.ORANGE_PIGMENT.get();
                this.doDelay(level,pos);
               }

            if ( state.getValue(BLOSSOM) == 2 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.YELLOW_PIGMENT.get();
                this.doDelay(level,pos);
              }

            if ( state.getValue(BLOSSOM) == 3 && itemstack.isEmpty()) {
                RESULT_ITEM =  ModItems.GREEN_PIGMENT.get();
                this.doDelay(level,pos);
              }

            if ( state.getValue(BLOSSOM) == 4 && itemstack.isEmpty()) {
                RESULT_ITEM =  ModItems.CYAN_PIGMENT.get();
                this.doDelay(level,pos);
               }

            if ( state.getValue(BLOSSOM) == 5 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.BLUE_PIGMENT.get();
                this.doDelay(level,pos);
                }

            if ( state.getValue(BLOSSOM) == 6 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.PURPLE_PIGMENT.get();
                this.doDelay(level,pos);
                }

            if ( state.getValue(BLOSSOM) == 7 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.PINK_PIGMENT.get();
                this.doDelay(level,pos);
              }

            if ( state.getValue(BLOSSOM) == 8 && itemstack.getItem() == ModItems.MICA_POWDER.get()) {
                itemstack.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,11));
            }

            if ( state.getValue(BLOSSOM) == 9 && itemstack.getItem() == ModItems.SILVERBELL_BLOSSOMS.get()) {
                itemstack.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,10));
            }

            if ( state.getValue(BLOSSOM) == 10 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.WHITE_PIGMENT.get();
                this.doDelay(level,pos);
                }

            if ( state.getValue(BLOSSOM) == 11 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.WHITE_PIGMENT.get();
                this.doDelay(level,pos);
                }

        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }



    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);

        if(blockstate.getValue(BLOSSOM) == 0){popResource(level, pos, new ItemStack(ModItems.CRABAPPLE_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 1){popResource(level, pos, new ItemStack(ModItems.POINCIANA_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 2){popResource(level, pos, new ItemStack(ModItems.LABURNUM_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 3){popResource(level, pos, new ItemStack(ModItems.JADE_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 4){popResource(level, pos, new ItemStack(ModItems.PAULOWNIA_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 5){popResource(level, pos, new ItemStack(ModItems.WISTERIA_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 6){popResource(level, pos, new ItemStack(ModItems.JACARANDA_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 7){popResource(level, pos, new ItemStack(ModItems.DOGWOOD_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 8){popResource(level, pos, new ItemStack(ModItems.SILVERBELL_BLOSSOMS.get()));}
        if(blockstate.getValue(BLOSSOM) == 9){popResource(level, pos, new ItemStack(ModItems.MICA_POWDER.get()));}

        if(blockstate.getValue(BLOSSOM) == 10 || (blockstate.getValue(BLOSSOM) == 11 )){
            popResource(level, pos, new ItemStack(ModItems.MICA_POWDER.get()));
            popResource(level, pos, new ItemStack(ModItems.SILVERBELL_BLOSSOMS.get()));

        }


    }


}




