package com.maideniles.maidensmaterials.world.gen.ore;

import com.maideniles.maidensmaterials.init.ModPlacements;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacements.AMETHYST_ORE_PLACED);
        base.add(ModPlacements.AVENTURINE_ORE_PLACED);
        base.add(ModPlacements.CARNELIAN_ORE_PLACED);
        base.add(ModPlacements.CHALCOPYRITE_ORE_PLACED);
        base.add(ModPlacements.CITRINE_ORE_PLACED);
        base.add(ModPlacements.JADE_ORE_PLACED);
        base.add(ModPlacements.JASPER_ORE_PLACED);
        base.add(ModPlacements.LABRADORITE_ORE_PLACED);
        base.add(ModPlacements.MICA_ORE_PLACED);
        base.add(ModPlacements.MOONSTONE_ORE_PLACED);
        base.add(ModPlacements.ROSE_QUARTZ_ORE_PLACED);
        base.add(ModPlacements.SODALITE_ORE_PLACED);

        base.add(ModPlacements.DEEPSLATE_AMETHYST_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_AVENTURINE_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_CARNELIAN_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_CHALCOPYRITE_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_CITRINE_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_JADE_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_JASPER_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_LABRADORITE_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_MICA_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_MOONSTONE_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_ROSE_QUARTZ_ORE_PLACED);
        base.add(ModPlacements.DEEPSLATE_SODALITE_ORE_PLACED);



    }
}
