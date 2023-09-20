package com.maideniles.maidensmaterials.blocks.mortar_pestle;


import com.maideniles.maidensmaterials.blocks.mortar_pestle.blossom.MortarPestleBlossomBlock;
import com.maideniles.maidensmaterials.blocks.mortar_pestle.chunk.MortarPestleChunkBlock;
import com.maideniles.maidensmaterials.blocks.mortar_pestle.other.MortarPestleOtherBlock;
import com.maideniles.maidensmaterials.blocks.mortar_pestle.pigment.MortarPestlePigmentBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import static com.maideniles.maidensmaterials.blocks.mortar_pestle.blossom.MortarPestleBlossomBlock.BLOSSOM;
import static com.maideniles.maidensmaterials.blocks.mortar_pestle.chunk.MortarPestleChunkBlock.CHUNK;
import static com.maideniles.maidensmaterials.blocks.mortar_pestle.other.MortarPestleOtherBlock.ITEM;
import static com.maideniles.maidensmaterials.blocks.mortar_pestle.pigment.MortarPestlePigmentBlock.PIGMENT;

public class MortarPestleBlock extends HorizontalDirectionalBlock  {


    private static final VoxelShape SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 6.0D, 13.0D);


    public MortarPestleBlock(Properties p_54120_) {
        super(p_54120_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));


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
        pBuilder.add(FACING);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {

        ItemStack itemInHand = player.getItemInHand(hand);

        if(!level.isClientSide() ){

   //BEGIN BLOSSOMS//

            if (itemInHand.getItem() == ModItems.CRABAPPLE_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos, ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,0));
            }
            else   if (itemInHand.getItem() == ModItems.POINCIANA_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,1));
            }
            else    if (itemInHand.getItem() == ModItems.LABURNUM_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,2));
            }
            else       if (itemInHand.getItem() == ModItems.JADE_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,3));
            }
            else       if (itemInHand.getItem() == ModItems.PAULOWNIA_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,4));
            }

            else       if (itemInHand.getItem() == ModItems.WISTERIA_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,5));
            }
            else     if (itemInHand.getItem() == ModItems.JACARANDA_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,6));
            }
            else  if (itemInHand.getItem() == ModItems.DOGWOOD_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,7));
            }
            else    if (itemInHand.getItem() == ModItems.SILVERBELL_BLOSSOMS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,8));
            }

   //BEGIN PIGMENTS//

            else       if (itemInHand.getItem() == ModItems.RED_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,0));
            }

            else       if (itemInHand.getItem() == ModItems.YELLOW_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,1));

            }
            else       if (itemInHand.getItem() == ModItems.GREEN_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,2));
            }
            else       if (itemInHand.getItem() == ModItems.BLUE_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,3));
            }
            else       if (itemInHand.getItem() == ModItems.PURPLE_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,4));
            }
            else       if (itemInHand.getItem() == ModItems.PINK_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,5));
            }

            else       if (itemInHand.getItem() == ModItems.WHITE_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,6));
            }

            else       if (itemInHand.getItem() == ModItems.BLACK_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,7));
            }

            else       if (itemInHand.getItem() == ModItems.GRAY_PIGMENT.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_PIGMENTS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(PIGMENT,20));
            }
    //BEGIN GEM CHUNKS//

            else       if (itemInHand.getItem() == ModItems.JASPER_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,0));
            }

            else       if (itemInHand.getItem() == ModItems.CARNELIAN_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,1));
            }

            else       if (itemInHand.getItem() == ModItems.CITRINE_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,2));
            }

            else       if (itemInHand.getItem() == ModItems.AVENTURINE_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,3));
            }

            else       if (itemInHand.getItem() == ModItems.JADE_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,4));
            }

            else       if (itemInHand.getItem() == ModItems.CHALCOPYRITE_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,5));
            }

            else       if (itemInHand.getItem() == ModItems.LABRADORITE_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,6));
            }

            else       if (itemInHand.getItem() == ModItems.MOONSTONE_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,7));
            }

            else       if (itemInHand.getItem() == ModItems.SODALITE_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,8));
            }

            else       if (itemInHand.getItem() == ModItems.AMETHYST_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,9));
            }

            else       if (itemInHand.getItem() == ModItems.ROSE_QUARTZ_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,10));
            }

            else       if (itemInHand.getItem() == ModItems.MICA_CHUNK.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_CHUNKS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(CHUNK,11));
            }

//OTHER ITEMS TO PIGMENTS//

            else       if (itemInHand.getItem() == ModItems.MICA_FRAGMENTS.get()){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_OTHER.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(ITEM,0));
            }

            else       if (itemInHand.getItem() == Items.CHARCOAL){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_OTHER.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(ITEM,1));
            }

            else       if (itemInHand.getItem() == Items.IRON_NUGGET){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_OTHER.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(ITEM,2));
            }

            else       if (itemInHand.getItem() == Items.COAL){
                itemInHand.shrink(1);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_OTHER.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(ITEM,3));
            }

            else       if (itemInHand.getItem() == ModItems.MICA_POWDER.get()){
                itemInHand.shrink(1);
                level.playSound(player, pos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1.0f, 1.0f);
                level.setBlockAndUpdate(pos,ModBlocks.MORTAR_PESTLE_BLOSSOMS.get().defaultBlockState().setValue(FACING,state.getValue(MortarPestleBlock.FACING)).setValue(BLOSSOM,9));
            }

            level.playSound(player, pos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1.0f, 1.0f);
        }

        return InteractionResult.SUCCESS;

    }
}
