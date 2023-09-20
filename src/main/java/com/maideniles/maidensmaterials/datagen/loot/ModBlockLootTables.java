package com.maideniles.maidensmaterials.datagen.loot;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {

        //MORTAR & PESTLE//
        this.dropSelf(ModBlocks.MORTAR_PESTLE.get());
        this.dropSelf(ModBlocks.MORTAR_PESTLE_PIGMENTS.get());
        this.dropSelf(ModBlocks.MORTAR_PESTLE_BLOSSOMS.get());
        this.dropSelf(ModBlocks.MORTAR_PESTLE_CHUNKS.get());
        this.dropSelf(ModBlocks.MORTAR_PESTLE_OTHER.get());


    //LOGS//
        this.dropSelf(ModBlocks.CRABAPPLE_LOG.get());
        this.dropSelf(ModBlocks.POINCIANA_LOG.get());
        this.dropSelf(ModBlocks.LABURNUM_LOG.get());
        this.dropSelf(ModBlocks.JADE_LOG.get());
        this.dropSelf(ModBlocks.PAULOWNIA_LOG.get());
        this.dropSelf(ModBlocks.WISTERIA_LOG.get());
        this.dropSelf(ModBlocks.JACARANDA_LOG.get());
        this.dropSelf(ModBlocks.DOGWOOD_LOG.get());
        this.dropSelf(ModBlocks.SILVERBELL_LOG.get());
        this.dropSelf(ModBlocks.CEDAR_LOG.get());

        this.dropSelf(ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_POINCIANA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_LABURNUM_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_JADE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PAULOWNIA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WISTERIA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_JACARANDA_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_DOGWOOD_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SILVERBELL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CEDAR_LOG.get());

    //WOODS//
        this.dropSelf(ModBlocks.CRABAPPLE_WOOD.get());
        this.dropSelf(ModBlocks.POINCIANA_WOOD.get());
        this.dropSelf(ModBlocks.LABURNUM_WOOD.get());
        this.dropSelf(ModBlocks.JADE_WOOD.get());
        this.dropSelf(ModBlocks.PAULOWNIA_WOOD.get());
        this.dropSelf(ModBlocks.WISTERIA_WOOD.get());
        this.dropSelf(ModBlocks.JACARANDA_WOOD.get());
        this.dropSelf(ModBlocks.DOGWOOD_WOOD.get());
        this.dropSelf(ModBlocks.SILVERBELL_WOOD.get());
        this.dropSelf(ModBlocks.CEDAR_WOOD.get());

        this.dropSelf(ModBlocks.STRIPPED_CRABAPPLE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_POINCIANA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_LABURNUM_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_JADE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PAULOWNIA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WISTERIA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_JACARANDA_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_DOGWOOD_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SILVERBELL_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CEDAR_WOOD.get());

    //LEAVES//
        this.dropSelf(ModBlocks.CRABAPPLE_LEAVES.get());
        this.dropSelf(ModBlocks.POINCIANA_LEAVES.get());
        this.dropSelf(ModBlocks.LABURNUM_LEAVES.get());
        this.dropSelf(ModBlocks.JADE_LEAVES.get());
        this.dropSelf(ModBlocks.PAULOWNIA_LEAVES.get());
        this.dropSelf(ModBlocks.WISTERIA_LEAVES.get());
        this.dropSelf(ModBlocks.JACARANDA_LEAVES.get());
        this.dropSelf(ModBlocks.DOGWOOD_LEAVES.get());
        this.dropSelf(ModBlocks.SILVERBELL_LEAVES.get());
        this.dropSelf(ModBlocks.CEDAR_LEAVES.get());

    //SAPLINGS//
        this.dropSelf(ModBlocks.CRABAPPLE_SAPLING.get());
        this.dropSelf(ModBlocks.POINCIANA_SAPLING.get());
        this.dropSelf(ModBlocks.LABURNUM_SAPLING.get());
        this.dropSelf(ModBlocks.JADE_SAPLING.get());
        this.dropSelf(ModBlocks.PAULOWNIA_SAPLING.get());
        this.dropSelf(ModBlocks.WISTERIA_SAPLING.get());
        this.dropSelf(ModBlocks.JACARANDA_SAPLING.get());
        this.dropSelf(ModBlocks.DOGWOOD_SAPLING.get());
        this.dropSelf(ModBlocks.SILVERBELL_SAPLING.get());
        this.dropSelf(ModBlocks.CEDAR_SAPLING.get());

    //VINES//
        this.dropSelf(ModBlocks.CRABAPPLE_VINE.get());
        this.dropSelf(ModBlocks.POINCIANA_VINE.get());
        this.dropSelf(ModBlocks.LABURNUM_VINE.get());
        this.dropSelf(ModBlocks.JADE_VINE.get());
        this.dropSelf(ModBlocks.PAULOWNIA_VINE.get());
        this.dropSelf(ModBlocks.WISTERIA_VINE.get());
        this.dropSelf(ModBlocks.JACARANDA_VINE.get());
        this.dropSelf(ModBlocks.DOGWOOD_VINE.get());
        this.dropSelf(ModBlocks.SILVERBELL_VINE.get());
        this.dropSelf(ModBlocks.CEDAR_VINE.get());

    //ESSENCES,OTHER//
        this.dropSelf(ModBlocks.EARTHEN_ESSENCE_BLOCK.get());
        this.dropSelf(ModBlocks.FLORAL_ESSENCE_BLOCK.get());
        this.dropOther(ModBlocks.WALK_FLOWERS.get(), Blocks.AIR);
        this.dropSelf(ModBlocks.VINE_TIE.get());
        this.dropOther(ModBlocks.ORNAMENTAL_PATH.get(),Blocks.DIRT);
        this.dropOther(ModBlocks.ORNAMENTAL_GRASS.get(), Blocks.AIR);
        this.dropSelf(ModBlocks.ORNAMENTAL_MUSHROOM.get());
        this.dropOther(ModBlocks.POTTED_ORNAMENTAL_MUSHROOM.get(),Blocks.FLOWER_POT);
        this.dropOther(ModBlocks.FAIRY_GLOW_CUP.get(), Items.GLOWSTONE_DUST);

    //WOOD CRAFTABLES//

        //BOOKSHELVES//
        this.dropOther(ModBlocks.CRABAPPLE_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.POINCIANA_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.LABURNUM_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.JADE_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.PAULOWNIA_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.WISTERIA_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.JACARANDA_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.DOGWOOD_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.SILVERBELL_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.CEDAR_BOOKSHELF.get(), Items.BOOK);


        this.dropOther(ModBlocks.ACACIA_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.BIRCH_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.OAK_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.SPRUCE_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.DARK_OAK_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.JUNGLE_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.CRIMSON_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.WARPED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.MANGROVE_BOOKSHELF.get(),Items.BOOK);
        //TREE WOODS//

        this.dropSelf(ModBlocks.CRABAPPLE_PLANKS.get());
        this.dropSelf(ModBlocks.POINCIANA_PLANKS.get());
        this.dropSelf(ModBlocks.LABURNUM_PLANKS.get());
        this.dropSelf(ModBlocks.JADE_PLANKS.get());
        this.dropSelf(ModBlocks.PAULOWNIA_PLANKS.get());
        this.dropSelf(ModBlocks.WISTERIA_PLANKS.get());
        this.dropSelf(ModBlocks.JACARANDA_PLANKS.get());
        this.dropSelf(ModBlocks.DOGWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.SILVERBELL_PLANKS.get());
        this.dropSelf(ModBlocks.CEDAR_PLANKS.get());

        this.dropSelf(ModBlocks.CRABAPPLE_STAIRS.get());
        this.dropSelf(ModBlocks.POINCIANA_STAIRS.get());
        this.dropSelf(ModBlocks.LABURNUM_STAIRS.get());
        this.dropSelf(ModBlocks.JADE_STAIRS.get());
        this.dropSelf(ModBlocks.PAULOWNIA_STAIRS.get());
        this.dropSelf(ModBlocks.WISTERIA_STAIRS.get());
        this.dropSelf(ModBlocks.JACARANDA_STAIRS.get());
        this.dropSelf(ModBlocks.DOGWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.SILVERBELL_STAIRS.get());
        this.dropSelf(ModBlocks.CEDAR_STAIRS.get());
/*
        this.add(ModBlocks.CRABAPPLE_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.POINCIANA_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.LABURNUM_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.JADE_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.PAULOWNIA_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.WISTERIA_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.JACARANDA_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.DOGWOOD_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.SILVERBELL_SLAB.get(),BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.CEDAR_SLAB.get(),BlockLootSubProvider:createSlabItemTable);

        this.dropSelf(ModBlocks.CRABAPPLE_FENCE.get());
        this.dropSelf(ModBlocks.POINCIANA_FENCE.get());
        this.dropSelf(ModBlocks.LABURNUM_FENCE.get());
        this.dropSelf(ModBlocks.JADE_FENCE.get());
        this.dropSelf(ModBlocks.PAULOWNIA_FENCE.get());
        this.dropSelf(ModBlocks.WISTERIA_FENCE.get());
        this.dropSelf(ModBlocks.JACARANDA_FENCE.get());
        this.dropSelf(ModBlocks.DOGWOOD_FENCE.get());
        this.dropSelf(ModBlocks.SILVERBELL_FENCE.get());
        this.dropSelf(ModBlocks.CEDAR_FENCE.get());

        this.dropSelf(ModBlocks.CRABAPPLE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.POINCIANA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LABURNUM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.JADE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PAULOWNIA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WISTERIA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.JACARANDA_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DOGWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SILVERBELL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CEDAR_FENCE_GATE.get());

        this.dropSelf(ModBlocks.CRABAPPLE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.POINCIANA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LABURNUM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.JADE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PAULOWNIA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WISTERIA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.JACARANDA_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.DOGWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SILVERBELL_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CEDAR_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.CRABAPPLE_BUTTON.get());
        this.dropSelf(ModBlocks.POINCIANA_BUTTON.get());
        this.dropSelf(ModBlocks.LABURNUM_BUTTON.get());
        this.dropSelf(ModBlocks.JADE_BUTTON.get());
        this.dropSelf(ModBlocks.PAULOWNIA_BUTTON.get());
        this.dropSelf(ModBlocks.WISTERIA_BUTTON.get());
        this.dropSelf(ModBlocks.JACARANDA_BUTTON.get());
        this.dropSelf(ModBlocks.DOGWOOD_BUTTON.get());
        this.dropSelf(ModBlocks.SILVERBELL_BUTTON.get());
        this.dropSelf(ModBlocks.CEDAR_BUTTON.get());
/*
        this.add(ModBlocks.CRABAPPLE_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.POINCIANA_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LABURNUM_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JADE_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PAULOWNIA_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WISTERIA_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JACARANDA_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DOGWOOD_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SILVERBELL_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CEDAR_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.CRABAPPLE_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.POINCIANA_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LABURNUM_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JADE_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PAULOWNIA_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WISTERIA_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JACARANDA_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DOGWOOD_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SILVERBELL_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CEDAR_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.CRABAPPLE_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.POINCIANA_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LABURNUM_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JADE_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PAULOWNIA_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WISTERIA_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JACARANDA_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DOGWOOD_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SILVERBELL_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CEDAR_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.CRABAPPLE_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.POINCIANA_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LABURNUM_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JADE_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PAULOWNIA_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WISTERIA_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JACARANDA_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DOGWOOD_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SILVERBELL_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CEDAR_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.CRABAPPLE_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.POINCIANA_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LABURNUM_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JADE_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PAULOWNIA_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WISTERIA_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JACARANDA_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DOGWOOD_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SILVERBELL_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CEDAR_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.CRABAPPLE_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.POINCIANA_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LABURNUM_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JADE_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PAULOWNIA_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WISTERIA_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JACARANDA_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DOGWOOD_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SILVERBELL_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CEDAR_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.ACACIA_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BIRCH_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.OAK_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SPRUCE_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DARK_OAK_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JUNGLE_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CRIMSON_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WARPED_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MANGROVE_DOOR_1.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.ACACIA_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BIRCH_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.OAK_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SPRUCE_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DARK_OAK_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JUNGLE_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CRIMSON_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WARPED_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MANGROVE_DOOR_2.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.ACACIA_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BIRCH_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.OAK_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SPRUCE_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DARK_OAK_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JUNGLE_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CRIMSON_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WARPED_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MANGROVE_DOOR_3.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.ACACIA_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BIRCH_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.OAK_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SPRUCE_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DARK_OAK_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JUNGLE_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CRIMSON_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WARPED_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MANGROVE_DOOR_4.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.ACACIA_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BIRCH_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.OAK_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SPRUCE_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DARK_OAK_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JUNGLE_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CRIMSON_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WARPED_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MANGROVE_DOOR_5.get(),BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.ACACIA_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BIRCH_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.OAK_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.SPRUCE_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.DARK_OAK_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.JUNGLE_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CRIMSON_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WARPED_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MANGROVE_DOOR_6.get(),BlockLootSubProvider:createSinglePropConditionTable);
/*
        this.dropSelf(ModBlocks.ACACIA_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.BIRCH_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.OAK_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.SPRUCE_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.DARK_OAK_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.JUNGLE_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.CRIMSON_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.WARPED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.MANGROVE_TRAPDOOR_1.get());

        this.dropSelf(ModBlocks.ACACIA_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.BIRCH_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.OAK_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.SPRUCE_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.DARK_OAK_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.JUNGLE_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.CRIMSON_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.WARPED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.MANGROVE_TRAPDOOR_2.get());

        this.dropSelf(ModBlocks.ACACIA_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.BIRCH_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.OAK_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.SPRUCE_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.DARK_OAK_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.JUNGLE_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.CRIMSON_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.WARPED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.MANGROVE_TRAPDOOR_3.get());

        this.dropSelf(ModBlocks.ACACIA_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.BIRCH_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.OAK_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.SPRUCE_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.DARK_OAK_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.JUNGLE_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.CRIMSON_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.WARPED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.MANGROVE_TRAPDOOR_4.get());



        this.dropSelf(ModBlocks.CRABAPPLE_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.POINCIANA_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.LABURNUM_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.JADE_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.PAULOWNIA_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.WISTERIA_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.JACARANDA_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.DOGWOOD_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.SILVERBELL_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.CEDAR_TRAPDOOR_1.get());

        this.dropSelf(ModBlocks.CRABAPPLE_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.POINCIANA_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.LABURNUM_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.JADE_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.PAULOWNIA_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.WISTERIA_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.JACARANDA_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.DOGWOOD_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.SILVERBELL_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.CEDAR_TRAPDOOR_2.get());

        this.dropSelf(ModBlocks.CRABAPPLE_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.POINCIANA_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.LABURNUM_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.JADE_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.PAULOWNIA_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.WISTERIA_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.JACARANDA_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.DOGWOOD_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.SILVERBELL_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.CEDAR_TRAPDOOR_3.get());

        this.dropSelf(ModBlocks.CRABAPPLE_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.POINCIANA_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.LABURNUM_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.JADE_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.PAULOWNIA_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.WISTERIA_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.JACARANDA_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.DOGWOOD_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.SILVERBELL_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.CEDAR_TRAPDOOR_4.get());

        //STAINED WOODS//
            //PLANKS//
        this.dropSelf(ModBlocks.WHITEWASHED_PLANKS.get());
        this.dropSelf(ModBlocks.RED_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PLANKS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PLANKS.get());

        this.dropOther(ModBlocks.RED_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.ORANGE_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.YELLOW_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.LIME_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.GREEN_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.CYAN_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.LIGHT_BLUE_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.BLUE_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.PURPLE_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.MAGENTA_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.PINK_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.WHITE_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.LIGHT_GRAY_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.GRAY_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.BLACK_STAINED_BOOKSHELF.get(), Items.BOOK);
        this.dropOther(ModBlocks.BROWN_STAINED_BOOKSHELF.get(), Items.BOOK);
            //STAIRS//
        this.dropSelf(ModBlocks.WHITEWASHED_STAIRS.get());
        this.dropSelf(ModBlocks.RED_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_STAIRS.get());
            //SLABS//
   /*     this.add(ModBlocks.WHITEWASHED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.RED_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.ORANGE_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.YELLOW_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.LIME_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.GREEN_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.CYAN_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.LIGHT_BLUE_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.BLUE_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.PURPLE_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.MAGENTA_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.PINK_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.WHITE_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.LIGHT_GRAY_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.GRAY_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.BLACK_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
        this.add(ModBlocks.BROWN_STAINED_SLAB.get(), BlockLootSubProvider:createSlabItemTable);
     */       //FENCES//
        this.dropSelf(ModBlocks.WHITEWASHED_FENCE.get());
        this.dropSelf(ModBlocks.RED_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.LIME_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.PINK_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_FENCE.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_FENCE.get());
            //GATES//
        this.dropSelf(ModBlocks.WHITEWASHED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.RED_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIME_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PINK_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_FENCE_GATE.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_FENCE_GATE.get());
            //PRESSURE PLATES//
        this.dropSelf(ModBlocks.WHITEWASHED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.RED_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIME_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PINK_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_PRESSURE_PLATE.get());
                //BUTTONS//
        this.dropSelf(ModBlocks.WHITEWASHED_BUTTON.get());
        this.dropSelf(ModBlocks.RED_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.LIME_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.PINK_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_BUTTON.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_BUTTON.get());
                //DOORS//
    /*    this.add(ModBlocks.RED_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.ORANGE_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.YELLOW_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIME_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GREEN_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CYAN_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_BLUE_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLUE_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PURPLE_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MAGENTA_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PINK_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WHITE_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_GRAY_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GRAY_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLACK_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BROWN_STAINED_DOOR_1.get(), BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.RED_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.ORANGE_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.YELLOW_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIME_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GREEN_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CYAN_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_BLUE_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLUE_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PURPLE_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MAGENTA_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PINK_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WHITE_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_GRAY_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GRAY_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLACK_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BROWN_STAINED_DOOR_2.get(), BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.RED_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.ORANGE_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.YELLOW_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIME_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GREEN_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CYAN_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_BLUE_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLUE_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PURPLE_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MAGENTA_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PINK_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WHITE_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_GRAY_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GRAY_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLACK_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BROWN_STAINED_DOOR_3.get(), BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.RED_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.ORANGE_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.YELLOW_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIME_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GREEN_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CYAN_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_BLUE_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLUE_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PURPLE_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MAGENTA_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PINK_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WHITE_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_GRAY_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GRAY_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLACK_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BROWN_STAINED_DOOR_4.get(), BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.RED_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.ORANGE_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.YELLOW_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIME_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GREEN_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CYAN_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_BLUE_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLUE_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PURPLE_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MAGENTA_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PINK_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WHITE_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_GRAY_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GRAY_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLACK_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BROWN_STAINED_DOOR_5.get(), BlockLootSubProvider:createSinglePropConditionTable);

        this.add(ModBlocks.RED_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.ORANGE_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.YELLOW_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIME_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GREEN_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.CYAN_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_BLUE_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLUE_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PURPLE_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.MAGENTA_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.PINK_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.WHITE_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.LIGHT_GRAY_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.GRAY_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BLACK_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
        this.add(ModBlocks.BROWN_STAINED_DOOR_6.get(), BlockLootSubProvider:createSinglePropConditionTable);
      */          //TRAPDOORS//
        this.dropSelf(ModBlocks.RED_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.LIME_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.PINK_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_TRAPDOOR_1.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_TRAPDOOR_1.get());

        this.dropSelf(ModBlocks.RED_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.LIME_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.PINK_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_TRAPDOOR_2.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_TRAPDOOR_2.get());

        this.dropSelf(ModBlocks.RED_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.LIME_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.PINK_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_TRAPDOOR_3.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_TRAPDOOR_3.get());

        this.dropSelf(ModBlocks.RED_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.LIME_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.PINK_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_TRAPDOOR_4.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_TRAPDOOR_4.get());

    //COLORED CLAY//
        //BLOCKS//
        this.dropSelf(ModBlocks.RED_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.ORANGE_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.YELLOW_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.LIME_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.GREEN_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.CYAN_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.BLUE_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.PURPLE_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.MAGENTA_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.PINK_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.WHITE_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.GRAY_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.BLACK_CLAY_BLOCK.get());
        this.dropSelf(ModBlocks.BROWN_CLAY_BLOCK.get());
        //BRICKS-SMALL//
        this.dropSelf(ModBlocks.RED_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.ORANGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.YELLOW_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.LIME_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.GREEN_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.CYAN_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.BLUE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.PURPLE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.MAGENTA_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.PINK_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.WHITE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.GRAY_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.BLACK_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.BROWN_BRICK_BLOCK.get());
        //BRICKS-LARGE//
        this.dropSelf(ModBlocks.RED_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.LIME_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.PINK_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get());
        this.dropSelf(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get());
        //BLOCKS-STAIRS//
        this.dropSelf(ModBlocks.RED_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_CLAY_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_CLAY_STAIRS.get());
        //BRICKS-SMALL-STAIRS//
        this.dropSelf(ModBlocks.RED_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_BRICK_STAIRS.get());
        //BRICKS-LARGE-STAIRS//
        this.dropSelf(ModBlocks.RED_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORANGE_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIME_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CYAN_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAGENTA_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PINK_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GRAY_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BLACK_LARGE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.BROWN_LARGE_BRICK_STAIRS.get());
        //BLOCKS-SLABS//
        this.dropSelf(ModBlocks.RED_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.LIME_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.PINK_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_CLAY_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_CLAY_SLAB.get());
        //BRICKS-SMALL-SLABS//
        this.dropSelf(ModBlocks.RED_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIME_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PINK_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_BRICK_SLAB.get());
        //BRICKS-LARGE-SLABS//
        this.dropSelf(ModBlocks.RED_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIME_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PURPLE_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.MAGENTA_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PINK_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.WHITE_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GRAY_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BLACK_LARGE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.BROWN_LARGE_BRICK_SLAB.get());

//ORES//


        add(ModBlocks.JASPER_ORE.get(), createSilkTouchDispatchTable(ModBlocks.JASPER_ORE.get() ,applyExplosionCondition(ModItems.JASPER_CHUNK.get(), LootItem.lootTableItem(ModItems.JASPER_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.CARNELIAN_ORE.get(), createSilkTouchDispatchTable(ModBlocks.CARNELIAN_ORE.get() ,applyExplosionCondition(ModItems.CARNELIAN_CHUNK.get(), LootItem.lootTableItem(ModItems.CARNELIAN_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.CITRINE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.CITRINE_ORE.get() ,applyExplosionCondition(ModItems.CITRINE_CHUNK.get(), LootItem.lootTableItem(ModItems.CITRINE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.AVENTURINE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.AVENTURINE_ORE.get() ,applyExplosionCondition(ModItems.AVENTURINE_CHUNK.get(), LootItem.lootTableItem(ModItems.AVENTURINE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.JADE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.JADE_ORE.get() ,applyExplosionCondition(ModItems.JADE_CHUNK.get(), LootItem.lootTableItem(ModItems.JADE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.CHALCOPYRITE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.CHALCOPYRITE_ORE.get() ,applyExplosionCondition(ModItems.CHALCOPYRITE_CHUNK.get(), LootItem.lootTableItem(ModItems.CHALCOPYRITE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.LABRADORITE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.LABRADORITE_ORE.get() ,applyExplosionCondition(ModItems.LABRADORITE_CHUNK.get(), LootItem.lootTableItem(ModItems.LABRADORITE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.MOONSTONE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.MOONSTONE_ORE.get() ,applyExplosionCondition(ModItems.MOONSTONE_CHUNK.get(), LootItem.lootTableItem(ModItems.MOONSTONE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.SODALITE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.SODALITE_ORE.get() ,applyExplosionCondition(ModItems.SODALITE_CHUNK.get(), LootItem.lootTableItem(ModItems.SODALITE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.AMETHYST_ORE.get(), createSilkTouchDispatchTable(ModBlocks.AMETHYST_ORE.get() ,applyExplosionCondition(ModItems.AMETHYST_CHUNK.get(), LootItem.lootTableItem(ModItems.AMETHYST_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.ROSE_QUARTZ_ORE.get(), createSilkTouchDispatchTable(ModBlocks.ROSE_QUARTZ_ORE.get() ,applyExplosionCondition(ModItems.ROSE_QUARTZ_CHUNK.get(), LootItem.lootTableItem(ModItems.ROSE_QUARTZ_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.MICA_ORE.get(), createSilkTouchDispatchTable(ModBlocks.MICA_ORE.get() ,applyExplosionCondition(ModItems.MICA_CHUNK.get(), LootItem.lootTableItem(ModItems.MICA_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));

        add(ModBlocks.DEEPSLATE_JASPER_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_JASPER_ORE.get() ,applyExplosionCondition(ModItems.JASPER_CHUNK.get(), LootItem.lootTableItem(ModItems.JASPER_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_CARNELIAN_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_CARNELIAN_ORE.get() ,applyExplosionCondition(ModItems.CARNELIAN_CHUNK.get(), LootItem.lootTableItem(ModItems.CARNELIAN_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_CITRINE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_CITRINE_ORE.get() ,applyExplosionCondition(ModItems.CITRINE_CHUNK.get(), LootItem.lootTableItem(ModItems.CITRINE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_AVENTURINE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_AVENTURINE_ORE.get() ,applyExplosionCondition(ModItems.AVENTURINE_CHUNK.get(), LootItem.lootTableItem(ModItems.AVENTURINE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_JADE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_JADE_ORE.get() ,applyExplosionCondition(ModItems.JADE_CHUNK.get(), LootItem.lootTableItem(ModItems.JADE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_CHALCOPYRITE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_CHALCOPYRITE_ORE.get() ,applyExplosionCondition(ModItems.CHALCOPYRITE_CHUNK.get(), LootItem.lootTableItem(ModItems.CHALCOPYRITE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_LABRADORITE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_LABRADORITE_ORE.get() ,applyExplosionCondition(ModItems.LABRADORITE_CHUNK.get(), LootItem.lootTableItem(ModItems.LABRADORITE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get() ,applyExplosionCondition(ModItems.MOONSTONE_CHUNK.get(), LootItem.lootTableItem(ModItems.MOONSTONE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_SODALITE_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_SODALITE_ORE.get() ,applyExplosionCondition(ModItems.SODALITE_CHUNK.get(), LootItem.lootTableItem(ModItems.SODALITE_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_AMETHYST_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_AMETHYST_ORE.get() ,applyExplosionCondition(ModItems.AMETHYST_CHUNK.get(), LootItem.lootTableItem(ModItems.AMETHYST_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.get() ,applyExplosionCondition(ModItems.ROSE_QUARTZ_CHUNK.get(), LootItem.lootTableItem(ModItems.ROSE_QUARTZ_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));
        add(ModBlocks.DEEPSLATE_MICA_ORE.get(), createSilkTouchDispatchTable(ModBlocks.DEEPSLATE_MICA_ORE.get() ,applyExplosionCondition(ModItems.MICA_CHUNK.get(), LootItem.lootTableItem(ModItems.MICA_CHUNK.get()).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))));




//GEM BLOCKS//
        this.dropSelf(ModBlocks.JASPER_BLOCK.get());
        this.dropSelf(ModBlocks.CARNELIAN_BLOCK.get());
        this.dropSelf(ModBlocks.CITRINE_BLOCK.get());
        this.dropSelf(ModBlocks.AVENTURINE_BLOCK.get());
        this.dropSelf(ModBlocks.JADE_BLOCK.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_BLOCK.get());
        this.dropSelf(ModBlocks.LABRADORITE_BLOCK.get());
        this.dropSelf(ModBlocks.MOONSTONE_BLOCK.get());
        this.dropSelf(ModBlocks.SODALITE_BLOCK.get());
        this.dropSelf(ModBlocks.AMETHYST_BLOCK.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_BLOCK.get());
        this.dropSelf(ModBlocks.MICA_BLOCK.get());

//GEM TILES//
        this.dropSelf(ModBlocks.JASPER_1.get());
        this.dropSelf(ModBlocks.CARNELIAN_1.get());
        this.dropSelf(ModBlocks.CITRINE_1.get());
        this.dropSelf(ModBlocks.AVENTURINE_1.get());
        this.dropSelf(ModBlocks.JADE_1.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_1.get());
        this.dropSelf(ModBlocks.LABRADORITE_1.get());
        this.dropSelf(ModBlocks.MOONSTONE_1.get());
        this.dropSelf(ModBlocks.SODALITE_1.get());
        this.dropSelf(ModBlocks.AMETHYST_1.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_1.get());
        this.dropSelf(ModBlocks.MICA_1.get());

        this.dropSelf(ModBlocks.JASPER_2.get());
        this.dropSelf(ModBlocks.CARNELIAN_2.get());
        this.dropSelf(ModBlocks.CITRINE_2.get());
        this.dropSelf(ModBlocks.AVENTURINE_2.get());
        this.dropSelf(ModBlocks.JADE_2.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_2.get());
        this.dropSelf(ModBlocks.LABRADORITE_2.get());
        this.dropSelf(ModBlocks.MOONSTONE_2.get());
        this.dropSelf(ModBlocks.SODALITE_2.get());
        this.dropSelf(ModBlocks.AMETHYST_2.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_2.get());
        this.dropSelf(ModBlocks.MICA_2.get());

        this.dropSelf(ModBlocks.JASPER_3.get());
        this.dropSelf(ModBlocks.CARNELIAN_3.get());
        this.dropSelf(ModBlocks.CITRINE_3.get());
        this.dropSelf(ModBlocks.AVENTURINE_3.get());
        this.dropSelf(ModBlocks.JADE_3.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_3.get());
        this.dropSelf(ModBlocks.LABRADORITE_3.get());
        this.dropSelf(ModBlocks.MOONSTONE_3.get());
        this.dropSelf(ModBlocks.SODALITE_3.get());
        this.dropSelf(ModBlocks.AMETHYST_3.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_3.get());
        this.dropSelf(ModBlocks.MICA_3.get());

        this.dropSelf(ModBlocks.JASPER_4.get());
        this.dropSelf(ModBlocks.CARNELIAN_4.get());
        this.dropSelf(ModBlocks.CITRINE_4.get());
        this.dropSelf(ModBlocks.AVENTURINE_4.get());
        this.dropSelf(ModBlocks.JADE_4.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_4.get());
        this.dropSelf(ModBlocks.LABRADORITE_4.get());
        this.dropSelf(ModBlocks.MOONSTONE_4.get());
        this.dropSelf(ModBlocks.SODALITE_4.get());
        this.dropSelf(ModBlocks.AMETHYST_4.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_4.get());
        this.dropSelf(ModBlocks.MICA_4.get());

        this.dropSelf(ModBlocks.JASPER_5.get());
        this.dropSelf(ModBlocks.CARNELIAN_5.get());
        this.dropSelf(ModBlocks.CITRINE_5.get());
        this.dropSelf(ModBlocks.AVENTURINE_5.get());
        this.dropSelf(ModBlocks.JADE_5.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_5.get());
        this.dropSelf(ModBlocks.LABRADORITE_5.get());
        this.dropSelf(ModBlocks.MOONSTONE_5.get());
        this.dropSelf(ModBlocks.SODALITE_5.get());
        this.dropSelf(ModBlocks.AMETHYST_5.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_5.get());
        this.dropSelf(ModBlocks.MICA_5.get());

        this.dropSelf(ModBlocks.JASPER_6.get());
        this.dropSelf(ModBlocks.CARNELIAN_6.get());
        this.dropSelf(ModBlocks.CITRINE_6.get());
        this.dropSelf(ModBlocks.AVENTURINE_6.get());
        this.dropSelf(ModBlocks.JADE_6.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_6.get());
        this.dropSelf(ModBlocks.LABRADORITE_6.get());
        this.dropSelf(ModBlocks.MOONSTONE_6.get());
        this.dropSelf(ModBlocks.SODALITE_6.get());
        this.dropSelf(ModBlocks.AMETHYST_6.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_6.get());
        this.dropSelf(ModBlocks.MICA_6.get());

//GEM TILES-SLABS//
        this.dropSelf(ModBlocks.JASPER_1_SLAB.get());
        this.dropSelf(ModBlocks.CARNELIAN_1_SLAB.get());
        this.dropSelf(ModBlocks.CITRINE_1_SLAB.get());
        this.dropSelf(ModBlocks.AVENTURINE_1_SLAB.get());
        this.dropSelf(ModBlocks.JADE_1_SLAB.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_1_SLAB.get());
        this.dropSelf(ModBlocks.LABRADORITE_1_SLAB.get());
        this.dropSelf(ModBlocks.MOONSTONE_1_SLAB.get());
        this.dropSelf(ModBlocks.SODALITE_1_SLAB.get());
        this.dropSelf(ModBlocks.AMETHYST_1_SLAB.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_1_SLAB.get());
        this.dropSelf(ModBlocks.MICA_1_SLAB.get());

        this.dropSelf(ModBlocks.JASPER_2_SLAB.get());
        this.dropSelf(ModBlocks.CARNELIAN_2_SLAB.get());
        this.dropSelf(ModBlocks.CITRINE_2_SLAB.get());
        this.dropSelf(ModBlocks.AVENTURINE_2_SLAB.get());
        this.dropSelf(ModBlocks.JADE_2_SLAB.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_2_SLAB.get());
        this.dropSelf(ModBlocks.LABRADORITE_2_SLAB.get());
        this.dropSelf(ModBlocks.MOONSTONE_2_SLAB.get());
        this.dropSelf(ModBlocks.SODALITE_2_SLAB.get());
        this.dropSelf(ModBlocks.AMETHYST_2_SLAB.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_2_SLAB.get());
        this.dropSelf(ModBlocks.MICA_2_SLAB.get());

        this.dropSelf(ModBlocks.JASPER_3_SLAB.get());
        this.dropSelf(ModBlocks.CARNELIAN_3_SLAB.get());
        this.dropSelf(ModBlocks.CITRINE_3_SLAB.get());
        this.dropSelf(ModBlocks.AVENTURINE_3_SLAB.get());
        this.dropSelf(ModBlocks.JADE_3_SLAB.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_3_SLAB.get());
        this.dropSelf(ModBlocks.LABRADORITE_3_SLAB.get());
        this.dropSelf(ModBlocks.MOONSTONE_3_SLAB.get());
        this.dropSelf(ModBlocks.SODALITE_3_SLAB.get());
        this.dropSelf(ModBlocks.AMETHYST_3_SLAB.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_3_SLAB.get());
        this.dropSelf(ModBlocks.MICA_3_SLAB.get());

        this.dropSelf(ModBlocks.JASPER_4_SLAB.get());
        this.dropSelf(ModBlocks.CARNELIAN_4_SLAB.get());
        this.dropSelf(ModBlocks.CITRINE_4_SLAB.get());
        this.dropSelf(ModBlocks.AVENTURINE_4_SLAB.get());
        this.dropSelf(ModBlocks.JADE_4_SLAB.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_4_SLAB.get());
        this.dropSelf(ModBlocks.LABRADORITE_4_SLAB.get());
        this.dropSelf(ModBlocks.MOONSTONE_4_SLAB.get());
        this.dropSelf(ModBlocks.SODALITE_4_SLAB.get());
        this.dropSelf(ModBlocks.AMETHYST_4_SLAB.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_4_SLAB.get());
        this.dropSelf(ModBlocks.MICA_4_SLAB.get());

        this.dropSelf(ModBlocks.JASPER_5_SLAB.get());
        this.dropSelf(ModBlocks.CARNELIAN_5_SLAB.get());
        this.dropSelf(ModBlocks.CITRINE_5_SLAB.get());
        this.dropSelf(ModBlocks.AVENTURINE_5_SLAB.get());
        this.dropSelf(ModBlocks.JADE_5_SLAB.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_5_SLAB.get());
        this.dropSelf(ModBlocks.LABRADORITE_5_SLAB.get());
        this.dropSelf(ModBlocks.MOONSTONE_5_SLAB.get());
        this.dropSelf(ModBlocks.SODALITE_5_SLAB.get());
        this.dropSelf(ModBlocks.AMETHYST_5_SLAB.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_5_SLAB.get());
        this.dropSelf(ModBlocks.MICA_5_SLAB.get());

        this.dropSelf(ModBlocks.JASPER_6_SLAB.get());
        this.dropSelf(ModBlocks.CARNELIAN_6_SLAB.get());
        this.dropSelf(ModBlocks.CITRINE_6_SLAB.get());
        this.dropSelf(ModBlocks.AVENTURINE_6_SLAB.get());
        this.dropSelf(ModBlocks.JADE_6_SLAB.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_6_SLAB.get());
        this.dropSelf(ModBlocks.LABRADORITE_6_SLAB.get());
        this.dropSelf(ModBlocks.MOONSTONE_6_SLAB.get());
        this.dropSelf(ModBlocks.SODALITE_6_SLAB.get());
        this.dropSelf(ModBlocks.AMETHYST_6_SLAB.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_6_SLAB.get());
        this.dropSelf(ModBlocks.MICA_6_SLAB.get());

//GEM TILES- STAIRS//
        this.dropSelf(ModBlocks.JASPER_1_STAIRS.get());
        this.dropSelf(ModBlocks.CARNELIAN_1_STAIRS.get());
        this.dropSelf(ModBlocks.CITRINE_1_STAIRS.get());
        this.dropSelf(ModBlocks.AVENTURINE_1_STAIRS.get());
        this.dropSelf(ModBlocks.JADE_1_STAIRS.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_1_STAIRS.get());
        this.dropSelf(ModBlocks.LABRADORITE_1_STAIRS.get());
        this.dropSelf(ModBlocks.MOONSTONE_1_STAIRS.get());
        this.dropSelf(ModBlocks.SODALITE_1_STAIRS.get());
        this.dropSelf(ModBlocks.AMETHYST_1_STAIRS.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_1_STAIRS.get());
        this.dropSelf(ModBlocks.MICA_1_STAIRS.get());

        this.dropSelf(ModBlocks.JASPER_2_STAIRS.get());
        this.dropSelf(ModBlocks.CARNELIAN_2_STAIRS.get());
        this.dropSelf(ModBlocks.CITRINE_2_STAIRS.get());
        this.dropSelf(ModBlocks.AVENTURINE_2_STAIRS.get());
        this.dropSelf(ModBlocks.JADE_2_STAIRS.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_2_STAIRS.get());
        this.dropSelf(ModBlocks.LABRADORITE_2_STAIRS.get());
        this.dropSelf(ModBlocks.MOONSTONE_2_STAIRS.get());
        this.dropSelf(ModBlocks.SODALITE_2_STAIRS.get());
        this.dropSelf(ModBlocks.AMETHYST_2_STAIRS.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_2_STAIRS.get());
        this.dropSelf(ModBlocks.MICA_2_STAIRS.get());

        this.dropSelf(ModBlocks.JASPER_3_STAIRS.get());
        this.dropSelf(ModBlocks.CARNELIAN_3_STAIRS.get());
        this.dropSelf(ModBlocks.CITRINE_3_STAIRS.get());
        this.dropSelf(ModBlocks.AVENTURINE_3_STAIRS.get());
        this.dropSelf(ModBlocks.JADE_3_STAIRS.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_3_STAIRS.get());
        this.dropSelf(ModBlocks.LABRADORITE_3_STAIRS.get());
        this.dropSelf(ModBlocks.MOONSTONE_3_STAIRS.get());
        this.dropSelf(ModBlocks.SODALITE_3_STAIRS.get());
        this.dropSelf(ModBlocks.AMETHYST_3_STAIRS.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_3_STAIRS.get());
        this.dropSelf(ModBlocks.MICA_3_STAIRS.get());

        this.dropSelf(ModBlocks.JASPER_4_STAIRS.get());
        this.dropSelf(ModBlocks.CARNELIAN_4_STAIRS.get());
        this.dropSelf(ModBlocks.CITRINE_4_STAIRS.get());
        this.dropSelf(ModBlocks.AVENTURINE_4_STAIRS.get());
        this.dropSelf(ModBlocks.JADE_4_STAIRS.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_4_STAIRS.get());
        this.dropSelf(ModBlocks.LABRADORITE_4_STAIRS.get());
        this.dropSelf(ModBlocks.MOONSTONE_4_STAIRS.get());
        this.dropSelf(ModBlocks.SODALITE_4_STAIRS.get());
        this.dropSelf(ModBlocks.AMETHYST_4_STAIRS.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_4_STAIRS.get());
        this.dropSelf(ModBlocks.MICA_4_STAIRS.get());

        this.dropSelf(ModBlocks.JASPER_5_STAIRS.get());
        this.dropSelf(ModBlocks.CARNELIAN_5_STAIRS.get());
        this.dropSelf(ModBlocks.CITRINE_5_STAIRS.get());
        this.dropSelf(ModBlocks.AVENTURINE_5_STAIRS.get());
        this.dropSelf(ModBlocks.JADE_5_STAIRS.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_5_STAIRS.get());
        this.dropSelf(ModBlocks.LABRADORITE_5_STAIRS.get());
        this.dropSelf(ModBlocks.MOONSTONE_5_STAIRS.get());
        this.dropSelf(ModBlocks.SODALITE_5_STAIRS.get());
        this.dropSelf(ModBlocks.AMETHYST_5_STAIRS.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_5_STAIRS.get());
        this.dropSelf(ModBlocks.MICA_5_STAIRS.get());

        this.dropSelf(ModBlocks.JASPER_6_STAIRS.get());
        this.dropSelf(ModBlocks.CARNELIAN_6_STAIRS.get());
        this.dropSelf(ModBlocks.CITRINE_6_STAIRS.get());
        this.dropSelf(ModBlocks.AVENTURINE_6_STAIRS.get());
        this.dropSelf(ModBlocks.JADE_6_STAIRS.get());
        this.dropSelf(ModBlocks.CHALCOPYRITE_6_STAIRS.get());
        this.dropSelf(ModBlocks.LABRADORITE_6_STAIRS.get());
        this.dropSelf(ModBlocks.MOONSTONE_6_STAIRS.get());
        this.dropSelf(ModBlocks.SODALITE_6_STAIRS.get());
        this.dropSelf(ModBlocks.AMETHYST_6_STAIRS.get());
        this.dropSelf(ModBlocks.ROSE_QUARTZ_6_STAIRS.get());
        this.dropSelf(ModBlocks.MICA_6_STAIRS.get());


//VASES//
        this.dropSelf(ModBlocks.VASE_RED.get());
        this.dropSelf(ModBlocks.VASE_ORANGE.get());
        this.dropSelf(ModBlocks.VASE_YELLOW.get());
        this.dropSelf(ModBlocks.VASE_LIME.get());
        this.dropSelf(ModBlocks.VASE_GREEN.get());
        this.dropSelf(ModBlocks.VASE_CYAN.get());
        this.dropSelf(ModBlocks.VASE_LIGHT_BLUE.get());
        this.dropSelf(ModBlocks.VASE_BLUE.get());
        this.dropSelf(ModBlocks.VASE_PURPLE.get());
        this.dropSelf(ModBlocks.VASE_MAGENTA.get());
        this.dropSelf(ModBlocks.VASE_PINK.get());
        this.dropSelf(ModBlocks.VASE_WHITE.get());
        this.dropSelf(ModBlocks.VASE_LIGHT_GRAY.get());
        this.dropSelf(ModBlocks.VASE_GRAY.get());
        this.dropSelf(ModBlocks.VASE_BLACK.get());
        this.dropSelf(ModBlocks.VASE_BROWN.get());

        //CHESTS//
        this.dropSelf(ModBlocks.ACACIA_CHEST.get());
        this.dropSelf(ModBlocks.BIRCH_CHEST.get());
        this.dropSelf(ModBlocks.OAK_CHEST.get());
        this.dropSelf(ModBlocks.SPRUCE_CHEST.get());
        this.dropSelf(ModBlocks.DARK_OAK_CHEST.get());
        this.dropSelf(ModBlocks.JUNGLE_CHEST.get());
        this.dropSelf(ModBlocks.CRIMSON_CHEST.get());
        this.dropSelf(ModBlocks.WARPED_CHEST.get());

        this.dropSelf(ModBlocks.CRABAPPLE_CHEST.get());
        this.dropSelf(ModBlocks.POINCIANA_CHEST.get());
        this.dropSelf(ModBlocks.LABURNUM_CHEST.get());
        this.dropSelf(ModBlocks.JADE_CHEST.get());
        this.dropSelf(ModBlocks.PAULOWNIA_CHEST.get());
        this.dropSelf(ModBlocks.WISTERIA_CHEST.get());
        this.dropSelf(ModBlocks.JACARANDA_CHEST.get());
        this.dropSelf(ModBlocks.DOGWOOD_CHEST.get());
        this.dropSelf(ModBlocks.SILVERBELL_CHEST.get());
        this.dropSelf(ModBlocks.CEDAR_CHEST.get());
        this.dropSelf(ModBlocks.MANGROVE_CHEST.get());

        this.dropSelf(ModBlocks.RED_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.ORANGE_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.YELLOW_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.LIME_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.GREEN_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.CYAN_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.BLUE_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.PURPLE_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.MAGENTA_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.PINK_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.WHITE_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.GRAY_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.BLACK_STAINED_CHEST.get());
        this.dropSelf(ModBlocks.BROWN_STAINED_CHEST.get());



    }

    private void registerEmpty(Block b) {
        add(b, LootTable.lootTable());
    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
