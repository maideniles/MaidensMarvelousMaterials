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
            () -> new PlacedFeature(ModFeatures.CRABAPPLE_CONFIG.getHolder().get(), List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));


    public static final RegistryObject<PlacedFeature> CRABAPPLE_VINES_PLACEMENT = PLACED_FEATURES.register("crabapple_vines_placement",
            () -> new PlacedFeature( ModFeatures. CRABAPPLE_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> CRABAPPLE_PLACED = PLACED_FEATURES.register("crabapple_placed",
            () -> new PlacedFeature(ModFeatures.CRABAPPLE_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));



    public static final RegistryObject<PlacedFeature> POINCIANA_PLACEMENT = PLACED_FEATURES.register("poinciana_placement",
            () -> new PlacedFeature(   ModFeatures. POINCIANA_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> POINCIANA_VINES_PLACEMENT = PLACED_FEATURES.register("poinciana_vines_placement",
            () -> new PlacedFeature(   ModFeatures. POINCIANA_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> POINCIANA_PLACED = PLACED_FEATURES.register("poinciana_placed",
            () -> new PlacedFeature(ModFeatures.POINCIANA_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    public static final RegistryObject<PlacedFeature> LABURNUM_PLACEMENT = PLACED_FEATURES.register("laburnum_placement",
            () -> new PlacedFeature(   ModFeatures. LABURNUM_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> LABURNUM_VINES_PLACEMENT = PLACED_FEATURES.register("laburnum_vines_placement",
            () -> new PlacedFeature(   ModFeatures. LABURNUM_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> LABURNUM_PLACED = PLACED_FEATURES.register("laburnum_placed",
            () -> new PlacedFeature(ModFeatures.LABURNUM_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    public static final RegistryObject<PlacedFeature> JADE_PLACEMENT = PLACED_FEATURES.register("jade_placement",
            () -> new PlacedFeature(   ModFeatures. JADE_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> JADE_VINES_PLACEMENT = PLACED_FEATURES.register("jade_vines_placement",
            () -> new PlacedFeature(   ModFeatures. JADE_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> JADE_PLACED = PLACED_FEATURES.register("jade_placed",
            () -> new PlacedFeature(ModFeatures.JADE_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    public static final RegistryObject<PlacedFeature> PAULOWNIA_PLACEMENT = PLACED_FEATURES.register("paulownia_placement",
            () -> new PlacedFeature(    ModFeatures. PAULOWNIA_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> PAULOWNIA_VINES_PLACEMENT = PLACED_FEATURES.register("paulownia_vines_placement",
            () -> new PlacedFeature(     ModFeatures. PAULOWNIA_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> PAULOWNIA_PLACED = PLACED_FEATURES.register("paulownia_placed",
            () -> new PlacedFeature(ModFeatures.PAULOWNIA_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    public static final RegistryObject<PlacedFeature> WISTERIA_PLACEMENT = PLACED_FEATURES.register("wisteria_placement",
            () -> new PlacedFeature(     ModFeatures. WISTERIA_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> WISTERIA_VINES_PLACEMENT = PLACED_FEATURES.register("wisteria_vines_placement",
            () -> new PlacedFeature(     ModFeatures. WISTERIA_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> WISTERIA_PLACED = PLACED_FEATURES.register("wisteria_placed",
            () -> new PlacedFeature(ModFeatures.WISTERIA_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    public static final RegistryObject<PlacedFeature> DOGWOOD_PLACEMENT = PLACED_FEATURES.register("dogwood_placement",
            () -> new PlacedFeature(      ModFeatures. DOGWOOD_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> DOGWOOD_VINES_PLACEMENT = PLACED_FEATURES.register("dogwood_vines_placement",
            () -> new PlacedFeature(    ModFeatures. DOGWOOD_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> DOGWOOD_PLACED = PLACED_FEATURES.register("dogwood_placed",
            () -> new PlacedFeature(ModFeatures.DOGWOOD_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    public static final RegistryObject<PlacedFeature> JACARANDA_PLACEMENT = PLACED_FEATURES.register("jacaranda_placement",
            () -> new PlacedFeature(     ModFeatures. JACARANDA_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> JACARANDA_VINES_PLACEMENT = PLACED_FEATURES.register("jacaranda_vines_placement",
            () -> new PlacedFeature(      ModFeatures. JACARANDA_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> JACARANDA_PLACED = PLACED_FEATURES.register("jacaranda_placed",
            () -> new PlacedFeature(ModFeatures.JACARANDA_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    public static final RegistryObject<PlacedFeature> SILVERBELL_PLACEMENT = PLACED_FEATURES.register("silverbell_placement",
            () -> new PlacedFeature(       ModFeatures. SILVERBELL_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> SILVERBELL_VINES_PLACEMENT = PLACED_FEATURES.register("silverbell_vines_placement",
            () -> new PlacedFeature(      ModFeatures. SILVERBELL_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> SILVERBELL_PLACED = PLACED_FEATURES.register("silverbell_placed",
            () -> new PlacedFeature(ModFeatures.SILVERBELL_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));



    public static final RegistryObject<PlacedFeature> CEDAR_PLACEMENT = PLACED_FEATURES.register("cedar_placement",
            () -> new PlacedFeature(     ModFeatures. CEDAR_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> CEDAR_VINES_PLACEMENT = PLACED_FEATURES.register("cedar_vines_placement",
            () -> new PlacedFeature(      ModFeatures. CEDAR_VINES_CONFIG.getHolder().get(),  List.of(PlacementUtils.filteredByBlockSurvival((Blocks.OAK_SAPLING)))));

    public static final RegistryObject<PlacedFeature> CEDAR_PLACED = PLACED_FEATURES.register("cedar_placed",
            () -> new PlacedFeature(ModFeatures.CEDAR_SPAWN.getHolder().get(), VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2))));


    //ORNAMENTAL MUSHROOM + OTHER FLOWERS//

    public static final RegistryObject<PlacedFeature> ORNAMENTAL_FOREST_FLOWERS_PLACEMENT = PLACED_FEATURES.register("ornamental_forest_flowers_placement", ()->
            new PlacedFeature( ModFeatures.ORNAMENTAL_FOREST_FLOWERS.getHolder().get(), List.of(CountPlacement.of(10),RarityFilter.onAverageOnceEvery(3),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,PlacementUtils.countExtra(3,1,1), BiomeFilter.biome())));

//ORES//

    //COMMON//
    public static final RegistryObject<PlacedFeature> CHALCOPYRITE_ORE_PLACED = PLACED_FEATURES.register("chalcopyrite_ore_placed",
            ()-> new PlacedFeature(ModFeatures.CHALCOPYRITE_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(61)))));

public static final RegistryObject<PlacedFeature> JASPER_ORE_PLACED = PLACED_FEATURES.register("jasper_ore_placed",
        ()-> new PlacedFeature( ModFeatures.JASPER_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(56)))));

    public static final RegistryObject<PlacedFeature> JADE_ORE_PLACED = PLACED_FEATURES.register("jade_ore_placed",
            ()-> new PlacedFeature(ModFeatures.JADE_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(60)))));

    public static final RegistryObject<PlacedFeature> MOONSTONE_ORE_PLACED = PLACED_FEATURES.register("moonstone_ore_placed",
            ()-> new PlacedFeature( ModFeatures.MOONSTONE_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(64)))));


//UNCOMMON//
public static final RegistryObject<PlacedFeature> AVENTURINE_ORE_PLACED = PLACED_FEATURES.register("aventurine_ore_placed",
        ()-> new PlacedFeature(ModFeatures.AVENTURINE_ORE.getHolder().get(),commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(32)))));

    public static final RegistryObject<PlacedFeature> LABRADORITE_ORE_PLACED = PLACED_FEATURES.register("labradorite_ore_placed",
            ()-> new PlacedFeature(ModFeatures.LABRADORITE_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(32)))));

    public static final RegistryObject<PlacedFeature> ROSE_QUARTZ_ORE_PLACED = PLACED_FEATURES.register("rose_quartz_ore_placed",
            ()-> new PlacedFeature(ModFeatures.ROSE_QUARTZ_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(32)))));

    public static final RegistryObject<PlacedFeature> MICA_ORE_PLACED = PLACED_FEATURES.register("mica_ore_placed",
            ()-> new PlacedFeature(ModFeatures.MICA_ORE.getHolder().get(),commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(32)))));

//RARE//

    public static final RegistryObject<PlacedFeature> CITRINE_ORE_PLACED = PLACED_FEATURES.register("citrine_ore_placed",
            () -> new PlacedFeature(ModFeatures.CITRINE_ORE.getHolder().get(), commonOrePlacement(9, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(16)))));

public static final RegistryObject<PlacedFeature> CARNELIAN_ORE_PLACED = PLACED_FEATURES.register("carnelian_ore_placed",
        ()-> new PlacedFeature(ModFeatures.CARNELIAN_ORE.getHolder().get(), commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(16)))));

    public static final RegistryObject<PlacedFeature> SODALITE_ORE_PLACED = PLACED_FEATURES.register("sodalite_ore_placed",
            ()-> new PlacedFeature(ModFeatures.SODALITE_ORE.getHolder().get(),commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(16)))));

    public static final RegistryObject<PlacedFeature> AMETHYST_ORE_PLACED = PLACED_FEATURES.register("amethyst_ore_placed",
            ()-> new PlacedFeature(ModFeatures.AMETHYST_ORE.getHolder().get(), commonOrePlacement(8, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.bottom(), VerticalAnchor.absolute(16)))));



    //ORES//



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


