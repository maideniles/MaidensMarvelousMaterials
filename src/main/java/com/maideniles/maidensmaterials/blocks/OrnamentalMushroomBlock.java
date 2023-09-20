package com.maideniles.maidensmaterials.blocks;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;

public class OrnamentalMushroomBlock extends FlowerBlock {


    public OrnamentalMushroomBlock(MobEffect effect, int effectDuration, Properties properties) {
        super(effect, effectDuration, properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter p_51043_, BlockPos p_51044_) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
                || block == Blocks.PODZOL || block == ModBlocks.ORNAMENTAL_GRASS.get() || block == Blocks.SAND || state.getBlock() instanceof GrassBlock || state.getBlock() instanceof SandBlock;
    }



    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        BlockPos blockpos = pos.below();
        if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return levelReader.getBlockState(blockpos).canSustainPlant(levelReader, blockpos, Direction.UP, this);
        return this.mayPlaceOn(levelReader.getBlockState(blockpos), levelReader, blockpos);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return false;
    }
}
