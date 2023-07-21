package com.maideniles.maidensmaterials.blocks;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModEnchantments;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class OrnamentalGrassBlock extends GrassBlock {
    public OrnamentalGrassBlock(Properties properties) {
        super(Properties.of(Material.GRASS).randomTicks().strength(0.5F).sound(SoundType.GRASS));
    }






    @Override
    public void randomTick(BlockState p_56819_, ServerLevel level, BlockPos pos, Random random) {
        if (!level.isClientSide()) {
            if (!level.isAreaLoaded(pos, 3))
                return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading

            //block is covered and so will turn into glowdirt
            level.setBlockAndUpdate(pos, ModBlocks.ORNAMENTAL_GRASS.get().defaultBlockState());


            if (level.getLightEmission(pos.above()) >= 9) {
                //attempt to spread grass onto neighboring dirt (glowdirt handles its own conversion)
                BlockState replacementBlock = Blocks.GRASS_BLOCK.defaultBlockState();

                for (int i = 0; i < 4; ++i) {
                    BlockPos blockpos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (level.getBlockState(blockpos).getBlock() == Blocks.DIRT) {
                        level.setBlockAndUpdate(blockpos, replacementBlock.setValue(SNOWY, level.getBlockState(blockpos.above()).getBlock() == Blocks.SNOW));
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


}
