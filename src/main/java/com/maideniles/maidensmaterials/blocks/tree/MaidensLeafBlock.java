package com.maideniles.maidensmaterials.blocks.tree;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModEffects;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class MaidensLeafBlock extends LeavesBlock {






    private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16.0, 16);

    public MaidensLeafBlock(Properties p_54422_) {
        super(p_54422_);
    }


    public static VoxelShape getSHAPE() {
        return SHAPE;
    }



    public InteractionResult use(BlockState state, Level p_57276_, BlockPos p_57277_, Player player, InteractionHand p_57279_, BlockHitResult p_57280_) {

        Block leaves = state.getBlock();
        ItemStack shears = player.getItemInHand(p_57279_);
        Random random = new Random();

        if (shears.is(ModItems.PRUNING_SHEARS.get()) || player.hasEffect(ModEffects.FLORAL_FORTUNE_EFFECT.get())) {


            shears.hurtAndBreak(1, player, (p_41303_) -> {
                p_41303_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
            });


            if(leaves == ModBlocks.CRABAPPLE_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.CRABAPPLE_BLOSSOMS.get(), 1));
            }

            if(leaves == ModBlocks.POINCIANA_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.POINCIANA_BLOSSOMS.get(), 1));
            }

            if(leaves == ModBlocks.LABURNUM_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.LABURNUM_BLOSSOMS.get(), 1));
            }

            if(leaves == ModBlocks.JADE_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.JADE_BLOSSOMS.get(), 1));
            }

            if(leaves == ModBlocks.PAULOWNIA_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.PAULOWNIA_BLOSSOMS.get(), 1));
            }

            if(leaves == ModBlocks.WISTERIA_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.WISTERIA_BLOSSOMS.get(), 1));
            }

            if(leaves == ModBlocks.JACARANDA_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.JACARANDA_BLOSSOMS.get(), 1));
            }

            if(leaves == ModBlocks.DOGWOOD_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.DOGWOOD_BLOSSOMS.get(), 1));
            }

            if(leaves == ModBlocks.SILVERBELL_LEAVES.get()) {
                popResource(p_57276_, p_57277_, new ItemStack(ModItems.SILVERBELL_BLOSSOMS.get(), 1));
            }
                p_57276_.playSound((Player)null, p_57277_, SoundEvents.AZALEA_HIT, SoundSource.BLOCKS, 1.0F, 0.8F + p_57276_.random.nextFloat() * 0.4F);



                if (random.nextInt(100) < 5){
                 popResource(p_57276_, p_57277_, new ItemStack(ModItems.FLORAL_ESSENCE.get(), 1));
             }

                return InteractionResult.sidedSuccess(p_57276_.isClientSide);
            }


         else {
            return super.use(state, p_57276_, p_57277_, player, p_57279_, p_57280_);
        }
    }













}

