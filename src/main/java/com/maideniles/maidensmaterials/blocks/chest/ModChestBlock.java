package com.maideniles.maidensmaterials.blocks.chest;

import com.maideniles.maidensmaterials.blockentity.ModChestEntity;
import com.maideniles.maidensmaterials.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModChestBlock extends ChestBlock {
    public ModChestBlock(Properties properties) {
        super(properties, ModBlockEntities.MOD_CHEST::get);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ModChestEntity(pos, state);
    }
}
