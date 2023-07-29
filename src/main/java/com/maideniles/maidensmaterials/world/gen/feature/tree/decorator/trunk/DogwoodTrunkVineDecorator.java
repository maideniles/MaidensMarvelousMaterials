package com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk;


import com.maideniles.maidensmaterials.blocks.tree.vine.DogwoodVineBlock;
import com.maideniles.maidensmaterials.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

public class DogwoodTrunkVineDecorator extends TreeDecorator {
    public static final Codec<DogwoodTrunkVineDecorator> CODEC = Codec.unit(() -> {
        return DogwoodTrunkVineDecorator.INSTANCE;
    });
    public static final DogwoodTrunkVineDecorator INSTANCE = new DogwoodTrunkVineDecorator();

    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.DOGWOOD_TRUNK_VINE.get();
    }

    public void place(TreeDecorator.Context p_226077_) {
        RandomSource randomsource = p_226077_.random();
        p_226077_.logs().forEach((p_226075_) -> {
            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos = p_226075_.west();
                if (p_226077_.isAir(blockpos)) {
                    p_226077_.placeVine(blockpos, DogwoodVineBlock.EAST);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos1 = p_226075_.east();
                if (p_226077_.isAir(blockpos1)) {
                    p_226077_.placeVine(blockpos1, DogwoodVineBlock.WEST);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos2 = p_226075_.north();
                if (p_226077_.isAir(blockpos2)) {
                    p_226077_.placeVine(blockpos2, DogwoodVineBlock.SOUTH);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos3 = p_226075_.south();
                if (p_226077_.isAir(blockpos3)) {
                    p_226077_.placeVine(blockpos3, DogwoodVineBlock.NORTH);
                }
            }

        });
    }
}