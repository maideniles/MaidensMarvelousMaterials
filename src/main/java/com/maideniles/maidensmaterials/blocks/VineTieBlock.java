package com.maideniles.maidensmaterials.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VineTieBlock extends Block {

    private static final VoxelShape SHAPE = Block.box(0, 15, 0, 16, 16, 16);

    public VineTieBlock(Properties p_49795_) {
        super(p_49795_);
    }




    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }

}