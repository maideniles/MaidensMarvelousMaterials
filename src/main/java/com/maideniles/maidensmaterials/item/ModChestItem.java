package com.maideniles.maidensmaterials.item;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.client.ISTER;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Consumer;

public class ModChestItem {

    public static void registerBlockItems(RegisterEvent event) {
        if (Objects.equals(event.getForgeRegistry(), ForgeRegistries.ITEMS)) {


            makeBEWLRItem(event, ModBlocks.ACACIA_CHEST);
            makeBEWLRItem(event, ModBlocks.BIRCH_CHEST);
            makeBEWLRItem(event, ModBlocks.OAK_CHEST);
            makeBEWLRItem(event, ModBlocks.SPRUCE_CHEST);
            makeBEWLRItem(event, ModBlocks.DARK_OAK_CHEST);
            makeBEWLRItem(event, ModBlocks.JUNGLE_CHEST);
            makeBEWLRItem(event, ModBlocks.CRIMSON_CHEST);
            makeBEWLRItem(event, ModBlocks.WARPED_CHEST);
//FOREST WOODS//
            makeBEWLRItem(event, ModBlocks.CRABAPPLE_CHEST);
            makeBEWLRItem(event, ModBlocks.POINCIANA_CHEST);
            makeBEWLRItem(event, ModBlocks.LABURNUM_CHEST);
            makeBEWLRItem(event, ModBlocks.JADE_CHEST);
            makeBEWLRItem(event, ModBlocks.PAULOWNIA_CHEST);
            makeBEWLRItem(event, ModBlocks.WISTERIA_CHEST);
            makeBEWLRItem(event, ModBlocks.JACARANDA_CHEST);
            makeBEWLRItem(event, ModBlocks.DOGWOOD_CHEST);
            makeBEWLRItem(event, ModBlocks.SILVERBELL_CHEST);
            makeBEWLRItem(event, ModBlocks.CEDAR_CHEST);
//STAINED WOODS//
            makeBEWLRItem(event, ModBlocks.RED_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.ORANGE_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.YELLOW_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.LIME_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.GREEN_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.CYAN_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.LIGHT_BLUE_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.BLUE_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.PURPLE_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.MAGENTA_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.PINK_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.WHITE_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.LIGHT_GRAY_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.GRAY_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.BLACK_STAINED_CHEST);
            makeBEWLRItem(event, ModBlocks.BROWN_STAINED_CHEST);
        }
    }

        public static Item.Properties defaultBuilder () {
            return new Item.Properties().tab(MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
        }


        private static void makeBEWLRItem (RegisterEvent event, RegistryObject < ? extends Block > block){
            register(event, new BlockItem(block.get(), ModItems.defaultBuilder()) {
                @Override
                public void initializeClient(Consumer<IClientItemExtensions> consumer) {
                    consumer.accept(new IClientItemExtensions() {
                        @Override
                        public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                            return new ISTER();
                        }
                    });
                }
            });
        }

        private static void register (RegisterEvent event, BlockItem item){
            event.register(ForgeRegistries.Keys.ITEMS, helper -> helper.register(ForgeRegistries.BLOCKS.getKey(item.getBlock()), item));
        }

    }


