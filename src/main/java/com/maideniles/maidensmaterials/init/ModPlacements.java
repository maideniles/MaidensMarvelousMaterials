package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.config.MarvelousCommonConfig;
import com.maideniles.maidensmaterials.world.gen.ore.ModOrePlacement;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModPlacements {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MarvelousMaterials.MOD_ID);


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

    //ORNAMENTAL MUSHROOM//
    public static final Holder<PlacedFeature> ORNAMENTAL_MUSHROOM_PLACEMENT = PlacementUtils.register("ornamental_mushroom_placement",
            ModFeatures.ORNAMENTAL_MUSHROOM, CountPlacement.of(3),RarityFilter.onAverageOnceEvery(3),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, PlacementUtils.countExtra(6,1,1), BiomeFilter.biome());

   // public static final Holder<PlacedFeature> ORNAMENTAL_MUSHROOM_CAVE_FLOOR_PLACEMENT = PlacementUtils.register("ornamental_mushroom_cave_floor_placement",
   //         ModFeatures.ORNAMENTAL_MUSHROOM, CountPlacement.of(3),RarityFilter.onAverageOnceEvery(3),
   //         InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, SurfaceRelativeThresholdFilter.of(Heightmap.Types.OCEAN_FLOOR_WG, Integer.MIN_VALUE, -2), PlacementUtils.countExtra(10,1,1), BiomeFilter.biome());


    public static final Holder<PlacedFeature> ORNAMENTAL_MUSHROOM_CAVE_PLACEMENT = PlacementUtils.register("ornamental_mushroom_cave_placement",
           ModFeatures.ORNAMENTAL_MUSHROOM_CAVE, CountPlacement.of(140), InSquarePlacement.spread(),
            PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(),
                    BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome());



    public static final Holder<PlacedFeature> ORNAMENTAL_FOREST_FLOWERS_PLACEMENT = PlacementUtils.register("ornamental_forest_flowers_placement",
            ModFeatures.ORNAMENTAL_FOREST_FLOWERS, CountPlacement.of(10),RarityFilter.onAverageOnceEvery(3),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,PlacementUtils.countExtra(3,1,1), BiomeFilter.biome());

//ORES//


//COMMON//
    public static final Holder<PlacedFeature> JASPER_ORE_PLACED = PlacementUtils.register("jasper_ore_placed",
            ModFeatures.JASPER_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.JASPER_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> CITRINE_ORE_PLACED = PlacementUtils.register("citrine_ore_placed",
            ModFeatures.CITRINE_ORE, ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.CITRINE_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> JADE_ORE_PLACED = PlacementUtils.register("jade_ore_placed",
            ModFeatures.JADE_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.JADE_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> MOONSTONE_ORE_PLACED = PlacementUtils.register("moonstone_ore_placed",
            ModFeatures.MOONSTONE_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.MOONSTONE_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));


//UNCOMMON//
    public static final Holder<PlacedFeature> AVENTURINE_ORE_PLACED = PlacementUtils.register("aventurine_ore_placed",
            ModFeatures.AVENTURINE_ORE, ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.AVENTURINE_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> LABRADORITE_ORE_PLACED = PlacementUtils.register("labradorite_ore_placed",
            ModFeatures.LABRADORITE_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.LABRADORITE_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> ROSE_QUARTZ_ORE_PLACED = PlacementUtils.register("rose_quartz_ore_placed",
            ModFeatures.ROSE_QUARTZ_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.ROSE_QUARTZ_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> MICA_ORE_PLACED = PlacementUtils.register("mica_ore_placed",
            ModFeatures.MICA_ORE, ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.MICA_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

//RARE//
    public static final Holder<PlacedFeature> CARNELIAN_ORE_PLACED = PlacementUtils.register("carnelian_ore_placed",
            ModFeatures.CARNELIAN_ORE,  ModOrePlacement.rareOrePlacement(MarvelousCommonConfig.CARNELIAN_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> SODALITE_ORE_PLACED = PlacementUtils.register("sodalite_ore_placed",
            ModFeatures.SODALITE_ORE, ModOrePlacement.rareOrePlacement(MarvelousCommonConfig.SODALITE_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> AMETHYST_ORE_PLACED = PlacementUtils.register("amethyst_ore_placed",
            ModFeatures.AMETHYST_ORE,  ModOrePlacement.rareOrePlacement(MarvelousCommonConfig.AMETHYST_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));

    public static final Holder<PlacedFeature> CHALCOPYRITE_ORE_PLACED = PlacementUtils.register("chalcopyrite_ore_placed",
            ModFeatures.CHALCOPYRITE_ORE,  ModOrePlacement.rareOrePlacement(MarvelousCommonConfig.CHALCOPYRITE_STONE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384))));



    //ORES//


    //COMMON//
    public static final Holder<PlacedFeature> DEEPSLATE_JASPER_ORE_PLACED = PlacementUtils.register("deepslate_jasper_ore_placed",
            ModFeatures.DEEPSLATE_JASPER_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.JASPER_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    public static final Holder<PlacedFeature> DEEPSLATE_CITRINE_ORE_PLACED = PlacementUtils.register("deepslate_citrine_ore_placed",
            ModFeatures.DEEPSLATE_CITRINE_ORE, ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.CITRINE_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    public static final Holder<PlacedFeature> DEEPSLATE_JADE_ORE_PLACED = PlacementUtils.register("deepslate_jade_ore_placed",
            ModFeatures.DEEPSLATE_JADE_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.JADE_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    public static final Holder<PlacedFeature> DEEPSLATE_MOONSTONE_ORE_PLACED = PlacementUtils.register("deepslate_moonstone_ore_placed",
            ModFeatures.DEEPSLATE_MOONSTONE_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.MOONSTONE_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));


    //UNCOMMON//
    public static final Holder<PlacedFeature> DEEPSLATE_AVENTURINE_ORE_PLACED = PlacementUtils.register("deepslate_aventurine_ore_placed",
            ModFeatures.DEEPSLATE_AVENTURINE_ORE, ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.AVENTURINE_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    public static final Holder<PlacedFeature> DEEPSLATE_LABRADORITE_ORE_PLACED = PlacementUtils.register("deepslate_labradorite_ore_placed",
            ModFeatures.DEEPSLATE_LABRADORITE_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.LABRADORITE_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    public static final Holder<PlacedFeature> DEEPSLATE_ROSE_QUARTZ_ORE_PLACED = PlacementUtils.register("deepslate_rose_quartz_ore_placed",
            ModFeatures.DEEPSLATE_ROSE_QUARTZ_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.ROSE_QUARTZ_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    public static final Holder<PlacedFeature> DEEPSLATE_MICA_ORE_PLACED = PlacementUtils.register("deepslate_mica_ore_placed",
            ModFeatures.DEEPSLATE_MICA_ORE, ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.MICA_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    //RARE//
    public static final Holder<PlacedFeature> DEEPSLATE_CARNELIAN_ORE_PLACED = PlacementUtils.register("deepslate_carnelian_ore_placed",
            ModFeatures.DEEPSLATE_CARNELIAN_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.CARNELIAN_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    public static final Holder<PlacedFeature> DEEPSLATE_SODALITE_ORE_PLACED = PlacementUtils.register("deepslate_sodalite_ore_placed",
            ModFeatures.DEEPSLATE_SODALITE_ORE, ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.SODALITE_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(48))));

    public static final Holder<PlacedFeature> DEEPSLATE_AMETHYST_ORE_PLACED = PlacementUtils.register("deepslate_amethyst_ore_placed",
            ModFeatures.DEEPSLATE_AMETHYST_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.AMETHYST_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));

    public static final Holder<PlacedFeature> DEEPSLATE_CHALCOPYRITE_ORE_PLACED = PlacementUtils.register("deepslate_chalcopyrite_ore_placed",
            ModFeatures.DEEPSLATE_CHALCOPYRITE_ORE,  ModOrePlacement.commonOrePlacement(MarvelousCommonConfig.CHALCOPYRITE_DEEPSLATE_VEINS.get(), // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48))));


    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

}


