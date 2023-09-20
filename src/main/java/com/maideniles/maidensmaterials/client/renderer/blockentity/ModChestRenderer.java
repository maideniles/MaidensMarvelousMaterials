package com.maideniles.maidensmaterials.client.renderer.blockentity;

import com.google.common.collect.ImmutableMap;
import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.blockentity.ModChestEntity;
import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraft.client.resources.model.Material;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ModChestRenderer<T extends ModChestEntity> extends ChestRenderer<T> {
    public static final Map<Block, EnumMap<ChestType, Material>> MATERIALS;

    static {
        ImmutableMap.Builder<Block, EnumMap<ChestType, Material>> builder = ImmutableMap.builder();

        builder.put(ModBlocks.ACACIA_CHEST.get(), chestMaterial("acacia_chest"));
        builder.put(ModBlocks.BIRCH_CHEST.get(), chestMaterial("birch_chest"));
        builder.put(ModBlocks.OAK_CHEST.get(), chestMaterial("oak_chest"));
        builder.put(ModBlocks.SPRUCE_CHEST.get(), chestMaterial("spruce_chest"));
        builder.put(ModBlocks.DARK_OAK_CHEST.get(), chestMaterial("dark_oak_chest"));
        builder.put(ModBlocks.JUNGLE_CHEST.get(), chestMaterial("jungle_chest"));
        builder.put(ModBlocks.CRIMSON_CHEST.get(), chestMaterial("crimson_chest"));
        builder.put(ModBlocks.WARPED_CHEST.get(), chestMaterial("warped_chest"));
        builder.put(ModBlocks.MANGROVE_CHEST.get(), chestMaterial("mangrove_chest"));
//FOREST WOODS//
        builder.put(ModBlocks.CRABAPPLE_CHEST.get(), chestMaterial("crabapple_chest"));
        builder.put(ModBlocks.POINCIANA_CHEST.get(), chestMaterial("poinciana_chest"));
        builder.put(ModBlocks.LABURNUM_CHEST.get(), chestMaterial("laburnum_chest"));
        builder.put(ModBlocks.JADE_CHEST.get(), chestMaterial("jade_chest"));
        builder.put(ModBlocks.PAULOWNIA_CHEST.get(), chestMaterial("paulownia_chest"));
        builder.put(ModBlocks.WISTERIA_CHEST.get(), chestMaterial("wisteria_chest"));
        builder.put(ModBlocks.JACARANDA_CHEST.get(), chestMaterial("jacaranda_chest"));
        builder.put(ModBlocks.DOGWOOD_CHEST.get(), chestMaterial("dogwood_chest"));
        builder.put(ModBlocks.SILVERBELL_CHEST.get(), chestMaterial("silverbell_chest"));
        builder.put(ModBlocks.CEDAR_CHEST.get(), chestMaterial("cedar_chest"));
//STAINED WOODS//
        builder.put(ModBlocks. RED_STAINED_CHEST.get(), chestMaterial("red_stained_chest"));
        builder.put(ModBlocks. ORANGE_STAINED_CHEST.get(), chestMaterial("orange_stained_chest"));
        builder.put(ModBlocks. YELLOW_STAINED_CHEST.get(), chestMaterial("yellow_stained_chest"));
        builder.put(ModBlocks. LIME_STAINED_CHEST.get(), chestMaterial("lime_stained_chest"));
        builder.put(ModBlocks. GREEN_STAINED_CHEST.get(), chestMaterial("green_stained_chest"));
        builder.put(ModBlocks. CYAN_STAINED_CHEST.get(), chestMaterial("cyan_stained_chest"));
        builder.put(ModBlocks. LIGHT_BLUE_STAINED_CHEST.get(), chestMaterial("light_blue_stained_chest"));
        builder.put(ModBlocks. BLUE_STAINED_CHEST.get(), chestMaterial("blue_stained_chest"));
        builder.put(ModBlocks. PURPLE_STAINED_CHEST.get(), chestMaterial("purple_stained_chest"));
        builder.put(ModBlocks. MAGENTA_STAINED_CHEST.get(), chestMaterial("magenta_stained_chest"));
        builder.put(ModBlocks. PINK_STAINED_CHEST.get(), chestMaterial("pink_stained_chest"));
        builder.put(ModBlocks. WHITE_STAINED_CHEST.get(), chestMaterial("white_stained_chest"));
        builder.put(ModBlocks. LIGHT_GRAY_STAINED_CHEST.get(), chestMaterial("light_gray_stained_chest"));
        builder.put(ModBlocks. GRAY_STAINED_CHEST.get(), chestMaterial("gray_stained_chest"));
        builder.put(ModBlocks. BLACK_STAINED_CHEST.get(), chestMaterial("black_stained_chest"));
        builder.put(ModBlocks. BROWN_STAINED_CHEST.get(), chestMaterial("brown_stained_chest"));

        MATERIALS = builder.build();

      //  ModelBakery.UNREFERENCED_TEXTURES.addAll(MATERIALS.values().stream().flatMap(e -> e.values().stream()).collect(Collectors.toList()));
    }

    public ModChestRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    protected Material getMaterial(T blockEntity, ChestType chestType) {
        EnumMap<ChestType, Material> b = MATERIALS.get(blockEntity.getBlockState().getBlock());

        if (b == null) return super.getMaterial(blockEntity, chestType);

        Material material = b.get(chestType);

        return material != null ? material : super.getMaterial(blockEntity, chestType);
    }

    private static EnumMap<ChestType, Material> chestMaterial(String type) {
        EnumMap<ChestType, Material> map = new EnumMap<>(ChestType.class);

        map.put(ChestType.SINGLE, new Material(Sheets.CHEST_SHEET, MarvelousMaterials.prefix("model/chest/" + type + "/" + type)));
        map.put(ChestType.LEFT, new Material(Sheets.CHEST_SHEET, MarvelousMaterials.prefix("model/chest/" + type + "/left")));
        map.put(ChestType.RIGHT, new Material(Sheets.CHEST_SHEET, MarvelousMaterials.prefix("model/chest/" + type + "/right")));

        return map;
    }
}
