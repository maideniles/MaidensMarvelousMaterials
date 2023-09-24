package com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk;

import com.maideniles.maidensmaterials.blocks.tree.vine.PaulowniaVineBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
public class PaulowniaTrunkVineDecorator extends TreeDecorator {
    public static final Codec<PaulowniaTrunkVineDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(PaulowniaTrunkVineDecorator::new, (p_69989_) -> {
        return p_69989_.probability;
    }).codec();
    private final float probability;

    public PaulowniaTrunkVineDecorator(float p_69976_) {
        this.probability = p_69976_;
    }

    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.PAULOWNIA_TRUNK_VINE.get();
    }

    public void placeVine(BlockPos pos, BooleanProperty property, TreeDecorator.Context context) {
        context.setBlock(pos, ModBlocks.PAULOWNIA_VINE.get().defaultBlockState().setValue(property, true));
    }

    public void place(TreeDecorator.Context context) {
        RandomSource randomsource = context.random();
        context.logs().forEach((p_226075_) -> {
            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos = p_226075_.west();
                if (context.isAir(blockpos)) {
                    this.placeVine(blockpos, PaulowniaVineBlock.EAST,context);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos1 = p_226075_.east();
                if (context.isAir(blockpos1)) {
                    this.placeVine(blockpos1, PaulowniaVineBlock.WEST,context);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos2 = p_226075_.north();
                if (context.isAir(blockpos2)) {
                    this.placeVine(blockpos2, PaulowniaVineBlock.SOUTH,context);
                }
            }

            if (randomsource.nextInt(3) > 0) {
                BlockPos blockpos3 = p_226075_.south();
                if (context.isAir(blockpos3)) {
                    this.placeVine(blockpos3, PaulowniaVineBlock.NORTH,context);
                }
            }

        });
    }
}