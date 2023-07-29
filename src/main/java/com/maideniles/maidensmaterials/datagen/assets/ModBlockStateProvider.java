package com.maideniles.maidensmaterials.datagen.assets;


import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.util.BlockModelHelpers;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MarvelousMaterials.MOD_ID, exFileHelper);
    }


    public void builtinEntity(Block b, String particle) {
        simpleBlock(b, models().getBuilder(name(b))
                .parent(new ModelFile.UncheckedModelFile("builtin/entity"))
                .texture("particle", particle));
    }

    public String name(Block block) {
        return BlockModelHelpers.key(block).getPath();
    }

    @Override
    protected void registerStatesAndModels() {



    //LOGS//
        axisBlock((RotatedPillarBlock) ModBlocks.CRABAPPLE_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_log"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.POINCIANA_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.LABURNUM_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.JADE_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.PAULOWNIA_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.WISTERIA_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.JACARANDA_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.DOGWOOD_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.SILVERBELL_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.CEDAR_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_top"));
//WOODS//
        axisBlock((RotatedPillarBlock) ModBlocks.CRABAPPLE_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_log"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.POINCIANA_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.LABURNUM_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.JADE_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.PAULOWNIA_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.WISTERIA_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.JACARANDA_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.DOGWOOD_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.SILVERBELL_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.CEDAR_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_log"));
//STRIPPED LOGS//
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CRABAPPLE_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_crabapple_log"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_crabapple_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_POINCIANA_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_poinciana_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_poinciana_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LABURNUM_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_laburnum_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_laburnum_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_JADE_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_jade_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_jade_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PAULOWNIA_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_paulownia_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_paulownia_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WISTERIA_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_wisteria_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_wisteria_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_JACARANDA_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_jacaranda_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_jacaranda_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_DOGWOOD_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_dogwood_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_dogwood_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_SILVERBELL_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_silverbell_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_silverbell_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CEDAR_LOG.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_cedar_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_cedar_top"));
//STRIPPED WOODS//
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CRABAPPLE_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_crabapple_log"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_crabapple_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_POINCIANA_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_poinciana_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_poinciana_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_LABURNUM_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_laburnum_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_laburnum_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_JADE_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_jade_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_jade_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_PAULOWNIA_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_paulownia_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_paulownia_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WISTERIA_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_wisteria_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_wisteria_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_JACARANDA_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_jacaranda_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_jacaranda_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_DOGWOOD_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_dogwood_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_dogwood_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_SILVERBELL_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_silverbell_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_silverbell_log"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_CEDAR_WOOD.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_cedar_log"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/stripped_cedar_log"));

    //LEAVES//
        simpleBlock(ModBlocks.CRABAPPLE_LEAVES.get());
        simpleBlock(ModBlocks.POINCIANA_LEAVES.get());
        simpleBlock(ModBlocks.LABURNUM_LEAVES.get());
        simpleBlock(ModBlocks.JADE_LEAVES.get());
        simpleBlock(ModBlocks.PAULOWNIA_LEAVES.get());
        simpleBlock(ModBlocks.WISTERIA_LEAVES.get());
        simpleBlock(ModBlocks.JACARANDA_LEAVES.get());
        simpleBlock(ModBlocks.DOGWOOD_LEAVES.get());
        simpleBlock(ModBlocks.SILVERBELL_LEAVES.get());
        simpleBlock(ModBlocks.CEDAR_LEAVES.get());
    //VINES//

        //ESSENCES//
        simpleBlock(ModBlocks.EARTHEN_ESSENCE_BLOCK.get());
        simpleBlock(ModBlocks.FLORAL_ESSENCE_BLOCK.get());

    //WOOD CRAFTABLES//
        simpleBlock(ModBlocks.WHITEWASHED_PLANKS.get());
        stairsBlock((StairBlock) ModBlocks.WHITEWASHED_STAIRS.get(),blockTexture(ModBlocks.WHITEWASHED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.WHITEWASHED_SLAB.get(), blockTexture(ModBlocks.WHITEWASHED_PLANKS.get()),blockTexture(ModBlocks.WHITEWASHED_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.WHITEWASHED_FENCE.get(),blockTexture(ModBlocks.WHITEWASHED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.WHITEWASHED_FENCE_GATE.get(),blockTexture(ModBlocks.WHITEWASHED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.WHITEWASHED_PRESSURE_PLATE.get(),blockTexture(ModBlocks.WHITEWASHED_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.WHITEWASHED_BUTTON.get(),blockTexture(ModBlocks.WHITEWASHED_PLANKS.get()));
        //PLANKS//
        simpleBlock(ModBlocks.CRABAPPLE_PLANKS.get());
        simpleBlock(ModBlocks.POINCIANA_PLANKS.get());
        simpleBlock(ModBlocks.LABURNUM_PLANKS.get());
        simpleBlock(ModBlocks.JADE_PLANKS.get());
        simpleBlock(ModBlocks.PAULOWNIA_PLANKS.get());
        simpleBlock(ModBlocks.WISTERIA_PLANKS.get());
        simpleBlock(ModBlocks.JACARANDA_PLANKS.get());
        simpleBlock(ModBlocks.DOGWOOD_PLANKS.get());
        simpleBlock(ModBlocks.SILVERBELL_PLANKS.get());
        simpleBlock(ModBlocks.CEDAR_PLANKS.get());
        //BOOKSHELVES//
        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.CRABAPPLE_STAIRS.get(),blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.POINCIANA_STAIRS.get(),blockTexture(ModBlocks.POINCIANA_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.LABURNUM_STAIRS.get(),blockTexture(ModBlocks.LABURNUM_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.JADE_STAIRS.get(),blockTexture(ModBlocks.JADE_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.PAULOWNIA_STAIRS.get(),blockTexture(ModBlocks.PAULOWNIA_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.WISTERIA_STAIRS.get(),blockTexture(ModBlocks.WISTERIA_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.JACARANDA_STAIRS.get(),blockTexture(ModBlocks.JACARANDA_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.DOGWOOD_STAIRS.get(),blockTexture(ModBlocks.DOGWOOD_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.SILVERBELL_STAIRS.get(),blockTexture(ModBlocks.SILVERBELL_PLANKS.get()));
        stairsBlock((StairBlock) ModBlocks.CEDAR_STAIRS.get(),blockTexture(ModBlocks.CEDAR_PLANKS.get()));


        //SLABS//
        slabBlock((SlabBlock) ModBlocks.CRABAPPLE_SLAB.get(),blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()),blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.POINCIANA_SLAB.get(),blockTexture(ModBlocks.POINCIANA_PLANKS.get()),blockTexture(ModBlocks.POINCIANA_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LABURNUM_SLAB.get(),blockTexture(ModBlocks.LABURNUM_PLANKS.get()),blockTexture(ModBlocks.LABURNUM_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.JADE_SLAB.get(),blockTexture(ModBlocks.JADE_PLANKS.get()),blockTexture(ModBlocks.JADE_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PAULOWNIA_SLAB.get(),blockTexture(ModBlocks.PAULOWNIA_PLANKS.get()),blockTexture(ModBlocks.PAULOWNIA_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.WISTERIA_SLAB.get(),blockTexture(ModBlocks.WISTERIA_PLANKS.get()),blockTexture(ModBlocks.WISTERIA_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.JACARANDA_SLAB.get(),blockTexture(ModBlocks.JACARANDA_PLANKS.get()),blockTexture(ModBlocks.JACARANDA_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.DOGWOOD_SLAB.get(),blockTexture(ModBlocks.DOGWOOD_PLANKS.get()),blockTexture(ModBlocks.DOGWOOD_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.SILVERBELL_SLAB.get(),blockTexture(ModBlocks.SILVERBELL_PLANKS.get()),blockTexture(ModBlocks.SILVERBELL_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.CEDAR_SLAB.get(),blockTexture(ModBlocks.CEDAR_PLANKS.get()),blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        //FENCES//
        fenceBlock((FenceBlock) ModBlocks.CRABAPPLE_FENCE.get(),blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.POINCIANA_FENCE.get(),blockTexture(ModBlocks.POINCIANA_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.LABURNUM_FENCE.get(),blockTexture(ModBlocks.LABURNUM_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.JADE_FENCE.get(),blockTexture(ModBlocks.JADE_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.PAULOWNIA_FENCE.get(),blockTexture(ModBlocks.PAULOWNIA_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.WISTERIA_FENCE.get(),blockTexture(ModBlocks.WISTERIA_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.JACARANDA_FENCE.get(),blockTexture(ModBlocks.JACARANDA_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.DOGWOOD_FENCE.get(),blockTexture(ModBlocks.DOGWOOD_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.SILVERBELL_FENCE.get(),blockTexture(ModBlocks.SILVERBELL_PLANKS.get()));
        fenceBlock((FenceBlock) ModBlocks.CEDAR_FENCE.get(),blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        //GATES//

        fenceGateBlock((FenceGateBlock) ModBlocks.CRABAPPLE_FENCE_GATE.get(),blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.POINCIANA_FENCE_GATE.get(),blockTexture(ModBlocks.POINCIANA_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.LABURNUM_FENCE_GATE.get(),blockTexture(ModBlocks.LABURNUM_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.JADE_FENCE_GATE.get(),blockTexture(ModBlocks.JADE_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.PAULOWNIA_FENCE_GATE.get(),blockTexture(ModBlocks.PAULOWNIA_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.WISTERIA_FENCE_GATE.get(),blockTexture(ModBlocks.WISTERIA_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.JACARANDA_FENCE_GATE.get(),blockTexture(ModBlocks.JACARANDA_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.DOGWOOD_FENCE_GATE.get(),blockTexture(ModBlocks.DOGWOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.SILVERBELL_FENCE_GATE.get(),blockTexture(ModBlocks.SILVERBELL_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.CEDAR_FENCE_GATE.get(),blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        //PRESSURE PLATES//

        pressurePlateBlock((PressurePlateBlock) ModBlocks.CRABAPPLE_PRESSURE_PLATE.get(),blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.POINCIANA_PRESSURE_PLATE.get(),blockTexture(ModBlocks.POINCIANA_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.LABURNUM_PRESSURE_PLATE.get(),blockTexture(ModBlocks.LABURNUM_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.JADE_PRESSURE_PLATE.get(),blockTexture(ModBlocks.JADE_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.PAULOWNIA_PRESSURE_PLATE.get(),blockTexture(ModBlocks.PAULOWNIA_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.WISTERIA_PRESSURE_PLATE.get(),blockTexture(ModBlocks.WISTERIA_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.JACARANDA_PRESSURE_PLATE.get(),blockTexture(ModBlocks.JACARANDA_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.DOGWOOD_PRESSURE_PLATE.get(),blockTexture(ModBlocks.DOGWOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.SILVERBELL_PRESSURE_PLATE.get(),blockTexture(ModBlocks.SILVERBELL_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.CEDAR_PRESSURE_PLATE.get(),blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        //BUTTONS//

        buttonBlock((ButtonBlock) ModBlocks.CRABAPPLE_BUTTON.get(),blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.POINCIANA_BUTTON.get(),blockTexture(ModBlocks.POINCIANA_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.LABURNUM_BUTTON.get(),blockTexture(ModBlocks.LABURNUM_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.JADE_BUTTON.get(),blockTexture(ModBlocks.JADE_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.PAULOWNIA_BUTTON.get(),blockTexture(ModBlocks.PAULOWNIA_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.WISTERIA_BUTTON.get(),blockTexture(ModBlocks.WISTERIA_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.JACARANDA_BUTTON.get(),blockTexture(ModBlocks.JACARANDA_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.DOGWOOD_BUTTON.get(),blockTexture(ModBlocks.DOGWOOD_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.SILVERBELL_BUTTON.get(),blockTexture(ModBlocks.SILVERBELL_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.CEDAR_BUTTON.get(),blockTexture(ModBlocks.CEDAR_PLANKS.get()));
        //DOORS//
        doorBlock((DoorBlock) ModBlocks.CRABAPPLE_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_1_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.POINCIANA_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.LABURNUM_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.JADE_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.PAULOWNIA_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.WISTERIA_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.JACARANDA_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.DOGWOOD_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.SILVERBELL_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.CEDAR_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_1_top"));

        doorBlock((DoorBlock) ModBlocks.CRABAPPLE_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_2_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.POINCIANA_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.LABURNUM_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.JADE_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.PAULOWNIA_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.WISTERIA_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.JACARANDA_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.DOGWOOD_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.SILVERBELL_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.CEDAR_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_2_top"));

        doorBlock((DoorBlock) ModBlocks.CRABAPPLE_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_3_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.POINCIANA_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.LABURNUM_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.JADE_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.PAULOWNIA_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.WISTERIA_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.JACARANDA_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.DOGWOOD_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.SILVERBELL_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.CEDAR_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_3_top"));

        doorBlock((DoorBlock) ModBlocks.CRABAPPLE_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_4_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.POINCIANA_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.LABURNUM_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.JADE_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.PAULOWNIA_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.WISTERIA_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.JACARANDA_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.DOGWOOD_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.SILVERBELL_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.CEDAR_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_4_top"));

        doorBlock((DoorBlock) ModBlocks.CRABAPPLE_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_5_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.POINCIANA_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.LABURNUM_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.JADE_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.PAULOWNIA_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.WISTERIA_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.JACARANDA_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.DOGWOOD_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.SILVERBELL_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.CEDAR_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_5_top"));

        doorBlock((DoorBlock) ModBlocks.CRABAPPLE_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_6_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crabapple_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.POINCIANA_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/poinciana_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.LABURNUM_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/laburnum_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.JADE_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jade_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.PAULOWNIA_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/paulownia_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.WISTERIA_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/wisteria_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.JACARANDA_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jacaranda_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.DOGWOOD_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dogwood_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.SILVERBELL_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/silverbell_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.CEDAR_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cedar_door_6_top"));


        doorBlock((DoorBlock) ModBlocks.ACACIA_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_1_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.BIRCH_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.OAK_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.SPRUCE_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.DARK_OAK_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.JUNGLE_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.CRIMSON_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.WARPED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/warped_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/warped_door_1_top"));


        doorBlock((DoorBlock) ModBlocks.ACACIA_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_2_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.BIRCH_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.OAK_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.SPRUCE_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.DARK_OAK_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.JUNGLE_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.CRIMSON_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.WARPED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/warped_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID, "block/warped_door_2_top"));

                doorBlock((DoorBlock) ModBlocks.ACACIA_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_3_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.BIRCH_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.OAK_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.SPRUCE_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.DARK_OAK_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.JUNGLE_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.CRIMSON_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.WARPED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/warped_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID, "block/warped_door_3_top"));

                doorBlock((DoorBlock) ModBlocks.ACACIA_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_4_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.BIRCH_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.OAK_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.SPRUCE_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.DARK_OAK_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.JUNGLE_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.CRIMSON_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.WARPED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/warped_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID, "block/warped_door_4_top"));

                doorBlock((DoorBlock) ModBlocks.ACACIA_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_5_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.BIRCH_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.OAK_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.SPRUCE_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.DARK_OAK_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.JUNGLE_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.CRIMSON_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.WARPED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/warped_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID, "block/warped_door_5_top"));

                doorBlock((DoorBlock) ModBlocks.ACACIA_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_6_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/acacia_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.BIRCH_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/birch_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.OAK_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/oak_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.SPRUCE_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/spruce_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.DARK_OAK_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/dark_oak_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.JUNGLE_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/jungle_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.CRIMSON_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/crimson_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.WARPED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/warped_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/warped_door_6_top"));


        //TRAPDOORS//
        trapdoorBlock((TrapDoorBlock) ModBlocks.CRABAPPLE_TRAPDOOR_1.get(),blockTexture(ModBlocks.CRABAPPLE_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.POINCIANA_TRAPDOOR_1.get(),blockTexture(ModBlocks.POINCIANA_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LABURNUM_TRAPDOOR_1.get(),blockTexture(ModBlocks.LABURNUM_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JADE_TRAPDOOR_1.get(),blockTexture(ModBlocks.JADE_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PAULOWNIA_TRAPDOOR_1.get(),blockTexture(ModBlocks.PAULOWNIA_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.WISTERIA_TRAPDOOR_1.get(),blockTexture(ModBlocks.WISTERIA_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JACARANDA_TRAPDOOR_1.get(),blockTexture(ModBlocks.JACARANDA_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.DOGWOOD_TRAPDOOR_1.get(),blockTexture(ModBlocks.DOGWOOD_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.SILVERBELL_TRAPDOOR_1.get(),blockTexture(ModBlocks.SILVERBELL_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CEDAR_TRAPDOOR_1.get(),blockTexture(ModBlocks.CEDAR_TRAPDOOR_1.get()), true);

        trapdoorBlock((TrapDoorBlock) ModBlocks.CRABAPPLE_TRAPDOOR_2.get(),blockTexture(ModBlocks.CRABAPPLE_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.POINCIANA_TRAPDOOR_2.get(),blockTexture(ModBlocks.POINCIANA_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LABURNUM_TRAPDOOR_2.get(),blockTexture(ModBlocks.LABURNUM_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JADE_TRAPDOOR_2.get(),blockTexture(ModBlocks.JADE_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PAULOWNIA_TRAPDOOR_2.get(),blockTexture(ModBlocks.PAULOWNIA_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.WISTERIA_TRAPDOOR_2.get(),blockTexture(ModBlocks.WISTERIA_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JACARANDA_TRAPDOOR_2.get(),blockTexture(ModBlocks.JACARANDA_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.DOGWOOD_TRAPDOOR_2.get(),blockTexture(ModBlocks.DOGWOOD_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.SILVERBELL_TRAPDOOR_2.get(),blockTexture(ModBlocks.SILVERBELL_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CEDAR_TRAPDOOR_2.get(),blockTexture(ModBlocks.CEDAR_TRAPDOOR_2.get()), true);

        trapdoorBlock((TrapDoorBlock) ModBlocks.CRABAPPLE_TRAPDOOR_3.get(),blockTexture(ModBlocks.CRABAPPLE_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.POINCIANA_TRAPDOOR_3.get(),blockTexture(ModBlocks.POINCIANA_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LABURNUM_TRAPDOOR_3.get(),blockTexture(ModBlocks.LABURNUM_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JADE_TRAPDOOR_3.get(),blockTexture(ModBlocks.JADE_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PAULOWNIA_TRAPDOOR_3.get(),blockTexture(ModBlocks.PAULOWNIA_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.WISTERIA_TRAPDOOR_3.get(),blockTexture(ModBlocks.WISTERIA_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JACARANDA_TRAPDOOR_3.get(),blockTexture(ModBlocks.JACARANDA_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.DOGWOOD_TRAPDOOR_3.get(),blockTexture(ModBlocks.DOGWOOD_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.SILVERBELL_TRAPDOOR_3.get(),blockTexture(ModBlocks.SILVERBELL_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CEDAR_TRAPDOOR_3.get(),blockTexture(ModBlocks.CEDAR_TRAPDOOR_3.get()), true);


        trapdoorBlock((TrapDoorBlock) ModBlocks.ACACIA_TRAPDOOR_1.get(),blockTexture(ModBlocks.ACACIA_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BIRCH_TRAPDOOR_1.get(),blockTexture(ModBlocks.BIRCH_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.OAK_TRAPDOOR_1.get(),blockTexture(ModBlocks.OAK_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.SPRUCE_TRAPDOOR_1.get(),blockTexture(ModBlocks.SPRUCE_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.DARK_OAK_TRAPDOOR_1.get(),blockTexture(ModBlocks.DARK_OAK_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JUNGLE_TRAPDOOR_1.get(),blockTexture(ModBlocks.JUNGLE_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CRIMSON_TRAPDOOR_1.get(),blockTexture(ModBlocks.CRIMSON_TRAPDOOR_1.get()), true);
          trapdoorBlock((TrapDoorBlock) ModBlocks.WARPED_TRAPDOOR_1.get(),blockTexture(ModBlocks.WARPED_TRAPDOOR_1.get()), true);


        trapdoorBlock((TrapDoorBlock) ModBlocks.ACACIA_TRAPDOOR_2.get(),blockTexture(ModBlocks.ACACIA_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BIRCH_TRAPDOOR_2.get(),blockTexture(ModBlocks.BIRCH_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.OAK_TRAPDOOR_2.get(),blockTexture(ModBlocks.OAK_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.SPRUCE_TRAPDOOR_2.get(),blockTexture(ModBlocks.SPRUCE_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.DARK_OAK_TRAPDOOR_2.get(),blockTexture(ModBlocks.DARK_OAK_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JUNGLE_TRAPDOOR_2.get(),blockTexture(ModBlocks.JUNGLE_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CRIMSON_TRAPDOOR_2.get(),blockTexture(ModBlocks.CRIMSON_TRAPDOOR_2.get()), true);
         trapdoorBlock((TrapDoorBlock) ModBlocks.WARPED_TRAPDOOR_2.get(),blockTexture(ModBlocks.WARPED_TRAPDOOR_2.get()), true);

        trapdoorBlock((TrapDoorBlock) ModBlocks.ACACIA_TRAPDOOR_3.get(),blockTexture(ModBlocks.ACACIA_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BIRCH_TRAPDOOR_3.get(),blockTexture(ModBlocks.BIRCH_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.OAK_TRAPDOOR_3.get(),blockTexture(ModBlocks.OAK_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.SPRUCE_TRAPDOOR_3.get(),blockTexture(ModBlocks.SPRUCE_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.DARK_OAK_TRAPDOOR_3.get(),blockTexture(ModBlocks.DARK_OAK_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.JUNGLE_TRAPDOOR_3.get(),blockTexture(ModBlocks.JUNGLE_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CRIMSON_TRAPDOOR_3.get(),blockTexture(ModBlocks.CRIMSON_TRAPDOOR_3.get()), true);
          trapdoorBlock((TrapDoorBlock) ModBlocks.WARPED_TRAPDOOR_3.get(),blockTexture(ModBlocks.WARPED_TRAPDOOR_3.get()), true);

        //CLAY BLOCKS//
        simpleBlock(ModBlocks.RED_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.ORANGE_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.YELLOW_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.LIME_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.GREEN_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.CYAN_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.BLUE_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.PURPLE_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.MAGENTA_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.PINK_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.WHITE_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.GRAY_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.BLACK_CLAY_BLOCK.get());
        simpleBlock(ModBlocks.BROWN_CLAY_BLOCK.get());

        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.RED_CLAY_STAIRS.get(), blockTexture(ModBlocks.RED_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_CLAY_STAIRS.get(), blockTexture(ModBlocks.ORANGE_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_CLAY_STAIRS.get(), blockTexture(ModBlocks.YELLOW_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_CLAY_STAIRS.get(), blockTexture(ModBlocks.LIME_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_CLAY_STAIRS.get(), blockTexture(ModBlocks.GREEN_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_CLAY_STAIRS.get(), blockTexture(ModBlocks.CYAN_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_CLAY_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_CLAY_STAIRS.get(), blockTexture(ModBlocks.BLUE_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_CLAY_STAIRS.get(), blockTexture(ModBlocks.PURPLE_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_CLAY_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_CLAY_STAIRS.get(), blockTexture(ModBlocks.PINK_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_CLAY_STAIRS.get(), blockTexture(ModBlocks.WHITE_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_CLAY_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_CLAY_STAIRS.get(), blockTexture(ModBlocks.GRAY_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_CLAY_STAIRS.get(), blockTexture(ModBlocks.BLACK_CLAY_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_CLAY_STAIRS.get(), blockTexture(ModBlocks.BROWN_CLAY_BLOCK.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.RED_CLAY_SLAB.get(), blockTexture(ModBlocks.RED_CLAY_BLOCK.get()), blockTexture(ModBlocks.RED_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_CLAY_SLAB.get(), blockTexture(ModBlocks.ORANGE_CLAY_BLOCK.get()), blockTexture(ModBlocks.ORANGE_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_CLAY_SLAB.get(), blockTexture(ModBlocks.YELLOW_CLAY_BLOCK.get()), blockTexture(ModBlocks.YELLOW_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_CLAY_SLAB.get(), blockTexture(ModBlocks.LIME_CLAY_BLOCK.get()), blockTexture(ModBlocks.LIME_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_CLAY_SLAB.get(), blockTexture(ModBlocks.GREEN_CLAY_BLOCK.get()), blockTexture(ModBlocks.GREEN_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_CLAY_SLAB.get(), blockTexture(ModBlocks.CYAN_CLAY_BLOCK.get()), blockTexture(ModBlocks.CYAN_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_CLAY_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get()), blockTexture(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_CLAY_SLAB.get(), blockTexture(ModBlocks.BLUE_CLAY_BLOCK.get()), blockTexture(ModBlocks.BLUE_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_CLAY_SLAB.get(), blockTexture(ModBlocks.PURPLE_CLAY_BLOCK.get()), blockTexture(ModBlocks.PURPLE_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_CLAY_SLAB.get(), blockTexture(ModBlocks.MAGENTA_CLAY_BLOCK.get()), blockTexture(ModBlocks.MAGENTA_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_CLAY_SLAB.get(), blockTexture(ModBlocks.PINK_CLAY_BLOCK.get()), blockTexture(ModBlocks.PINK_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_CLAY_SLAB.get(), blockTexture(ModBlocks.WHITE_CLAY_BLOCK.get()), blockTexture(ModBlocks.WHITE_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_CLAY_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get()), blockTexture(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_CLAY_SLAB.get(), blockTexture(ModBlocks.GRAY_CLAY_BLOCK.get()), blockTexture(ModBlocks.GRAY_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_CLAY_SLAB.get(), blockTexture(ModBlocks.BLACK_CLAY_BLOCK.get()), blockTexture(ModBlocks.BLACK_CLAY_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_CLAY_SLAB.get(), blockTexture(ModBlocks.BROWN_CLAY_BLOCK.get()), blockTexture(ModBlocks.BROWN_CLAY_BLOCK.get())); //BRICKS-SMALL//
        simpleBlock(ModBlocks.RED_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.ORANGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.YELLOW_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.LIME_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.GREEN_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.CYAN_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.BLUE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.PURPLE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.MAGENTA_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.PINK_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.WHITE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.GRAY_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.BLACK_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.BROWN_BRICK_BLOCK.get());

        stairsBlock((StairBlock) ModBlocks.RED_BRICK_STAIRS.get(), blockTexture(ModBlocks.RED_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_BRICK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIME_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_BRICK_STAIRS.get(), blockTexture(ModBlocks.GREEN_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_BRICK_STAIRS.get(), blockTexture(ModBlocks.CYAN_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLUE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_BRICK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WHITE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_BRICK_STAIRS.get(), blockTexture(ModBlocks.GRAY_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLACK_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_BRICK_STAIRS.get(), blockTexture(ModBlocks.BROWN_BRICK_BLOCK.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.RED_BRICK_SLAB.get(), blockTexture(ModBlocks.RED_BRICK_BLOCK.get()), blockTexture(ModBlocks.RED_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_BRICK_SLAB.get(), blockTexture(ModBlocks.ORANGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.ORANGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_BRICK_SLAB.get(), blockTexture(ModBlocks.YELLOW_BRICK_BLOCK.get()), blockTexture(ModBlocks.YELLOW_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_BRICK_SLAB.get(), blockTexture(ModBlocks.LIME_BRICK_BLOCK.get()), blockTexture(ModBlocks.LIME_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_BRICK_SLAB.get(), blockTexture(ModBlocks.GREEN_BRICK_BLOCK.get()), blockTexture(ModBlocks.GREEN_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_BRICK_SLAB.get(), blockTexture(ModBlocks.CYAN_BRICK_BLOCK.get()), blockTexture(ModBlocks.CYAN_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get()), blockTexture(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLUE_BRICK_BLOCK.get()), blockTexture(ModBlocks.BLUE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_BRICK_SLAB.get(), blockTexture(ModBlocks.PURPLE_BRICK_BLOCK.get()), blockTexture(ModBlocks.PURPLE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_BRICK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_BRICK_BLOCK.get()), blockTexture(ModBlocks.MAGENTA_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_BRICK_SLAB.get(), blockTexture(ModBlocks.PINK_BRICK_BLOCK.get()), blockTexture(ModBlocks.PINK_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_BRICK_SLAB.get(), blockTexture(ModBlocks.WHITE_BRICK_BLOCK.get()), blockTexture(ModBlocks.WHITE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get()), blockTexture(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_BRICK_SLAB.get(), blockTexture(ModBlocks.GRAY_BRICK_BLOCK.get()), blockTexture(ModBlocks.GRAY_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_BRICK_SLAB.get(), blockTexture(ModBlocks.BLACK_BRICK_BLOCK.get()), blockTexture(ModBlocks.BLACK_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_BRICK_SLAB.get(), blockTexture(ModBlocks.BROWN_BRICK_BLOCK.get()), blockTexture(ModBlocks.BROWN_BRICK_BLOCK.get())); //BRICKS-LARGE// //BRICKS-LARGE//
        simpleBlock(ModBlocks.RED_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.LIME_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.PINK_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get());
        simpleBlock(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get());

        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.RED_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.RED_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.ORANGE_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.YELLOW_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIME_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIME_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.GREEN_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.CYAN_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_BLUE_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BLUE_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.PURPLE_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.MAGENTA_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.PINK_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.PINK_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.WHITE_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.LIGHT_GRAY_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.GRAY_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BLACK_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.BROWN_LARGE_BRICK_STAIRS.get(), blockTexture(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.RED_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.RED_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.RED_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIME_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.LIME_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.PINK_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.PINK_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_LARGE_BRICK_SLAB.get(), blockTexture(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get()), blockTexture(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get()));//ORES//

        //ORES//
        simpleBlock(ModBlocks.JASPER_ORE.get());
        simpleBlock(ModBlocks.CARNELIAN_ORE.get());
        simpleBlock(ModBlocks.CITRINE_ORE.get());
        simpleBlock(ModBlocks.AVENTURINE_ORE.get());
        simpleBlock(ModBlocks.JADE_ORE.get());
        simpleBlock(ModBlocks.CHALCOPYRITE_ORE.get());
        simpleBlock(ModBlocks.LABRADORITE_ORE.get());
        simpleBlock(ModBlocks.MOONSTONE_ORE.get());
        simpleBlock(ModBlocks.SODALITE_ORE.get());
        simpleBlock(ModBlocks.AMETHYST_ORE.get());
        simpleBlock(ModBlocks.ROSE_QUARTZ_ORE.get());
        simpleBlock(ModBlocks.MICA_ORE.get());
//DEEPSLATE//
        simpleBlock(ModBlocks.DEEPSLATE_JASPER_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_CARNELIAN_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_CITRINE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_AVENTURINE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_JADE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_CHALCOPYRITE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_LABRADORITE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_SODALITE_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_AMETHYST_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.get());
        simpleBlock(ModBlocks.DEEPSLATE_MICA_ORE.get());
    //GEM BLOCKS//
        simpleBlock(ModBlocks.JASPER_BLOCK.get());
        simpleBlock(ModBlocks.CARNELIAN_BLOCK.get());
        simpleBlock(ModBlocks.CITRINE_BLOCK.get());
        simpleBlock(ModBlocks.AVENTURINE_BLOCK.get());
        simpleBlock(ModBlocks.JADE_BLOCK.get());
        simpleBlock(ModBlocks.CHALCOPYRITE_BLOCK.get());
        simpleBlock(ModBlocks.LABRADORITE_BLOCK.get());
        simpleBlock(ModBlocks.MOONSTONE_BLOCK.get());
        simpleBlock(ModBlocks.SODALITE_BLOCK.get());
        simpleBlock(ModBlocks.AMETHYST_BLOCK.get());
        simpleBlock(ModBlocks.ROSE_QUARTZ_BLOCK.get());
        simpleBlock(ModBlocks.MICA_BLOCK.get());

        //GEM TILES//
//TILE 1//
        simpleBlock(ModBlocks.JASPER_1.get());
        simpleBlock(ModBlocks.CARNELIAN_1.get());
        simpleBlock(ModBlocks.CITRINE_1.get());
        simpleBlock(ModBlocks.AVENTURINE_1.get());
        simpleBlock(ModBlocks.JADE_1.get());
        simpleBlock(ModBlocks.CHALCOPYRITE_1.get());
        simpleBlock(ModBlocks.LABRADORITE_1.get());
        simpleBlock(ModBlocks.MOONSTONE_1.get());
        simpleBlock(ModBlocks.SODALITE_1.get());
        simpleBlock(ModBlocks.AMETHYST_1.get());
        simpleBlock(ModBlocks.ROSE_QUARTZ_1.get());
        simpleBlock(ModBlocks.MICA_1.get());
        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.JASPER_1_STAIRS.get(),blockTexture(ModBlocks.JASPER_1.get()));
        stairsBlock((StairBlock) ModBlocks.CARNELIAN_1_STAIRS.get(),blockTexture(ModBlocks.CARNELIAN_1.get()));
        stairsBlock((StairBlock) ModBlocks.CITRINE_1_STAIRS.get(),blockTexture(ModBlocks.CITRINE_1.get()));
        stairsBlock((StairBlock) ModBlocks.AVENTURINE_1_STAIRS.get(),blockTexture(ModBlocks.AVENTURINE_1.get()));
        stairsBlock((StairBlock) ModBlocks.JADE_1_STAIRS.get(),blockTexture(ModBlocks.JADE_1.get()));
        stairsBlock((StairBlock) ModBlocks.CHALCOPYRITE_1_STAIRS.get(),blockTexture(ModBlocks.CHALCOPYRITE_1.get()));
        stairsBlock((StairBlock) ModBlocks.LABRADORITE_1_STAIRS.get(),blockTexture(ModBlocks.LABRADORITE_1.get()));
        stairsBlock((StairBlock) ModBlocks.MOONSTONE_1_STAIRS.get(),blockTexture(ModBlocks.MOONSTONE_1.get()));
        stairsBlock((StairBlock) ModBlocks.SODALITE_1_STAIRS.get(),blockTexture(ModBlocks.SODALITE_1.get()));
        stairsBlock((StairBlock) ModBlocks.AMETHYST_1_STAIRS.get(),blockTexture(ModBlocks.AMETHYST_1.get()));
        stairsBlock((StairBlock) ModBlocks.ROSE_QUARTZ_1_STAIRS.get(),blockTexture(ModBlocks.ROSE_QUARTZ_1.get()));
        stairsBlock((StairBlock) ModBlocks.MICA_1_STAIRS.get(),blockTexture(ModBlocks.MICA_1.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.JASPER_1_SLAB.get(),blockTexture(ModBlocks.JASPER_1.get()),blockTexture(ModBlocks.JASPER_1.get()));
        slabBlock((SlabBlock) ModBlocks.CARNELIAN_1_SLAB.get(),blockTexture(ModBlocks.CARNELIAN_1.get()),blockTexture(ModBlocks.CARNELIAN_1.get()));
        slabBlock((SlabBlock) ModBlocks.CITRINE_1_SLAB.get(),blockTexture(ModBlocks.CITRINE_1.get()),blockTexture(ModBlocks.CITRINE_1.get()));
        slabBlock((SlabBlock) ModBlocks.AVENTURINE_1_SLAB.get(),blockTexture(ModBlocks.AVENTURINE_1.get()),blockTexture(ModBlocks.AVENTURINE_1.get()));
        slabBlock((SlabBlock) ModBlocks.JADE_1_SLAB.get(),blockTexture(ModBlocks.JADE_1.get()),blockTexture(ModBlocks.JADE_1.get()));
        slabBlock((SlabBlock) ModBlocks.CHALCOPYRITE_1_SLAB.get(),blockTexture(ModBlocks.CHALCOPYRITE_1.get()),blockTexture(ModBlocks.CHALCOPYRITE_1.get()));
        slabBlock((SlabBlock) ModBlocks.LABRADORITE_1_SLAB.get(),blockTexture(ModBlocks.LABRADORITE_1.get()),blockTexture(ModBlocks.LABRADORITE_1.get()));
        slabBlock((SlabBlock) ModBlocks.MOONSTONE_1_SLAB.get(),blockTexture(ModBlocks.MOONSTONE_1.get()),blockTexture(ModBlocks.MOONSTONE_1.get()));
        slabBlock((SlabBlock) ModBlocks.SODALITE_1_SLAB.get(),blockTexture(ModBlocks.SODALITE_1.get()),blockTexture(ModBlocks.SODALITE_1.get()));
        slabBlock((SlabBlock) ModBlocks.AMETHYST_1_SLAB.get(),blockTexture(ModBlocks.AMETHYST_1.get()),blockTexture(ModBlocks.AMETHYST_1.get()));
        slabBlock((SlabBlock) ModBlocks.ROSE_QUARTZ_1_SLAB.get(),blockTexture(ModBlocks.ROSE_QUARTZ_1.get()),blockTexture(ModBlocks.ROSE_QUARTZ_1.get()));
        slabBlock((SlabBlock) ModBlocks.MICA_1_SLAB.get(),blockTexture(ModBlocks.MICA_1.get()),blockTexture(ModBlocks.MICA_1.get()));
        //TILE 2//
        simpleBlock(ModBlocks.JASPER_2.get());
        simpleBlock(ModBlocks.CARNELIAN_2.get());
        simpleBlock(ModBlocks.CITRINE_2.get());
        simpleBlock(ModBlocks.AVENTURINE_2.get());
        simpleBlock(ModBlocks.JADE_2.get());
        simpleBlock(ModBlocks.CHALCOPYRITE_2.get());
        simpleBlock(ModBlocks.LABRADORITE_2.get());
        simpleBlock(ModBlocks.MOONSTONE_2.get());
        simpleBlock(ModBlocks.SODALITE_2.get());
        simpleBlock(ModBlocks.AMETHYST_2.get());
        simpleBlock(ModBlocks.ROSE_QUARTZ_2.get());
        simpleBlock(ModBlocks.MICA_2.get());
        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.JASPER_2_STAIRS.get(),blockTexture(ModBlocks.JASPER_2.get()));
        stairsBlock((StairBlock) ModBlocks.CARNELIAN_2_STAIRS.get(),blockTexture(ModBlocks.CARNELIAN_2.get()));
        stairsBlock((StairBlock) ModBlocks.CITRINE_2_STAIRS.get(),blockTexture(ModBlocks.CITRINE_2.get()));
        stairsBlock((StairBlock) ModBlocks.AVENTURINE_2_STAIRS.get(),blockTexture(ModBlocks.AVENTURINE_2.get()));
        stairsBlock((StairBlock) ModBlocks.JADE_2_STAIRS.get(),blockTexture(ModBlocks.JADE_2.get()));
        stairsBlock((StairBlock) ModBlocks.CHALCOPYRITE_2_STAIRS.get(),blockTexture(ModBlocks.CHALCOPYRITE_2.get()));
        stairsBlock((StairBlock) ModBlocks.LABRADORITE_2_STAIRS.get(),blockTexture(ModBlocks.LABRADORITE_2.get()));
        stairsBlock((StairBlock) ModBlocks.MOONSTONE_2_STAIRS.get(),blockTexture(ModBlocks.MOONSTONE_2.get()));
        stairsBlock((StairBlock) ModBlocks.SODALITE_2_STAIRS.get(),blockTexture(ModBlocks.SODALITE_2.get()));
        stairsBlock((StairBlock) ModBlocks.AMETHYST_2_STAIRS.get(),blockTexture(ModBlocks.AMETHYST_2.get()));
        stairsBlock((StairBlock) ModBlocks.ROSE_QUARTZ_2_STAIRS.get(),blockTexture(ModBlocks.ROSE_QUARTZ_2.get()));
        stairsBlock((StairBlock) ModBlocks.MICA_2_STAIRS.get(),blockTexture(ModBlocks.MICA_2.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.JASPER_2_SLAB.get(),blockTexture(ModBlocks.JASPER_2.get()),blockTexture(ModBlocks.JASPER_2.get()));
        slabBlock((SlabBlock) ModBlocks.CARNELIAN_2_SLAB.get(),blockTexture(ModBlocks.CARNELIAN_2.get()),blockTexture(ModBlocks.CARNELIAN_2.get()));
        slabBlock((SlabBlock) ModBlocks.CITRINE_2_SLAB.get(),blockTexture(ModBlocks.CITRINE_2.get()),blockTexture(ModBlocks.CITRINE_2.get()));
        slabBlock((SlabBlock) ModBlocks.AVENTURINE_2_SLAB.get(),blockTexture(ModBlocks.AVENTURINE_2.get()),blockTexture(ModBlocks.AVENTURINE_2.get()));
        slabBlock((SlabBlock) ModBlocks.JADE_2_SLAB.get(),blockTexture(ModBlocks.JADE_2.get()),blockTexture(ModBlocks.JADE_2.get()));
        slabBlock((SlabBlock) ModBlocks.CHALCOPYRITE_2_SLAB.get(),blockTexture(ModBlocks.CHALCOPYRITE_2.get()),blockTexture(ModBlocks.CHALCOPYRITE_2.get()));
        slabBlock((SlabBlock) ModBlocks.LABRADORITE_2_SLAB.get(),blockTexture(ModBlocks.LABRADORITE_2.get()),blockTexture(ModBlocks.LABRADORITE_2.get()));
        slabBlock((SlabBlock) ModBlocks.MOONSTONE_2_SLAB.get(),blockTexture(ModBlocks.MOONSTONE_2.get()),blockTexture(ModBlocks.MOONSTONE_2.get()));
        slabBlock((SlabBlock) ModBlocks.SODALITE_2_SLAB.get(),blockTexture(ModBlocks.SODALITE_2.get()),blockTexture(ModBlocks.SODALITE_2.get()));
        slabBlock((SlabBlock) ModBlocks.AMETHYST_2_SLAB.get(),blockTexture(ModBlocks.AMETHYST_2.get()),blockTexture(ModBlocks.AMETHYST_2.get()));
        slabBlock((SlabBlock) ModBlocks.ROSE_QUARTZ_2_SLAB.get(),blockTexture(ModBlocks.ROSE_QUARTZ_2.get()),blockTexture(ModBlocks.ROSE_QUARTZ_2.get()));
        slabBlock((SlabBlock) ModBlocks.MICA_2_SLAB.get(),blockTexture(ModBlocks.MICA_2.get()),blockTexture(ModBlocks.MICA_2.get()));
        //TILE 3//
        simpleBlock(ModBlocks.JASPER_3.get());
        simpleBlock(ModBlocks.CARNELIAN_3.get());
        simpleBlock(ModBlocks.CITRINE_3.get());
        simpleBlock(ModBlocks.AVENTURINE_3.get());
        simpleBlock(ModBlocks.JADE_3.get());
        simpleBlock(ModBlocks.CHALCOPYRITE_3.get());
        simpleBlock(ModBlocks.LABRADORITE_3.get());
        simpleBlock(ModBlocks.MOONSTONE_3.get());
        simpleBlock(ModBlocks.SODALITE_3.get());
        simpleBlock(ModBlocks.AMETHYST_3.get());
        simpleBlock(ModBlocks.ROSE_QUARTZ_3.get());
        simpleBlock(ModBlocks.MICA_3.get());
        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.JASPER_3_STAIRS.get(),blockTexture(ModBlocks.JASPER_3.get()));
        stairsBlock((StairBlock) ModBlocks.CARNELIAN_3_STAIRS.get(),blockTexture(ModBlocks.CARNELIAN_3.get()));
        stairsBlock((StairBlock) ModBlocks.CITRINE_3_STAIRS.get(),blockTexture(ModBlocks.CITRINE_3.get()));
        stairsBlock((StairBlock) ModBlocks.AVENTURINE_3_STAIRS.get(),blockTexture(ModBlocks.AVENTURINE_3.get()));
        stairsBlock((StairBlock) ModBlocks.JADE_3_STAIRS.get(),blockTexture(ModBlocks.JADE_3.get()));
        stairsBlock((StairBlock) ModBlocks.CHALCOPYRITE_3_STAIRS.get(),blockTexture(ModBlocks.CHALCOPYRITE_3.get()));
        stairsBlock((StairBlock) ModBlocks.LABRADORITE_3_STAIRS.get(),blockTexture(ModBlocks.LABRADORITE_3.get()));
        stairsBlock((StairBlock) ModBlocks.MOONSTONE_3_STAIRS.get(),blockTexture(ModBlocks.MOONSTONE_3.get()));
        stairsBlock((StairBlock) ModBlocks.SODALITE_3_STAIRS.get(),blockTexture(ModBlocks.SODALITE_3.get()));
        stairsBlock((StairBlock) ModBlocks.AMETHYST_3_STAIRS.get(),blockTexture(ModBlocks.AMETHYST_3.get()));
        stairsBlock((StairBlock) ModBlocks.ROSE_QUARTZ_3_STAIRS.get(),blockTexture(ModBlocks.ROSE_QUARTZ_3.get()));
        stairsBlock((StairBlock) ModBlocks.MICA_3_STAIRS.get(),blockTexture(ModBlocks.MICA_3.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.JASPER_3_SLAB.get(),blockTexture(ModBlocks.JASPER_3.get()),blockTexture(ModBlocks.JASPER_3.get()));
        slabBlock((SlabBlock) ModBlocks.CARNELIAN_3_SLAB.get(),blockTexture(ModBlocks.CARNELIAN_3.get()),blockTexture(ModBlocks.CARNELIAN_3.get()));
        slabBlock((SlabBlock) ModBlocks.CITRINE_3_SLAB.get(),blockTexture(ModBlocks.CITRINE_3.get()),blockTexture(ModBlocks.CITRINE_3.get()));
        slabBlock((SlabBlock) ModBlocks.AVENTURINE_3_SLAB.get(),blockTexture(ModBlocks.AVENTURINE_3.get()),blockTexture(ModBlocks.AVENTURINE_3.get()));
        slabBlock((SlabBlock) ModBlocks.JADE_3_SLAB.get(),blockTexture(ModBlocks.JADE_3.get()),blockTexture(ModBlocks.JADE_3.get()));
        slabBlock((SlabBlock) ModBlocks.CHALCOPYRITE_3_SLAB.get(),blockTexture(ModBlocks.CHALCOPYRITE_3.get()),blockTexture(ModBlocks.CHALCOPYRITE_3.get()));
        slabBlock((SlabBlock) ModBlocks.LABRADORITE_3_SLAB.get(),blockTexture(ModBlocks.LABRADORITE_3.get()),blockTexture(ModBlocks.LABRADORITE_3.get()));
        slabBlock((SlabBlock) ModBlocks.MOONSTONE_3_SLAB.get(),blockTexture(ModBlocks.MOONSTONE_3.get()),blockTexture(ModBlocks.MOONSTONE_3.get()));
        slabBlock((SlabBlock) ModBlocks.SODALITE_3_SLAB.get(),blockTexture(ModBlocks.SODALITE_3.get()),blockTexture(ModBlocks.SODALITE_3.get()));
        slabBlock((SlabBlock) ModBlocks.AMETHYST_3_SLAB.get(),blockTexture(ModBlocks.AMETHYST_3.get()),blockTexture(ModBlocks.AMETHYST_3.get()));
        slabBlock((SlabBlock) ModBlocks.ROSE_QUARTZ_3_SLAB.get(),blockTexture(ModBlocks.ROSE_QUARTZ_3.get()),blockTexture(ModBlocks.ROSE_QUARTZ_3.get()));
        slabBlock((SlabBlock) ModBlocks.MICA_3_SLAB.get(),blockTexture(ModBlocks.MICA_3.get()),blockTexture(ModBlocks.MICA_3.get()));
//TILE 4//
        simpleBlock(ModBlocks.JASPER_4.get());
        simpleBlock(ModBlocks.CARNELIAN_4.get());
        simpleBlock(ModBlocks.CITRINE_4.get());
        simpleBlock(ModBlocks.AVENTURINE_4.get());
        simpleBlock(ModBlocks.JADE_4.get());
        simpleBlock(ModBlocks.CHALCOPYRITE_4.get());
        simpleBlock(ModBlocks.LABRADORITE_4.get());
        simpleBlock(ModBlocks.MOONSTONE_4.get());
        simpleBlock(ModBlocks.SODALITE_4.get());
        simpleBlock(ModBlocks.AMETHYST_4.get());
        simpleBlock(ModBlocks.ROSE_QUARTZ_4.get());
        simpleBlock(ModBlocks.MICA_4.get());
        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.JASPER_4_STAIRS.get(),blockTexture(ModBlocks.JASPER_4.get()));
        stairsBlock((StairBlock) ModBlocks.CARNELIAN_4_STAIRS.get(),blockTexture(ModBlocks.CARNELIAN_4.get()));
        stairsBlock((StairBlock) ModBlocks.CITRINE_4_STAIRS.get(),blockTexture(ModBlocks.CITRINE_4.get()));
        stairsBlock((StairBlock) ModBlocks.AVENTURINE_4_STAIRS.get(),blockTexture(ModBlocks.AVENTURINE_4.get()));
        stairsBlock((StairBlock) ModBlocks.JADE_4_STAIRS.get(),blockTexture(ModBlocks.JADE_4.get()));
        stairsBlock((StairBlock) ModBlocks.CHALCOPYRITE_4_STAIRS.get(),blockTexture(ModBlocks.CHALCOPYRITE_4.get()));
        stairsBlock((StairBlock) ModBlocks.LABRADORITE_4_STAIRS.get(),blockTexture(ModBlocks.LABRADORITE_4.get()));
        stairsBlock((StairBlock) ModBlocks.MOONSTONE_4_STAIRS.get(),blockTexture(ModBlocks.MOONSTONE_4.get()));
        stairsBlock((StairBlock) ModBlocks.SODALITE_4_STAIRS.get(),blockTexture(ModBlocks.SODALITE_4.get()));
        stairsBlock((StairBlock) ModBlocks.AMETHYST_4_STAIRS.get(),blockTexture(ModBlocks.AMETHYST_4.get()));
        stairsBlock((StairBlock) ModBlocks.ROSE_QUARTZ_4_STAIRS.get(),blockTexture(ModBlocks.ROSE_QUARTZ_4.get()));
        stairsBlock((StairBlock) ModBlocks.MICA_4_STAIRS.get(),blockTexture(ModBlocks.MICA_4.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.JASPER_4_SLAB.get(),blockTexture(ModBlocks.JASPER_4.get()),blockTexture(ModBlocks.JASPER_4.get()));
        slabBlock((SlabBlock) ModBlocks.CARNELIAN_4_SLAB.get(),blockTexture(ModBlocks.CARNELIAN_4.get()),blockTexture(ModBlocks.CARNELIAN_4.get()));
        slabBlock((SlabBlock) ModBlocks.CITRINE_4_SLAB.get(),blockTexture(ModBlocks.CITRINE_4.get()),blockTexture(ModBlocks.CITRINE_4.get()));
        slabBlock((SlabBlock) ModBlocks.AVENTURINE_4_SLAB.get(),blockTexture(ModBlocks.AVENTURINE_4.get()),blockTexture(ModBlocks.AVENTURINE_4.get()));
        slabBlock((SlabBlock) ModBlocks.JADE_4_SLAB.get(),blockTexture(ModBlocks.JADE_4.get()),blockTexture(ModBlocks.JADE_4.get()));
        slabBlock((SlabBlock) ModBlocks.CHALCOPYRITE_4_SLAB.get(),blockTexture(ModBlocks.CHALCOPYRITE_4.get()),blockTexture(ModBlocks.CHALCOPYRITE_4.get()));
        slabBlock((SlabBlock) ModBlocks.LABRADORITE_4_SLAB.get(),blockTexture(ModBlocks.LABRADORITE_4.get()),blockTexture(ModBlocks.LABRADORITE_4.get()));
        slabBlock((SlabBlock) ModBlocks.MOONSTONE_4_SLAB.get(),blockTexture(ModBlocks.MOONSTONE_4.get()),blockTexture(ModBlocks.MOONSTONE_4.get()));
        slabBlock((SlabBlock) ModBlocks.SODALITE_4_SLAB.get(),blockTexture(ModBlocks.SODALITE_4.get()),blockTexture(ModBlocks.SODALITE_4.get()));
        slabBlock((SlabBlock) ModBlocks.AMETHYST_4_SLAB.get(),blockTexture(ModBlocks.AMETHYST_4.get()),blockTexture(ModBlocks.AMETHYST_4.get()));
        slabBlock((SlabBlock) ModBlocks.ROSE_QUARTZ_4_SLAB.get(),blockTexture(ModBlocks.ROSE_QUARTZ_4.get()),blockTexture(ModBlocks.ROSE_QUARTZ_4.get()));
        slabBlock((SlabBlock) ModBlocks.MICA_4_SLAB.get(),blockTexture(ModBlocks.MICA_4.get()),blockTexture(ModBlocks.MICA_4.get()));
        //TILE 5//
        simpleBlock(ModBlocks.JASPER_5.get());
        simpleBlock(ModBlocks.CARNELIAN_5.get());
        simpleBlock(ModBlocks.CITRINE_5.get());
        simpleBlock(ModBlocks.AVENTURINE_5.get());
        simpleBlock(ModBlocks.JADE_5.get());
        simpleBlock(ModBlocks.CHALCOPYRITE_5.get());
        simpleBlock(ModBlocks.LABRADORITE_5.get());
        simpleBlock(ModBlocks.MOONSTONE_5.get());
        simpleBlock(ModBlocks.SODALITE_5.get());
        simpleBlock(ModBlocks.AMETHYST_5.get());
        simpleBlock(ModBlocks.ROSE_QUARTZ_5.get());
        simpleBlock(ModBlocks.MICA_5.get());
        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.JASPER_5_STAIRS.get(),blockTexture(ModBlocks.JASPER_5.get()));
        stairsBlock((StairBlock) ModBlocks.CARNELIAN_5_STAIRS.get(),blockTexture(ModBlocks.CARNELIAN_5.get()));
        stairsBlock((StairBlock) ModBlocks.CITRINE_5_STAIRS.get(),blockTexture(ModBlocks.CITRINE_5.get()));
        stairsBlock((StairBlock) ModBlocks.AVENTURINE_5_STAIRS.get(),blockTexture(ModBlocks.AVENTURINE_5.get()));
        stairsBlock((StairBlock) ModBlocks.JADE_5_STAIRS.get(),blockTexture(ModBlocks.JADE_5.get()));
        stairsBlock((StairBlock) ModBlocks.CHALCOPYRITE_5_STAIRS.get(),blockTexture(ModBlocks.CHALCOPYRITE_5.get()));
        stairsBlock((StairBlock) ModBlocks.LABRADORITE_5_STAIRS.get(),blockTexture(ModBlocks.LABRADORITE_5.get()));
        stairsBlock((StairBlock) ModBlocks.MOONSTONE_5_STAIRS.get(),blockTexture(ModBlocks.MOONSTONE_5.get()));
        stairsBlock((StairBlock) ModBlocks.SODALITE_5_STAIRS.get(),blockTexture(ModBlocks.SODALITE_5.get()));
        stairsBlock((StairBlock) ModBlocks.AMETHYST_5_STAIRS.get(),blockTexture(ModBlocks.AMETHYST_5.get()));
        stairsBlock((StairBlock) ModBlocks.ROSE_QUARTZ_5_STAIRS.get(),blockTexture(ModBlocks.ROSE_QUARTZ_5.get()));
        stairsBlock((StairBlock) ModBlocks.MICA_5_STAIRS.get(),blockTexture(ModBlocks.MICA_5.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.JASPER_5_SLAB.get(),blockTexture(ModBlocks.JASPER_5.get()),blockTexture(ModBlocks.JASPER_5.get()));
        slabBlock((SlabBlock) ModBlocks.CARNELIAN_5_SLAB.get(),blockTexture(ModBlocks.CARNELIAN_5.get()),blockTexture(ModBlocks.CARNELIAN_5.get()));
        slabBlock((SlabBlock) ModBlocks.CITRINE_5_SLAB.get(),blockTexture(ModBlocks.CITRINE_5.get()),blockTexture(ModBlocks.CITRINE_5.get()));
        slabBlock((SlabBlock) ModBlocks.AVENTURINE_5_SLAB.get(),blockTexture(ModBlocks.AVENTURINE_5.get()),blockTexture(ModBlocks.AVENTURINE_5.get()));
        slabBlock((SlabBlock) ModBlocks.JADE_5_SLAB.get(),blockTexture(ModBlocks.JADE_5.get()),blockTexture(ModBlocks.JADE_5.get()));
        slabBlock((SlabBlock) ModBlocks.CHALCOPYRITE_5_SLAB.get(),blockTexture(ModBlocks.CHALCOPYRITE_5.get()),blockTexture(ModBlocks.CHALCOPYRITE_5.get()));
        slabBlock((SlabBlock) ModBlocks.LABRADORITE_5_SLAB.get(),blockTexture(ModBlocks.LABRADORITE_5.get()),blockTexture(ModBlocks.LABRADORITE_5.get()));
        slabBlock((SlabBlock) ModBlocks.MOONSTONE_5_SLAB.get(),blockTexture(ModBlocks.MOONSTONE_5.get()),blockTexture(ModBlocks.MOONSTONE_5.get()));
        slabBlock((SlabBlock) ModBlocks.SODALITE_5_SLAB.get(),blockTexture(ModBlocks.SODALITE_5.get()),blockTexture(ModBlocks.SODALITE_5.get()));
        slabBlock((SlabBlock) ModBlocks.AMETHYST_5_SLAB.get(),blockTexture(ModBlocks.AMETHYST_5.get()),blockTexture(ModBlocks.AMETHYST_5.get()));
        slabBlock((SlabBlock) ModBlocks.ROSE_QUARTZ_5_SLAB.get(),blockTexture(ModBlocks.ROSE_QUARTZ_5.get()),blockTexture(ModBlocks.ROSE_QUARTZ_5.get()));
        slabBlock((SlabBlock) ModBlocks.MICA_5_SLAB.get(),blockTexture(ModBlocks.MICA_5.get()),blockTexture(ModBlocks.MICA_5.get()));
        //TILE 6//
        simpleBlock(ModBlocks.JASPER_6.get());
        simpleBlock(ModBlocks.CARNELIAN_6.get());
        simpleBlock(ModBlocks.CITRINE_6.get());
        simpleBlock(ModBlocks.AVENTURINE_6.get());
        simpleBlock(ModBlocks.JADE_6.get());
        simpleBlock(ModBlocks.CHALCOPYRITE_6.get());
        simpleBlock(ModBlocks.LABRADORITE_6.get());
        simpleBlock(ModBlocks.MOONSTONE_6.get());
        simpleBlock(ModBlocks.SODALITE_6.get());
        simpleBlock(ModBlocks.AMETHYST_6.get());
        simpleBlock(ModBlocks.ROSE_QUARTZ_6.get());
        simpleBlock(ModBlocks.MICA_6.get());
        //STAIRS//
        stairsBlock((StairBlock) ModBlocks.JASPER_6_STAIRS.get(),blockTexture(ModBlocks.JASPER_6.get()));
        stairsBlock((StairBlock) ModBlocks.CARNELIAN_6_STAIRS.get(),blockTexture(ModBlocks.CARNELIAN_6.get()));
        stairsBlock((StairBlock) ModBlocks.CITRINE_6_STAIRS.get(),blockTexture(ModBlocks.CITRINE_6.get()));
        stairsBlock((StairBlock) ModBlocks.AVENTURINE_6_STAIRS.get(),blockTexture(ModBlocks.AVENTURINE_6.get()));
        stairsBlock((StairBlock) ModBlocks.JADE_6_STAIRS.get(),blockTexture(ModBlocks.JADE_6.get()));
        stairsBlock((StairBlock) ModBlocks.CHALCOPYRITE_6_STAIRS.get(),blockTexture(ModBlocks.CHALCOPYRITE_6.get()));
        stairsBlock((StairBlock) ModBlocks.LABRADORITE_6_STAIRS.get(),blockTexture(ModBlocks.LABRADORITE_6.get()));
        stairsBlock((StairBlock) ModBlocks.MOONSTONE_6_STAIRS.get(),blockTexture(ModBlocks.MOONSTONE_6.get()));
        stairsBlock((StairBlock) ModBlocks.SODALITE_6_STAIRS.get(),blockTexture(ModBlocks.SODALITE_6.get()));
        stairsBlock((StairBlock) ModBlocks.AMETHYST_6_STAIRS.get(),blockTexture(ModBlocks.AMETHYST_6.get()));
        stairsBlock((StairBlock) ModBlocks.ROSE_QUARTZ_6_STAIRS.get(),blockTexture(ModBlocks.ROSE_QUARTZ_6.get()));
        stairsBlock((StairBlock) ModBlocks.MICA_6_STAIRS.get(),blockTexture(ModBlocks.MICA_6.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.JASPER_6_SLAB.get(),blockTexture(ModBlocks.JASPER_6.get()),blockTexture(ModBlocks.JASPER_6.get()));
        slabBlock((SlabBlock) ModBlocks.CARNELIAN_6_SLAB.get(),blockTexture(ModBlocks.CARNELIAN_6.get()),blockTexture(ModBlocks.CARNELIAN_6.get()));
        slabBlock((SlabBlock) ModBlocks.CITRINE_6_SLAB.get(),blockTexture(ModBlocks.CITRINE_6.get()),blockTexture(ModBlocks.CITRINE_6.get()));
        slabBlock((SlabBlock) ModBlocks.AVENTURINE_6_SLAB.get(),blockTexture(ModBlocks.AVENTURINE_6.get()),blockTexture(ModBlocks.AVENTURINE_6.get()));
        slabBlock((SlabBlock) ModBlocks.JADE_6_SLAB.get(),blockTexture(ModBlocks.JADE_6.get()),blockTexture(ModBlocks.JADE_6.get()));
        slabBlock((SlabBlock) ModBlocks.CHALCOPYRITE_6_SLAB.get(),blockTexture(ModBlocks.CHALCOPYRITE_6.get()),blockTexture(ModBlocks.CHALCOPYRITE_6.get()));
        slabBlock((SlabBlock) ModBlocks.LABRADORITE_6_SLAB.get(),blockTexture(ModBlocks.LABRADORITE_6.get()),blockTexture(ModBlocks.LABRADORITE_6.get()));
        slabBlock((SlabBlock) ModBlocks.MOONSTONE_6_SLAB.get(),blockTexture(ModBlocks.MOONSTONE_6.get()),blockTexture(ModBlocks.MOONSTONE_6.get()));
        slabBlock((SlabBlock) ModBlocks.SODALITE_6_SLAB.get(),blockTexture(ModBlocks.SODALITE_6.get()),blockTexture(ModBlocks.SODALITE_6.get()));
        slabBlock((SlabBlock) ModBlocks.AMETHYST_6_SLAB.get(),blockTexture(ModBlocks.AMETHYST_6.get()),blockTexture(ModBlocks.AMETHYST_6.get()));
        slabBlock((SlabBlock) ModBlocks.ROSE_QUARTZ_6_SLAB.get(),blockTexture(ModBlocks.ROSE_QUARTZ_6.get()),blockTexture(ModBlocks.ROSE_QUARTZ_6.get()));
        slabBlock((SlabBlock) ModBlocks.MICA_6_SLAB.get(),blockTexture(ModBlocks.MICA_6.get()),blockTexture(ModBlocks.MICA_6.get()));

        //STAINED CRAFTABLES//
        //PLANKS//
        simpleBlock(ModBlocks.RED_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.ORANGE_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.YELLOW_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.LIME_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.GREEN_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.CYAN_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.BLUE_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.PURPLE_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.MAGENTA_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.PINK_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.WHITE_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.GRAY_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.BLACK_STAINED_PLANKS.get());
        simpleBlock(ModBlocks.BROWN_STAINED_PLANKS.get());

        stairsBlock((StairBlock) (ModBlocks.RED_STAINED_STAIRS.get()), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.ORANGE_STAINED_STAIRS.get()), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.YELLOW_STAINED_STAIRS.get()), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.LIME_STAINED_STAIRS.get()), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.GREEN_STAINED_STAIRS.get()), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.CYAN_STAINED_STAIRS.get()), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.LIGHT_BLUE_STAINED_STAIRS.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.BLUE_STAINED_STAIRS.get()), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.PURPLE_STAINED_STAIRS.get()), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.MAGENTA_STAINED_STAIRS.get()), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.PINK_STAINED_STAIRS.get()), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.WHITE_STAINED_STAIRS.get()), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.LIGHT_GRAY_STAINED_STAIRS.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.GRAY_STAINED_STAIRS.get()), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.BLACK_STAINED_STAIRS.get()), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        stairsBlock((StairBlock) (ModBlocks.BROWN_STAINED_STAIRS.get()), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        //SLABS//
        slabBlock((SlabBlock) ModBlocks.RED_STAINED_SLAB.get(), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.ORANGE_STAINED_SLAB.get(), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.YELLOW_STAINED_SLAB.get(), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIME_STAINED_SLAB.get(), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.GREEN_STAINED_SLAB.get(), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.CYAN_STAINED_SLAB.get(), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_BLUE_STAINED_SLAB.get(), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLUE_STAINED_SLAB.get(), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PURPLE_STAINED_SLAB.get(), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.MAGENTA_STAINED_SLAB.get(), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.PINK_STAINED_SLAB.get(), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.WHITE_STAINED_SLAB.get(), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.LIGHT_GRAY_STAINED_SLAB.get(), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.GRAY_STAINED_SLAB.get(), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BLACK_STAINED_SLAB.get(), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.BROWN_STAINED_SLAB.get(), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        //FENCES//
        fenceBlock((FenceBlock) (ModBlocks.RED_STAINED_FENCE.get()), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.ORANGE_STAINED_FENCE.get()), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.YELLOW_STAINED_FENCE.get()), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.LIME_STAINED_FENCE.get()), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.GREEN_STAINED_FENCE.get()), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.CYAN_STAINED_FENCE.get()), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.LIGHT_BLUE_STAINED_FENCE.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.BLUE_STAINED_FENCE.get()), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.PURPLE_STAINED_FENCE.get()), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.MAGENTA_STAINED_FENCE.get()), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.PINK_STAINED_FENCE.get()), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.WHITE_STAINED_FENCE.get()), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.LIGHT_GRAY_STAINED_FENCE.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.GRAY_STAINED_FENCE.get()), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.BLACK_STAINED_FENCE.get()), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        fenceBlock((FenceBlock) (ModBlocks.BROWN_STAINED_FENCE.get()), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
//FENCE GATES//
        fenceGateBlock((FenceGateBlock) (ModBlocks.RED_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.ORANGE_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.YELLOW_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.LIME_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.GREEN_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.CYAN_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.LIGHT_BLUE_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.BLUE_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.PURPLE_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.MAGENTA_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.PINK_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.WHITE_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.LIGHT_GRAY_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.GRAY_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.BLACK_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) (ModBlocks.BROWN_STAINED_FENCE_GATE.get()), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
      //PRESSURE PLATES//
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.RED_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.ORANGE_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.YELLOW_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.LIME_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.GREEN_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.CYAN_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.LIGHT_BLUE_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.BLUE_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.PURPLE_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.MAGENTA_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.PINK_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.WHITE_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.LIGHT_GRAY_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.GRAY_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.BLACK_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) (ModBlocks.BROWN_STAINED_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        //BUTTONS//
        buttonBlock((ButtonBlock) (ModBlocks.RED_STAINED_BUTTON.get()), blockTexture(ModBlocks.RED_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.ORANGE_STAINED_BUTTON.get()), blockTexture(ModBlocks.ORANGE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.YELLOW_STAINED_BUTTON.get()), blockTexture(ModBlocks.YELLOW_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.LIME_STAINED_BUTTON.get()), blockTexture(ModBlocks.LIME_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.GREEN_STAINED_BUTTON.get()), blockTexture(ModBlocks.GREEN_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.CYAN_STAINED_BUTTON.get()), blockTexture(ModBlocks.CYAN_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.LIGHT_BLUE_STAINED_BUTTON.get()), blockTexture(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.BLUE_STAINED_BUTTON.get()), blockTexture(ModBlocks.BLUE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.PURPLE_STAINED_BUTTON.get()), blockTexture(ModBlocks.PURPLE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.MAGENTA_STAINED_BUTTON.get()), blockTexture(ModBlocks.MAGENTA_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.PINK_STAINED_BUTTON.get()), blockTexture(ModBlocks.PINK_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.WHITE_STAINED_BUTTON.get()), blockTexture(ModBlocks.WHITE_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.LIGHT_GRAY_STAINED_BUTTON.get()), blockTexture(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.GRAY_STAINED_BUTTON.get()), blockTexture(ModBlocks.GRAY_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.BLACK_STAINED_BUTTON.get()), blockTexture(ModBlocks.BLACK_STAINED_PLANKS.get()));
        buttonBlock((ButtonBlock) (ModBlocks.BROWN_STAINED_BUTTON.get()), blockTexture(ModBlocks.BROWN_STAINED_PLANKS.get()));
        //BOOKSHELVES//

        //DOORS//
        doorBlock((DoorBlock) ModBlocks.RED_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_1_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.ORANGE_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.YELLOW_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.LIME_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.GREEN_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.CYAN_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_BLUE_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.BLUE_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.PURPLE_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.MAGENTA_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.PINK_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_1_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.WHITE_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_GRAY_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.GRAY_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.BLACK_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_1_top"));
        doorBlock((DoorBlock) ModBlocks.BROWN_STAINED_DOOR_1.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_1_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_1_top"));

        doorBlock((DoorBlock) ModBlocks.RED_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_2_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.ORANGE_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.YELLOW_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.LIME_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.GREEN_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.CYAN_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_BLUE_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.BLUE_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.PURPLE_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.MAGENTA_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.PINK_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_2_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.WHITE_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_GRAY_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.GRAY_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.BLACK_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_2_top"));
        doorBlock((DoorBlock) ModBlocks.BROWN_STAINED_DOOR_2.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_2_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_2_top"));

        doorBlock((DoorBlock) ModBlocks.RED_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_3_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.ORANGE_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.YELLOW_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.LIME_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.GREEN_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.CYAN_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_BLUE_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.BLUE_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.PURPLE_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.MAGENTA_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.PINK_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_3_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.WHITE_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_GRAY_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.GRAY_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.BLACK_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_3_top"));
        doorBlock((DoorBlock) ModBlocks.BROWN_STAINED_DOOR_3.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_3_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_3_top"));

        doorBlock((DoorBlock) ModBlocks.RED_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_4_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.ORANGE_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.YELLOW_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.LIME_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.GREEN_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.CYAN_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_BLUE_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.BLUE_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.PURPLE_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.MAGENTA_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.PINK_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_4_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.WHITE_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_GRAY_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.GRAY_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.BLACK_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_4_top"));
        doorBlock((DoorBlock) ModBlocks.BROWN_STAINED_DOOR_4.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_4_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_4_top"));

        doorBlock((DoorBlock) ModBlocks.RED_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_5_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.ORANGE_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.YELLOW_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.LIME_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.GREEN_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.CYAN_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_BLUE_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.BLUE_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.PURPLE_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.MAGENTA_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.PINK_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_5_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.WHITE_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_GRAY_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.GRAY_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.BLACK_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_5_top"));
        doorBlock((DoorBlock) ModBlocks.BROWN_STAINED_DOOR_5.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_5_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_5_top"));

        doorBlock((DoorBlock) ModBlocks.RED_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_6_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/red_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.ORANGE_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/orange_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.YELLOW_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/yellow_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.LIME_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/lime_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.GREEN_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/green_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.CYAN_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/cyan_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_BLUE_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_blue_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.BLUE_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/blue_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.PURPLE_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/purple_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.MAGENTA_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/magenta_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.PINK_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_6_bottom"), new ResourceLocation(MarvelousMaterials.MOD_ID,"block/pink_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.WHITE_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/white_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.LIGHT_GRAY_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/light_gray_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.GRAY_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/gray_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.BLACK_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/black_stained_door_6_top"));
        doorBlock((DoorBlock) ModBlocks.BROWN_STAINED_DOOR_6.get(),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_6_bottom"),new ResourceLocation(MarvelousMaterials.MOD_ID,"block/brown_stained_door_6_top"));

        //TRAPDOORS//
        trapdoorBlock((TrapDoorBlock) ModBlocks.RED_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.RED_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.ORANGE_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.ORANGE_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.YELLOW_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.YELLOW_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIME_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.LIME_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.GREEN_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.GREEN_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CYAN_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.CYAN_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BLUE_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.BLUE_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PURPLE_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.PURPLE_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.MAGENTA_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.MAGENTA_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PINK_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.PINK_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.WHITE_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.WHITE_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.GRAY_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.GRAY_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BLACK_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.BLACK_STAINED_TRAPDOOR_1.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BROWN_STAINED_TRAPDOOR_1.get(),blockTexture(ModBlocks.BROWN_STAINED_TRAPDOOR_1.get()), true);

        trapdoorBlock((TrapDoorBlock) ModBlocks.RED_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.RED_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.ORANGE_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.ORANGE_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.YELLOW_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.YELLOW_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIME_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.LIME_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.GREEN_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.GREEN_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CYAN_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.CYAN_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BLUE_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.BLUE_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PURPLE_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.PURPLE_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.MAGENTA_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.MAGENTA_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PINK_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.PINK_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.WHITE_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.WHITE_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.GRAY_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.GRAY_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BLACK_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.BLACK_STAINED_TRAPDOOR_2.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BROWN_STAINED_TRAPDOOR_2.get(),blockTexture(ModBlocks.BROWN_STAINED_TRAPDOOR_2.get()), true);

        trapdoorBlock((TrapDoorBlock) ModBlocks.RED_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.RED_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.ORANGE_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.ORANGE_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.YELLOW_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.YELLOW_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIME_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.LIME_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.GREEN_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.GREEN_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CYAN_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.CYAN_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.LIGHT_BLUE_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BLUE_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.BLUE_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PURPLE_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.PURPLE_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.MAGENTA_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.MAGENTA_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.PINK_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.PINK_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.WHITE_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.WHITE_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.LIGHT_GRAY_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.GRAY_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.GRAY_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BLACK_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.BLACK_STAINED_TRAPDOOR_3.get()), true);
        trapdoorBlock((TrapDoorBlock) ModBlocks.BROWN_STAINED_TRAPDOOR_3.get(),blockTexture(ModBlocks.BROWN_STAINED_TRAPDOOR_3.get()), true);
//CHESTS//

        builtinEntity(ModBlocks.ACACIA_CHEST.get(),"block/acacia_planks");
        builtinEntity(ModBlocks.BIRCH_CHEST.get(),"block/birch_planks");
        builtinEntity(ModBlocks.OAK_CHEST.get(),"block/oak_planks");
        builtinEntity(ModBlocks.SPRUCE_CHEST.get(),"block/spruce_planks");
        builtinEntity(ModBlocks.DARK_OAK_CHEST.get(),"block/dark_oak_planks");
        builtinEntity(ModBlocks.JUNGLE_CHEST.get(),"block/jungle_planks");
        builtinEntity(ModBlocks.CRIMSON_CHEST.get(),"block/crimson_planks");
        builtinEntity(ModBlocks.WARPED_CHEST.get(),"block/warped_planks");

        builtinEntity(ModBlocks.CRABAPPLE_CHEST.get(),"maidensmaterials:block/crabapple_planks");
        builtinEntity(ModBlocks.POINCIANA_CHEST.get(),"maidensmaterials:block/poinciana_planks");
        builtinEntity(ModBlocks.LABURNUM_CHEST.get(),"maidensmaterials:block/laburnum_planks");
        builtinEntity(ModBlocks.JADE_CHEST.get(),"maidensmaterials:block/jade_planks");
        builtinEntity(ModBlocks.PAULOWNIA_CHEST.get(),"maidensmaterials:block/paulownia_planks");
        builtinEntity(ModBlocks.WISTERIA_CHEST.get(),"maidensmaterials:block/wisteria_planks");
        builtinEntity(ModBlocks.JACARANDA_CHEST.get(),"maidensmaterials:block/jacaranda_planks");
        builtinEntity(ModBlocks.DOGWOOD_CHEST.get(),"maidensmaterials:block/dogwood_planks");
        builtinEntity(ModBlocks.SILVERBELL_CHEST.get(),"maidensmaterials:block/silverbell_planks");
        builtinEntity(ModBlocks.CEDAR_CHEST.get(),"maidensmaterials:block/cedar_planks");

        builtinEntity(ModBlocks.RED_STAINED_CHEST.get(),"maidensmaterials:block/red_stained_planks");
        builtinEntity(ModBlocks.ORANGE_STAINED_CHEST.get(),"maidensmaterials:block/orange_stained_planks");
        builtinEntity(ModBlocks.YELLOW_STAINED_CHEST.get(),"maidensmaterials:block/laburnum_planks");
        builtinEntity(ModBlocks.LIME_STAINED_CHEST.get(),"maidensmaterials:block/lime_stained_planks");
        builtinEntity(ModBlocks.GREEN_STAINED_CHEST.get(),"maidensmaterials:block/green_stained_door_1_top");
        builtinEntity(ModBlocks.CYAN_STAINED_CHEST.get(),"maidensmaterials:block/cyan_stained_planks");
        builtinEntity(ModBlocks.LIGHT_BLUE_STAINED_CHEST.get(),"maidensmaterials:block/light_blue_stained_planks");
        builtinEntity(ModBlocks.BLUE_STAINED_CHEST.get(),"maidensmaterials:block/blue_stained_planks");
        builtinEntity(ModBlocks.PURPLE_STAINED_CHEST.get(),"maidensmaterials:block/purple_stained_planks");
        builtinEntity(ModBlocks.MAGENTA_STAINED_CHEST.get(),"maidensmaterials:block/magenta_stained_planks");
        builtinEntity(ModBlocks.PINK_STAINED_CHEST.get(),"maidensmaterials:block/pink_stained_planks");
        builtinEntity(ModBlocks.WHITE_STAINED_CHEST.get(),"maidensmaterials:block/white_stained_planks");
        builtinEntity(ModBlocks.LIGHT_GRAY_STAINED_CHEST.get(),"maidensmaterials:block/light_gray_stained_planks");
        builtinEntity(ModBlocks.GRAY_STAINED_CHEST.get(),"maidensmaterials:block/gray_stained_planks");
        builtinEntity(ModBlocks.BLACK_STAINED_CHEST.get(),"maidensmaterials:block/black_stained_door_1_top");
        builtinEntity(ModBlocks.BROWN_STAINED_CHEST.get(),"maidensmaterials:block/brown_stained_planks");

    }




}