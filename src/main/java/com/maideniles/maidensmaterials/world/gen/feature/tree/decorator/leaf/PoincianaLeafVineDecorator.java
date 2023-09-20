package com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf;


import com.maideniles.maidensmaterials.blocks.tree.vine.PoincianaVineBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
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

    public void place(Context context) {
        RandomSource randomsource = context.random();
        context.leaves().forEach((p_226035_) -> {
            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos = p_226035_.west();
                if (context.isAir(blockpos)) {
                    addHangingVine(blockpos, PoincianaVineBlock.EAST, context);
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos1 = p_226035_.east();
                if (context.isAir(blockpos1)) {
                    addHangingVine(blockpos1, PoincianaVineBlock.WEST, context);
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos2 = p_226035_.north();
                if (context.isAir(blockpos2)) {
                    addHangingVine(blockpos2, PoincianaVineBlock.SOUTH, context);
                }
            }

            if (randomsource.nextFloat() < this.probability) {
                BlockPos blockpos3 = p_226035_.south();
                if (context.isAir(blockpos3)) {
                    addHangingVine(blockpos3, PoincianaVineBlock.NORTH, context);
                }
            }

        });
    }

    private static void addHangingVine(BlockPos blockPos, BooleanProperty p_226042_, Context p_226043_) {
        p_226043_.setBlock(blockPos, ModBlocks.POINCIANA_VINE.get().defaultBlockState().setValue(p_226042_, true));
        int i = 4;

        for(BlockPos blockpos1 = blockPos.below(); p_226043_.isAir(blockpos1) && i > 0; --i) {
            p_226043_.setBlock(blockpos1, ModBlocks.POINCIANA_VINE.get().defaultBlockState().setValue(p_226042_, true));
            blockpos1 = blockpos1.below();
        }

    }
}