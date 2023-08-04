package com.maideniles.maidensmaterials.world.gen.feature.tree.grower;

import com.maideniles.maidensmaterials.init.ModFeatures;
import net.minecraft.core.Holder;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class JacarandaTreeGrower extends AbstractTreeGrower {
    /**
     * @return a {@link ConfiguredFeature} of this tree
     */
    @org.jetbrains.annotations.Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean p_222911_) {
        if(pRandom.nextInt(10) ==0) { return ModFeatures.JACARANDA_VINES_CONFIG.getHolder().get();}

        return ModFeatures.JACARANDA_CONFIG.getHolder().get();

    }

}
