package com.maideniles.maidensmaterials.init;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacements {

    public static final Holder <PlacedFeature> CRABAPPLE_PLACEMENT = PlacementUtils.register("crabapple_placement",
           ModFeatures. CRABAPPLE_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                   BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> CRABAPPLE_VINES_PLACEMENT = PlacementUtils.register("crabapple_vines_placement",
            ModFeatures. CRABAPPLE_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> POINCIANA_PLACEMENT = PlacementUtils.register("poinciana_placement",
            ModFeatures. POINCIANA_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> POINCIANA_VINES_PLACEMENT = PlacementUtils.register("poinciana_vines_placement",
            ModFeatures. POINCIANA_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> LABURNUM_PLACEMENT = PlacementUtils.register("laburnum_placement",
            ModFeatures. LABURNUM_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> LABURNUM_VINES_PLACEMENT = PlacementUtils.register("laburnum_vines_placement",
            ModFeatures. LABURNUM_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> JADE_PLACEMENT = PlacementUtils.register("jade_placement",
            ModFeatures. JADE_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> JADE_VINES_PLACEMENT = PlacementUtils.register("jade_vines_placement",
            ModFeatures. JADE_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> PAULOWNIA_PLACEMENT = PlacementUtils.register("paulownia_placement",
            ModFeatures. PAULOWNIA_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> PAULOWNIA_VINES_PLACEMENT = PlacementUtils.register("paulownia_vines_placement",
            ModFeatures. PAULOWNIA_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> WISTERIA_PLACEMENT = PlacementUtils.register("wisteria_placement",
            ModFeatures. WISTERIA_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> WISTERIA_VINES_PLACEMENT = PlacementUtils.register("wisteria_vines_placement",
            ModFeatures. WISTERIA_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> DOGWOOD_PLACEMENT = PlacementUtils.register("dogwood_placement",
            ModFeatures. DOGWOOD_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> DOGWOOD_VINES_PLACEMENT = PlacementUtils.register("dogwood_vines_placement",
            ModFeatures. DOGWOOD_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> JACARANDA_PLACEMENT = PlacementUtils.register("jacaranda_placement",
            ModFeatures. JACARANDA_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> JACARANDA_VINES_PLACEMENT = PlacementUtils.register("jacaranda_vines_placement",
            ModFeatures. JACARANDA_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> SILVERBELL_PLACEMENT = PlacementUtils.register("silverbell_placement",
            ModFeatures. SILVERBELL_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> SILVERBELL_VINES_PLACEMENT = PlacementUtils.register("silverbell_vines_placement",
            ModFeatures. SILVERBELL_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> CEDAR_PLACEMENT = PlacementUtils.register("cedar_placement",
            ModFeatures. CEDAR_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());


    public static final Holder <PlacedFeature> CEDAR_VINES_PLACEMENT = PlacementUtils.register("cedar_vines_placement",
            ModFeatures. CEDAR_VINES_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());



    public static final Holder <PlacedFeature> APPLE_TREE_PLACEMENT = PlacementUtils.register("apple_placement",
            ModFeatures. APPLE_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> CHERRY_TREE_PLACEMENT = PlacementUtils.register("cherry_placement",
            ModFeatures. CHERRY_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> GRAPEFRUIT_TREE_PLACEMENT = PlacementUtils.register("grapefruit_placement",
            ModFeatures. GRAPEFRUIT_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> LEMON_TREE_PLACEMENT = PlacementUtils.register("lemon_placement",
            ModFeatures. LEMON_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> LIME_TREE_PLACEMENT = PlacementUtils.register("lime_placement",
            ModFeatures. LIME_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> ORANGE_TREE_PLACEMENT = PlacementUtils.register("orange_placement",
            ModFeatures. ORANGE_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> PEACH_TREE_PLACEMENT = PlacementUtils.register("peach_placement",
            ModFeatures. PEACH_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> PEAR_TREE_PLACEMENT = PlacementUtils.register("pear_placement",
            ModFeatures. PEAR_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());

    public static final Holder <PlacedFeature> PLUM_TREE_PLACEMENT = PlacementUtils.register("plum_placement",
            ModFeatures. PLUM_CONFIG,(PlacementUtils.countExtra(1, 0.05F, 1)),
                    InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
                    BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(),
                            BlockPos.ZERO)), BiomeFilter.biome());



    public static final Holder< PlacedFeature> PALM_TREE_PLACEMENT = PlacementUtils.register("palm_tree_placement",
            ModFeatures.PALM_TREE_CONFIG, PlacementUtils.countExtra(1, 0.05F, 1),
            InSquarePlacement.spread(), VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR,
            BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.CACTUS.defaultBlockState(),
                    BlockPos.ZERO)), BiomeFilter.biome());





    private static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, name, configuredFeature);
    }

}
