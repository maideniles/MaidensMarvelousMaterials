package com.maideniles.maidensmaterials.world.gen.biome;

import com.maideniles.maidensmaterials.init.ModPlacements;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.sounds.Music;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;

import javax.annotation.Nullable;

public class ModOverworldBiomes
{
    @Nullable
    private static final Music NORMAL_MUSIC = null;

    protected static int calculateSkyColor(float color)
    {
        float $$1 = color / 3.0F;
        $$1 = Mth.clamp($$1, -1.0F, 1.0F);
        return Mth.hsvToRgb(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
    }

 //   private static Biome biome(Biome.Precipitation precipitation, Biome.BiomeCategory category, float temperature, float downfall, MobSpawnSettings.Builder spawnBuilder, BiomeGenerationSettings.Builder biomeBuilder, @Nullable Music music)
  //  {
  //      return biome(precipitation, category, temperature, downfall, 4159204, 329011, spawnBuilder, biomeBuilder, music);
 //   }

    private static Biome biome(Biome.Precipitation precipitation,  float temperature, float downfall, int waterColor, int waterFogColor, int fogColor, int skyColor , int foliageColorOverride, int grassColorOverride, MobSpawnSettings.Builder spawnBuilder, BiomeGenerationSettings.Builder biomeBuilder, @Nullable Music music)
    {
        return (new Biome.BiomeBuilder()).precipitation(precipitation).temperature(temperature).downfall(downfall).specialEffects((new BiomeSpecialEffects.Builder()).waterColor(waterColor).waterFogColor(waterFogColor).fogColor(12638463).skyColor(calculateSkyColor(temperature)).foliageColorOverride(foliageColorOverride).grassColorOverride(grassColorOverride).ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS).backgroundMusic(music).build()).mobSpawnSettings(spawnBuilder.build()).generationSettings(biomeBuilder.build()).build();
    }

    private static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder)
    {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
     //  BiomeDefaultFeatures.addLushCavesVegetationFeatures(builder);
     //  BiomeDefaultFeatures.addLushCavesSpecialOres(builder);

        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
        BiomeDefaultFeatures.addDefaultOres(builder);
        BiomeDefaultFeatures.addDefaultSoftDisks(builder);
        BiomeDefaultFeatures.addForestGrass(builder);
    }

    public static Biome ornamentalForest()
    {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 5, 1, 3));
        spawnBuilder.addSpawn(MobCategory.AXOLOTLS, new MobSpawnSettings.SpawnerData(EntityType.AXOLOTL, 3,1,3));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder();

        globalOverworldGeneration(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_SUGAR_CANE);
      //  biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.AMETHYST_ORE_PLACED.getHolder().get());






  //COMMENT OUT BECAUSE MOD ORE GEN CLASS ADDS TO ALL BIOMES--ELIMINATE FEATURE ORDER CYCLE ERROR//
/*
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.JASPER_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.CARNELIAN_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.CITRINE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.AVENTURINE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.JADE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.CHALCOPYRITE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.LABRADORITE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.MOONSTONE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.SODALITE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.AMETHYST_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.ROSE_QUARTZ_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.MICA_ORE_PLACED.getHolder().get());


        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_JASPER_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_CARNELIAN_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_CITRINE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_AVENTURINE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_JADE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_CHALCOPYRITE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_LABRADORITE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_MOONSTONE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_SODALITE_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_AMETHYST_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_ROSE_QUARTZ_ORE_PLACED.getHolder().get());
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacements.DEEPSLATE_MICA_ORE_PLACED.getHolder().get());

*/

        return biome(Biome.Precipitation.RAIN,
                 2.0F, 0.0F,4445678,15925247, 15925247, calculateSkyColor(0.0F),0x1A937, 0x1A937, spawnBuilder, biomeBuilder, NORMAL_MUSIC);

    }


}
