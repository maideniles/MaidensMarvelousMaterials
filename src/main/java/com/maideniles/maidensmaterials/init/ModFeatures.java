package com.maideniles.maidensmaterials.init;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf.*;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.other.ModMushroomDecorator;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk.*;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;


public class ModFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MarvelousMaterials.MOD_ID);


    public static final RegistryObject<ConfiguredFeature<?, ?>>  CRABAPPLE_CONFIG =  CONFIGURED_FEATURES.register("crabapple_tree", () ->
                    new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
            new ForkingTrunkPlacer(5, 4, 0),
    BlockStateProvider.simple(ModBlocks.CRABAPPLE_LEAVES.get()),
            new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
            new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  CRABAPPLE_VINES_CONFIG =  CONFIGURED_FEATURES.register("crabapple_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.CRABAPPLE_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new CrabappleLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), CrabappleTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  POINCIANA_CONFIG =  CONFIGURED_FEATURES.register("poinciana_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.POINCIANA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  POINCIANA_VINES_CONFIG =  CONFIGURED_FEATURES.register("poinciana_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.POINCIANA_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.POINCIANA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new PoincianaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), PoincianaTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  LABURNUM_CONFIG =  CONFIGURED_FEATURES.register("laburnum_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.LABURNUM_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  LABURNUM_VINES_CONFIG =  CONFIGURED_FEATURES.register("laburnum_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.LABURNUM_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.LABURNUM_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new LaburnumLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), LaburnumTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  JADE_CONFIG =  CONFIGURED_FEATURES.register("jade_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.JADE_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.JADE_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  JADE_VINES_CONFIG =  CONFIGURED_FEATURES.register("jade_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.JADE_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.JADE_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new JadeLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), JadeTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  PAULOWNIA_CONFIG =  CONFIGURED_FEATURES.register("paulownia_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.PAULOWNIA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  PAULOWNIA_VINES_CONFIG =  CONFIGURED_FEATURES.register("paulownia_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.PAULOWNIA_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.PAULOWNIA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new PaulowniaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), PaulowniaTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  WISTERIA_CONFIG =  CONFIGURED_FEATURES.register("wisteria_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.WISTERIA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  WISTERIA_VINES_CONFIG =  CONFIGURED_FEATURES.register("wisteria_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.WISTERIA_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.WISTERIA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new WisteriaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), WisteriaTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  JACARANDA_CONFIG =  CONFIGURED_FEATURES.register("jacaranda_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.JACARANDA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  JACARANDA_VINES_CONFIG =  CONFIGURED_FEATURES.register("jacaranda_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.JACARANDA_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.JACARANDA_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new JacarandaLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), JacarandaTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  DOGWOOD_CONFIG =  CONFIGURED_FEATURES.register("dogwood_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.DOGWOOD_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  DOGWOOD_VINES_CONFIG =  CONFIGURED_FEATURES.register("dogwood_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.DOGWOOD_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.DOGWOOD_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new DogwoodLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), DogwoodTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  SILVERBELL_CONFIG =  CONFIGURED_FEATURES.register("silverbell_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.SILVERBELL_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  SILVERBELL_VINES_CONFIG =  CONFIGURED_FEATURES.register("silverbell_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.SILVERBELL_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.SILVERBELL_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new SilverbellLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), SilverbellTrunkVineDecorator.INSTANCE)).build()));


    public static final RegistryObject<ConfiguredFeature<?, ?>>  CEDAR_CONFIG =  CONFIGURED_FEATURES.register("cedar_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.CEDAR_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators(ImmutableList.of(new BeehiveDecorator(0.25F))).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>>  CEDAR_VINES_CONFIG =  CONFIGURED_FEATURES.register("cedar_vines_tree", () ->
            new ConfiguredFeature<>(Feature.TREE,new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.CEDAR_LOG.get()),
                    new ForkingTrunkPlacer(5, 4, 0),
                    BlockStateProvider.simple(ModBlocks.CEDAR_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 2),
                    new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().decorators
                    (ImmutableList.of(new CedarLeafVineDecorator(0.25F),new ModMushroomDecorator(0.35F), CedarTrunkVineDecorator.INSTANCE)).build()));

    //ORNAMENTAL MUSHROOM//
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORNAMENTAL_MUSHROOM = CONFIGURED_FEATURES.register("ornamental_mushroom", () ->
            new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ORNAMENTAL_MUSHROOM.get()))))));


    public static final RegistryObject<ConfiguredFeature<?, ?>> ORNAMENTAL_MUSHROOM_CAVE = CONFIGURED_FEATURES.register("ornamental_mushroom_cave", () ->
                    new ConfiguredFeature<>(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                            .add(ModBlocks.ORNAMENTAL_MUSHROOM.get().defaultBlockState(), 40)
                            .add(Blocks.GRASS.defaultBlockState(), 50)
                            .add(Blocks.TALL_GRASS.defaultBlockState(), 20)))));


    public static final RegistryObject<ConfiguredFeature<?, ?>> ORNAMENTAL_FOREST_FLOWERS = CONFIGURED_FEATURES.register("ornamental_forest_flowers", ()->
            new ConfiguredFeature<>(Feature.SIMPLE_RANDOM_SELECTOR,
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
            new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY))))))));



//ORES//


//COMMON ORES//
public static final RegistryObject<ConfiguredFeature<?, ?>> CITRINE_ORE = CONFIGURED_FEATURES.register("citrine_ore", () ->
        new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CITRINE_ORE.get().defaultBlockState(), 20)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_CITRINE_ORE = CONFIGURED_FEATURES.register("deepslate_citrine_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CITRINE_ORE.get().defaultBlockState(), 16)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> JADE_ORE = CONFIGURED_FEATURES.register("jade_ore", () -> new ConfiguredFeature<>(Feature.ORE,
            new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JADE_ORE.get().defaultBlockState(), 19)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_JADE_ORE = CONFIGURED_FEATURES.register("deepslate_jade_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_JADE_ORE.get().defaultBlockState(), 15)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> JASPER_ORE = CONFIGURED_FEATURES.register("jasper_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JASPER_ORE.get().defaultBlockState(), 18)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_JASPER_ORE = CONFIGURED_FEATURES.register("deepslate_jasper_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_JASPER_ORE.get().defaultBlockState(), 14)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MOONSTONE_ORE = CONFIGURED_FEATURES.register("moonstone_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MOONSTONE_ORE.get().defaultBlockState(), 17)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_MOONSTONE_ORE = CONFIGURED_FEATURES.register("deepslate_moonstone_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MOONSTONE_ORE.get().defaultBlockState(), 13)));

    //UNOMMON//
    public static final RegistryObject<ConfiguredFeature<?, ?>> AVENTURINE_ORE = CONFIGURED_FEATURES.register("aventurine_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AVENTURINE_ORE.get().defaultBlockState(), 16)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_AVENTURINE_ORE = CONFIGURED_FEATURES.register("deepslate_aventurine_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AVENTURINE_ORE.get().defaultBlockState(), 12)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> LABRADORITE_ORE = CONFIGURED_FEATURES.register("labradorite_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.LABRADORITE_ORE.get().defaultBlockState(), 15)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_LABRADORITE_ORE = CONFIGURED_FEATURES.register("deepslate_labradorite_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_LABRADORITE_ORE.get().defaultBlockState(), 11)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MICA_ORE = CONFIGURED_FEATURES.register("mica_ore", () -> new ConfiguredFeature<>(Feature.ORE,
            new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MICA_ORE.get().defaultBlockState(), 14)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_MICA_ORE = CONFIGURED_FEATURES.register("deepslate_mica_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MICA_ORE.get().defaultBlockState(), 10)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ROSE_QUARTZ_ORE = CONFIGURED_FEATURES.register("rose_quartz_ore", () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ROSE_QUARTZ_ORE.get().defaultBlockState(), 13)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_ROSE_QUARTZ_ORE = CONFIGURED_FEATURES.register("deepslate_rose_quartz_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.get().defaultBlockState(), 9)));

    //RARE//
    public static final RegistryObject<ConfiguredFeature<?, ?>> AMETHYST_ORE = CONFIGURED_FEATURES.register("amethyst_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.AMETHYST_ORE.get().defaultBlockState(), 12)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_AMETHYST_ORE = CONFIGURED_FEATURES.register("deepslate_amethyst_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_AMETHYST_ORE.get().defaultBlockState(), 9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CARNELIAN_ORE = CONFIGURED_FEATURES.register("carnelian_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CARNELIAN_ORE.get().defaultBlockState(), 11)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_CARNELIAN_ORE = CONFIGURED_FEATURES.register("deepslate_carnelian_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CARNELIAN_ORE.get().defaultBlockState(), 8)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> CHALCOPYRITE_ORE = CONFIGURED_FEATURES.register("chalcopyrite_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.CHALCOPYRITE_ORE.get().defaultBlockState(), 10)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_CHALCOPYRITE_ORE = CONFIGURED_FEATURES.register("deepslate_chalcopyrite_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_CHALCOPYRITE_ORE.get().defaultBlockState(), 7)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SODALITE_ORE = CONFIGURED_FEATURES.register("sodalite_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SODALITE_ORE.get().defaultBlockState(), 9)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_SODALITE_ORE = CONFIGURED_FEATURES.register("deepslate_sodalite_ore", () ->
            new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SODALITE_ORE.get().defaultBlockState(), 6)));
    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}

