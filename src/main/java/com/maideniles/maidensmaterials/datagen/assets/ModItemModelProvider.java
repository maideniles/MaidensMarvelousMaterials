package com.maideniles.maidensmaterials.datagen.assets;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MarvelousMaterials.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

       // simpleItem(ModItems.MARVELOUS_MANUAL.get());

        //TOOLS//
        simpleItem(ModItems.MORTAR_AND_PESTLE.get());

        handheldItem(ModItems.PRUNING_SHEARS.get());

        //ESSENCES//
        simpleItem(ModItems.EARTHEN_ESSENCE.get());

        simpleItem(ModItems.FLORAL_ESSENCE.get());

        //HIDDEN--FOR BOOK PURPOSES//
      //  simpleItem(ModItems.EARTHEN_POTION_ITEM.get());

     //   simpleItem(ModItems.FLORAL_POTION_ITEM.get());

        //BLOSSOMS//
        simpleItem(ModItems.CRABAPPLE_BLOSSOMS.get());

        simpleItem(ModItems.POINCIANA_BLOSSOMS.get());

        simpleItem(ModItems.LABURNUM_BLOSSOMS.get());

        simpleItem(ModItems.JADE_BLOSSOMS.get());

        simpleItem(ModItems.PAULOWNIA_BLOSSOMS.get());

        simpleItem(ModItems.WISTERIA_BLOSSOMS.get());


        simpleItem(ModItems.DOGWOOD_BLOSSOMS.get());

        simpleItem(ModItems.SILVERBELL_BLOSSOMS.get());

//COLORED PIGMENTS//

        simpleItem(ModItems.RED_PIGMENT.get());

        simpleItem(ModItems.ORANGE_PIGMENT.get());

        simpleItem(ModItems.YELLOW_PIGMENT.get());
        simpleItem(ModItems.LIME_PIGMENT.get());

        simpleItem(ModItems.GREEN_PIGMENT.get());

        simpleItem(ModItems.CYAN_PIGMENT.get());

        simpleItem(ModItems.LIGHT_BLUE_PIGMENT.get());

        simpleItem(ModItems.BLUE_PIGMENT.get());

        simpleItem(ModItems.PURPLE_PIGMENT.get());

        simpleItem(ModItems.MAGENTA_PIGMENT.get());

        simpleItem(ModItems.PINK_PIGMENT.get());

        simpleItem(ModItems.WHITE_PIGMENT.get());

        simpleItem(ModItems.LIGHT_GRAY_PIGMENT.get());

        simpleItem(ModItems.GRAY_PIGMENT.get());

        simpleItem(ModItems.BLACK_PIGMENT.get());

        simpleItem(ModItems.BROWN_PIGMENT.get());

        //COLORED CLAY//
        simpleItem(ModItems.RED_CLAY.get());

        simpleItem(ModItems.ORANGE_CLAY.get());

        simpleItem(ModItems.YELLOW_CLAY.get());
        simpleItem(ModItems.LIME_CLAY.get());

        simpleItem(ModItems.GREEN_CLAY.get());

        simpleItem(ModItems.CYAN_CLAY.get());

        simpleItem(ModItems.LIGHT_BLUE_CLAY.get());

        simpleItem(ModItems.BLUE_CLAY.get());

        simpleItem(ModItems.PURPLE_CLAY.get());

        simpleItem(ModItems.MAGENTA_CLAY.get());

        simpleItem(ModItems.PINK_CLAY.get());

        simpleItem(ModItems.WHITE_CLAY.get());

        simpleItem(ModItems.LIGHT_GRAY_CLAY.get());

        simpleItem(ModItems.GRAY_CLAY.get());

        simpleItem(ModItems.BLACK_CLAY.get());

        simpleItem(ModItems.BROWN_CLAY.get());

        //COLORED CLAY BRICKS//
        simpleItem(ModItems.RED_BRICK.get());

        simpleItem(ModItems.ORANGE_BRICK.get());

        simpleItem(ModItems.YELLOW_BRICK.get());
        simpleItem(ModItems.LIME_BRICK.get());

        simpleItem(ModItems.GREEN_BRICK.get());

        simpleItem(ModItems.CYAN_BRICK.get());

        simpleItem(ModItems.LIGHT_BLUE_BRICK.get());

        simpleItem(ModItems.BLUE_BRICK.get());

        simpleItem(ModItems.PURPLE_BRICK.get());

        simpleItem(ModItems.MAGENTA_BRICK.get());

        simpleItem(ModItems.PINK_BRICK.get());

        simpleItem(ModItems.WHITE_BRICK.get());

        simpleItem(ModItems.LIGHT_GRAY_BRICK.get());

        simpleItem(ModItems.GRAY_BRICK.get());

        simpleItem(ModItems.BLACK_BRICK.get());

        simpleItem(ModItems.BROWN_BRICK.get());

        //COLORED CLAY MIX//
        simpleItem(ModItems.RED_CLAY_MIX.get());

        simpleItem(ModItems.ORANGE_CLAY_MIX.get());

        simpleItem(ModItems.YELLOW_CLAY_MIX.get());

        simpleItem(ModItems.LIME_CLAY_MIX.get());

        simpleItem(ModItems.GREEN_CLAY_MIX.get());

        simpleItem(ModItems.CYAN_CLAY_MIX.get());

        simpleItem(ModItems.LIGHT_BLUE_CLAY_MIX.get());

        simpleItem(ModItems.BLUE_CLAY_MIX.get());

        simpleItem(ModItems.PURPLE_CLAY_MIX.get());

        simpleItem(ModItems.MAGENTA_CLAY_MIX.get());

        simpleItem(ModItems.PINK_CLAY_MIX.get());

        simpleItem(ModItems.WHITE_CLAY_MIX.get());

        simpleItem(ModItems.LIGHT_GRAY_CLAY_MIX.get());

        simpleItem(ModItems.GRAY_CLAY_MIX.get());

        simpleItem(ModItems.BLACK_CLAY_MIX.get());

        simpleItem(ModItems.BROWN_CLAY_MIX.get());

        //COLORED CLAY VASES//
        simpleItem(ModItems.RED_CLAY_VASE.get());

        simpleItem(ModItems.ORANGE_CLAY_VASE.get());

        simpleItem(ModItems.YELLOW_CLAY_VASE.get());

        simpleItem(ModItems.LIME_CLAY_VASE.get());

        simpleItem(ModItems.GREEN_CLAY_VASE.get());

        simpleItem(ModItems.CYAN_CLAY_VASE.get());

        simpleItem(ModItems.LIGHT_BLUE_CLAY_VASE.get());

        simpleItem(ModItems.BLUE_CLAY_VASE.get());

        simpleItem(ModItems.PURPLE_CLAY_VASE.get());

        simpleItem(ModItems.MAGENTA_CLAY_VASE.get());

        simpleItem(ModItems.PINK_CLAY_VASE.get());

        simpleItem(ModItems.WHITE_CLAY_VASE.get());

        simpleItem(ModItems.LIGHT_GRAY_CLAY_VASE.get());

        simpleItem(ModItems.GRAY_CLAY_VASE.get());

        simpleItem(ModItems.BLACK_CLAY_VASE.get());

        simpleItem(ModItems.BROWN_CLAY_VASE.get());

//COLORED DYE BATHS//

        simpleItem(ModItems.RED_DYE_BATH.get());

        simpleItem(ModItems.ORANGE_DYE_BATH.get());

        simpleItem(ModItems.YELLOW_DYE_BATH.get());

        simpleItem(ModItems.LIME_DYE_BATH.get());

        simpleItem(ModItems.GREEN_DYE_BATH.get());

        simpleItem(ModItems.CYAN_DYE_BATH.get());

        simpleItem(ModItems.LIGHT_BLUE_DYE_BATH.get());

        simpleItem(ModItems.BLUE_DYE_BATH.get());

        simpleItem(ModItems.PURPLE_DYE_BATH.get());

        simpleItem(ModItems.MAGENTA_DYE_BATH.get());

        simpleItem(ModItems.PINK_DYE_BATH.get());

        simpleItem(ModItems.WHITE_DYE_BATH.get());

        simpleItem(ModItems.LIGHT_GRAY_DYE_BATH.get());

        simpleItem(ModItems.GRAY_DYE_BATH.get());

        simpleItem(ModItems.BLACK_DYE_BATH.get());

        simpleItem(ModItems.BROWN_DYE_BATH.get());

        //WHITEWASH//
        simpleItem(ModItems.WHITEWASH.get());

//COLORED STAINS//

        simpleItem(ModItems.RED_STAIN.get());

        simpleItem(ModItems.ORANGE_STAIN.get());

        simpleItem(ModItems.YELLOW_STAIN.get());

        simpleItem(ModItems.LIME_STAIN.get());

        simpleItem(ModItems.GREEN_STAIN.get());

        simpleItem(ModItems.CYAN_STAIN.get());

        simpleItem(ModItems.LIGHT_BLUE_STAIN.get());

        simpleItem(ModItems.BLUE_STAIN.get());

        simpleItem(ModItems.PURPLE_STAIN.get());

        simpleItem(ModItems.MAGENTA_STAIN.get());

        simpleItem(ModItems.PINK_STAIN.get());

        simpleItem(ModItems.WHITE_STAIN.get());

        simpleItem(ModItems.LIGHT_GRAY_STAIN.get());

        simpleItem(ModItems.GRAY_STAIN.get());

        simpleItem(ModItems.BLACK_STAIN.get());

        simpleItem(ModItems.BROWN_STAIN.get());

//DOOR BLUEPRINTS//

        simpleItem(ModItems.DOOR_PLANS_1.get());

        simpleItem(ModItems.DOOR_PLANS_2.get());

        simpleItem(ModItems.DOOR_PLANS_3.get());

        simpleItem(ModItems.DOOR_PLANS_4.get());

        simpleItem(ModItems.DOOR_PLANS_5.get());

        simpleItem(ModItems.DOOR_PLANS_6.get());

        //DARK IRON//
        simpleItem(ModItems.DARK_IRON_MIX.get());

        simpleItem(ModItems.DARK_IRON_INGOT.get());

        simpleItem(ModItems.DARK_IRON_INLAY.get());

//FRUITS//




        //GROUT//
        simpleItem(ModItems.GROUT.get());

        //MICA POWDER//
        simpleItem(ModItems.MICA_POWDER.get());

        //GEMSTONES//
        simpleItem(ModItems.JASPER_CHUNK.get());

        simpleItem(ModItems.CARNELIAN_CHUNK.get());

        simpleItem(ModItems.CITRINE_CHUNK.get());

        simpleItem(ModItems.AVENTURINE_CHUNK.get());

        simpleItem(ModItems.JADE_CHUNK.get());

        simpleItem(ModItems.CHALCOPYRITE_CHUNK.get());

        simpleItem(ModItems.LABRADORITE_CHUNK.get());

        simpleItem(ModItems.MOONSTONE_CHUNK.get());

        simpleItem(ModItems.SODALITE_CHUNK.get());

        simpleItem(ModItems.AMETHYST_CHUNK.get());

        simpleItem(ModItems.ROSE_QUARTZ_CHUNK.get());

        simpleItem(ModItems.MICA_CHUNK.get());


        //FRAGMENTS//
        simpleItem(ModItems.JASPER_FRAGMENTS.get());

        simpleItem(ModItems.CARNELIAN_FRAGMENTS.get());

        simpleItem(ModItems.CITRINE_FRAGMENTS.get());

        simpleItem(ModItems.AVENTURINE_FRAGMENTS.get());

        simpleItem(ModItems.JADE_FRAGMENTS.get());

        simpleItem(ModItems.CHALCOPYRITE_FRAGMENTS.get());

        simpleItem(ModItems.LABRADORITE_FRAGMENTS.get());

        simpleItem(ModItems.MOONSTONE_FRAGMENTS.get());

        simpleItem(ModItems.SODALITE_FRAGMENTS.get());

        simpleItem(ModItems.AMETHYST_FRAGMENTS.get());

        simpleItem(ModItems.ROSE_QUARTZ_FRAGMENTS.get());

        simpleItem(ModItems.MICA_FRAGMENTS.get());

    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MarvelousMaterials.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MarvelousMaterials.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }
}
