package com.maideniles.maidensmaterials.init;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.gen.feature.tree.PalmTreeFeature;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf.*;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk.*;
import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModFeatures {


    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(ForgeRegistries.FEATURES, MarvelousMaterials.MOD_ID);

      public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> CRABAPPLE_CONFIG = FeatureUtils.register("crabapple_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));





    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> CRABAPPLE_VINES_CONFIG = FeatureUtils.register("crabapple_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(CrabappleTrunkVineDecorator.INSTANCE,
                    CrabappleLeafVineDecorator.INSTANCE)).build())));

    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> POINCIANA_CONFIG = FeatureUtils.register("poinciana_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> POINCIANA_VINES_CONFIG = FeatureUtils.register("poinciana_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(PoincianaTrunkVineDecorator.INSTANCE,
                    PoincianaLeafVineDecorator.INSTANCE)).build())));

    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> LABURNUM_CONFIG = FeatureUtils.register("laburnum_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> LABURNUM_VINES_CONFIG = FeatureUtils.register("laburnum_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(LaburnumTrunkVineDecorator.INSTANCE,
                    LaburnumLeafVineDecorator.INSTANCE)).build())));

    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> JADE_CONFIG = FeatureUtils.register("jade_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JADE_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> JADE_VINES_CONFIG = FeatureUtils.register("jade_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JADE_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(JadeTrunkVineDecorator.INSTANCE,
                    JadeLeafVineDecorator.INSTANCE)).build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> PAULOWNIA_CONFIG = FeatureUtils.register("paulownia_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> PAULOWNIA_VINES_CONFIG = FeatureUtils.register("paulownia_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(PaulowniaTrunkVineDecorator.INSTANCE,
                    PaulowniaLeafVineDecorator.INSTANCE)).build())));

    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> WISTERIA_CONFIG = FeatureUtils.register("wisteria_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()), new
                    ForkingTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> WISTERIA_VINES_CONFIG = FeatureUtils.register("wisteria_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()), new
                    ForkingTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(WisteriaTrunkVineDecorator.INSTANCE,
                    WisteriaLeafVineDecorator.INSTANCE)).build())));

    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> JACARANDA_CONFIG = FeatureUtils.register("jacaranda_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> JACARANDA_VINES_CONFIG = FeatureUtils.register("jacaranda_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()), new
                    ForkingTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(JacarandaTrunkVineDecorator.INSTANCE,
                    JacarandaLeafVineDecorator.INSTANCE)).build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> DOGWOOD_CONFIG = FeatureUtils.register("dogwood_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()), new
                    StraightTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> DOGWOOD_VINES_CONFIG = FeatureUtils.register("dogwood_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()), new
                    StraightTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(DogwoodTrunkVineDecorator.INSTANCE,
                    DogwoodLeafVineDecorator.INSTANCE)).build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> SILVERBELL_CONFIG = FeatureUtils.register("silverbell_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> SILVERBELL_VINES_CONFIG = FeatureUtils.register("silverbell_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(SilverbellTrunkVineDecorator.INSTANCE,
                    SilverbellLeafVineDecorator.INSTANCE)).build())));


    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>APPLE_CONFIG = FeatureUtils.register("apple_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.APPLE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_APPLE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>CHERRY_CONFIG = FeatureUtils.register("cherry_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CHERRY_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_CHERRY_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>GRAPEFRUIT_CONFIG = FeatureUtils.register("grapefruit_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.GRAPEFRUIT_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_GRAPEFRUIT_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>LEMON_CONFIG = FeatureUtils.register("lemon_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LEMON_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_LEMON_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>LIME_CONFIG = FeatureUtils.register("lime_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LIME_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_LIME_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>ORANGE_CONFIG = FeatureUtils.register("orange_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.ORANGE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_ORANGE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>PEACH_CONFIG = FeatureUtils.register("peach_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PEACH_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_PEACH_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>PEAR_CONFIG = FeatureUtils.register("pear_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PEAR_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_PEAR_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>>PLUM_CONFIG = FeatureUtils.register("plum_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(4, 2, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PLUM_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.GROWING_PLUM_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));

    public static final RegistryObject<PalmTreeFeature> PALM_TREE = FEATURES.register("palm_tree",
            () -> new PalmTreeFeature(NoneFeatureConfiguration.CODEC));

    public static final Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> PALM_TREE_CONFIG = FeatureUtils.register("palm_tree", ModFeatures.PALM_TREE.get());




    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> CEDAR_VINES_CONFIG = FeatureUtils.register("paulownia_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators(ImmutableList.of(CedarTrunkVineDecorator.INSTANCE,
                    CedarLeafVineDecorator.INSTANCE)).build())));

    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> CEDAR_CONFIG = FeatureUtils.register("cedar_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(3, 4, 1),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build())));






}

