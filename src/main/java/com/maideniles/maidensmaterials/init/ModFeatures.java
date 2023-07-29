package com.maideniles.maidensmaterials.init;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf.*;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.other.ModMushroomDecorator;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk.*;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.BeehiveDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;


public class ModFeatures {


    //  public static final DeferredRegister<Feature<?>> FEATURES =
  //          DeferredRegister.create(ForgeRegistries.FEATURES, MarvelousMaterials.MOD_ID);

      public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> CRABAPPLE_CONFIG = FeatureUtils.register("crabapple_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CRABAPPLE_VINES_CONFIG = FeatureUtils.register("crabapple_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CRABAPPLE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new CrabappleLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), CrabappleTrunkVineDecorator.INSTANCE)).build())));


    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> POINCIANA_CONFIG = FeatureUtils.register("poinciana_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()), new
                    FancyTrunkPlacer(3, 10, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> POINCIANA_VINES_CONFIG = FeatureUtils.register("poinciana_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.POINCIANA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new PoincianaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), PoincianaTrunkVineDecorator.INSTANCE)).build())));


    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> LABURNUM_CONFIG = FeatureUtils.register("laburnum_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> LABURNUM_VINES_CONFIG = FeatureUtils.register("laburnum_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.LABURNUM_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new LaburnumLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), LaburnumTrunkVineDecorator.INSTANCE)).build())));


    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> JADE_CONFIG = FeatureUtils.register("jade_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JADE_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> JADE_VINES_CONFIG = FeatureUtils.register("jade_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JADE_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JADE_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new JadeLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), JadeTrunkVineDecorator.INSTANCE)).build())));


    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> PAULOWNIA_CONFIG = FeatureUtils.register("paulownia_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()), new
                    FancyTrunkPlacer(3, 10, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> PAULOWNIA_VINES_CONFIG = FeatureUtils.register("paulownia_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.PAULOWNIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new PaulowniaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), PaulowniaTrunkVineDecorator.INSTANCE)).build())));



    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> WISTERIA_CONFIG = FeatureUtils.register("wisteria_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> WISTERIA_VINES_CONFIG = FeatureUtils.register("wisteria_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.WISTERIA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new WisteriaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), WisteriaTrunkVineDecorator.INSTANCE)).build())));


    public static final   Holder<ConfiguredFeature<TreeConfiguration, ?>> JACARANDA_CONFIG = FeatureUtils.register("jacaranda_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> JACARANDA_VINES_CONFIG = FeatureUtils.register("jacaranda_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.JACARANDA_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new JacarandaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), JacarandaTrunkVineDecorator.INSTANCE)).build())));


    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> DOGWOOD_CONFIG = FeatureUtils.register("dogwood_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()), new
                    StraightTrunkPlacer(3, 4, 2),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DOGWOOD_VINES_CONFIG = FeatureUtils.register("dogwood_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.DOGWOOD_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new DogwoodLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), DogwoodTrunkVineDecorator.INSTANCE)).build())));


    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> SILVERBELL_CONFIG = FeatureUtils.register("silverbell_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()), new
                    StraightTrunkPlacer(4, 4, 3),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SILVERBELL_VINES_CONFIG = FeatureUtils.register("silverbell_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.SILVERBELL_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new SilverbellLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), SilverbellTrunkVineDecorator.INSTANCE)).build())));


    public static final  Holder<ConfiguredFeature<TreeConfiguration, ?>> CEDAR_CONFIG = FeatureUtils.register("cedar_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    FancyTrunkPlacer(3, 10, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new ModMushroomDecorator(0.25F))).build())));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CEDAR_VINES_CONFIG = FeatureUtils.register("cedar_vines_tree",
            Feature.TREE,((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()), new
                    ForkingTrunkPlacer(5, 4, 0),
                    new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 1)
                            .add(ModBlocks.CEDAR_LEAVES.get().defaultBlockState(), 2)),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).decorators
                    (ImmutableList.of(new CedarLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), CedarTrunkVineDecorator.INSTANCE)).build())));

    //ORNAMENTAL MUSHROOM//
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> ORNAMENTAL_MUSHROOM =
            FeatureUtils.register("ornamental_mushroom", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ORNAMENTAL_MUSHROOM.get())))));


    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> ORNAMENTAL_MUSHROOM_CAVE =
            FeatureUtils.register("ornamental_mushroom_cave", Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(ModBlocks.ORNAMENTAL_MUSHROOM.get().defaultBlockState(), 40)
                            .add(Blocks.GRASS.defaultBlockState(), 50)
                            .add(Blocks.TALL_GRASS.defaultBlockState(), 20))));


    public static final Holder<ConfiguredFeature<SimpleRandomFeatureConfiguration, ?>> ORNAMENTAL_FOREST_FLOWERS =
            FeatureUtils.register("ornamental_forest_flowers", Feature.SIMPLE_RANDOM_SELECTOR,
                    new SimpleRandomFeatureConfiguration(HolderSet.direct(

     PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
             new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILAC)))),

     PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.POPPY)))),

     PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.DANDELION)))),

     PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.ALLIUM)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.RED_TULIP)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.ORANGE_TULIP)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.PINK_TULIP)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.WHITE_TULIP)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.AZURE_BLUET)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.BLUE_ORCHID)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.OXEYE_DAISY)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.CORNFLOWER)))),

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
           new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.ROSE_BUSH)))),

     PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
           new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.PEONY)))),

    PlacementUtils.inlinePlaced(Feature.NO_BONEMEAL_FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY)))))));



//ORES//


//COMMON ORES//
public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CITRINE_ORE = FeatureUtils.register("citrine_ore",
        Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CITRINE_ORE.get().defaultBlockState(), 20));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_CITRINE_ORE = FeatureUtils.register("deepslate_citrine_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState(), 16));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> JADE_ORE = FeatureUtils.register("jade_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JADE_ORE.get().defaultBlockState(), 19));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_JADE_ORE = FeatureUtils.register("deepslate_jade_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_JADE_ORE.get().defaultBlockState(), 15));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> JASPER_ORE = FeatureUtils.register("jasper_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JASPER_ORE.get().defaultBlockState(), 18));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_JASPER_ORE = FeatureUtils.register("deepslate_jasper_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_JASPER_ORE.get().defaultBlockState(), 14));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MOONSTONE_ORE = FeatureUtils.register("moonstone_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MOONSTONE_ORE.get().defaultBlockState(), 17));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_MOONSTONE_ORE = FeatureUtils.register("deepslate_moonstone_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MOONSTONE_ORE.get().defaultBlockState(), 13));

    //UNOMMON//
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AVENTURINE_ORE = FeatureUtils.register("aventurine_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AVENTURINE_ORE.get().defaultBlockState(), 16));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_AVENTURINE_ORE = FeatureUtils.register("deepslate_aventurine_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AVENTURINE_ORE.get().defaultBlockState(), 12));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LABRADORITE_ORE = FeatureUtils.register("labradorite_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LABRADORITE_ORE.get().defaultBlockState(), 15));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_LABRADORITE_ORE = FeatureUtils.register("deepslate_labradorite_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LABRADORITE_ORE.get().defaultBlockState(), 11));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MICA_ORE = FeatureUtils.register("mica_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MICA_ORE.get().defaultBlockState(), 14));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_MICA_ORE = FeatureUtils.register("deepslate_mica_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MICA_ORE.get().defaultBlockState(), 10));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ROSE_QUARTZ_ORE = FeatureUtils.register("rose_quartz_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ROSE_QUARTZ_ORE.get().defaultBlockState(), 13));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_ROSE_QUARTZ_ORE = FeatureUtils.register("deepslate_rose_quartz_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.get().defaultBlockState(), 9));

//RARE//
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AMETHYST_ORE = FeatureUtils.register("amethyst_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AMETHYST_ORE.get().defaultBlockState(), 12));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_AMETHYST_ORE = FeatureUtils.register("deepslate_amethyst_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState(), 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CARNELIAN_ORE = FeatureUtils.register("carnelian_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CARNELIAN_ORE.get().defaultBlockState(), 11));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_CARNELIAN_ORE = FeatureUtils.register("deepslate_carnelian_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CARNELIAN_ORE.get().defaultBlockState(), 8));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CHALCOPYRITE_ORE = FeatureUtils.register("chalcopyrite_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CHALCOPYRITE_ORE.get().defaultBlockState(), 10));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_CHALCOPYRITE_ORE = FeatureUtils.register("deepslate_chalcopyrite_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CHALCOPYRITE_ORE.get().defaultBlockState(), 7));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SODALITE_ORE = FeatureUtils.register("sodalite_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SODALITE_ORE.get().defaultBlockState(), 9));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_SODALITE_ORE = FeatureUtils.register("deepslate_sodalite_ore",
            Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SODALITE_ORE.get().defaultBlockState(), 6));

}

