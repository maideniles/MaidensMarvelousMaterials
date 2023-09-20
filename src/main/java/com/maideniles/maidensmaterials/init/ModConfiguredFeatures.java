package com.maideniles.maidensmaterials.init;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf.*;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.other.ModMushroomDecorator;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk.*;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.InclusiveRange;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.DualNoiseProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.BeehiveDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;

public class ModConfiguredFeatures {

//TREES//
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRABAPPLE_KEY = registerKey("crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINCIANA_KEY = registerKey("poinciana");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LABURNUM_KEY = registerKey("laburnum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JADE_KEY = registerKey("jade");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PAULOWNIA_KEY = registerKey("paulownia");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WISTERIA_KEY = registerKey("wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JACARANDA_KEY = registerKey("jacaranda");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOGWOOD_KEY = registerKey("dogwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVERBELL_KEY = registerKey("silverbell");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CEDAR_KEY = registerKey("cedar");

    public static final ResourceKey<ConfiguredFeature<?, ?>> CRABAPPLE_VINES_KEY = registerKey("crabapple_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POINCIANA_VINES_KEY = registerKey("poinciana_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LABURNUM_VINES_KEY = registerKey("laburnum_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JADE_VINES_KEY = registerKey("jade_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PAULOWNIA_VINES_KEY = registerKey("paulownia_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WISTERIA_VINES_KEY = registerKey("wisteria_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JACARANDA_VINES_KEY = registerKey("jacaranda_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOGWOOD_VINES_KEY = registerKey("dogwood_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVERBELL_VINES_KEY = registerKey("silverbell_vines");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CEDAR_VINES_KEY = registerKey("cedar_vines");
//FLOWERS//
public static final ResourceKey<ConfiguredFeature<?, ?>> ORNAMENTAL_FLOWERS_KEY = registerKey("ornamental_flowers");
//ORES//
public static final ResourceKey<ConfiguredFeature<?, ?>> JASPER_ORE_KEY = registerKey("jasper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CARNELIAN_ORE_KEY = registerKey("carnelian_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> CITRINE_ORE_KEY = registerKey("citrine_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> AVENTURINE_ORE_KEY = registerKey("aventurine_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> JADE_ORE_KEY = registerKey("jade_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> CHALCOPYRITE_ORE_KEY = registerKey("chalcopyrite_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> LABRADORITE_ORE_KEY = registerKey("labradorite_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> MOONSTONE_ORE_KEY = registerKey("moonstone_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> SODALITE_ORE_KEY = registerKey("sodalite_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> AMETHYST_ORE_KEY = registerKey("amethyst_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> ROSE_QUARTZ_ORE_KEY = registerKey("rose_quartz_ore");
    public static final ResourceKey<ConfiguredFeature <?,?>> MICA_ORE_KEY = registerKey("mica_ore");


    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

//TREES//

//CRABAPPLE//
        register(context, CRABAPPLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, CRABAPPLE_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new CrabappleLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new CrabappleTrunkVineDecorator(0.5f))).build());
//POINCIANA//
        register(context, POINCIANA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.POINCIANA_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, POINCIANA_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.POINCIANA_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new PoincianaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new PoincianaTrunkVineDecorator(0.5f))).build());
//LABURNUM//
        register(context, LABURNUM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.LABURNUM_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, LABURNUM_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.LABURNUM_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new LaburnumLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new LaburnumTrunkVineDecorator(0.5f))).build());
//JADE//
        register(context, JADE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.JADE_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.JADE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, JADE_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.JADE_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.JADE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new JadeLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new JadeTrunkVineDecorator(0.5f))).build());
//PAULOWNIA//
        register(context, PAULOWNIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.PAULOWNIA_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, PAULOWNIA_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.PAULOWNIA_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new PaulowniaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new PaulowniaTrunkVineDecorator(0.5f))).build());
//WISTERIA//
        register(context, WISTERIA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.WISTERIA_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, WISTERIA_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.WISTERIA_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new WisteriaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new WisteriaTrunkVineDecorator(0.5f))).build());
//JACARANDA//
        register(context, JACARANDA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.JACARANDA_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, JACARANDA_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.JACARANDA_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new JacarandaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new JacarandaTrunkVineDecorator(0.5f))).build());
        //DOGWOOD//
        register(context, DOGWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.DOGWOOD_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, DOGWOOD_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.DOGWOOD_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new DogwoodLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new DogwoodTrunkVineDecorator(0.5f))).build());
//SILVERBELL/
        register(context, SILVERBELL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.SILVERBELL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, SILVERBELL_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.SILVERBELL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new SilverbellLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new SilverbellTrunkVineDecorator(0.5f))).build());
//CEDAR//
        register(context, CEDAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.CEDAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.1F))).build());

        register(context, CEDAR_VINES_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()),
                new ForkingTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.CEDAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                (ImmutableList.of( new CedarLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), new CedarTrunkVineDecorator(0.5f))).build());
//FLOWERS//
        FeatureUtils.register(context, ORNAMENTAL_FLOWERS_KEY, Feature.FLOWER, new RandomPatchConfiguration(
                96, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(new NoiseProvider(2345L,
                        new NormalNoise.NoiseParameters(0, 1.0D), 0.020833334F,

                List.of(Blocks.TALL_GRASS.defaultBlockState(), Blocks.RED_TULIP.defaultBlockState(),
                                Blocks.ORANGE_TULIP.defaultBlockState(),Blocks.PINK_TULIP.defaultBlockState(),
                                Blocks.WHITE_TULIP.defaultBlockState(),Blocks.LILY_OF_THE_VALLEY.defaultBlockState(),
                                Blocks.BLUE_ORCHID.defaultBlockState(),Blocks.ALLIUM.defaultBlockState(),
                                Blocks.POPPY.defaultBlockState(), Blocks.AZURE_BLUET.defaultBlockState(),
                                Blocks.DANDELION.defaultBlockState(), Blocks.CORNFLOWER.defaultBlockState(),
                                Blocks.OXEYE_DAISY.defaultBlockState(), Blocks.ROSE_BUSH.defaultBlockState(),
                                Blocks.PEONY.defaultBlockState(),ModBlocks.ORNAMENTAL_MUSHROOM.get().defaultBlockState(),
                                Blocks.GRASS.defaultBlockState()))))));











//ORES//

//COMMON ORES//
        List<OreConfiguration.TargetBlockState> OVERWORLD_CHALCOPYRITE_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.CHALCOPYRITE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CHALCOPYRITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_JASPER_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.JASPER_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_JASPER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_JADE_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.JADE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_JADE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_MOONSTONE_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.MOONSTONE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_MOONSTONE_ORE.get().defaultBlockState()));
//UNCOMMON ORES//
        List<OreConfiguration.TargetBlockState> OVERWORLD_AVENTURINE_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.AVENTURINE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_AVENTURINE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_LABRADORITE_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.LABRADORITE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_LABRADORITE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_MICA_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.MICA_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_MICA_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_ROSE_QUARTZ_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.ROSE_QUARTZ_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.get().defaultBlockState()));
//RARE ORES//
        List<OreConfiguration.TargetBlockState> OVERWORLD_AMETHYST_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.AMETHYST_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_CARNELIAN_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.CARNELIAN_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CARNELIAN_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_CITRINE_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.CITRINE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> OVERWORLD_SODALITE_ORES =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.SODALITE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SODALITE_ORE.get().defaultBlockState()));
//COMMON//
        register(context, JASPER_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_JASPER_ORES, 9));
        register(context, CHALCOPYRITE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_CHALCOPYRITE_ORES, 9));
        register(context, JADE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_JADE_ORES, 9));
        register(context, MOONSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_MOONSTONE_ORES, 9));
//UNCOMMON//
        register(context, AVENTURINE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_AVENTURINE_ORES, 9));
        register(context, LABRADORITE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_LABRADORITE_ORES, 9));
        register(context, MICA_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_MICA_ORES, 9));
        register(context, ROSE_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_ROSE_QUARTZ_ORES, 9));
//RARE//
        register(context, AMETHYST_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_AMETHYST_ORES, 9));
        register(context, CARNELIAN_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_CARNELIAN_ORES, 9));
        register(context, CITRINE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_CITRINE_ORES, 9));
        register(context, SODALITE_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_SODALITE_ORES, 9));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MarvelousMaterials.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
