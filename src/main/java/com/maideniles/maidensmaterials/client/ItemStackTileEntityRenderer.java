package com.maideniles.maidensmaterials.client;

import com.maideniles.maidensmaterials.blockentity.ModChestEntity;
import com.maideniles.maidensmaterials.blocks.chest.ModChestBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public class ItemStackTileEntityRenderer extends BlockEntityWithoutLevelRenderer {

     private final Map<Block, ModChestEntity> chestEntities = Util.make(new HashMap<>(), map -> {
         makeInstance(map,ModBlocks.ACACIA_CHEST);
         makeInstance(map,ModBlocks.BIRCH_CHEST);
         makeInstance(map,ModBlocks.OAK_CHEST);
         makeInstance(map,ModBlocks.SPRUCE_CHEST);
         makeInstance(map,ModBlocks.DARK_OAK_CHEST);
         makeInstance(map,ModBlocks.JUNGLE_CHEST);
         makeInstance(map,ModBlocks.CRIMSON_CHEST);
         makeInstance(map,ModBlocks.WARPED_CHEST);
//FOREST WOODS//
         makeInstance(map,ModBlocks.CRABAPPLE_CHEST);
         makeInstance(map,ModBlocks.POINCIANA_CHEST);
         makeInstance(map,ModBlocks.LABURNUM_CHEST);
         makeInstance(map,ModBlocks.JADE_CHEST);
         makeInstance(map,ModBlocks.PAULOWNIA_CHEST);
         makeInstance(map,ModBlocks.WISTERIA_CHEST);
         makeInstance(map,ModBlocks.JACARANDA_CHEST);
         makeInstance(map,ModBlocks.DOGWOOD_CHEST);
         makeInstance(map,ModBlocks.SILVERBELL_CHEST);
         makeInstance(map,ModBlocks.CEDAR_CHEST);
//STAINED WOODS//
         makeInstance(map,ModBlocks.RED_STAINED_CHEST);
         makeInstance(map,ModBlocks.ORANGE_STAINED_CHEST);
         makeInstance(map,ModBlocks.YELLOW_STAINED_CHEST);
         makeInstance(map,ModBlocks.LIME_STAINED_CHEST);
         makeInstance(map,ModBlocks.GREEN_STAINED_CHEST);
         makeInstance(map,ModBlocks.CYAN_STAINED_CHEST);
         makeInstance(map,ModBlocks.LIGHT_BLUE_STAINED_CHEST);
         makeInstance(map,ModBlocks.BLUE_STAINED_CHEST);
         makeInstance(map,ModBlocks.PURPLE_STAINED_CHEST);
         makeInstance(map,ModBlocks.MAGENTA_STAINED_CHEST);
         makeInstance(map,ModBlocks.PINK_STAINED_CHEST);
         makeInstance(map,ModBlocks.WHITE_STAINED_CHEST);
         makeInstance(map,ModBlocks.LIGHT_GRAY_STAINED_CHEST);
         makeInstance(map,ModBlocks.GRAY_STAINED_CHEST);
         makeInstance(map,ModBlocks.BLACK_STAINED_CHEST);
         makeInstance(map,ModBlocks.BROWN_STAINED_CHEST);
     });

    // When this is called from Item register, TEType register has not run yet so we can't pass the actual object
    public ItemStackTileEntityRenderer(ResourceLocation typeId) {
        super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());

    }

    @Override
    public void renderByItem(ItemStack stack, ItemTransforms.TransformType camera, PoseStack ms, MultiBufferSource buffers, int light, int overlay) {


        Item item = stack.getItem();
        if (item instanceof BlockItem) {
            Block block = ((BlockItem) item).getBlock();
          if (block instanceof ModChestBlock) {
                Minecraft.getInstance().getBlockEntityRenderDispatcher().renderItem(this.chestEntities.get(block), ms, buffers, light, overlay);
            }
        }
    }

    public static void makeInstance(Map<Block, ModChestEntity> map, RegistryObject<? extends ChestBlock> registryObject) {
        ChestBlock block = registryObject.get();

        map.put(block, new ModChestEntity(BlockPos.ZERO, block.defaultBlockState()));
    }
}
