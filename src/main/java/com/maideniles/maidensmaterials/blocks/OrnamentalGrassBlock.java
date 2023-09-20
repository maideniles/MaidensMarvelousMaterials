package com.maideniles.maidensmaterials.blocks;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModEnchantments;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LightEngine;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.IPlantable;

public class OrnamentalGrassBlock extends GrassBlock {


    public OrnamentalGrassBlock(Properties p_53685_) {
        super(p_53685_);
    }

    public void randomTick(BlockState p_222508_, ServerLevel p_222509_, BlockPos p_222510_, RandomSource p_222511_) {
        if (!canBeGrass(p_222508_, p_222509_, p_222510_)) {
            if (!p_222509_.isAreaLoaded(p_222510_, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            p_222509_.setBlockAndUpdate(p_222510_, Blocks.DIRT.defaultBlockState());
        } else {
            if (!p_222509_.isAreaLoaded(p_222510_, 3)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
            if (p_222509_.getMaxLocalRawBrightness(p_222510_.above()) >= 9) {
                BlockState blockstate = this.defaultBlockState();

                for(int i = 0; i < 4; ++i) {
                    BlockPos blockpos = p_222510_.offset(p_222511_.nextInt(3) - 1, p_222511_.nextInt(5) - 3, p_222511_.nextInt(3) - 1);
                    if (p_222509_.getBlockState(blockpos).is(Blocks.DIRT) && canPropagate(blockstate, p_222509_, blockpos)) {
                        p_222509_.setBlockAndUpdate(blockpos, blockstate.setValue(SNOWY, Boolean.valueOf(p_222509_.getBlockState(blockpos.above()).is(Blocks.SNOW))));
                    }
                }
            }

        }
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }

    @Override
    public InteractionResult use(BlockState p_60503_, Level level, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult p_60508_) {
       ItemStack item = player.getItemInHand(handIn);
        int enchLevel = EnchantmentHelper.getItemEnchantmentLevel(ModEnchantments.FLOWER_POWER.get(), item);
        boolean hasEnchant = enchLevel >=1;

        if(item.toString().toLowerCase().contains("hoe")) {
            level.setBlockAndUpdate(pos, Blocks.FARMLAND.defaultBlockState());
            level.playSound(player, pos, SoundEvents.HOE_TILL, SoundSource.BLOCKS, 1.0F, 1.0F);

        }

        if (item.toString().toLowerCase().contains("shovel") && hasEnchant) {
            level.setBlockAndUpdate(pos, ModBlocks.ORNAMENTAL_PATH.get().defaultBlockState());
        }



        return InteractionResult.PASS;
    }

    @Override
    public void destroy(LevelAccessor level, BlockPos pos, BlockState p_49862_) {
        level.setBlock(pos, Blocks.AIR.defaultBlockState(),3);
    }

    private static boolean canPropagate(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockPos blockpos = pPos.above();
        return canBeGrass(pState, pLevel, pPos) && !pLevel.getFluidState(blockpos).is(FluidTags.WATER);
    }

    private static boolean canBeGrass(BlockState p_56824_, LevelReader p_56825_, BlockPos p_56826_) {
        BlockPos blockpos = p_56826_.above();
        BlockState blockstate = p_56825_.getBlockState(blockpos);
        if (blockstate.is(Blocks.SNOW) && blockstate.getValue(SnowLayerBlock.LAYERS) == 1) {
            return true;
        } else if (blockstate.getFluidState().getAmount() == 8) {
            return false;
        } else {
            int i = LightEngine.getLightBlockInto(p_56825_, p_56824_, p_56826_, blockstate, blockpos, Direction.UP, blockstate.getLightBlock(p_56825_, blockpos));
            return i < p_56825_.getMaxLightLevel();
        }
    }

}
