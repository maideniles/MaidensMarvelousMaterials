package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.world.gen.ore.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

//TREES//
    public static final ResourceKey<PlacedFeature> CRABAPPLE_PLACED_KEY = createKey("crabapple_placed_mm");
    public static final ResourceKey<PlacedFeature> POINCIANA_PLACED_KEY = createKey("poinciana_placed_mm");
    public static final ResourceKey<PlacedFeature> LABURNUM_PLACED_KEY = createKey("laburnum_placed_mm");
    public static final ResourceKey<PlacedFeature> JADE_PLACED_KEY = createKey("jade_placed_mm");
    public static final ResourceKey<PlacedFeature> PAULOWNIA_PLACED_KEY = createKey("paulownia_placed_mm");
    public static final ResourceKey<PlacedFeature> WISTERIA_PLACED_KEY = createKey("wisteria_placed_mm");
    public static final ResourceKey<PlacedFeature> JACARANDA_PLACED_KEY = createKey("jacaranda_placed_mm");
    public static final ResourceKey<PlacedFeature> DOGWOOD_PLACED_KEY = createKey("dogwood_placed_mm");
    public static final ResourceKey<PlacedFeature> SILVERBELL_PLACED_KEY = createKey("silverbell_placed_mm");
    public static final ResourceKey<PlacedFeature> CEDAR_PLACED_KEY = createKey("cedar_placed_mm");

    public static final ResourceKey<PlacedFeature> CRABAPPLE_VINES_PLACED_KEY = createKey("crabapple_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> POINCIANA_VINES_PLACED_KEY = createKey("poinciana_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> LABURNUM_VINES_PLACED_KEY = createKey("laburnum_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> JADE_VINES_PLACED_KEY = createKey("jade_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> PAULOWNIA_VINES_PLACED_KEY = createKey("paulownia_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> WISTERIA_VINES_PLACED_KEY = createKey("wisteria_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> JACARANDA_VINES_PLACED_KEY = createKey("jacaranda_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> DOGWOOD_VINES_PLACED_KEY = createKey("dogwood_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> SILVERBELL_VINES_PLACED_KEY = createKey("silverbell_vines_placed_mm");
    public static final ResourceKey<PlacedFeature> CEDAR_VINES_PLACED_KEY = createKey("cedar_vines_placed_mm");

//FLOWERS//
public static final ResourceKey<PlacedFeature> ORNAMENTAL_FLOWERS_PLACED_KEY = createKey("ornamental_flowers_placed_mm");

//ORES//
public static final ResourceKey<PlacedFeature> JASPER_ORE_PLACED_KEY = createKey("jasper_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> CARNELIAN_ORE_PLACED_KEY = createKey("carnelian_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> CITRINE_ORE_PLACED_KEY = createKey("citrine_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> AVENTURINE_ORE_PLACED_KEY = createKey("aventurine_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> JADE_ORE_PLACED_KEY = createKey("jade_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> CHALCOPYRITE_ORE_PLACED_KEY = createKey("chalcopyrite_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> LABRADORITE_ORE_PLACED_KEY = createKey("labradorite_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> MOONSTONE_ORE_PLACED_KEY = createKey("moonstone_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> SODALITE_ORE_PLACED_KEY = createKey("sodalite_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> AMETHYST_ORE_PLACED_KEY = createKey("amethyst_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> ROSE_QUARTZ_ORE_PLACED_KEY = createKey("rose_quartz_ore_placed_mm");
    public static final ResourceKey<PlacedFeature> MICA_ORE_PLACED_KEY = createKey("mica_ore_placed_mm");



    public static void bootstrap(BootstapContext<PlacedFeature> context) {

        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

//TREES//
        register(context, CRABAPPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRABAPPLE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.CRABAPPLE_SAPLING.get()));
        register(context, POINCIANA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINCIANA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.POINCIANA_SAPLING.get()));
        register(context, LABURNUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LABURNUM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.LABURNUM_SAPLING.get()));
        register(context, JADE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JADE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.JADE_SAPLING.get()));
        register(context, PAULOWNIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PAULOWNIA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.PAULOWNIA_SAPLING.get()));
        register(context, WISTERIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WISTERIA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.WISTERIA_SAPLING.get()));
        register(context, JACARANDA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JACARANDA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.JACARANDA_SAPLING.get()));
        register(context, DOGWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOGWOOD_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.DOGWOOD_SAPLING.get()));
        register(context, SILVERBELL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVERBELL_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.SILVERBELL_SAPLING.get()));
        register(context, CEDAR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CEDAR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.CEDAR_SAPLING.get()));

        register(context, CRABAPPLE_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRABAPPLE_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.CRABAPPLE_SAPLING.get()));
        register(context, POINCIANA_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.POINCIANA_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.POINCIANA_SAPLING.get()));
        register(context, LABURNUM_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LABURNUM_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.LABURNUM_SAPLING.get()));
        register(context, JADE_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JADE_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.JADE_SAPLING.get()));
        register(context, PAULOWNIA_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PAULOWNIA_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.PAULOWNIA_SAPLING.get()));
        register(context, WISTERIA_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WISTERIA_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.WISTERIA_SAPLING.get()));
        register(context, JACARANDA_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JACARANDA_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.JACARANDA_SAPLING.get()));
        register(context, DOGWOOD_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOGWOOD_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.DOGWOOD_SAPLING.get()));
        register(context, SILVERBELL_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVERBELL_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.SILVERBELL_SAPLING.get()));
        register(context, CEDAR_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CEDAR_VINES_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.CEDAR_SAPLING.get()));
//FLOWERS//
        register(context, ORNAMENTAL_FLOWERS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORNAMENTAL_FLOWERS_KEY), CountPlacement.of(3),
                RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,PlacementUtils.countExtra(0,1.0F,1),
                BiomeFilter.biome());
//ORES//
        register(context,CHALCOPYRITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHALCOPYRITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(10, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(61))));
        register(context,JASPER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JASPER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(56))));
        register(context,JADE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JADE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(60))));
        register(context,MOONSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOONSTONE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64))));
//UNCOMMON//
        register(context,AVENTURINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AVENTURINE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(32))));
        register(context,LABRADORITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LABRADORITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(32))));
        register(context,ROSE_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROSE_QUARTZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(32))));
        register(context,MICA_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MICA_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(32))));
//RARE//
        register(context,CITRINE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CITRINE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(9, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(16))));
        register(context,CARNELIAN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CARNELIAN_ORE_KEY),
                ModOrePlacement.commonOrePlacement(8, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(16))));
        register(context,SODALITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SODALITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(16))));
        register(context,AMETHYST_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AMETHYST_ORE_KEY),
                ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(16))));

    }




    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MarvelousMaterials.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }



    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
