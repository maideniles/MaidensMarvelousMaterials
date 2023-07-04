package com.maideniles.maidensmaterials.datagen.assets;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.maideniles.maidensmaterials.MarvelousMaterials.prefix;

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

        simpleItem(ModItems.JACARANDA_BLOSSOMS.get());

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

//BLOCKS//
        //LOGS//
        toBlock(ModBlocks.CRABAPPLE_LOG.get());
        toBlock(ModBlocks.POINCIANA_LOG.get());
        toBlock(ModBlocks.LABURNUM_LOG.get());
        toBlock(ModBlocks.JADE_LOG.get());
        toBlock(ModBlocks.PAULOWNIA_LOG.get());
        toBlock(ModBlocks.WISTERIA_LOG.get());
        toBlock(ModBlocks.JACARANDA_LOG.get());
        toBlock(ModBlocks.DOGWOOD_LOG.get());
        toBlock(ModBlocks.SILVERBELL_LOG.get());
        toBlock(ModBlocks.CEDAR_LOG.get());

        toBlock(ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        toBlock(ModBlocks.STRIPPED_POINCIANA_LOG.get());
        toBlock(ModBlocks.STRIPPED_LABURNUM_LOG.get());
        toBlock(ModBlocks.STRIPPED_JADE_LOG.get());
        toBlock(ModBlocks.STRIPPED_PAULOWNIA_LOG.get());
        toBlock(ModBlocks.STRIPPED_WISTERIA_LOG.get());
        toBlock(ModBlocks.STRIPPED_JACARANDA_LOG.get());
        toBlock(ModBlocks.STRIPPED_DOGWOOD_LOG.get());
        toBlock(ModBlocks.STRIPPED_SILVERBELL_LOG.get());
        toBlock(ModBlocks.STRIPPED_CEDAR_LOG.get());

        //WOODS//
        toBlock(ModBlocks.CRABAPPLE_WOOD.get());
        toBlock(ModBlocks.POINCIANA_WOOD.get());
        toBlock(ModBlocks.LABURNUM_WOOD.get());
        toBlock(ModBlocks.JADE_WOOD.get());
        toBlock(ModBlocks.PAULOWNIA_WOOD.get());
        toBlock(ModBlocks.WISTERIA_WOOD.get());
        toBlock(ModBlocks.JACARANDA_WOOD.get());
        toBlock(ModBlocks.DOGWOOD_WOOD.get());
        toBlock(ModBlocks.SILVERBELL_WOOD.get());
        toBlock(ModBlocks.CEDAR_WOOD.get());

        toBlock(ModBlocks.STRIPPED_CRABAPPLE_WOOD.get());
        toBlock(ModBlocks.STRIPPED_POINCIANA_WOOD.get());
        toBlock(ModBlocks.STRIPPED_LABURNUM_WOOD.get());
        toBlock(ModBlocks.STRIPPED_JADE_WOOD.get());
        toBlock(ModBlocks.STRIPPED_PAULOWNIA_WOOD.get());
        toBlock(ModBlocks.STRIPPED_WISTERIA_WOOD.get());
        toBlock(ModBlocks.STRIPPED_JACARANDA_WOOD.get());
        toBlock(ModBlocks.STRIPPED_DOGWOOD_WOOD.get());
        toBlock(ModBlocks.STRIPPED_SILVERBELL_WOOD.get());
        toBlock(ModBlocks.STRIPPED_CEDAR_WOOD.get());

        //LEAVES//
        toBlock(ModBlocks.CRABAPPLE_LEAVES.get());
        toBlock(ModBlocks.POINCIANA_LEAVES.get());
        toBlock(ModBlocks.LABURNUM_LEAVES.get());
        toBlock(ModBlocks.JADE_LEAVES.get());
        toBlock(ModBlocks.PAULOWNIA_LEAVES.get());
        toBlock(ModBlocks.WISTERIA_LEAVES.get());
        toBlock(ModBlocks.JACARANDA_LEAVES.get());
        toBlock(ModBlocks.DOGWOOD_LEAVES.get());
        toBlock(ModBlocks.SILVERBELL_LEAVES.get());
        toBlock(ModBlocks.CEDAR_LEAVES.get());

        //SAPLINGS//


        //VINES//


        //ESSENCES,OTHER//
        toBlock(ModBlocks.EARTHEN_ESSENCE_BLOCK.get());
        toBlock(ModBlocks.FLORAL_ESSENCE_BLOCK.get());
     //   toBlock(ModBlocks.WALK_FLOWERS.get());
        simpleItem(Item.byBlock(ModBlocks.VINE_TIE.get()));
     //   toBlock(ModBlocks.ORNAMENTAL_PATH.get());
     //   toBlock(ModBlocks.ORNAMENTAL_GRASS.get());

        toBlock(ModBlocks.CRABAPPLE_PLANKS.get());
        toBlock(ModBlocks.POINCIANA_PLANKS.get());
        toBlock(ModBlocks.LABURNUM_PLANKS.get());
        toBlock(ModBlocks.JADE_PLANKS.get());
        toBlock(ModBlocks.PAULOWNIA_PLANKS.get());
        toBlock(ModBlocks.WISTERIA_PLANKS.get());
        toBlock(ModBlocks.JACARANDA_PLANKS.get());
        toBlock(ModBlocks.DOGWOOD_PLANKS.get());
        toBlock(ModBlocks.SILVERBELL_PLANKS.get());
        toBlock(ModBlocks.CEDAR_PLANKS.get());

        toBlock(ModBlocks.CRABAPPLE_STAIRS.get());
        toBlock(ModBlocks.POINCIANA_STAIRS.get());
        toBlock(ModBlocks.LABURNUM_STAIRS.get());
        toBlock(ModBlocks.JADE_STAIRS.get());
        toBlock(ModBlocks.PAULOWNIA_STAIRS.get());
        toBlock(ModBlocks.WISTERIA_STAIRS.get());
        toBlock(ModBlocks.JACARANDA_STAIRS.get());
        toBlock(ModBlocks.DOGWOOD_STAIRS.get());
        toBlock(ModBlocks.SILVERBELL_STAIRS.get());
        toBlock(ModBlocks.CEDAR_STAIRS.get());

        toBlock(ModBlocks.CRABAPPLE_SLAB.get());
        toBlock(ModBlocks.POINCIANA_SLAB.get());
        toBlock(ModBlocks.LABURNUM_SLAB.get());
        toBlock(ModBlocks.JADE_SLAB.get());
        toBlock(ModBlocks.PAULOWNIA_SLAB.get());
        toBlock(ModBlocks.WISTERIA_SLAB.get());
        toBlock(ModBlocks.JACARANDA_SLAB.get());
        toBlock(ModBlocks.DOGWOOD_SLAB.get());
        toBlock(ModBlocks.SILVERBELL_SLAB.get());
        toBlock(ModBlocks.CEDAR_SLAB.get());

        woodenFence(ModBlocks.CRABAPPLE_FENCE.get(), "crabapple");
        woodenFence(ModBlocks.POINCIANA_FENCE.get(), "poinciana");
        woodenFence(ModBlocks.LABURNUM_FENCE.get(), "laburnum");
        woodenFence(ModBlocks.JADE_FENCE.get(), "jade");
        woodenFence(ModBlocks.PAULOWNIA_FENCE.get(), "paulownia");
        woodenFence(ModBlocks.WISTERIA_FENCE.get(), "wisteria");
        woodenFence(ModBlocks.JACARANDA_FENCE.get(), "jacaranda");
        woodenFence(ModBlocks.DOGWOOD_FENCE.get(), "dogwood");
        woodenFence(ModBlocks.SILVERBELL_FENCE.get(), "silverbell");
        woodenFence(ModBlocks.CEDAR_FENCE.get(), "cedar");

        toBlock(ModBlocks.CRABAPPLE_FENCE_GATE.get());
        toBlock(ModBlocks.POINCIANA_FENCE_GATE.get());
        toBlock(ModBlocks.LABURNUM_FENCE_GATE.get());
        toBlock(ModBlocks.JADE_FENCE_GATE.get());
        toBlock(ModBlocks.PAULOWNIA_FENCE_GATE.get());
        toBlock(ModBlocks.WISTERIA_FENCE_GATE.get());
        toBlock(ModBlocks.JACARANDA_FENCE_GATE.get());
        toBlock(ModBlocks.DOGWOOD_FENCE_GATE.get());
        toBlock(ModBlocks.SILVERBELL_FENCE_GATE.get());
        toBlock(ModBlocks.CEDAR_FENCE_GATE.get());

        toBlock(ModBlocks.CRABAPPLE_PRESSURE_PLATE.get());
        toBlock(ModBlocks.POINCIANA_PRESSURE_PLATE.get());
        toBlock(ModBlocks.LABURNUM_PRESSURE_PLATE.get());
        toBlock(ModBlocks.JADE_PRESSURE_PLATE.get());
        toBlock(ModBlocks.PAULOWNIA_PRESSURE_PLATE.get());
        toBlock(ModBlocks.WISTERIA_PRESSURE_PLATE.get());
        toBlock(ModBlocks.JACARANDA_PRESSURE_PLATE.get());
        toBlock(ModBlocks.DOGWOOD_PRESSURE_PLATE.get());
        toBlock(ModBlocks.SILVERBELL_PRESSURE_PLATE.get());
        toBlock(ModBlocks.CEDAR_PRESSURE_PLATE.get());

        toBlock(ModBlocks.CRABAPPLE_BUTTON.get());
        toBlock(ModBlocks.POINCIANA_BUTTON.get());
        toBlock(ModBlocks.LABURNUM_BUTTON.get());
        toBlock(ModBlocks.JADE_BUTTON.get());
        toBlock(ModBlocks.PAULOWNIA_BUTTON.get());
        toBlock(ModBlocks.WISTERIA_BUTTON.get());
        toBlock(ModBlocks.JACARANDA_BUTTON.get());
        toBlock(ModBlocks.DOGWOOD_BUTTON.get());
        toBlock(ModBlocks.SILVERBELL_BUTTON.get());
        toBlock(ModBlocks.CEDAR_BUTTON.get());

        simpleItem(Item.byBlock(ModBlocks.CRABAPPLE_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.POINCIANA_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.LABURNUM_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.JADE_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.PAULOWNIA_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.WISTERIA_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.JACARANDA_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.DOGWOOD_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.SILVERBELL_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.CEDAR_DOOR_1.get()));

        simpleItem(Item.byBlock(ModBlocks.CRABAPPLE_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.POINCIANA_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.LABURNUM_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.JADE_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.PAULOWNIA_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.WISTERIA_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.JACARANDA_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.DOGWOOD_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.SILVERBELL_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.CEDAR_DOOR_2.get()));

        simpleItem(Item.byBlock(ModBlocks.CRABAPPLE_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.POINCIANA_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.LABURNUM_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.JADE_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.PAULOWNIA_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.WISTERIA_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.JACARANDA_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.DOGWOOD_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.SILVERBELL_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.CEDAR_DOOR_3.get()));

        simpleItem(Item.byBlock(ModBlocks.CRABAPPLE_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.POINCIANA_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.LABURNUM_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.JADE_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.PAULOWNIA_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.WISTERIA_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.JACARANDA_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.DOGWOOD_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.SILVERBELL_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.CEDAR_DOOR_4.get()));

        simpleItem(Item.byBlock(ModBlocks.CRABAPPLE_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.POINCIANA_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.LABURNUM_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.JADE_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.PAULOWNIA_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.WISTERIA_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.JACARANDA_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.DOGWOOD_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.SILVERBELL_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.CEDAR_DOOR_5.get()));

        simpleItem(Item.byBlock(ModBlocks.CRABAPPLE_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.POINCIANA_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.LABURNUM_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.JADE_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.PAULOWNIA_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.WISTERIA_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.JACARANDA_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.DOGWOOD_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.SILVERBELL_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.CEDAR_DOOR_6.get()));



        //STAINED WOODS//
        //PLANKS//
        toBlock(ModBlocks.WHITEWASHED_PLANKS.get());
        toBlock(ModBlocks.RED_STAINED_PLANKS.get());
        toBlock(ModBlocks.ORANGE_STAINED_PLANKS.get());
        toBlock(ModBlocks.YELLOW_STAINED_PLANKS.get());
        toBlock(ModBlocks.LIME_STAINED_PLANKS.get());
        toBlock(ModBlocks.GREEN_STAINED_PLANKS.get());
        toBlock(ModBlocks.CYAN_STAINED_PLANKS.get());
        toBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
        toBlock(ModBlocks.BLUE_STAINED_PLANKS.get());
        toBlock(ModBlocks.PURPLE_STAINED_PLANKS.get());
        toBlock(ModBlocks.MAGENTA_STAINED_PLANKS.get());
        toBlock(ModBlocks.PINK_STAINED_PLANKS.get());
        toBlock(ModBlocks.WHITE_STAINED_PLANKS.get());
        toBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
        toBlock(ModBlocks.GRAY_STAINED_PLANKS.get());
        toBlock(ModBlocks.BLACK_STAINED_PLANKS.get());
        toBlock(ModBlocks.BROWN_STAINED_PLANKS.get());

        //STAIRS//
        toBlock(ModBlocks.WHITEWASHED_STAIRS.get());
        toBlock(ModBlocks.RED_STAINED_STAIRS.get());
        toBlock(ModBlocks.ORANGE_STAINED_STAIRS.get());
        toBlock(ModBlocks.YELLOW_STAINED_STAIRS.get());
        toBlock(ModBlocks.LIME_STAINED_STAIRS.get());
        toBlock(ModBlocks.GREEN_STAINED_STAIRS.get());
        toBlock(ModBlocks.CYAN_STAINED_STAIRS.get());
        toBlock(ModBlocks.LIGHT_BLUE_STAINED_STAIRS.get());
        toBlock(ModBlocks.BLUE_STAINED_STAIRS.get());
        toBlock(ModBlocks.PURPLE_STAINED_STAIRS.get());
        toBlock(ModBlocks.MAGENTA_STAINED_STAIRS.get());
        toBlock(ModBlocks.PINK_STAINED_STAIRS.get());
        toBlock(ModBlocks.WHITE_STAINED_STAIRS.get());
        toBlock(ModBlocks.LIGHT_GRAY_STAINED_STAIRS.get());
        toBlock(ModBlocks.GRAY_STAINED_STAIRS.get());
        toBlock(ModBlocks.BLACK_STAINED_STAIRS.get());
        toBlock(ModBlocks.BROWN_STAINED_STAIRS.get());
        //SLABS//
        toBlock(ModBlocks.WHITEWASHED_SLAB.get());
        toBlock(ModBlocks.RED_STAINED_SLAB.get());
        toBlock(ModBlocks.ORANGE_STAINED_SLAB.get());
        toBlock(ModBlocks.YELLOW_STAINED_SLAB.get());
        toBlock(ModBlocks.LIME_STAINED_SLAB.get());
        toBlock(ModBlocks.GREEN_STAINED_SLAB.get());
        toBlock(ModBlocks.CYAN_STAINED_SLAB.get());
        toBlock(ModBlocks.LIGHT_BLUE_STAINED_SLAB.get());
        toBlock(ModBlocks.BLUE_STAINED_SLAB.get());
        toBlock(ModBlocks.PURPLE_STAINED_SLAB.get());
        toBlock(ModBlocks.MAGENTA_STAINED_SLAB.get());
        toBlock(ModBlocks.PINK_STAINED_SLAB.get());
        toBlock(ModBlocks.WHITE_STAINED_SLAB.get());
        toBlock(ModBlocks.LIGHT_GRAY_STAINED_SLAB.get());
        toBlock(ModBlocks.GRAY_STAINED_SLAB.get());
        toBlock(ModBlocks.BLACK_STAINED_SLAB.get());
        toBlock(ModBlocks.BROWN_STAINED_SLAB.get());
        //FENCES//
        woodenFence(ModBlocks.WHITEWASHED_FENCE.get(), "whitewashed");
        woodenFence(ModBlocks.RED_STAINED_FENCE.get(), "red_stained");
        woodenFence(ModBlocks.ORANGE_STAINED_FENCE.get(), "orange_stained");
        woodenFence(ModBlocks.YELLOW_STAINED_FENCE.get(), "yellow_stained");
        woodenFence(ModBlocks.LIME_STAINED_FENCE.get(), "lime_stained");
        woodenFence(ModBlocks.GREEN_STAINED_FENCE.get(), "green_stained");
        woodenFence(ModBlocks.CYAN_STAINED_FENCE.get(), "cyan_stained");
        woodenFence(ModBlocks.LIGHT_BLUE_STAINED_FENCE.get(), "light_blue_stained");
        woodenFence(ModBlocks.BLUE_STAINED_FENCE.get(), "blue_stained");
        woodenFence(ModBlocks.PURPLE_STAINED_FENCE.get(), "purple_stained");
        woodenFence(ModBlocks.MAGENTA_STAINED_FENCE.get(), "magenta_stained");
        woodenFence(ModBlocks.PINK_STAINED_FENCE.get(), "pink_stained");
        woodenFence(ModBlocks.WHITE_STAINED_FENCE.get(), "white_stained");
        woodenFence(ModBlocks.LIGHT_GRAY_STAINED_FENCE.get(), "light_gray_stained");
        woodenFence(ModBlocks.GRAY_STAINED_FENCE.get(), "gray_stained");
        woodenFence(ModBlocks.BLACK_STAINED_FENCE.get(), "black_stained");
        woodenFence(ModBlocks.BROWN_STAINED_FENCE.get(), "brown_stained");
        //GATES//
        toBlock(ModBlocks.WHITEWASHED_FENCE_GATE.get());
        toBlock(ModBlocks.RED_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.ORANGE_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.YELLOW_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.LIME_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.GREEN_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.CYAN_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.LIGHT_BLUE_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.BLUE_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.PURPLE_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.MAGENTA_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.PINK_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.WHITE_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.LIGHT_GRAY_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.GRAY_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.BLACK_STAINED_FENCE_GATE.get());
        toBlock(ModBlocks.BROWN_STAINED_FENCE_GATE.get());
        //PRESSURE PLATES//
        toBlock(ModBlocks.WHITEWASHED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.RED_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.ORANGE_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.YELLOW_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.LIME_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.GREEN_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.CYAN_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.LIGHT_BLUE_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.BLUE_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.PURPLE_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.MAGENTA_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.PINK_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.WHITE_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.LIGHT_GRAY_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.GRAY_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.BLACK_STAINED_PRESSURE_PLATE.get());
        toBlock(ModBlocks.BROWN_STAINED_PRESSURE_PLATE.get());
        //BUTTONS//
        toBlock(ModBlocks.WHITEWASHED_BUTTON.get());
        toBlock(ModBlocks.RED_STAINED_BUTTON.get());
        toBlock(ModBlocks.ORANGE_STAINED_BUTTON.get());
        toBlock(ModBlocks.YELLOW_STAINED_BUTTON.get());
        toBlock(ModBlocks.LIME_STAINED_BUTTON.get());
        toBlock(ModBlocks.GREEN_STAINED_BUTTON.get());
        toBlock(ModBlocks.CYAN_STAINED_BUTTON.get());
        toBlock(ModBlocks.LIGHT_BLUE_STAINED_BUTTON.get());
        toBlock(ModBlocks.BLUE_STAINED_BUTTON.get());
        toBlock(ModBlocks.PURPLE_STAINED_BUTTON.get());
        toBlock(ModBlocks.MAGENTA_STAINED_BUTTON.get());
        toBlock(ModBlocks.PINK_STAINED_BUTTON.get());
        toBlock(ModBlocks.WHITE_STAINED_BUTTON.get());
        toBlock(ModBlocks.LIGHT_GRAY_STAINED_BUTTON.get());
        toBlock(ModBlocks.GRAY_STAINED_BUTTON.get());
        toBlock(ModBlocks.BLACK_STAINED_BUTTON.get());
        toBlock(ModBlocks.BROWN_STAINED_BUTTON.get());
        //DOORS//
        simpleItem(Item.byBlock(ModBlocks.RED_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.ORANGE_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.YELLOW_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.LIME_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.GREEN_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.CYAN_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_BLUE_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.BLUE_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.PURPLE_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.MAGENTA_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.PINK_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.WHITE_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_GRAY_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.GRAY_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.BLACK_STAINED_DOOR_1.get()));
        simpleItem(Item.byBlock(ModBlocks.BROWN_STAINED_DOOR_1.get()));

        simpleItem(Item.byBlock(ModBlocks.RED_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.ORANGE_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.YELLOW_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.LIME_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.GREEN_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.CYAN_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_BLUE_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.BLUE_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.PURPLE_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.MAGENTA_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.PINK_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.WHITE_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_GRAY_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.GRAY_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.BLACK_STAINED_DOOR_2.get()));
        simpleItem(Item.byBlock(ModBlocks.BROWN_STAINED_DOOR_2.get()));

        simpleItem(Item.byBlock(ModBlocks.RED_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.ORANGE_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.YELLOW_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.LIME_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.GREEN_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.CYAN_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_BLUE_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.BLUE_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.PURPLE_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.MAGENTA_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.PINK_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.WHITE_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_GRAY_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.GRAY_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.BLACK_STAINED_DOOR_3.get()));
        simpleItem(Item.byBlock(ModBlocks.BROWN_STAINED_DOOR_3.get()));

        simpleItem(Item.byBlock(ModBlocks.RED_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.ORANGE_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.YELLOW_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.LIME_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.GREEN_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.CYAN_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_BLUE_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.BLUE_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.PURPLE_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.MAGENTA_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.PINK_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.WHITE_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_GRAY_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.GRAY_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.BLACK_STAINED_DOOR_4.get()));
        simpleItem(Item.byBlock(ModBlocks.BROWN_STAINED_DOOR_4.get()));

        simpleItem(Item.byBlock(ModBlocks.RED_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.ORANGE_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.YELLOW_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.LIME_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.GREEN_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.CYAN_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_BLUE_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.BLUE_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.PURPLE_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.MAGENTA_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.PINK_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.WHITE_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_GRAY_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.GRAY_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.BLACK_STAINED_DOOR_5.get()));
        simpleItem(Item.byBlock(ModBlocks.BROWN_STAINED_DOOR_5.get()));

        simpleItem(Item.byBlock(ModBlocks.RED_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.ORANGE_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.YELLOW_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.LIME_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.GREEN_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.CYAN_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_BLUE_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.BLUE_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.PURPLE_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.MAGENTA_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.PINK_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.WHITE_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.LIGHT_GRAY_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.GRAY_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.BLACK_STAINED_DOOR_6.get()));
        simpleItem(Item.byBlock(ModBlocks.BROWN_STAINED_DOOR_6.get()));


        //COLORED CLAY//
        //BLOCKS//
        toBlock(ModBlocks.RED_CLAY_BLOCK.get());
        toBlock(ModBlocks.ORANGE_CLAY_BLOCK.get());
        toBlock(ModBlocks.YELLOW_CLAY_BLOCK.get());
        toBlock(ModBlocks.LIME_CLAY_BLOCK.get());
        toBlock(ModBlocks.GREEN_CLAY_BLOCK.get());
        toBlock(ModBlocks.CYAN_CLAY_BLOCK.get());
        toBlock(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get());
        toBlock(ModBlocks.BLUE_CLAY_BLOCK.get());
        toBlock(ModBlocks.PURPLE_CLAY_BLOCK.get());
        toBlock(ModBlocks.MAGENTA_CLAY_BLOCK.get());
        toBlock(ModBlocks.PINK_CLAY_BLOCK.get());
        toBlock(ModBlocks.WHITE_CLAY_BLOCK.get());
        toBlock(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get());
        toBlock(ModBlocks.GRAY_CLAY_BLOCK.get());
        toBlock(ModBlocks.BLACK_CLAY_BLOCK.get());
        toBlock(ModBlocks.BROWN_CLAY_BLOCK.get());
        //BRICKS-SMALL//
        toBlock(ModBlocks.RED_BRICK_BLOCK.get());
        toBlock(ModBlocks.ORANGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.YELLOW_BRICK_BLOCK.get());
        toBlock(ModBlocks.LIME_BRICK_BLOCK.get());
        toBlock(ModBlocks.GREEN_BRICK_BLOCK.get());
        toBlock(ModBlocks.CYAN_BRICK_BLOCK.get());
        toBlock(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get());
        toBlock(ModBlocks.BLUE_BRICK_BLOCK.get());
        toBlock(ModBlocks.PURPLE_BRICK_BLOCK.get());
        toBlock(ModBlocks.MAGENTA_BRICK_BLOCK.get());
        toBlock(ModBlocks.PINK_BRICK_BLOCK.get());
        toBlock(ModBlocks.WHITE_BRICK_BLOCK.get());
        toBlock(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get());
        toBlock(ModBlocks.GRAY_BRICK_BLOCK.get());
        toBlock(ModBlocks.BLACK_BRICK_BLOCK.get());
        toBlock(ModBlocks.BROWN_BRICK_BLOCK.get());
        //BRICKS-LARGE//
        toBlock(ModBlocks.RED_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.LIME_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.PINK_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get());
        toBlock(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get());
        //BLOCKS-STAIRS//
        toBlock(ModBlocks.RED_CLAY_STAIRS.get());
        toBlock(ModBlocks.ORANGE_CLAY_STAIRS.get());
        toBlock(ModBlocks.YELLOW_CLAY_STAIRS.get());
        toBlock(ModBlocks.LIME_CLAY_STAIRS.get());
        toBlock(ModBlocks.GREEN_CLAY_STAIRS.get());
        toBlock(ModBlocks.CYAN_CLAY_STAIRS.get());
        toBlock(ModBlocks.LIGHT_BLUE_CLAY_STAIRS.get());
        toBlock(ModBlocks.BLUE_CLAY_STAIRS.get());
        toBlock(ModBlocks.PURPLE_CLAY_STAIRS.get());
        toBlock(ModBlocks.MAGENTA_CLAY_STAIRS.get());
        toBlock(ModBlocks.PINK_CLAY_STAIRS.get());
        toBlock(ModBlocks.WHITE_CLAY_STAIRS.get());
        toBlock(ModBlocks.LIGHT_GRAY_CLAY_STAIRS.get());
        toBlock(ModBlocks.GRAY_CLAY_STAIRS.get());
        toBlock(ModBlocks.BLACK_CLAY_STAIRS.get());
        toBlock(ModBlocks.BROWN_CLAY_STAIRS.get());
        //BRICKS-SMALL-STAIRS//
        toBlock(ModBlocks.RED_BRICK_STAIRS.get());
        toBlock(ModBlocks.ORANGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.YELLOW_BRICK_STAIRS.get());
        toBlock(ModBlocks.LIME_BRICK_STAIRS.get());
        toBlock(ModBlocks.GREEN_BRICK_STAIRS.get());
        toBlock(ModBlocks.CYAN_BRICK_STAIRS.get());
        toBlock(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
        toBlock(ModBlocks.BLUE_BRICK_STAIRS.get());
        toBlock(ModBlocks.PURPLE_BRICK_STAIRS.get());
        toBlock(ModBlocks.MAGENTA_BRICK_STAIRS.get());
        toBlock(ModBlocks.PINK_BRICK_STAIRS.get());
        toBlock(ModBlocks.WHITE_BRICK_STAIRS.get());
        toBlock(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
        toBlock(ModBlocks.GRAY_BRICK_STAIRS.get());
        toBlock(ModBlocks.BLACK_BRICK_STAIRS.get());
        toBlock(ModBlocks.BROWN_BRICK_STAIRS.get());
        //BRICKS-LARGE-STAIRS//
        toBlock(ModBlocks.RED_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.ORANGE_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.YELLOW_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.LIME_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.GREEN_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.CYAN_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.LIGHT_BLUE_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.BLUE_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.PURPLE_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.MAGENTA_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.PINK_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.WHITE_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.LIGHT_GRAY_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.GRAY_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.BLACK_LARGE_BRICK_STAIRS.get());
        toBlock(ModBlocks.BROWN_LARGE_BRICK_STAIRS.get());
        //BLOCKS-SLABS//
        toBlock(ModBlocks.RED_CLAY_SLAB.get());
        toBlock(ModBlocks.ORANGE_CLAY_SLAB.get());
        toBlock(ModBlocks.YELLOW_CLAY_SLAB.get());
        toBlock(ModBlocks.LIME_CLAY_SLAB.get());
        toBlock(ModBlocks.GREEN_CLAY_SLAB.get());
        toBlock(ModBlocks.CYAN_CLAY_SLAB.get());
        toBlock(ModBlocks.LIGHT_BLUE_CLAY_SLAB.get());
        toBlock(ModBlocks.BLUE_CLAY_SLAB.get());
        toBlock(ModBlocks.PURPLE_CLAY_SLAB.get());
        toBlock(ModBlocks.MAGENTA_CLAY_SLAB.get());
        toBlock(ModBlocks.PINK_CLAY_SLAB.get());
        toBlock(ModBlocks.WHITE_CLAY_SLAB.get());
        toBlock(ModBlocks.LIGHT_GRAY_CLAY_SLAB.get());
        toBlock(ModBlocks.GRAY_CLAY_SLAB.get());
        toBlock(ModBlocks.BLACK_CLAY_SLAB.get());
        toBlock(ModBlocks.BROWN_CLAY_SLAB.get());
        //BRICKS-SMALL-SLABS//
        toBlock(ModBlocks.RED_BRICK_SLAB.get());
        toBlock(ModBlocks.ORANGE_BRICK_SLAB.get());
        toBlock(ModBlocks.YELLOW_BRICK_SLAB.get());
        toBlock(ModBlocks.LIME_BRICK_SLAB.get());
        toBlock(ModBlocks.GREEN_BRICK_SLAB.get());
        toBlock(ModBlocks.CYAN_BRICK_SLAB.get());
        toBlock(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get());
        toBlock(ModBlocks.BLUE_BRICK_SLAB.get());
        toBlock(ModBlocks.PURPLE_BRICK_SLAB.get());
        toBlock(ModBlocks.MAGENTA_BRICK_SLAB.get());
        toBlock(ModBlocks.PINK_BRICK_SLAB.get());
        toBlock(ModBlocks.WHITE_BRICK_SLAB.get());
        toBlock(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get());
        toBlock(ModBlocks.GRAY_BRICK_SLAB.get());
        toBlock(ModBlocks.BLACK_BRICK_SLAB.get());
        toBlock(ModBlocks.BROWN_BRICK_SLAB.get());
        //BRICKS-LARGE-SLABS//
        toBlock(ModBlocks.RED_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.ORANGE_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.YELLOW_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.LIME_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.GREEN_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.CYAN_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.LIGHT_BLUE_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.BLUE_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.PURPLE_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.MAGENTA_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.PINK_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.WHITE_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.LIGHT_GRAY_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.GRAY_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.BLACK_LARGE_BRICK_SLAB.get());
        toBlock(ModBlocks.BROWN_LARGE_BRICK_SLAB.get());

//ORES//
        toBlock(ModBlocks.JASPER_ORE.get());
        toBlock(ModBlocks.CARNELIAN_ORE.get());
        toBlock(ModBlocks.CITRINE_ORE.get());
        toBlock(ModBlocks.AVENTURINE_ORE.get());
        toBlock(ModBlocks.JADE_ORE.get());
        toBlock(ModBlocks.CHALCOPYRITE_ORE.get());
        toBlock(ModBlocks.LABRADORITE_ORE.get());
        toBlock(ModBlocks.MOONSTONE_ORE.get());
        toBlock(ModBlocks.SODALITE_ORE.get());
        toBlock(ModBlocks.AMETHYST_ORE.get());
        toBlock(ModBlocks.ROSE_QUARTZ_ORE.get());
        toBlock(ModBlocks.MICA_ORE.get());

//GEM BLOCKS//
        toBlock(ModBlocks.JASPER_BLOCK.get());
        toBlock(ModBlocks.CARNELIAN_BLOCK.get());
        toBlock(ModBlocks.CITRINE_BLOCK.get());
        toBlock(ModBlocks.AVENTURINE_BLOCK.get());
        toBlock(ModBlocks.JADE_BLOCK.get());
        toBlock(ModBlocks.CHALCOPYRITE_BLOCK.get());
        toBlock(ModBlocks.LABRADORITE_BLOCK.get());
        toBlock(ModBlocks.MOONSTONE_BLOCK.get());
        toBlock(ModBlocks.SODALITE_BLOCK.get());
        toBlock(ModBlocks.AMETHYST_BLOCK.get());
        toBlock(ModBlocks.ROSE_QUARTZ_BLOCK.get());
        toBlock(ModBlocks.MICA_BLOCK.get());

//GEM TILES//
        toBlock(ModBlocks.JASPER_1.get());
        toBlock(ModBlocks.CARNELIAN_1.get());
        toBlock(ModBlocks.CITRINE_1.get());
        toBlock(ModBlocks.AVENTURINE_1.get());
        toBlock(ModBlocks.JADE_1.get());
        toBlock(ModBlocks.CHALCOPYRITE_1.get());
        toBlock(ModBlocks.LABRADORITE_1.get());
        toBlock(ModBlocks.MOONSTONE_1.get());
        toBlock(ModBlocks.SODALITE_1.get());
        toBlock(ModBlocks.AMETHYST_1.get());
        toBlock(ModBlocks.ROSE_QUARTZ_1.get());
        toBlock(ModBlocks.MICA_1.get());

        toBlock(ModBlocks.JASPER_2.get());
        toBlock(ModBlocks.CARNELIAN_2.get());
        toBlock(ModBlocks.CITRINE_2.get());
        toBlock(ModBlocks.AVENTURINE_2.get());
        toBlock(ModBlocks.JADE_2.get());
        toBlock(ModBlocks.CHALCOPYRITE_2.get());
        toBlock(ModBlocks.LABRADORITE_2.get());
        toBlock(ModBlocks.MOONSTONE_2.get());
        toBlock(ModBlocks.SODALITE_2.get());
        toBlock(ModBlocks.AMETHYST_2.get());
        toBlock(ModBlocks.ROSE_QUARTZ_2.get());
        toBlock(ModBlocks.MICA_2.get());

        toBlock(ModBlocks.JASPER_3.get());
        toBlock(ModBlocks.CARNELIAN_3.get());
        toBlock(ModBlocks.CITRINE_3.get());
        toBlock(ModBlocks.AVENTURINE_3.get());
        toBlock(ModBlocks.JADE_3.get());
        toBlock(ModBlocks.CHALCOPYRITE_3.get());
        toBlock(ModBlocks.LABRADORITE_3.get());
        toBlock(ModBlocks.MOONSTONE_3.get());
        toBlock(ModBlocks.SODALITE_3.get());
        toBlock(ModBlocks.AMETHYST_3.get());
        toBlock(ModBlocks.ROSE_QUARTZ_3.get());
        toBlock(ModBlocks.MICA_3.get());

        toBlock(ModBlocks.JASPER_4.get());
        toBlock(ModBlocks.CARNELIAN_4.get());
        toBlock(ModBlocks.CITRINE_4.get());
        toBlock(ModBlocks.AVENTURINE_4.get());
        toBlock(ModBlocks.JADE_4.get());
        toBlock(ModBlocks.CHALCOPYRITE_4.get());
        toBlock(ModBlocks.LABRADORITE_4.get());
        toBlock(ModBlocks.MOONSTONE_4.get());
        toBlock(ModBlocks.SODALITE_4.get());
        toBlock(ModBlocks.AMETHYST_4.get());
        toBlock(ModBlocks.ROSE_QUARTZ_4.get());
        toBlock(ModBlocks.MICA_4.get());

        toBlock(ModBlocks.JASPER_5.get());
        toBlock(ModBlocks.CARNELIAN_5.get());
        toBlock(ModBlocks.CITRINE_5.get());
        toBlock(ModBlocks.AVENTURINE_5.get());
        toBlock(ModBlocks.JADE_5.get());
        toBlock(ModBlocks.CHALCOPYRITE_5.get());
        toBlock(ModBlocks.LABRADORITE_5.get());
        toBlock(ModBlocks.MOONSTONE_5.get());
        toBlock(ModBlocks.SODALITE_5.get());
        toBlock(ModBlocks.AMETHYST_5.get());
        toBlock(ModBlocks.ROSE_QUARTZ_5.get());
        toBlock(ModBlocks.MICA_5.get());

        toBlock(ModBlocks.JASPER_6.get());
        toBlock(ModBlocks.CARNELIAN_6.get());
        toBlock(ModBlocks.CITRINE_6.get());
        toBlock(ModBlocks.AVENTURINE_6.get());
        toBlock(ModBlocks.JADE_6.get());
        toBlock(ModBlocks.CHALCOPYRITE_6.get());
        toBlock(ModBlocks.LABRADORITE_6.get());
        toBlock(ModBlocks.MOONSTONE_6.get());
        toBlock(ModBlocks.SODALITE_6.get());
        toBlock(ModBlocks.AMETHYST_6.get());
        toBlock(ModBlocks.ROSE_QUARTZ_6.get());
        toBlock(ModBlocks.MICA_6.get());

//GEM TILES-SLABS//
        toBlock(ModBlocks.JASPER_1_SLAB.get());
        toBlock(ModBlocks.CARNELIAN_1_SLAB.get());
        toBlock(ModBlocks.CITRINE_1_SLAB.get());
        toBlock(ModBlocks.AVENTURINE_1_SLAB.get());
        toBlock(ModBlocks.JADE_1_SLAB.get());
        toBlock(ModBlocks.CHALCOPYRITE_1_SLAB.get());
        toBlock(ModBlocks.LABRADORITE_1_SLAB.get());
        toBlock(ModBlocks.MOONSTONE_1_SLAB.get());
        toBlock(ModBlocks.SODALITE_1_SLAB.get());
        toBlock(ModBlocks.AMETHYST_1_SLAB.get());
        toBlock(ModBlocks.ROSE_QUARTZ_1_SLAB.get());
        toBlock(ModBlocks.MICA_1_SLAB.get());

        toBlock(ModBlocks.JASPER_2_SLAB.get());
        toBlock(ModBlocks.CARNELIAN_2_SLAB.get());
        toBlock(ModBlocks.CITRINE_2_SLAB.get());
        toBlock(ModBlocks.AVENTURINE_2_SLAB.get());
        toBlock(ModBlocks.JADE_2_SLAB.get());
        toBlock(ModBlocks.CHALCOPYRITE_2_SLAB.get());
        toBlock(ModBlocks.LABRADORITE_2_SLAB.get());
        toBlock(ModBlocks.MOONSTONE_2_SLAB.get());
        toBlock(ModBlocks.SODALITE_2_SLAB.get());
        toBlock(ModBlocks.AMETHYST_2_SLAB.get());
        toBlock(ModBlocks.ROSE_QUARTZ_2_SLAB.get());
        toBlock(ModBlocks.MICA_2_SLAB.get());

        toBlock(ModBlocks.JASPER_3_SLAB.get());
        toBlock(ModBlocks.CARNELIAN_3_SLAB.get());
        toBlock(ModBlocks.CITRINE_3_SLAB.get());
        toBlock(ModBlocks.AVENTURINE_3_SLAB.get());
        toBlock(ModBlocks.JADE_3_SLAB.get());
        toBlock(ModBlocks.CHALCOPYRITE_3_SLAB.get());
        toBlock(ModBlocks.LABRADORITE_3_SLAB.get());
        toBlock(ModBlocks.MOONSTONE_3_SLAB.get());
        toBlock(ModBlocks.SODALITE_3_SLAB.get());
        toBlock(ModBlocks.AMETHYST_3_SLAB.get());
        toBlock(ModBlocks.ROSE_QUARTZ_3_SLAB.get());
        toBlock(ModBlocks.MICA_3_SLAB.get());

        toBlock(ModBlocks.JASPER_4_SLAB.get());
        toBlock(ModBlocks.CARNELIAN_4_SLAB.get());
        toBlock(ModBlocks.CITRINE_4_SLAB.get());
        toBlock(ModBlocks.AVENTURINE_4_SLAB.get());
        toBlock(ModBlocks.JADE_4_SLAB.get());
        toBlock(ModBlocks.CHALCOPYRITE_4_SLAB.get());
        toBlock(ModBlocks.LABRADORITE_4_SLAB.get());
        toBlock(ModBlocks.MOONSTONE_4_SLAB.get());
        toBlock(ModBlocks.SODALITE_4_SLAB.get());
        toBlock(ModBlocks.AMETHYST_4_SLAB.get());
        toBlock(ModBlocks.ROSE_QUARTZ_4_SLAB.get());
        toBlock(ModBlocks.MICA_4_SLAB.get());

        toBlock(ModBlocks.JASPER_5_SLAB.get());
        toBlock(ModBlocks.CARNELIAN_5_SLAB.get());
        toBlock(ModBlocks.CITRINE_5_SLAB.get());
        toBlock(ModBlocks.AVENTURINE_5_SLAB.get());
        toBlock(ModBlocks.JADE_5_SLAB.get());
        toBlock(ModBlocks.CHALCOPYRITE_5_SLAB.get());
        toBlock(ModBlocks.LABRADORITE_5_SLAB.get());
        toBlock(ModBlocks.MOONSTONE_5_SLAB.get());
        toBlock(ModBlocks.SODALITE_5_SLAB.get());
        toBlock(ModBlocks.AMETHYST_5_SLAB.get());
        toBlock(ModBlocks.ROSE_QUARTZ_5_SLAB.get());
        toBlock(ModBlocks.MICA_5_SLAB.get());

        toBlock(ModBlocks.JASPER_6_SLAB.get());
        toBlock(ModBlocks.CARNELIAN_6_SLAB.get());
        toBlock(ModBlocks.CITRINE_6_SLAB.get());
        toBlock(ModBlocks.AVENTURINE_6_SLAB.get());
        toBlock(ModBlocks.JADE_6_SLAB.get());
        toBlock(ModBlocks.CHALCOPYRITE_6_SLAB.get());
        toBlock(ModBlocks.LABRADORITE_6_SLAB.get());
        toBlock(ModBlocks.MOONSTONE_6_SLAB.get());
        toBlock(ModBlocks.SODALITE_6_SLAB.get());
        toBlock(ModBlocks.AMETHYST_6_SLAB.get());
        toBlock(ModBlocks.ROSE_QUARTZ_6_SLAB.get());
        toBlock(ModBlocks.MICA_6_SLAB.get());

//GEM TILES- STAIRS//
        toBlock(ModBlocks.JASPER_1_STAIRS.get());
        toBlock(ModBlocks.CARNELIAN_1_STAIRS.get());
        toBlock(ModBlocks.CITRINE_1_STAIRS.get());
        toBlock(ModBlocks.AVENTURINE_1_STAIRS.get());
        toBlock(ModBlocks.JADE_1_STAIRS.get());
        toBlock(ModBlocks.CHALCOPYRITE_1_STAIRS.get());
        toBlock(ModBlocks.LABRADORITE_1_STAIRS.get());
        toBlock(ModBlocks.MOONSTONE_1_STAIRS.get());
        toBlock(ModBlocks.SODALITE_1_STAIRS.get());
        toBlock(ModBlocks.AMETHYST_1_STAIRS.get());
        toBlock(ModBlocks.ROSE_QUARTZ_1_STAIRS.get());
        toBlock(ModBlocks.MICA_1_STAIRS.get());

        toBlock(ModBlocks.JASPER_2_STAIRS.get());
        toBlock(ModBlocks.CARNELIAN_2_STAIRS.get());
        toBlock(ModBlocks.CITRINE_2_STAIRS.get());
        toBlock(ModBlocks.AVENTURINE_2_STAIRS.get());
        toBlock(ModBlocks.JADE_2_STAIRS.get());
        toBlock(ModBlocks.CHALCOPYRITE_2_STAIRS.get());
        toBlock(ModBlocks.LABRADORITE_2_STAIRS.get());
        toBlock(ModBlocks.MOONSTONE_2_STAIRS.get());
        toBlock(ModBlocks.SODALITE_2_STAIRS.get());
        toBlock(ModBlocks.AMETHYST_2_STAIRS.get());
        toBlock(ModBlocks.ROSE_QUARTZ_2_STAIRS.get());
        toBlock(ModBlocks.MICA_2_STAIRS.get());

        toBlock(ModBlocks.JASPER_3_STAIRS.get());
        toBlock(ModBlocks.CARNELIAN_3_STAIRS.get());
        toBlock(ModBlocks.CITRINE_3_STAIRS.get());
        toBlock(ModBlocks.AVENTURINE_3_STAIRS.get());
        toBlock(ModBlocks.JADE_3_STAIRS.get());
        toBlock(ModBlocks.CHALCOPYRITE_3_STAIRS.get());
        toBlock(ModBlocks.LABRADORITE_3_STAIRS.get());
        toBlock(ModBlocks.MOONSTONE_3_STAIRS.get());
        toBlock(ModBlocks.SODALITE_3_STAIRS.get());
        toBlock(ModBlocks.AMETHYST_3_STAIRS.get());
        toBlock(ModBlocks.ROSE_QUARTZ_3_STAIRS.get());
        toBlock(ModBlocks.MICA_3_STAIRS.get());

        toBlock(ModBlocks.JASPER_4_STAIRS.get());
        toBlock(ModBlocks.CARNELIAN_4_STAIRS.get());
        toBlock(ModBlocks.CITRINE_4_STAIRS.get());
        toBlock(ModBlocks.AVENTURINE_4_STAIRS.get());
        toBlock(ModBlocks.JADE_4_STAIRS.get());
        toBlock(ModBlocks.CHALCOPYRITE_4_STAIRS.get());
        toBlock(ModBlocks.LABRADORITE_4_STAIRS.get());
        toBlock(ModBlocks.MOONSTONE_4_STAIRS.get());
        toBlock(ModBlocks.SODALITE_4_STAIRS.get());
        toBlock(ModBlocks.AMETHYST_4_STAIRS.get());
        toBlock(ModBlocks.ROSE_QUARTZ_4_STAIRS.get());
        toBlock(ModBlocks.MICA_4_STAIRS.get());

        toBlock(ModBlocks.JASPER_5_STAIRS.get());
        toBlock(ModBlocks.CARNELIAN_5_STAIRS.get());
        toBlock(ModBlocks.CITRINE_5_STAIRS.get());
        toBlock(ModBlocks.AVENTURINE_5_STAIRS.get());
        toBlock(ModBlocks.JADE_5_STAIRS.get());
        toBlock(ModBlocks.CHALCOPYRITE_5_STAIRS.get());
        toBlock(ModBlocks.LABRADORITE_5_STAIRS.get());
        toBlock(ModBlocks.MOONSTONE_5_STAIRS.get());
        toBlock(ModBlocks.SODALITE_5_STAIRS.get());
        toBlock(ModBlocks.AMETHYST_5_STAIRS.get());
        toBlock(ModBlocks.ROSE_QUARTZ_5_STAIRS.get());
        toBlock(ModBlocks.MICA_5_STAIRS.get());

        toBlock(ModBlocks.JASPER_6_STAIRS.get());
        toBlock(ModBlocks.CARNELIAN_6_STAIRS.get());
        toBlock(ModBlocks.CITRINE_6_STAIRS.get());
        toBlock(ModBlocks.AVENTURINE_6_STAIRS.get());
        toBlock(ModBlocks.JADE_6_STAIRS.get());
        toBlock(ModBlocks.CHALCOPYRITE_6_STAIRS.get());
        toBlock(ModBlocks.LABRADORITE_6_STAIRS.get());
        toBlock(ModBlocks.MOONSTONE_6_STAIRS.get());
        toBlock(ModBlocks.SODALITE_6_STAIRS.get());
        toBlock(ModBlocks.AMETHYST_6_STAIRS.get());
        toBlock(ModBlocks.ROSE_QUARTZ_6_STAIRS.get());
        toBlock(ModBlocks.MICA_6_STAIRS.get());

        //CHESTS//

        withExistingParent(ModBlocks.ACACIA_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/acacia_planks"));
        withExistingParent(ModBlocks.BIRCH_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/birch_planks"));
        withExistingParent(ModBlocks.OAK_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/oak_planks"));
        withExistingParent(ModBlocks.SPRUCE_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/spruce_planks"));
        withExistingParent(ModBlocks.DARK_OAK_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/dark_oak_planks"));
        withExistingParent(ModBlocks.JUNGLE_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/jungle_planks"));
        withExistingParent(ModBlocks.CRIMSON_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/crimson_planks"));
        withExistingParent(ModBlocks.WARPED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/warped_planks"));

        withExistingParent(ModBlocks.CRABAPPLE_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/crabapple_planks"));
        withExistingParent(ModBlocks.POINCIANA_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/poinciana_planks"));
        withExistingParent(ModBlocks.LABURNUM_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/laburnum_planks"));
        withExistingParent(ModBlocks.JADE_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/jade_planks"));
        withExistingParent(ModBlocks.PAULOWNIA_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/paulownia_door_1_top"));
        withExistingParent(ModBlocks.WISTERIA_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/wisteria_planks"));
        withExistingParent(ModBlocks.JACARANDA_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/jacaranda_planks"));
        withExistingParent(ModBlocks.DOGWOOD_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/dogwood_planks"));
        withExistingParent(ModBlocks.SILVERBELL_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/silverbell_planks"));
        withExistingParent(ModBlocks.CEDAR_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/cedar_planks"));

        withExistingParent(ModBlocks.RED_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/red_stained_planks"));
        withExistingParent(ModBlocks.ORANGE_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/orange_stained_planks"));
        withExistingParent(ModBlocks.YELLOW_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/laburnum_planks"));
        withExistingParent(ModBlocks.LIME_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/lime_stained_planks"));
        withExistingParent(ModBlocks.GREEN_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/green_stained_door_1_top"));
        withExistingParent(ModBlocks.CYAN_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/cyan_stained_planks"));
        withExistingParent(ModBlocks.LIGHT_BLUE_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/light_blue_stained_planks"));
        withExistingParent(ModBlocks.BLUE_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/blue_stained_planks"));
        withExistingParent(ModBlocks.PURPLE_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/purple_stained_planks"));
        withExistingParent(ModBlocks.MAGENTA_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/magenta_stained_planks"));
        withExistingParent(ModBlocks.PINK_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/pink_stained_planks"));
        withExistingParent(ModBlocks.WHITE_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/white_stained_planks"));
        withExistingParent(ModBlocks.LIGHT_GRAY_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/light_gray_stained_planks"));
        withExistingParent(ModBlocks.GRAY_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/gray_stained_planks"));
        withExistingParent(ModBlocks.BLACK_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/black_stained_door_1_top"));
        withExistingParent(ModBlocks.BROWN_STAINED_CHEST.getId().toString(), "item/chest").texture("particle", prefix("block/brown_stained_planks"));


//VASES//




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

    private void toBlock(Block b) {
        toBlockModel(b, b.getRegistryName().getPath());
    }

    private void toBlockModel(Block b, String model) {
        toBlockModel(b, prefix("block/" + model));
    }

    private void toBlockModel(Block b, ResourceLocation model) {
        withExistingParent(b.getRegistryName().getPath(), model);
    }

    private void woodenFence(Block fence, String variant) {
        getBuilder(fence.getRegistryName().getPath())
                .parent(getExistingFile(mcLoc("block/fence_inventory")))
                .texture("texture", "block/"+ variant +"_planks");
    }
}
