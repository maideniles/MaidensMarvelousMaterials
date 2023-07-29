package com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf;

import com.maideniles.maidensmaterials.blocks.tree.vine.PoincianaVineBlock;
import com.maideniles.maidensmaterials.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

public class PoincianaLeafVineDecorator extends TreeDecorator {
    public static final Codec<PoincianaLeafVineDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(PoincianaLeafVineDecorator::new, (p_226037_) -> {
        return p_226037_.probability;
    }).codec();
    public final float probability;

    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.POINCIANA_LEAF_VINE.get();
    }

    public PoincianaLeafVineDecorator(float p_226031_) {
        this.probability = p_226031_;
    }

    public void place(TreeDecorator.Context p_226039_) {
        RandomSource randomsource = p_226039_.random();
        p_226039_.leaves().forEach((p_226035_) -> {
            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos = p_226035_.west();
                if (p_226039_.isAir(blockpos)) {
                    addHangingVine(blockpos, PoincianaVineBlock.EAST, p_226039_);
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos1 = p_226035_.east();
                if (p_226039_.isAir(blockpos1)) {
                    addHangingVine(blockpos1, PoincianaVineBlock.WEST, p_226039_);
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos2 = p_226035_.north();
                if (p_226039_.isAir(blockpos2)) {
                    addHangingVine(blockpos2, PoincianaVineBlock.SOUTH, p_226039_);
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos3 = p_226035_.south();
                if (p_226039_.isAir(blockpos3)) {
                    addHangingVine(blockpos3, PoincianaVineBlock.NORTH, p_226039_);
                }
            }

        });
    }

    private static void addHangingVine(BlockPos p_226041_, BooleanProperty p_226042_, TreeDecorator.Context p_226043_) {
        p_226043_.placeVine(p_226041_, p_226042_);
        int i = 4;

        for(BlockPos blockpos = p_226041_.below(); p_226043_.isAir(blockpos) && i > 0; --i) {
            p_226043_.placeVine(blockpos, p_226042_);
            blockpos = blockpos.below();
        }

    }
}