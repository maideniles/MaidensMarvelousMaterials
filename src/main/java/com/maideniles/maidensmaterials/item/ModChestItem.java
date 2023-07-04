package com.maideniles.maidensmaterials.item;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.client.ItemStackTileEntityRenderer;
import com.maideniles.maidensmaterials.init.ModBlockEntities;
import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Consumer;

public class ModChestItem {

    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();


        makeBEWLRItem(r, ModBlocks.ACACIA_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.BIRCH_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.OAK_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.SPRUCE_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.DARK_OAK_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.JUNGLE_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.CRIMSON_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.WARPED_CHEST, ModBlockEntities.MOD_CHEST.getId());
//FOREST WOODS//
        makeBEWLRItem(r, ModBlocks.CRABAPPLE_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.POINCIANA_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.LABURNUM_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.JADE_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.PAULOWNIA_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.WISTERIA_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.JACARANDA_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.DOGWOOD_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.SILVERBELL_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.CEDAR_CHEST, ModBlockEntities.MOD_CHEST.getId());
//STAINED WOODS//
        makeBEWLRItem(r, ModBlocks.RED_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.ORANGE_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.YELLOW_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.LIME_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.GREEN_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.CYAN_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.LIGHT_BLUE_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.BLUE_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.PURPLE_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.MAGENTA_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.PINK_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.WHITE_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.LIGHT_GRAY_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.GRAY_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.BLACK_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
        makeBEWLRItem(r, ModBlocks.BROWN_STAINED_CHEST, ModBlockEntities.MOD_CHEST.getId());
    }



    public static Item.Properties defaultBuilder() {
        return new Item.Properties().tab(MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    }
    private static Item makeBlockItem(Item blockitem, RegistryObject<? extends Block> block) {
        return blockitem.setRegistryName(Objects.requireNonNull(block.getId()));
    }

    private static void makeBEWLRItem(IForgeRegistry<Item> r, RegistryObject<? extends Block> block, ResourceLocation rl) {
        r.register(makeBlockItem(new BlockItem(block.get(), ModChestItem.defaultBuilder()) {
            @Override
            public void initializeClient(Consumer<IItemRenderProperties> consumer) {
                consumer.accept(new IItemRenderProperties() {
                    @Override
                    public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                        return new ItemStackTileEntityRenderer(rl);
                    }
                });
            }
        }, block));
    }


}
