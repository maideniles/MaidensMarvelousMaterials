package com.maideniles.maidensmaterials.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class MaidensBookshelfBlock extends Block {


    public MaidensBookshelfBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return 1;
    }
}
