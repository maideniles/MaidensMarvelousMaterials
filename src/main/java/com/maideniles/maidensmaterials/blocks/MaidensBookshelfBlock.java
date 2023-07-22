package com.maideniles.maidensmaterials.blocks;

import com.maideniles.maidensmaterials.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class MaidensBookshelfBlock extends Block {
    public MaidensBookshelfBlock(Properties properties) {
        super(Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD));

    }


    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return 1;
    }
}
