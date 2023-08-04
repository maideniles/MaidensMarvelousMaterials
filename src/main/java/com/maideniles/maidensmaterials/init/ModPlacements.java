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
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacements {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MarvelousMaterials.MOD_ID);


    public static final RegistryObject<PlacedFeature> CRABAPPLE_PLACEMENT = PLACED_FEATURES.register("crabapple_placement",
            () -> new PlacedFeature(ModFeatures.CRABAPPLE_CONFIG.getHolder().get(),  List.of(PlacementUtils.countExtra(1, 0.05f, 1),PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> CRABAPPLE_VINES_PLACEMENT = PLACED_FEATURES.register("crabapple_vines_placement",
            () -> new PlacedFeature( ModFeatures. CRABAPPLE_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> POINCIANA_PLACEMENT = PLACED_FEATURES.register("poinciana_placement",
            () -> new PlacedFeature(   ModFeatures. POINCIANA_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> POINCIANA_VINES_PLACEMENT = PLACED_FEATURES.register("poinciana_vines_placement",
            () -> new PlacedFeature(   ModFeatures. POINCIANA_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> LABURNUM_PLACEMENT = PLACED_FEATURES.register("laburnum_placement",
            () -> new PlacedFeature(   ModFeatures. LABURNUM_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> LABURNUM_VINES_PLACEMENT = PLACED_FEATURES.register("laburnum_vines_placement",
            () -> new PlacedFeature(   ModFeatures. LABURNUM_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> JADE_PLACEMENT = PLACED_FEATURES.register("jade_placement",
            () -> new PlacedFeature(   ModFeatures. JADE_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> JADE_VINES_PLACEMENT = PLACED_FEATURES.register("jade_vines_placement",
            () -> new PlacedFeature(   ModFeatures. JADE_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> PAULOWNIA_PLACEMENT = PLACED_FEATURES.register("paulownia_placement",
            () -> new PlacedFeature(    ModFeatures. PAULOWNIA_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> PAULOWNIA_VINES_PLACEMENT = PLACED_FEATURES.register("paulownia_vines_placement",
            () -> new PlacedFeature(     ModFeatures. PAULOWNIA_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> WISTERIA_PLACEMENT = PLACED_FEATURES.register("wisteria_placement",
            () -> new PlacedFeature(     ModFeatures. WISTERIA_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> WISTERIA_VINES_PLACEMENT = PLACED_FEATURES.register("wisteria_vines_placement",
            () -> new PlacedFeature(     ModFeatures. WISTERIA_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> DOGWOOD_PLACEMENT = PLACED_FEATURES.register("dogwood_placement",
            () -> new PlacedFeature(      ModFeatures. DOGWOOD_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> DOGWOOD_VINES_PLACEMENT = PLACED_FEATURES.register("dogwood_vines_placement",
            () -> new PlacedFeature(    ModFeatures. DOGWOOD_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> JACARANDA_PLACEMENT = PLACED_FEATURES.register("jacaranda_placement",
            () -> new PlacedFeature(     ModFeatures. JACARANDA_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> JACARANDA_VINES_PLACEMENT = PLACED_FEATURES.register("jacaranda_vines_placement",
            () -> new PlacedFeature(      ModFeatures. JACARANDA_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> SILVERBELL_PLACEMENT = PLACED_FEATURES.register("silverbell_placement",
            () -> new PlacedFeature(       ModFeatures. SILVERBELL_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> SILVERBELL_VINES_PLACEMENT = PLACED_FEATURES.register("silverbell_vines_placement",
            () -> new PlacedFeature(      ModFeatures. SILVERBELL_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> CEDAR_PLACEMENT = PLACED_FEATURES.register("cedar_placement",
            () -> new PlacedFeature(     ModFeatures. CEDAR_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> CEDAR_VINES_PLACEMENT = PLACED_FEATURES.register("cedar_vines_placement",
            () -> new PlacedFeature(      ModFeatures. CEDAR_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    //ORNAMENTAL MUSHROOM//
    public static final RegistryObject<PlacedFeature> ORNAMENTAL_MUSHROOM_PLACEMENT = PLACED_FEATURES.register("ornamental_mushroom_placement", ()->
            new PlacedFeature( ModFeatures.ORNAMENTAL_MUSHROOM.getHolder().get(), List.of(CountPlacement.of(3),RarityFilter.onAverageOnceEvery(3),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, PlacementUtils.countExtra(6,1,1), BiomeFilter.biome())));

   // public static final Holder<PlacedFeature> ORNAMENTAL_MUSHROOM_CAVE_FLOOR_PLACEMENT = PLACED_FEATURES.register("ornamental_mushroom_cave_floor_placement",
   //         ModFeatures.ORNAMENTAL_MUSHROOM, CountPlacement.of(3),RarityFilter.onAverageOnceEvery(3),
   //         InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, SurfaceRelativeThresholdFilter.of(Heightmap.Types.OCEAN_FLOOR_WG, Integer.MIN_VALUE, -2), PlacementUtils.countExtra(10,1,1), BiomeFilter.biome());


    public static final RegistryObject<PlacedFeature> ORNAMENTAL_MUSHROOM_CAVE_PLACEMENT = PLACED_FEATURES.register("ornamental_mushroom_cave_placement", ()->
           new PlacedFeature(ModFeatures.ORNAMENTAL_MUSHROOM_CAVE.getHolder().get(), List.of(CountPlacement.of(140), InSquarePlacement.spread(),
            PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(),
                    BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome())));



    public static final RegistryObject<PlacedFeature> ORNAMENTAL_FOREST_FLOWERS_PLACEMENT = PLACED_FEATURES.register("ornamental_forest_flowers_placement", ()->
            new PlacedFeature( ModFeatures.ORNAMENTAL_FOREST_FLOWERS.getHolder().get(), List.of(CountPlacement.of(10),RarityFilter.onAverageOnceEvery(3),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,PlacementUtils.countExtra(3,1,1), BiomeFilter.biome())));

//ORES//




//COMMON//
public static final RegistryObject<PlacedFeature> JASPER_ORE_PLACED = PLACED_FEATURES.register("jasper_ore_placed", ()->
           new PlacedFeature( ModFeatures.JASPER_ORE.getHolder().get(), commonOrePlacement(20, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> CITRINE_ORE_PLACED = PLACED_FEATURES.register("citrine_ore_placed",()->
            new PlacedFeature(ModFeatures.CITRINE_ORE.getHolder().get(),commonOrePlacement(18, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> JADE_ORE_PLACED = PLACED_FEATURES.register("jade_ore_placed", ()->
            new PlacedFeature(ModFeatures.JADE_ORE.getHolder().get(), commonOrePlacement(16, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> MOONSTONE_ORE_PLACED = PLACED_FEATURES.register("moonstone_ore_placed", ()->
            new PlacedFeature( ModFeatures.MOONSTONE_ORE.getHolder().get(), commonOrePlacement(14, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));


//UNCOMMON//
public static final RegistryObject<PlacedFeature> AVENTURINE_ORE_PLACED = PLACED_FEATURES.register("aventurine_ore_placed", ()->
        new PlacedFeature(
            ModFeatures.AVENTURINE_ORE.getHolder().get(),commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> LABRADORITE_ORE_PLACED = PLACED_FEATURES.register("labradorite_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.LABRADORITE_ORE.getHolder().get(), commonOrePlacement(14, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> ROSE_QUARTZ_ORE_PLACED = PLACED_FEATURES.register("rose_quartz_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.ROSE_QUARTZ_ORE.getHolder().get(), commonOrePlacement(14, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> MICA_ORE_PLACED = PLACED_FEATURES.register("mica_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.MICA_ORE.getHolder().get(),commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

//RARE//
public static final RegistryObject<PlacedFeature> CARNELIAN_ORE_PLACED = PLACED_FEATURES.register("carnelian_ore_placed", ()->
        new PlacedFeature(
            ModFeatures.CARNELIAN_ORE.getHolder().get(), rareOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> SODALITE_ORE_PLACED = PLACED_FEATURES.register("sodalite_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.SODALITE_ORE.getHolder().get(),rareOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> AMETHYST_ORE_PLACED = PLACED_FEATURES.register("amethyst_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.AMETHYST_ORE.getHolder().get(), rareOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    public static final RegistryObject<PlacedFeature> CHALCOPYRITE_ORE_PLACED = PLACED_FEATURES.register("chalcopyrite_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.CHALCOPYRITE_ORE.getHolder().get(), rareOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(80), VerticalAnchor.aboveBottom(384)))));

    //ORES//

    //COMMON//
    public static final RegistryObject<PlacedFeature> DEEPSLATE_JASPER_ORE_PLACED = PLACED_FEATURES.register("deepslate_jasper_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_JASPER_ORE.getHolder().get(), commonOrePlacement(20, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_CITRINE_ORE_PLACED = PLACED_FEATURES.register("deepslate_citrine_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_CITRINE_ORE.getHolder().get(),commonOrePlacement(18, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_JADE_ORE_PLACED = PLACED_FEATURES.register("deepslate_jade_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_JADE_ORE.getHolder().get(), commonOrePlacement(16, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_MOONSTONE_ORE_PLACED = PLACED_FEATURES.register("deepslate_moonstone_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_MOONSTONE_ORE.getHolder().get(), commonOrePlacement(14, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));


    //UNCOMMON//
    public static final RegistryObject<PlacedFeature> DEEPSLATE_AVENTURINE_ORE_PLACED = PLACED_FEATURES.register("deepslate_aventurine_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_AVENTURINE_ORE.getHolder().get(),commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_LABRADORITE_ORE_PLACED = PLACED_FEATURES.register("deepslate_labradorite_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_LABRADORITE_ORE.getHolder().get(), commonOrePlacement(14, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_ROSE_QUARTZ_ORE_PLACED = PLACED_FEATURES.register("deepslate_rose_quartz_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_ROSE_QUARTZ_ORE.getHolder().get(), commonOrePlacement(14, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_MICA_ORE_PLACED = PLACED_FEATURES.register("deepslate_mica_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_MICA_ORE.getHolder().get(),commonOrePlacement(12, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    //RARE//
    public static final RegistryObject<PlacedFeature> DEEPSLATE_CARNELIAN_ORE_PLACED = PLACED_FEATURES.register("deepslate_carnelian_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_CARNELIAN_ORE.getHolder().get(), rareOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_SODALITE_ORE_PLACED = PLACED_FEATURES.register("deepslate_sodalite_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_SODALITE_ORE.getHolder().get(),rareOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_AMETHYST_ORE_PLACED = PLACED_FEATURES.register("deepslate_amethyst_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_AMETHYST_ORE.getHolder().get(), rareOrePlacement(6, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));

    public static final RegistryObject<PlacedFeature> DEEPSLATE_CHALCOPYRITE_ORE_PLACED = PLACED_FEATURES.register("deepslate_chalcopyrite_ore_placed", ()->
            new PlacedFeature(
            ModFeatures.DEEPSLATE_CHALCOPYRITE_ORE.getHolder().get(), rareOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(-48)))));


    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus) {
        PLACED_FEATURES.register(eventBus);
    }

}


