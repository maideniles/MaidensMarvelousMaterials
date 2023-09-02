package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.item.BlossomItem;
import com.maideniles.maidensmaterials.item.GemChunkItem;
import com.maideniles.maidensmaterials.item.PigmentItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarvelousMaterials.MOD_ID);

  //  public static final RegistryObject<Item> MARVELOUS_MANUAL = ITEMS.register("marvelous_manual",
 //           ()-> new MarvelousManualItem(new Item.Properties().tab(null).stacksTo(1)));

    public static final RegistryObject<Item> EARTHEN_POTION_FOR_BOOK = ITEMS.register("earthen_potion_item",
            () -> new Item(new Item.Properties().tab(null)));

    public static final RegistryObject<Item> FLORAL_POTION_FOR_BOOK = ITEMS.register("floral_potion_item",
            () -> new Item(new Item.Properties().tab(null)));
    //TOOLS//
    public static final RegistryObject<Item> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));


    //IMPLEMENTS//
    public static final RegistryObject<Item> PRUNING_SHEARS = ITEMS.register("pruning_shears",
            () -> new Item(new Item.Properties().durability(64).tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //ESSENCES//

    public static final RegistryObject<Item> FLORAL_ESSENCE = ITEMS.register("floral_essence",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> EARTHEN_ESSENCE = ITEMS.register("earthen_essence",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));
    //BLOSSOMS//
    public static final RegistryObject<Item> CRABAPPLE_BLOSSOMS = ITEMS.register("crabapple_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> POINCIANA_BLOSSOMS = ITEMS.register("poinciana_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LABURNUM_BLOSSOMS = ITEMS.register("laburnum_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> JADE_BLOSSOMS = ITEMS.register("jade_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PAULOWNIA_BLOSSOMS = ITEMS.register("paulownia_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WISTERIA_BLOSSOMS = ITEMS.register("wisteria_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> JACARANDA_BLOSSOMS = ITEMS.register("jacaranda_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DOGWOOD_BLOSSOMS = ITEMS.register("dogwood_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> SILVERBELL_BLOSSOMS = ITEMS.register("silverbell_blossoms",
            () -> new BlossomItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));


//COLORED PIGMENTS//

    public static final RegistryObject<Item> RED_PIGMENT = ITEMS.register("red_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORANGE_PIGMENT = ITEMS.register("orange_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> YELLOW_PIGMENT = ITEMS.register("yellow_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));
    public static final RegistryObject<Item> LIME_PIGMENT = ITEMS.register("lime_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_PIGMENT = ITEMS.register("green_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CYAN_PIGMENT = ITEMS.register("cyan_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_BLUE_PIGMENT = ITEMS.register("light_blue_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLUE_PIGMENT = ITEMS.register("blue_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PURPLE_PIGMENT = ITEMS.register("purple_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MAGENTA_PIGMENT = ITEMS.register("magenta_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PINK_PIGMENT = ITEMS.register("pink_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_PIGMENT = ITEMS.register("white_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_GRAY_PIGMENT = ITEMS.register("light_gray_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GRAY_PIGMENT = ITEMS.register("gray_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLACK_PIGMENT = ITEMS.register("black_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BROWN_PIGMENT = ITEMS.register("brown_pigment",
            () -> new PigmentItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //COLORED CLAY//
    public static final RegistryObject<Item> RED_CLAY = ITEMS.register("red_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORANGE_CLAY = ITEMS.register("orange_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> YELLOW_CLAY = ITEMS.register("yellow_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));
    public static final RegistryObject<Item> LIME_CLAY = ITEMS.register("lime_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_CLAY = ITEMS.register("green_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CYAN_CLAY = ITEMS.register("cyan_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_BLUE_CLAY = ITEMS.register("light_blue_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLUE_CLAY = ITEMS.register("blue_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PURPLE_CLAY = ITEMS.register("purple_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MAGENTA_CLAY = ITEMS.register("magenta_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PINK_CLAY = ITEMS.register("pink_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_CLAY = ITEMS.register("white_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_GRAY_CLAY = ITEMS.register("light_gray_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GRAY_CLAY = ITEMS.register("gray_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLACK_CLAY = ITEMS.register("black_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BROWN_CLAY = ITEMS.register("brown_clay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //COLORED CLAY BRICKS//
    public static final RegistryObject<Item> RED_BRICK = ITEMS.register("red_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORANGE_BRICK = ITEMS.register("orange_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> YELLOW_BRICK = ITEMS.register("yellow_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));
    public static final RegistryObject<Item> LIME_BRICK = ITEMS.register("lime_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_BRICK = ITEMS.register("green_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CYAN_BRICK = ITEMS.register("cyan_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = ITEMS.register("light_blue_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLUE_BRICK = ITEMS.register("blue_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PURPLE_BRICK = ITEMS.register("purple_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MAGENTA_BRICK = ITEMS.register("magenta_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PINK_BRICK = ITEMS.register("pink_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_BRICK = ITEMS.register("white_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = ITEMS.register("light_gray_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GRAY_BRICK = ITEMS.register("gray_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLACK_BRICK = ITEMS.register("black_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BROWN_BRICK = ITEMS.register("brown_brick",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //COLORED CLAY MIX//
    public static final RegistryObject<Item> RED_CLAY_MIX = ITEMS.register("red_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORANGE_CLAY_MIX = ITEMS.register("orange_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> YELLOW_CLAY_MIX = ITEMS.register("yellow_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIME_CLAY_MIX = ITEMS.register("lime_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_CLAY_MIX = ITEMS.register("green_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CYAN_CLAY_MIX = ITEMS.register("cyan_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_BLUE_CLAY_MIX = ITEMS.register("light_blue_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLUE_CLAY_MIX = ITEMS.register("blue_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PURPLE_CLAY_MIX = ITEMS.register("purple_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MAGENTA_CLAY_MIX = ITEMS.register("magenta_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PINK_CLAY_MIX = ITEMS.register("pink_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_CLAY_MIX = ITEMS.register("white_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_GRAY_CLAY_MIX = ITEMS.register("light_gray_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GRAY_CLAY_MIX = ITEMS.register("gray_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLACK_CLAY_MIX = ITEMS.register("black_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BROWN_CLAY_MIX = ITEMS.register("brown_clay_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //COLORED CLAY VASES//
    public static final RegistryObject<Item> RED_CLAY_VASE = ITEMS.register("red_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORANGE_CLAY_VASE = ITEMS.register("orange_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> YELLOW_CLAY_VASE = ITEMS.register("yellow_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIME_CLAY_VASE = ITEMS.register("lime_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_CLAY_VASE = ITEMS.register("green_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CYAN_CLAY_VASE = ITEMS.register("cyan_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_BLUE_CLAY_VASE = ITEMS.register("light_blue_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLUE_CLAY_VASE = ITEMS.register("blue_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PURPLE_CLAY_VASE = ITEMS.register("purple_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MAGENTA_CLAY_VASE = ITEMS.register("magenta_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PINK_CLAY_VASE = ITEMS.register("pink_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_CLAY_VASE = ITEMS.register("white_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_GRAY_CLAY_VASE = ITEMS.register("light_gray_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GRAY_CLAY_VASE = ITEMS.register("gray_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLACK_CLAY_VASE = ITEMS.register("black_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BROWN_CLAY_VASE = ITEMS.register("brown_clay_vase",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

//COLORED DYE BATHS//

    public static final RegistryObject<Item> RED_DYE_BATH = ITEMS.register("red_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORANGE_DYE_BATH = ITEMS.register("orange_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> YELLOW_DYE_BATH = ITEMS.register("yellow_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIME_DYE_BATH = ITEMS.register("lime_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_DYE_BATH = ITEMS.register("green_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CYAN_DYE_BATH = ITEMS.register("cyan_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_BLUE_DYE_BATH = ITEMS.register("light_blue_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLUE_DYE_BATH = ITEMS.register("blue_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PURPLE_DYE_BATH = ITEMS.register("purple_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MAGENTA_DYE_BATH = ITEMS.register("magenta_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PINK_DYE_BATH = ITEMS.register("pink_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_DYE_BATH = ITEMS.register("white_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_GRAY_DYE_BATH = ITEMS.register("light_gray_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GRAY_DYE_BATH = ITEMS.register("gray_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLACK_DYE_BATH = ITEMS.register("black_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BROWN_DYE_BATH = ITEMS.register("brown_dye_bath",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //WHITEWASH//
    public static final RegistryObject<Item> WHITEWASH = ITEMS.register("whitewash",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

//COLORED STAINS//

    public static final RegistryObject<Item> RED_STAIN = ITEMS.register("red_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ORANGE_STAIN = ITEMS.register("orange_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> YELLOW_STAIN = ITEMS.register("yellow_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIME_STAIN = ITEMS.register("lime_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GREEN_STAIN = ITEMS.register("green_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CYAN_STAIN = ITEMS.register("cyan_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_BLUE_STAIN = ITEMS.register("light_blue_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLUE_STAIN = ITEMS.register("blue_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PURPLE_STAIN = ITEMS.register("purple_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MAGENTA_STAIN = ITEMS.register("magenta_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> PINK_STAIN = ITEMS.register("pink_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> WHITE_STAIN = ITEMS.register("white_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LIGHT_GRAY_STAIN = ITEMS.register("light_gray_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> GRAY_STAIN = ITEMS.register("gray_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BLACK_STAIN = ITEMS.register("black_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> BROWN_STAIN = ITEMS.register("brown_stain",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

//DOOR BLUEPRINTS//

    public static final RegistryObject<Item> DOOR_PLANS_1 = ITEMS.register("door_plans_1",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DOOR_PLANS_2 = ITEMS.register("door_plans_2",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DOOR_PLANS_3 = ITEMS.register("door_plans_3",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DOOR_PLANS_4 = ITEMS.register("door_plans_4",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DOOR_PLANS_5 = ITEMS.register("door_plans_5",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DOOR_PLANS_6 = ITEMS.register("door_plans_6",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //DARK IRON//
    public static final RegistryObject<Item> DARK_IRON_MIX = ITEMS.register("dark_iron_mix",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DARK_IRON_INGOT = ITEMS.register("dark_iron_ingot",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> DARK_IRON_INLAY = ITEMS.register("dark_iron_inlay",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

//FRUITS//





    //GROUT//
    public static final RegistryObject<Item> GROUT = ITEMS.register("grout",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //MICA POWDER//
    public static final RegistryObject<Item> MICA_POWDER = ITEMS.register("mica_powder",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    //GEMSTONES//
    public static final RegistryObject<Item> JASPER_CHUNK = ITEMS.register("jasper_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CARNELIAN_CHUNK = ITEMS.register("carnelian_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CITRINE_CHUNK = ITEMS.register("citrine_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> AVENTURINE_CHUNK = ITEMS.register("aventurine_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> JADE_CHUNK = ITEMS.register("jade_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CHALCOPYRITE_CHUNK = ITEMS.register("chalcopyrite_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LABRADORITE_CHUNK = ITEMS.register("labradorite_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MOONSTONE_CHUNK = ITEMS.register("moonstone_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> SODALITE_CHUNK = ITEMS.register("sodalite_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> AMETHYST_CHUNK = ITEMS.register("amethyst_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ROSE_QUARTZ_CHUNK = ITEMS.register("rose_quartz_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MICA_CHUNK = ITEMS.register("mica_chunk",
            () -> new GemChunkItem(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));


    //FRAGMENTS//
    public static final RegistryObject<Item> JASPER_FRAGMENTS = ITEMS.register("jasper_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CARNELIAN_FRAGMENTS = ITEMS.register("carnelian_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CITRINE_FRAGMENTS = ITEMS.register("citrine_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> AVENTURINE_FRAGMENTS = ITEMS.register("aventurine_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> JADE_FRAGMENTS = ITEMS.register("jade_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> CHALCOPYRITE_FRAGMENTS = ITEMS.register("chalcopyrite_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> LABRADORITE_FRAGMENTS = ITEMS.register("labradorite_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MOONSTONE_FRAGMENTS = ITEMS.register("moonstone_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> SODALITE_FRAGMENTS = ITEMS.register("sodalite_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> AMETHYST_FRAGMENTS = ITEMS.register("amethyst_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> ROSE_QUARTZ_FRAGMENTS = ITEMS.register("rose_quartz_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));

    public static final RegistryObject<Item> MICA_FRAGMENTS = ITEMS.register("mica_fragments",
            () -> new Item(new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP)));


    public static Item.Properties defaultBuilder() {
        return new Item.Properties().tab(MarvelousMaterials.MAIDENS_ITEMS_GROUP);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
