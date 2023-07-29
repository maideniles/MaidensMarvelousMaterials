package com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk;

import com.maideniles.maidensmaterials.blocks.tree.vine.JacarandaVineBlock;
import com.maideniles.maidensmaterials.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

public class JacarandaTrunkVineDecorator extends TreeDecorator {
    public static final Codec<JacarandaTrunkVineDecorator> CODEC = Codec.unit(() -> {
        return JacarandaTrunkVineDecorator.INSTANCE;
    });
    public static final JacarandaTrunkVineDecorator INSTANCE = new JacarandaTrunkVineDecorator();

    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.JACARANDA_TRUNK_VINE.get();
    }

    public void place(TreeDecorator.Context p_226077_) {
        RandomSource randomsource = p_226077_.random();
        p_226077_.logs().forEach((p_226075_) -> {
            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos = p_226075_.west();
                if (p_226077_.isAir(blockpos)) {
                    p_226077_.placeVine(blockpos, JacarandaVineBlock.EAST);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos1 = p_226075_.east();
                if (p_226077_.isAir(blockpos1)) {
                    p_226077_.placeVine(blockpos1, JacarandaVineBlock.WEST);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos2 = p_226075_.north();
                if (p_226077_.isAir(blockpos2)) {
                    p_226077_.placeVine(blockpos2, JacarandaVineBlock.SOUTH);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos3 = p_226075_.south();
                if (p_226077_.isAir(blockpos3)) {
                    p_226077_.placeVine(blockpos3, JacarandaVineBlock.NORTH);
                }
            }

        });
    }
}