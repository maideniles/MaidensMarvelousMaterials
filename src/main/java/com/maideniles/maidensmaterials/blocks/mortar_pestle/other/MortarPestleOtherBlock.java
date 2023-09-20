package com.maideniles.maidensmaterials.blocks.mortar_pestle.other;



import com.maideniles.maidensmaterials.blocks.mortar_pestle.blossom.MortarPestleBlossomBlock;
import com.maideniles.maidensmaterials.blocks.mortar_pestle.pigment.MortarPestlePigmentBlock;
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
import net.minecraft.world.item.Items;
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

public class MortarPestleOtherBlock extends HorizontalDirectionalBlock {

    public static Item RESULT_ITEM;

    public static final IntegerProperty ITEM = IntegerProperty.create("item",0,4);

    private static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);


    public MortarPestleOtherBlock(Properties p_54120_) {
        super(p_54120_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(ITEM, 0));
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
        pBuilder.add(ITEM,FACING);
    }

    private int getDelay() {
        return  46;
    }

    public void doDelay(Level level, BlockPos pos){
        level.scheduleTick(pos, this, this.getDelay());
        level.playSound((Player)null, pos, ModSoundEvents.MORTAR_PESTLE_GRIND.get(), SoundSource.BLOCKS, 5.0F, 1.0F);
    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) {
        int count = 8;
        if(RESULT_ITEM == ModItems.DARK_IRON_MIX.get()){ count = 1;}
        if(RESULT_ITEM == ModItems.BLACK_PIGMENT.get()){count = 4;}
        popResource(level,pos, new ItemStack(RESULT_ITEM,count));
        level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleOtherBlock.FACING)));
    }


    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);
        boolean flag = false;
        if(!level.isClientSide() ){

    //ITEMS//



        //IF COAL, ADD NUGGET
            if ( state.getValue(ITEM) == 3 && itemstack.getItem() == Items.IRON_NUGGET) {
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestleOtherBlock.FACING)).setValue(ITEM,4));
            }
        //IF NUGGET, ADD COAL
            if ( state.getValue(ITEM) == 2 && itemstack.getItem() == Items.COAL) {
                itemstack.shrink(1);
                level.playSound(player, pos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,this.defaultBlockState().setValue(FACING,state.getValue(MortarPestleOtherBlock.FACING)).setValue(ITEM,4));
            }

    ///CATALYSTS//

            //MICA POWDER READY
            if ( state.getValue(ITEM) == 0 && itemstack.isEmpty()) {
               RESULT_ITEM = ModItems.MICA_POWDER.get();
                this.doDelay(level,pos);
            }
            //CHARCOAL READY
            if ( state.getValue(ITEM) == 1 && itemstack.isEmpty()) {
               RESULT_ITEM = ModItems.BLACK_PIGMENT.get();
                this.doDelay(level,pos);
            }
            //DARK MIX READY
            if ( state.getValue(ITEM) == 4 && itemstack.isEmpty()) {
                RESULT_ITEM = ModItems.DARK_IRON_MIX.get();
               this.doDelay(level,pos);
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {

        BlockState blockstate = level.getBlockState(pos);

        if(blockstate.getValue(ITEM) == 0){popResource(level, pos, new ItemStack(ModItems.MICA_FRAGMENTS.get()));}
        if(blockstate.getValue(ITEM) == 1){popResource(level, pos, new ItemStack(Items.CHARCOAL));}
        if(blockstate.getValue(ITEM) == 2){popResource(level, pos, new ItemStack(Items.IRON_NUGGET));}
        if(blockstate.getValue(ITEM) == 3){popResource(level, pos, new ItemStack(Items.COAL));}

        if(blockstate.getValue(ITEM) == 4){
            popResource(level, pos, new ItemStack(Items.IRON_NUGGET));
            popResource(level, pos, new ItemStack(Items.COAL));
        }

    }


}
