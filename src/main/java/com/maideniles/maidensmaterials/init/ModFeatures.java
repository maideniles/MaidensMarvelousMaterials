package com.maideniles.maidensmaterials.init;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.leaf.*;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.other.ModMushroomDecorator;
import com.maideniles.maidensmaterials.world.gen.feature.tree.decorator.trunk.*;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
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
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;


public class ModFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registries.CONFIGURED_FEATURE, MarvelousMaterials.MOD_ID);

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

    PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ORNAMENTAL_MUSHROOM.get())))),

    PlacementUtils.inlinePlaced(Feature.NO_BONEMEAL_FLOWER, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY))))))));




     public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}

