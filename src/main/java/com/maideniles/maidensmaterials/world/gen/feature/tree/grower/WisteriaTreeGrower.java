package com.maideniles.maidensmaterials.world.gen.feature.tree.grower;

import com.maideniles.maidensmaterials.init.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class WisteriaTreeGrower extends AbstractTreeGrower {
    /**
     * @return a {@link ConfiguredFeature} of this tree
     */
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean p_222911_) {
        if(pRandom.nextInt(10) ==0) { return ModConfiguredFeatures.WISTERIA_VINES_KEY;}

        return ModConfiguredFeatures.WISTERIA_KEY;

    }

}
