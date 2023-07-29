package com.maideniles.maidensmaterials.blockentity;

import com.maideniles.maidensmaterials.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModChestEntity extends ChestBlockEntity {
    public ModChestEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOD_CHEST.get(), pos, state);
    }
}
