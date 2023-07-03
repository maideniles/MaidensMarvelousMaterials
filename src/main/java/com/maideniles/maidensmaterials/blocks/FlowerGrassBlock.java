package com.maideniles.maidensmaterials.blocks;


import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class FlowerGrassBlock extends BushBlock {

    private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 1.0, 16);

    public FlowerGrassBlock(Properties properties) {
        super(Block.Properties.of(Material.GRASS).sound(SoundType.GRASS).noOcclusion().noCollission());




    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState p_60550_) {
        return super.getRenderShape(p_60550_);
    }







    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter p_51043_, BlockPos p_51044_) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
                || block == Blocks.PODZOL || block == Blocks.SAND || state.getBlock() instanceof GrassBlock || state.getBlock() instanceof SandBlock ;
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState state1, boolean p_60570_) {
        BlockState blockstate = level.getBlockState(pos.below());
        if(blockstate == Blocks.AIR.defaultBlockState()){
            level.setBlockAndUpdate(pos,Blocks.AIR.defaultBlockState());
        }
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        BlockPos blockpos = pos.below();
        if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
            return levelReader.getBlockState(blockpos).canSustainPlant(levelReader, blockpos, Direction.UP, this);
        return this.mayPlaceOn(levelReader.getBlockState(blockpos), levelReader, blockpos);
    }

    @Override
    public boolean isRandomlyTicking(BlockState p_49921_) {
        return true;
    }

    public int tickRate(Level level) {
        return 3;
    }

    public void tick(BlockState state, ServerLevel level, BlockPos pos, Random rand) {
        if (state.getBlock() == this) {
            level.setBlockAndUpdate(pos,Blocks.AIR.defaultBlockState());
        }




    }






}
