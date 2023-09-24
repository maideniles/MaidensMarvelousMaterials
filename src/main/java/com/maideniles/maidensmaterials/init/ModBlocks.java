package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.blocks.*;
import com.maideniles.maidensmaterials.blocks.chest.ModChestBlock;
import com.maideniles.maidensmaterials.blocks.tree.FairyGlowCupBlock;
import com.maideniles.maidensmaterials.blocks.tree.MaidenSaplingBlock;
import com.maideniles.maidensmaterials.blocks.tree.MaidensLeafBlock;
import com.maideniles.maidensmaterials.blocks.tree.vine.CrabappleVineBlock;
import com.maideniles.maidensmaterials.blocks.tree.vine.PoincianaVineBlock;
import com.maideniles.maidensmaterials.blocks.vase.VaseBlock;
import com.maideniles.maidensmaterials.world.gen.feature.tree.grower.*;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MarvelousMaterials.MOD_ID);

   // public static final WoodType CRABAPPLE = WoodType.create(MarvelousMaterials.prefix("crabapple").toString());



    public static final RegistryObject<Block> CRABAPPLE_LOG = registerBlock("crabapple_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_LOG = registerBlock("poinciana_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_LOG = registerBlock("laburnum_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_LOG = registerBlock("jade_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_LOG = registerBlock("paulownia_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_LOG = registerBlock("wisteria_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_LOG = registerBlock("jacaranda_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_LOG = registerBlock("dogwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_LOG = registerBlock("silverbell_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_LOG = registerBlock("cedar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_CRABAPPLE_LOG = registerBlock("stripped_crabapple_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_POINCIANA_LOG = registerBlock("stripped_poinciana_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_LABURNUM_LOG = registerBlock("stripped_laburnum_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_JADE_LOG = registerBlock("stripped_jade_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_PAULOWNIA_LOG = registerBlock("stripped_paulownia_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_WISTERIA_LOG = registerBlock("stripped_wisteria_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_JACARANDA_LOG = registerBlock("stripped_jacaranda_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_DOGWOOD_LOG = registerBlock("stripped_dogwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_SILVERBELL_LOG = registerBlock("stripped_silverbell_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //WOODS//

    public static final RegistryObject<Block> CRABAPPLE_WOOD = registerBlock("crabapple_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_WOOD = registerBlock("poinciana_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_WOOD = registerBlock("laburnum_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_WOOD = registerBlock("jade_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_WOOD = registerBlock("paulownia_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_WOOD = registerBlock("wisteria_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_WOOD = registerBlock("jacaranda_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_WOOD = registerBlock("dogwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_WOOD = registerBlock("silverbell_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_WOOD = registerBlock("cedar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> STRIPPED_CRABAPPLE_WOOD = registerBlock("stripped_crabapple_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_POINCIANA_WOOD = registerBlock("stripped_poinciana_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_LABURNUM_WOOD = registerBlock("stripped_laburnum_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_JADE_WOOD = registerBlock("stripped_jade_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_PAULOWNIA_WOOD = registerBlock("stripped_paulownia_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD = registerBlock("stripped_wisteria_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_JACARANDA_WOOD = registerBlock("stripped_jacaranda_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_DOGWOOD_WOOD = registerBlock("stripped_dogwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_SILVERBELL_WOOD = registerBlock("stripped_silverbell_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.0F).randomTicks().sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);




    //FOREST SAPLINGS//
    public static final RegistryObject<Block> CRABAPPLE_SAPLING = registerBlock("crabapple_sapling",
            () -> new MaidenSaplingBlock(new CrabappleTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_SAPLING = registerBlock("poinciana_sapling",
            () -> new MaidenSaplingBlock(new PoincianaTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_SAPLING = registerBlock("laburnum_sapling",
            () -> new MaidenSaplingBlock(new LaburnumTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_SAPLING = registerBlock("jade_sapling",
            () -> new MaidenSaplingBlock(new JadeTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_SAPLING = registerBlock("paulownia_sapling",
            () -> new MaidenSaplingBlock(new PaulowniaTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_SAPLING = registerBlock("wisteria_sapling",
            () -> new MaidenSaplingBlock(new WisteriaTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_SAPLING = registerBlock("jacaranda_sapling",
            () -> new MaidenSaplingBlock(new JacarandaTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_SAPLING = registerBlock("dogwood_sapling",
            () -> new MaidenSaplingBlock(new DogwoodTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_SAPLING = registerBlock("silverbell_sapling",
            () -> new MaidenSaplingBlock(new SilverbellTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_SAPLING = registerBlock("cedar_sapling",
            () -> new MaidenSaplingBlock(new CedarTreeGrower(),BlockBehaviour.Properties.of(Material.PLANT).strength(2.0F).noOcclusion().instabreak().noCollission().sound(SoundType.CROP)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> CRABAPPLE_LEAVES = registerBlock("crabapple_leaves",
            () -> new MaidensLeafBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_LEAVES = registerBlock("poinciana_leaves",
            () -> new MaidensLeafBlock( BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_LEAVES = registerBlock("laburnum_leaves",
            () -> new MaidensLeafBlock( BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_LEAVES = registerBlock("jade_leaves",
            () -> new MaidensLeafBlock( BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_LEAVES = registerBlock("paulownia_leaves",
            () -> new MaidensLeafBlock( BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_LEAVES = registerBlock("wisteria_leaves",
            () -> new MaidensLeafBlock( BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_LEAVES = registerBlock("jacaranda_leaves",
            () -> new MaidensLeafBlock( BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_LEAVES = registerBlock("dogwood_leaves",
            () -> new MaidensLeafBlock( BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_LEAVES = registerBlock("silverbell_leaves",
            () -> new MaidensLeafBlock( BlockBehaviour.Properties.of(Material.LEAVES).strength(0.1F).randomTicks().sound(SoundType.GRASS).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_LEAVES = registerBlock("cedar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(1F).noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //VINES-FLOWERING//
    public static final RegistryObject<Block> CRABAPPLE_VINE = registerBlock("crabapple_vine",
            () -> new CrabappleVineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_VINE = registerBlock("poinciana_vine",
            () -> new PoincianaVineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_VINE = registerBlock("laburnum_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_VINE = registerBlock("paulownia_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_VINE = registerBlock("wisteria_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_VINE = registerBlock("jacaranda_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_VINE = registerBlock("dogwood_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_VINE = registerBlock("silverbell_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_VINE = registerBlock("jade_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_VINE = registerBlock("cedar_vine",
            () -> new VineBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(.2F).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> RED_CLAY_BLOCK = registerBlock("red_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_CLAY_BLOCK = registerBlock("orange_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_CLAY_BLOCK = registerBlock("yellow_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_CLAY_BLOCK = registerBlock("lime_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_CLAY_BLOCK = registerBlock("green_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_CLAY_BLOCK = registerBlock("cyan_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_BLOCK = registerBlock("light_blue_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_CLAY_BLOCK = registerBlock("blue_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_CLAY_BLOCK = registerBlock("purple_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_CLAY_BLOCK = registerBlock("magenta_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_CLAY_BLOCK = registerBlock("pink_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_CLAY_BLOCK = registerBlock("white_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_BLOCK = registerBlock("light_gray_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_CLAY_BLOCK = registerBlock("gray_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_CLAY_BLOCK = registerBlock("black_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_CLAY_BLOCK = registerBlock("brown_clay_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);



    //COLORED BRICK BLOCKS//
    public static final RegistryObject<Block> RED_BRICK_BLOCK = registerBlock("red_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_BRICK_BLOCK = registerBlock("orange_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_BRICK_BLOCK = registerBlock("yellow_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_BRICK_BLOCK = registerBlock("lime_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_BRICK_BLOCK = registerBlock("green_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_BRICK_BLOCK = registerBlock("cyan_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_BLOCK = registerBlock("light_blue_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_BRICK_BLOCK = registerBlock("blue_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_BRICK_BLOCK = registerBlock("purple_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_BRICK_BLOCK = registerBlock("magenta_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_BRICK_BLOCK = registerBlock("pink_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_BRICK_BLOCK = registerBlock("white_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_BLOCK = registerBlock("light_gray_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_BRICK_BLOCK = registerBlock("gray_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_BRICK_BLOCK = registerBlock("black_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_BRICK_BLOCK = registerBlock("brown_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //LARGE BRICK BLOCKS//
    public static final RegistryObject<Block> RED_LARGE_BRICK_BLOCK = registerBlock("red_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_LARGE_BRICK_BLOCK = registerBlock("orange_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_LARGE_BRICK_BLOCK = registerBlock("yellow_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_LARGE_BRICK_BLOCK = registerBlock("lime_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_LARGE_BRICK_BLOCK = registerBlock("green_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_LARGE_BRICK_BLOCK = registerBlock("cyan_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_LARGE_BRICK_BLOCK = registerBlock("light_blue_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_LARGE_BRICK_BLOCK = registerBlock("blue_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_LARGE_BRICK_BLOCK = registerBlock("purple_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_LARGE_BRICK_BLOCK = registerBlock("magenta_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_LARGE_BRICK_BLOCK = registerBlock("pink_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_LARGE_BRICK_BLOCK = registerBlock("white_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_LARGE_BRICK_BLOCK = registerBlock("light_gray_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_LARGE_BRICK_BLOCK = registerBlock("gray_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_LARGE_BRICK_BLOCK = registerBlock("black_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_LARGE_BRICK_BLOCK = registerBlock("brown_large_brick_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //CLAY STAIRS//

    public static final RegistryObject<Block> RED_CLAY_STAIRS = registerBlock("red_clay_stairs",
            ()-> new StairBlock(ModBlocks.RED_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_CLAY_STAIRS = registerBlock("orange_clay_stairs",
            ()-> new StairBlock(ModBlocks.ORANGE_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_CLAY_STAIRS = registerBlock("yellow_clay_stairs",
            ()-> new StairBlock(ModBlocks.YELLOW_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_CLAY_STAIRS = registerBlock("lime_clay_stairs",
            ()-> new StairBlock(ModBlocks.LIME_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_CLAY_STAIRS = registerBlock("green_clay_stairs",
            ()-> new StairBlock(ModBlocks.GREEN_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_CLAY_STAIRS = registerBlock("cyan_clay_stairs",
            ()-> new StairBlock(ModBlocks.CYAN_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_STAIRS = registerBlock("light_blue_clay_stairs",
            ()-> new StairBlock(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_CLAY_STAIRS = registerBlock("blue_clay_stairs",
            ()-> new StairBlock(ModBlocks.BLUE_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_CLAY_STAIRS = registerBlock("purple_clay_stairs",
            ()-> new StairBlock(ModBlocks.PURPLE_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_CLAY_STAIRS = registerBlock("magenta_clay_stairs",
            ()-> new StairBlock(ModBlocks.MAGENTA_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_CLAY_STAIRS = registerBlock("pink_clay_stairs",
            ()-> new StairBlock(ModBlocks.PINK_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_CLAY_STAIRS = registerBlock("white_clay_stairs",
            ()-> new StairBlock(ModBlocks.WHITE_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_STAIRS = registerBlock("light_gray_clay_stairs",
            ()-> new StairBlock(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_CLAY_STAIRS = registerBlock("gray_clay_stairs",
            ()-> new StairBlock(ModBlocks.GRAY_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_CLAY_STAIRS = registerBlock("black_clay_stairs",
            ()-> new StairBlock(ModBlocks.BLACK_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_CLAY_STAIRS = registerBlock("brown_clay_stairs",
            ()-> new StairBlock(ModBlocks.BROWN_CLAY_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> RED_BRICK_STAIRS = registerBlock("red_brick_stairs",
            ()-> new StairBlock(ModBlocks.RED_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_BRICK_STAIRS = registerBlock("orange_brick_stairs",
            ()-> new StairBlock(ModBlocks.ORANGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs",
            ()-> new StairBlock(ModBlocks.YELLOW_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_BRICK_STAIRS = registerBlock("lime_brick_stairs",
            ()-> new StairBlock(ModBlocks.LIME_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_BRICK_STAIRS = registerBlock("green_brick_stairs",
            ()-> new StairBlock(ModBlocks.GREEN_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_BRICK_STAIRS = registerBlock("cyan_brick_stairs",
            ()-> new StairBlock(ModBlocks.CYAN_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_STAIRS = registerBlock("light_blue_brick_stairs",
            ()-> new StairBlock(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs",
            ()-> new StairBlock(ModBlocks.BLUE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_BRICK_STAIRS = registerBlock("purple_brick_stairs",
            ()-> new StairBlock(ModBlocks.PURPLE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_BRICK_STAIRS = registerBlock("magenta_brick_stairs",
            ()-> new StairBlock(ModBlocks.MAGENTA_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_BRICK_STAIRS = registerBlock("pink_brick_stairs",
            ()-> new StairBlock(ModBlocks.PINK_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            ()-> new StairBlock(ModBlocks.WHITE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs",
            ()-> new StairBlock(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs",
            ()-> new StairBlock(ModBlocks.GRAY_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs",
            ()-> new StairBlock(ModBlocks.BLACK_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_BRICK_STAIRS = registerBlock("brown_brick_stairs",
            ()-> new StairBlock(ModBlocks.BROWN_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> RED_LARGE_BRICK_STAIRS = registerBlock("red_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.RED_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_LARGE_BRICK_STAIRS = registerBlock("orange_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_LARGE_BRICK_STAIRS = registerBlock("yellow_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_LARGE_BRICK_STAIRS = registerBlock("lime_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.LIME_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_LARGE_BRICK_STAIRS = registerBlock("green_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_LARGE_BRICK_STAIRS = registerBlock("cyan_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_LARGE_BRICK_STAIRS = registerBlock("light_blue_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_LARGE_BRICK_STAIRS = registerBlock("blue_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_LARGE_BRICK_STAIRS = registerBlock("purple_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_LARGE_BRICK_STAIRS = registerBlock("magenta_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_LARGE_BRICK_STAIRS = registerBlock("pink_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.PINK_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_LARGE_BRICK_STAIRS = registerBlock("white_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_LARGE_BRICK_STAIRS = registerBlock("light_gray_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_LARGE_BRICK_STAIRS = registerBlock("gray_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_LARGE_BRICK_STAIRS = registerBlock("black_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_LARGE_BRICK_STAIRS = registerBlock("brown_large_brick_stairs",
            ()-> new StairBlock(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

//CLAY SLABS//


    public static final RegistryObject<Block> RED_CLAY_SLAB = registerBlock("red_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.RED_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_CLAY_SLAB = registerBlock("orange_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.ORANGE_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_CLAY_SLAB = registerBlock("yellow_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.YELLOW_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_CLAY_SLAB = registerBlock("lime_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIME_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_CLAY_SLAB = registerBlock("green_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.GREEN_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_CLAY_SLAB = registerBlock("cyan_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.CYAN_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_SLAB = registerBlock("light_blue_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIGHT_BLUE_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_CLAY_SLAB = registerBlock("blue_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BLUE_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_CLAY_SLAB = registerBlock("purple_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PURPLE_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_CLAY_SLAB = registerBlock("magenta_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.MAGENTA_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_CLAY_SLAB = registerBlock("pink_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PINK_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_CLAY_SLAB = registerBlock("white_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.WHITE_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_SLAB = registerBlock("light_gray_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIGHT_GRAY_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_CLAY_SLAB = registerBlock("gray_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.GRAY_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_CLAY_SLAB = registerBlock("black_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BLACK_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_CLAY_SLAB = registerBlock("brown_clay_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BROWN_CLAY_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> RED_BRICK_SLAB = registerBlock("red_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.RED_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.ORANGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.YELLOW_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_BRICK_SLAB = registerBlock("lime_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIME_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_BRICK_SLAB = registerBlock("green_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.GREEN_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_BRICK_SLAB = registerBlock("cyan_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.CYAN_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_SLAB = registerBlock("light_blue_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIGHT_BLUE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_BRICK_SLAB = registerBlock("blue_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BLUE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_BRICK_SLAB = registerBlock("purple_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PURPLE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_BRICK_SLAB = registerBlock("magenta_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.MAGENTA_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_BRICK_SLAB = registerBlock("pink_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PINK_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.WHITE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIGHT_GRAY_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_BRICK_SLAB = registerBlock("gray_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.GRAY_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_BRICK_SLAB = registerBlock("black_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BLACK_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_BRICK_SLAB = registerBlock("brown_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BROWN_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> RED_LARGE_BRICK_SLAB = registerBlock("red_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.RED_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_LARGE_BRICK_SLAB = registerBlock("orange_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.ORANGE_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_LARGE_BRICK_SLAB = registerBlock("yellow_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.YELLOW_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_LARGE_BRICK_SLAB = registerBlock("lime_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIME_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_LARGE_BRICK_SLAB = registerBlock("green_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.GREEN_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_LARGE_BRICK_SLAB = registerBlock("cyan_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.CYAN_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_LARGE_BRICK_SLAB = registerBlock("light_blue_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIGHT_BLUE_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_LARGE_BRICK_SLAB = registerBlock("blue_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BLUE_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_LARGE_BRICK_SLAB = registerBlock("purple_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PURPLE_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_LARGE_BRICK_SLAB = registerBlock("magenta_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.MAGENTA_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_LARGE_BRICK_SLAB = registerBlock("pink_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PINK_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_LARGE_BRICK_SLAB = registerBlock("white_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.WHITE_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_LARGE_BRICK_SLAB = registerBlock("light_gray_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIGHT_GRAY_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_LARGE_BRICK_SLAB = registerBlock("gray_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.GRAY_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_LARGE_BRICK_SLAB = registerBlock("black_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BLACK_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_LARGE_BRICK_SLAB = registerBlock("brown_large_brick_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BROWN_LARGE_BRICK_BLOCK.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);



//GEMSTONE ORES//

    public static final RegistryObject<Block> JASPER_ORE = registerBlock("jasper_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_ORE = registerBlock("carnelian_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_ORE = registerBlock("aventurine_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_ORE = registerBlock("jade_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_ORE = registerBlock("chalcopyrite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_ORE = registerBlock("labradorite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_ORE = registerBlock("moonstone_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_ORE = registerBlock("sodalite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_ORE = registerBlock("rose_quartz_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_ORE = registerBlock("mica_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

//DEEPSLATE ORES//
public static final RegistryObject<Block> DEEPSLATE_JASPER_ORE = registerBlock("deepslate_jasper_ore",
        ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_CARNELIAN_ORE = registerBlock("deepslate_carnelian_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_AVENTURINE_ORE = registerBlock("deepslate_aventurine_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_CHALCOPYRITE_ORE = registerBlock("deepslate_chalcopyrite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_LABRADORITE_ORE = registerBlock("deepslate_labradorite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_MOONSTONE_ORE = registerBlock("deepslate_moonstone_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_SODALITE_ORE = registerBlock("deepslate_sodalite_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_AMETHYST_ORE = registerBlock("deepslate_amethyst_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_ROSE_QUARTZ_ORE = registerBlock("deepslate_rose_quartz_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DEEPSLATE_MICA_ORE = registerBlock("deepslate_mica_ore",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


//GEMSTONE BLOCKS//

    public static final RegistryObject<Block> JASPER_BLOCK = registerBlock("jasper_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_BLOCK = registerBlock("carnelian_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_BLOCK = registerBlock("aventurine_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_BLOCK = registerBlock("chalcopyrite_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_BLOCK = registerBlock("labradorite_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_BLOCK = registerBlock("sodalite_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_BLOCK = registerBlock("mica_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //GEMSTONE TILE BLOCKS//
//GEMSTONE TILE 1//
    public static final RegistryObject<Block> JASPER_1 = registerBlock("jasper_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_1 = registerBlock("carnelian_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_1 = registerBlock("citrine_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_1 = registerBlock("aventurine_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_1 = registerBlock("jade_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_1 = registerBlock("chalcopyrite_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_1 = registerBlock("labradorite_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_1 = registerBlock("moonstone_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_1 = registerBlock("sodalite_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_1 = registerBlock("amethyst_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_1 = registerBlock("rose_quartz_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_1 = registerBlock("mica_1",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 2//
    public static final RegistryObject<Block> JASPER_2 = registerBlock("jasper_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_2 = registerBlock("carnelian_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_2 = registerBlock("citrine_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_2 = registerBlock("aventurine_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> JADE_2 = registerBlock("jade_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_2 = registerBlock("chalcopyrite_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_2 = registerBlock("labradorite_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_2 = registerBlock("moonstone_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_2 = registerBlock("sodalite_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_2 = registerBlock("amethyst_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_2 = registerBlock("rose_quartz_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_2 = registerBlock("mica_2",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 3//
    public static final RegistryObject<Block> JASPER_3 = registerBlock("jasper_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_3 = registerBlock("carnelian_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_3 = registerBlock("citrine_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_3 = registerBlock("aventurine_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_3 = registerBlock("jade_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_3 = registerBlock("chalcopyrite_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_3 = registerBlock("labradorite_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_3 = registerBlock("moonstone_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_3 = registerBlock("sodalite_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_3 = registerBlock("amethyst_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_3 = registerBlock("rose_quartz_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_3 = registerBlock("mica_3",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 4//
    public static final RegistryObject<Block> JASPER_4 = registerBlock("jasper_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_4 = registerBlock("carnelian_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_4 = registerBlock("citrine_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_4 = registerBlock("aventurine_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_4 = registerBlock("jade_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_4 = registerBlock("chalcopyrite_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_4 = registerBlock("labradorite_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_4 = registerBlock("moonstone_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_4 = registerBlock("sodalite_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_4 = registerBlock("amethyst_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_4 = registerBlock("rose_quartz_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_4 = registerBlock("mica_4",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 5//
    public static final RegistryObject<Block> JASPER_5 = registerBlock("jasper_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_5 = registerBlock("carnelian_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_5 = registerBlock("citrine_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_5 = registerBlock("aventurine_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_5 = registerBlock("jade_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_5 = registerBlock("chalcopyrite_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_5 = registerBlock("labradorite_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_5 = registerBlock("moonstone_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_5 = registerBlock("sodalite_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_5 = registerBlock("amethyst_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_5 = registerBlock("rose_quartz_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_5 = registerBlock("mica_5",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEMSTONE TILE 6//
    public static final RegistryObject<Block> JASPER_6 = registerBlock("jasper_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_6 = registerBlock("carnelian_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_6 = registerBlock("citrine_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_6 = registerBlock("aventurine_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_6 = registerBlock("jade_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_6 = registerBlock("chalcopyrite_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_6 = registerBlock("labradorite_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_6 = registerBlock("moonstone_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_6 = registerBlock("sodalite_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_6 = registerBlock("amethyst_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_6 = registerBlock("rose_quartz_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_6 = registerBlock("mica_6",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(3.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //GEM STAIRS//

    public static final RegistryObject<Block> AMETHYST_1_STAIRS = registerBlock("amethyst_1_stairs",
            () ->new StairBlock(ModBlocks.AMETHYST_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_1_STAIRS = registerBlock("aventurine_1_stairs" ,
            () ->new StairBlock(ModBlocks.AVENTURINE_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_1_STAIRS = registerBlock("carnelian_1_stairs",
            () ->new StairBlock(ModBlocks.CARNELIAN_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_1_STAIRS = registerBlock("chalcopyrite_1_stairs",
            () ->new StairBlock(ModBlocks.CHALCOPYRITE_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_1_STAIRS = registerBlock("citrine_1_stairs",
            () ->new StairBlock(ModBlocks.CITRINE_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_1_STAIRS = registerBlock("jade_1_stairs",
            () ->new StairBlock(ModBlocks.JADE_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_1_STAIRS = registerBlock("jasper_1_stairs",
            () ->new StairBlock(ModBlocks.JASPER_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_1_STAIRS = registerBlock("labradorite_1_stairs",
            () ->new StairBlock(ModBlocks.LABRADORITE_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_1_STAIRS = registerBlock("mica_1_stairs",
            () ->new StairBlock(ModBlocks.MICA_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_1_STAIRS = registerBlock( "moonstone_1_stairs",
            () ->new StairBlock(ModBlocks.MOONSTONE_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_1_STAIRS = registerBlock("rose_quartz_1_stairs",
            () ->new StairBlock(ModBlocks.ROSE_QUARTZ_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_1_STAIRS = registerBlock("sodalite_1_stairs",
            () ->new StairBlock(ModBlocks.SODALITE_1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_2_STAIRS = registerBlock("amethyst_2_stairs",
            () ->new StairBlock(ModBlocks.AMETHYST_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_2_STAIRS = registerBlock("aventurine_2_stairs" ,
            () ->new StairBlock(ModBlocks.AVENTURINE_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_2_STAIRS = registerBlock("carnelian_2_stairs",
            () ->new StairBlock(ModBlocks.CARNELIAN_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_2_STAIRS = registerBlock("chalcopyrite_2_stairs",
            () ->new StairBlock(ModBlocks.CHALCOPYRITE_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_2_STAIRS = registerBlock("citrine_2_stairs",
            () ->new StairBlock(ModBlocks.CITRINE_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_2_STAIRS = registerBlock("jade_2_stairs",
            () ->new StairBlock(ModBlocks.JADE_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_2_STAIRS = registerBlock("jasper_2_stairs",
            () ->new StairBlock(ModBlocks.JASPER_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_2_STAIRS = registerBlock("labradorite_2_stairs",
            () ->new StairBlock(ModBlocks.LABRADORITE_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_2_STAIRS = registerBlock("mica_2_stairs",
            () ->new StairBlock(ModBlocks.MICA_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_2_STAIRS = registerBlock( "moonstone_2_stairs",
            () ->new StairBlock(ModBlocks.MOONSTONE_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_2_STAIRS = registerBlock("rose_quartz_2_stairs",
            () ->new StairBlock(ModBlocks.ROSE_QUARTZ_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_2_STAIRS = registerBlock("sodalite_2_stairs",
            () ->new StairBlock(ModBlocks.SODALITE_2.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_3_STAIRS = registerBlock("amethyst_3_stairs",
            () ->new StairBlock(ModBlocks.AMETHYST_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_3_STAIRS = registerBlock("aventurine_3_stairs" ,
            () ->new StairBlock(ModBlocks.AVENTURINE_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_3_STAIRS = registerBlock("carnelian_3_stairs",
            () ->new StairBlock(ModBlocks.CARNELIAN_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_3_STAIRS = registerBlock("chalcopyrite_3_stairs",
            () ->new StairBlock(ModBlocks.CHALCOPYRITE_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_3_STAIRS = registerBlock("citrine_3_stairs",
            () ->new StairBlock(ModBlocks.CITRINE_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_3_STAIRS = registerBlock("jade_3_stairs",
            () ->new StairBlock(ModBlocks.JADE_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_3_STAIRS = registerBlock("jasper_3_stairs",
            () ->new StairBlock(ModBlocks.JASPER_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_3_STAIRS = registerBlock("labradorite_3_stairs",
            () ->new StairBlock(ModBlocks.LABRADORITE_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_3_STAIRS = registerBlock("mica_3_stairs",
            () ->new StairBlock(ModBlocks.MICA_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_3_STAIRS = registerBlock( "moonstone_3_stairs",
            () ->new StairBlock(ModBlocks.MOONSTONE_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_3_STAIRS = registerBlock("rose_quartz_3_stairs",
            () ->new StairBlock(ModBlocks.ROSE_QUARTZ_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_3_STAIRS = registerBlock("sodalite_3_stairs",
            () ->new StairBlock(ModBlocks.SODALITE_3.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_4_STAIRS = registerBlock("amethyst_4_stairs",
            () ->new StairBlock(ModBlocks.AMETHYST_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_4_STAIRS = registerBlock("aventurine_4_stairs" ,
            () ->new StairBlock(ModBlocks.AVENTURINE_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_4_STAIRS = registerBlock("carnelian_4_stairs",
            () ->new StairBlock(ModBlocks.CARNELIAN_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_4_STAIRS = registerBlock("chalcopyrite_4_stairs",
            () ->new StairBlock(ModBlocks.CHALCOPYRITE_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_4_STAIRS = registerBlock("citrine_4_stairs",
            () ->new StairBlock(ModBlocks.CITRINE_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_4_STAIRS = registerBlock("jade_4_stairs",
            () ->new StairBlock(ModBlocks.JADE_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_4_STAIRS = registerBlock("jasper_4_stairs",
            () ->new StairBlock(ModBlocks.JASPER_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_4_STAIRS = registerBlock("labradorite_4_stairs",
            () ->new StairBlock(ModBlocks.LABRADORITE_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_4_STAIRS = registerBlock("mica_4_stairs",
            () ->new StairBlock(ModBlocks.MICA_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_4_STAIRS = registerBlock( "moonstone_4_stairs",
            () ->new StairBlock(ModBlocks.MOONSTONE_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_4_STAIRS = registerBlock("rose_quartz_4_stairs",
            () ->new StairBlock(ModBlocks.ROSE_QUARTZ_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_4_STAIRS = registerBlock("sodalite_4_stairs",
            () ->new StairBlock(ModBlocks.SODALITE_4.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_5_STAIRS = registerBlock("amethyst_5_stairs",
            () ->new StairBlock(ModBlocks.AMETHYST_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_5_STAIRS = registerBlock("aventurine_5_stairs" ,
            () ->new StairBlock(ModBlocks.AVENTURINE_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_5_STAIRS = registerBlock("carnelian_5_stairs",
            () ->new StairBlock(ModBlocks.CARNELIAN_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_5_STAIRS = registerBlock("chalcopyrite_5_stairs",
            () ->new StairBlock(ModBlocks.CHALCOPYRITE_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_5_STAIRS = registerBlock("citrine_5_stairs",
            () ->new StairBlock(ModBlocks.CITRINE_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_5_STAIRS = registerBlock("jade_5_stairs",
            () ->new StairBlock(ModBlocks.JADE_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_5_STAIRS = registerBlock("jasper_5_stairs",
            () ->new StairBlock(ModBlocks.JASPER_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_5_STAIRS = registerBlock("labradorite_5_stairs",
            () ->new StairBlock(ModBlocks.LABRADORITE_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_5_STAIRS = registerBlock("mica_5_stairs",
            () ->new StairBlock(ModBlocks.MICA_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_5_STAIRS = registerBlock( "moonstone_5_stairs",
            () ->new StairBlock(ModBlocks.MOONSTONE_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_5_STAIRS = registerBlock("rose_quartz_5_stairs",
            () ->new StairBlock(ModBlocks.ROSE_QUARTZ_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_5_STAIRS = registerBlock("sodalite_5_stairs",
            () ->new StairBlock(ModBlocks.SODALITE_5.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_6_STAIRS = registerBlock("amethyst_6_stairs",
            () ->new StairBlock(ModBlocks.AMETHYST_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_6_STAIRS = registerBlock("aventurine_6_stairs" ,
            () ->new StairBlock(ModBlocks.AVENTURINE_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_6_STAIRS = registerBlock("carnelian_6_stairs",
            () ->new StairBlock(ModBlocks.CARNELIAN_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_6_STAIRS = registerBlock("chalcopyrite_6_stairs",
            () ->new StairBlock(ModBlocks.CHALCOPYRITE_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_6_STAIRS = registerBlock("citrine_6_stairs",
            () ->new StairBlock(ModBlocks.CITRINE_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_6_STAIRS = registerBlock("jade_6_stairs",
            () ->new StairBlock(ModBlocks.JADE_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_6_STAIRS = registerBlock("jasper_6_stairs",
            () ->new StairBlock(ModBlocks.JASPER_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_6_STAIRS = registerBlock("labradorite_6_stairs",
            () ->new StairBlock(ModBlocks.LABRADORITE_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_6_STAIRS = registerBlock("mica_6_stairs",
            () ->new StairBlock(ModBlocks.MICA_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_6_STAIRS = registerBlock( "moonstone_6_stairs",
            () ->new StairBlock(ModBlocks.MOONSTONE_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_6_STAIRS = registerBlock("rose_quartz_6_stairs",
            () ->new StairBlock(ModBlocks.ROSE_QUARTZ_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_6_STAIRS = registerBlock("sodalite_6_stairs",
            () ->new StairBlock(ModBlocks.SODALITE_6.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.CLAY)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> AMETHYST_1_SLAB = registerBlock("amethyst_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AMETHYST_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_1_SLAB = registerBlock("aventurine_1_slab" ,
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AVENTURINE_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_1_SLAB = registerBlock("carnelian_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CARNELIAN_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_1_SLAB = registerBlock("chalcopyrite_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CHALCOPYRITE_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_1_SLAB = registerBlock("citrine_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CITRINE_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_1_SLAB = registerBlock("jade_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JADE_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_1_SLAB = registerBlock("jasper_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JASPER_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_1_SLAB = registerBlock("labradorite_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.LABRADORITE_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_1_SLAB = registerBlock("mica_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MICA_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_1_SLAB = registerBlock( "moonstone_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MOONSTONE_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_1_SLAB = registerBlock("rose_quartz_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.ROSE_QUARTZ_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_1_SLAB = registerBlock("sodalite_1_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.SODALITE_1.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> AMETHYST_2_SLAB = registerBlock("amethyst_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AMETHYST_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_2_SLAB = registerBlock("aventurine_2_slab" ,
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AVENTURINE_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_2_SLAB = registerBlock("carnelian_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CARNELIAN_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_2_SLAB = registerBlock("chalcopyrite_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CHALCOPYRITE_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_2_SLAB = registerBlock("citrine_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CITRINE_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_2_SLAB = registerBlock("jade_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JADE_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_2_SLAB = registerBlock("jasper_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JASPER_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_2_SLAB = registerBlock("labradorite_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.LABRADORITE_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_2_SLAB = registerBlock("mica_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MICA_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_2_SLAB = registerBlock( "moonstone_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MOONSTONE_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_2_SLAB = registerBlock("rose_quartz_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.ROSE_QUARTZ_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_2_SLAB = registerBlock("sodalite_2_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.SODALITE_2.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AMETHYST_3_SLAB = registerBlock("amethyst_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AMETHYST_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_3_SLAB = registerBlock("aventurine_3_slab" ,
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AVENTURINE_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_3_SLAB = registerBlock("carnelian_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CARNELIAN_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_3_SLAB = registerBlock("chalcopyrite_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CHALCOPYRITE_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_3_SLAB = registerBlock("citrine_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CITRINE_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_3_SLAB = registerBlock("jade_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JADE_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_3_SLAB = registerBlock("jasper_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JASPER_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_3_SLAB = registerBlock("labradorite_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.LABRADORITE_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_3_SLAB = registerBlock("mica_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MICA_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_3_SLAB = registerBlock( "moonstone_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MOONSTONE_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_3_SLAB = registerBlock("rose_quartz_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.ROSE_QUARTZ_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_3_SLAB = registerBlock("sodalite_3_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.SODALITE_3.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> AMETHYST_4_SLAB = registerBlock("amethyst_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AMETHYST_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_4_SLAB = registerBlock("aventurine_4_slab" ,
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AVENTURINE_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_4_SLAB = registerBlock("carnelian_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CARNELIAN_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_4_SLAB = registerBlock("chalcopyrite_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CHALCOPYRITE_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_4_SLAB = registerBlock("citrine_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CITRINE_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_4_SLAB = registerBlock("jade_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JADE_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_4_SLAB = registerBlock("jasper_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JASPER_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_4_SLAB = registerBlock("labradorite_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.LABRADORITE_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_4_SLAB = registerBlock("mica_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MICA_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_4_SLAB = registerBlock( "moonstone_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MOONSTONE_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_4_SLAB = registerBlock("rose_quartz_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.ROSE_QUARTZ_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_4_SLAB = registerBlock("sodalite_4_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.SODALITE_4.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> AMETHYST_5_SLAB = registerBlock("amethyst_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AMETHYST_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_5_SLAB = registerBlock("aventurine_5_slab" ,
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AVENTURINE_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_5_SLAB = registerBlock("carnelian_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CARNELIAN_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_5_SLAB = registerBlock("chalcopyrite_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CHALCOPYRITE_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_5_SLAB = registerBlock("citrine_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CITRINE_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_5_SLAB = registerBlock("jade_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JADE_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_5_SLAB = registerBlock("jasper_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JASPER_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_5_SLAB = registerBlock("labradorite_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.LABRADORITE_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_5_SLAB = registerBlock("mica_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MICA_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_5_SLAB = registerBlock( "moonstone_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MOONSTONE_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_5_SLAB = registerBlock("rose_quartz_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.ROSE_QUARTZ_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_5_SLAB = registerBlock("sodalite_5_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.SODALITE_5.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> AMETHYST_6_SLAB = registerBlock("amethyst_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AMETHYST_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> AVENTURINE_6_SLAB = registerBlock("aventurine_6_slab" ,
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.AVENTURINE_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CARNELIAN_6_SLAB = registerBlock("carnelian_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CARNELIAN_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CHALCOPYRITE_6_SLAB = registerBlock("chalcopyrite_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CHALCOPYRITE_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CITRINE_6_SLAB = registerBlock("citrine_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.CITRINE_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_6_SLAB = registerBlock("jade_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JADE_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JASPER_6_SLAB = registerBlock("jasper_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.JASPER_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABRADORITE_6_SLAB = registerBlock("labradorite_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.LABRADORITE_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MICA_6_SLAB = registerBlock("mica_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MICA_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MOONSTONE_6_SLAB = registerBlock( "moonstone_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.MOONSTONE_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ROSE_QUARTZ_6_SLAB = registerBlock("rose_quartz_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.ROSE_QUARTZ_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SODALITE_6_SLAB = registerBlock("sodalite_6_slab",
            () ->new SlabBlock(Block.Properties.copy(ModBlocks.SODALITE_6.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);




    //ESSENCE BLOCKS//
    public static final RegistryObject<Block> EARTHEN_ESSENCE_BLOCK = registerBlock("earthen_essence_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> FLORAL_ESSENCE_BLOCK = registerBlock("floral_essence_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(1.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORNAMENTAL_GRASS = registerBlock("ornamental_grass",
            ()-> new OrnamentalGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).strength(0.5f).sound(SoundType.GRASS)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORNAMENTAL_PATH = registerBlock("ornamental_path",
            ()-> new DirtPathBlock(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS).noOcclusion().strength(0.5f)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORNAMENTAL_MUSHROOM = registerBlock("ornamental_mushroom",
            () -> new OrnamentalMushroomBlock(MobEffects.NIGHT_VISION, 6,Block.Properties.of(Material.PLANT).noOcclusion().noCollission()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> FAIRY_GLOW_CUP = registerBlock("fairy_glow_cup",
            ()-> new FairyGlowCupBlock(BlockBehaviour.Properties.of(Material.PLANT).lightLevel((p_50872_) -> {
                return 15;}).instabreak().noCollission().noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POTTED_ORNAMENTAL_MUSHROOM = registerBlock("potted_ornamental_mushroom",
            () -> new FlowerPotBlock(null, ModBlocks.ORNAMENTAL_MUSHROOM,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> WALK_FLOWERS = registerBlock("flower_grass",
            ()-> new FlowerGrassBlock(BlockBehaviour.Properties.of(Material.GRASS).instabreak().noCollission().noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VINE_TIE = registerBlock("vine_tie",
            ()-> new VineTieBlock(BlockBehaviour.Properties.of(Material.GRASS).instabreak().noCollission().noOcclusion()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);



    //WHITEWASHED BLOCKS//

    public static final RegistryObject<Block> WHITEWASHED_PLANKS = registerBlock("whitewashed_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITEWASHED_STAIRS = registerBlock("whitewashed_stairs",
            ()-> new StairBlock(ModBlocks.WHITEWASHED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITEWASHED_SLAB = registerBlock("whitewashed_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.WHITEWASHED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITEWASHED_FENCE = registerBlock("whitewashed_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITEWASHED_FENCE_GATE = registerBlock("whitewashed_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITEWASHED_PRESSURE_PLATE = registerBlock("whitewashed_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.WHITEWASHED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITEWASHED_BUTTON = registerBlock("witewashed_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


//STAINED PLANKS//

    public static final RegistryObject<Block> RED_STAINED_PLANKS = registerBlock("red_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_PLANKS = registerBlock("orange_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_PLANKS = registerBlock("yellow_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_PLANKS = registerBlock("lime_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_PLANKS = registerBlock("green_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_PLANKS = registerBlock("cyan_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANKS = registerBlock("light_blue_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_PLANKS = registerBlock("blue_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_PLANKS = registerBlock("purple_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_PLANKS = registerBlock("magenta_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_PLANKS = registerBlock("pink_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_PLANKS = registerBlock("white_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANKS = registerBlock("light_gray_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_PLANKS = registerBlock("gray_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_PLANKS = registerBlock("black_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_PLANKS = registerBlock("brown_stained_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //STAINED BOOKSHELVES//
    public static final RegistryObject<Block> RED_STAINED_BOOKSHELF = registerBlock("red_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_BOOKSHELF = registerBlock("orange_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_BOOKSHELF = registerBlock("yellow_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_BOOKSHELF = registerBlock("lime_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_BOOKSHELF = registerBlock("green_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_BOOKSHELF = registerBlock("cyan_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BOOKSHELF = registerBlock("light_blue_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_BOOKSHELF = registerBlock("blue_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_BOOKSHELF = registerBlock("purple_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_BOOKSHELF = registerBlock("magenta_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_BOOKSHELF = registerBlock("pink_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_BOOKSHELF = registerBlock("white_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BOOKSHELF = registerBlock("light_gray_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_BOOKSHELF = registerBlock("gray_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_BOOKSHELF = registerBlock("black_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_BOOKSHELF = registerBlock("brown_stained_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //STAINED STAIRS//

    public static final RegistryObject<Block> RED_STAINED_STAIRS = registerBlock("red_stained_stairs",
            ()-> new StairBlock(ModBlocks.RED_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_STAIRS = registerBlock("orange_stained_stairs",
            ()-> new StairBlock(ModBlocks.ORANGE_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_STAIRS = registerBlock("yellow_stained_stairs",
            ()-> new StairBlock(ModBlocks.YELLOW_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_STAIRS = registerBlock("lime_stained_stairs",
            ()-> new StairBlock(ModBlocks.LIME_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_STAIRS = registerBlock("green_stained_stairs",
            ()-> new StairBlock(ModBlocks.GREEN_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_STAIRS = registerBlock("cyan_stained_stairs",
            ()-> new StairBlock(ModBlocks.CYAN_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_STAIRS = registerBlock("light_blue_stained_stairs",
            ()-> new StairBlock(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_STAIRS = registerBlock("blue_stained_stairs",
            ()-> new StairBlock(ModBlocks.BLUE_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_STAIRS = registerBlock("purple_stained_stairs",
            ()-> new StairBlock(ModBlocks.PURPLE_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_STAIRS = registerBlock("magenta_stained_stairs",
            ()-> new StairBlock(ModBlocks.MAGENTA_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_STAIRS = registerBlock("pink_stained_stairs",
            ()-> new StairBlock(ModBlocks.PINK_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_STAIRS = registerBlock("white_stained_stairs",
            ()-> new StairBlock(ModBlocks.WHITE_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_STAIRS = registerBlock("light_gray_stained_stairs",
            ()-> new StairBlock(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_STAIRS = registerBlock("gray_stained_stairs",
            ()-> new StairBlock(ModBlocks.GRAY_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_STAIRS = registerBlock("black_stained_stairs",
            ()-> new StairBlock(ModBlocks.BLACK_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_STAIRS = registerBlock("brown_stained_stairs",
            ()-> new StairBlock(ModBlocks.BROWN_STAINED_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //STAINED SLABS//

    public static final RegistryObject<Block> RED_STAINED_SLAB = registerBlock("red_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.RED_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_SLAB = registerBlock("orange_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_SLAB = registerBlock("yellow_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_SLAB = registerBlock("lime_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_SLAB = registerBlock("green_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_SLAB = registerBlock("cyan_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_SLAB = registerBlock("light_blue_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_SLAB = registerBlock("blue_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_SLAB = registerBlock("purple_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_SLAB = registerBlock("magenta_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_SLAB = registerBlock("pink_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_SLAB = registerBlock("white_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_SLAB = registerBlock("light_gray_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_SLAB = registerBlock("gray_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_SLAB = registerBlock("black_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_SLAB = registerBlock("brown_stained_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //STAINED FENCES & GATES//
    public static final RegistryObject<Block> RED_STAINED_FENCE = registerBlock("red_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_FENCE = registerBlock("orange_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_FENCE = registerBlock("yellow_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_FENCE = registerBlock("lime_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_FENCE = registerBlock("green_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_FENCE = registerBlock("cyan_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_FENCE = registerBlock("light_blue_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_FENCE = registerBlock("blue_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_FENCE = registerBlock("purple_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_FENCE = registerBlock("magenta_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_FENCE = registerBlock("pink_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_FENCE = registerBlock("white_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_FENCE = registerBlock("light_gray_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_FENCE = registerBlock("gray_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_FENCE = registerBlock("black_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_FENCE = registerBlock("brown_stained_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> RED_STAINED_FENCE_GATE = registerBlock("red_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_FENCE_GATE = registerBlock("orange_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_FENCE_GATE = registerBlock("yellow_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_FENCE_GATE = registerBlock("lime_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_FENCE_GATE = registerBlock("green_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_FENCE_GATE = registerBlock("cyan_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_FENCE_GATE = registerBlock("light_blue_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_FENCE_GATE = registerBlock("blue_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_FENCE_GATE = registerBlock("purple_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_FENCE_GATE = registerBlock("magenta_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_FENCE_GATE = registerBlock("pink_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_FENCE_GATE = registerBlock("white_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_FENCE_GATE = registerBlock("light_gray_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_FENCE_GATE = registerBlock("gray_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_FENCE_GATE = registerBlock("black_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_FENCE_GATE = registerBlock("brown_stained_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4F, 2.5F).noOcclusion()), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

//STAINED PRESSURE PLATES//

    public static final RegistryObject<Block> RED_STAINED_PRESSURE_PLATE = registerBlock("red_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.RED_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_PRESSURE_PLATE = registerBlock("orange_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_PRESSURE_PLATE = registerBlock("yellow_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_PRESSURE_PLATE = registerBlock("lime_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_PRESSURE_PLATE = registerBlock("green_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_PRESSURE_PLATE = registerBlock("cyan_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PRESSURE_PLATE = registerBlock("light_blue_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_PRESSURE_PLATE = registerBlock("blue_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_PRESSURE_PLATE = registerBlock("purple_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_PRESSURE_PLATE = registerBlock("magenta_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_PRESSURE_PLATE = registerBlock("pink_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_PRESSURE_PLATE = registerBlock("white_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PRESSURE_PLATE = registerBlock("light_gray_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_PRESSURE_PLATE = registerBlock("gray_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_PRESSURE_PLATE = registerBlock("black_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_PRESSURE_PLATE = registerBlock("brown_stained_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
//STAINED BUTTONS//

    public static final RegistryObject<Block> RED_STAINED_BUTTON = registerBlock("red_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_BUTTON = registerBlock("orange_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_BUTTON = registerBlock("yellow_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_BUTTON = registerBlock("lime_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_BUTTON = registerBlock("green_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_BUTTON = registerBlock("cyan_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_BUTTON = registerBlock("light_blue_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_BUTTON = registerBlock("blue_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_BUTTON = registerBlock("purple_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_BUTTON = registerBlock("magenta_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_BUTTON = registerBlock("pink_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_BUTTON = registerBlock("white_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_BUTTON = registerBlock("light_gray_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_BUTTON = registerBlock("gray_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_BUTTON = registerBlock("black_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_BUTTON = registerBlock("brown_stained_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //STAINED DOORS//
//DOOR 1//
    public static final RegistryObject<Block> RED_STAINED_DOOR_1 = registerBlock("red_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_1 = registerBlock("orange_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_1 = registerBlock("yellow_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_DOOR_1 = registerBlock("lime_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_1 = registerBlock("green_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_1 = registerBlock("cyan_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_1 = registerBlock("light_blue_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_1 = registerBlock("blue_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_1 = registerBlock("purple_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_1 = registerBlock("magenta_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_DOOR_1 = registerBlock("pink_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_1 = registerBlock("white_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_1 = registerBlock("light_gray_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_1 = registerBlock("gray_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_1 = registerBlock("black_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_1 = registerBlock("brown_stained_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //DOOR 2//
    public static final RegistryObject<Block> RED_STAINED_DOOR_2 = registerBlock("red_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_2 = registerBlock("orange_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_2 = registerBlock("yellow_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_DOOR_2 = registerBlock("lime_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_2 = registerBlock("green_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_2 = registerBlock("cyan_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_2 = registerBlock("light_blue_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_2 = registerBlock("blue_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_2 = registerBlock("purple_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_2 = registerBlock("magenta_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_DOOR_2 = registerBlock("pink_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_2 = registerBlock("white_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_2 = registerBlock("light_gray_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_2 = registerBlock("gray_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_2 = registerBlock("black_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_2 = registerBlock("brown_stained_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
//DOOR 3//

    public static final RegistryObject<Block> RED_STAINED_DOOR_3 = registerBlock("red_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_3 = registerBlock("orange_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_3 = registerBlock("yellow_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_DOOR_3 = registerBlock("lime_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_3 = registerBlock("green_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_3 = registerBlock("cyan_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_3 = registerBlock("light_blue_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_3 = registerBlock("blue_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_3 = registerBlock("purple_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_3 = registerBlock("magenta_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_DOOR_3 = registerBlock("pink_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_3 = registerBlock("white_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_3 = registerBlock("light_gray_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_3 = registerBlock("gray_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_3 = registerBlock("black_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_3 = registerBlock("brown_stained_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //DOOR 4//

    public static final RegistryObject<Block> RED_STAINED_DOOR_4 = registerBlock("red_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_4 = registerBlock("orange_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_4 = registerBlock("yellow_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_DOOR_4 = registerBlock("lime_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_4 = registerBlock("green_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_4 = registerBlock("cyan_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_4 = registerBlock("light_blue_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_4 = registerBlock("blue_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_4 = registerBlock("purple_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_4 = registerBlock("magenta_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_DOOR_4 = registerBlock("pink_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_4 = registerBlock("white_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_4 = registerBlock("light_gray_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_4 = registerBlock("gray_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_4 = registerBlock("black_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_4 = registerBlock("brown_stained_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //DOOR 5//
    public static final RegistryObject<Block> RED_STAINED_DOOR_5 = registerBlock("red_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_5 = registerBlock("orange_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_5 = registerBlock("yellow_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_DOOR_5 = registerBlock("lime_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_5 = registerBlock("green_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_5 = registerBlock("cyan_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_5 = registerBlock("light_blue_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_5 = registerBlock("blue_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_5 = registerBlock("purple_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_5 = registerBlock("magenta_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_DOOR_5 = registerBlock("pink_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_5 = registerBlock("white_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_5 = registerBlock("light_gray_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_5 = registerBlock("gray_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_5 = registerBlock("black_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_5 = registerBlock("brown_stained_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //DOOR 6//

    public static final RegistryObject<Block> RED_STAINED_DOOR_6 = registerBlock("red_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_DOOR_6 = registerBlock("orange_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_DOOR_6 = registerBlock("yellow_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_DOOR_6 = registerBlock("lime_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_DOOR_6 = registerBlock("green_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_DOOR_6 = registerBlock("cyan_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_DOOR_6 = registerBlock("light_blue_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_DOOR_6 = registerBlock("blue_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_DOOR_6 = registerBlock("purple_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_DOOR_6 = registerBlock("magenta_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_DOOR_6 = registerBlock("pink_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_DOOR_6 = registerBlock("white_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_DOOR_6 = registerBlock("light_gray_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_DOOR_6 = registerBlock("gray_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_DOOR_6 = registerBlock("black_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_DOOR_6 = registerBlock("brown_stained_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR 1//
    public static final RegistryObject<Block> RED_STAINED_TRAPDOOR_1 = registerBlock("red_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_TRAPDOOR_1 = registerBlock("orange_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_TRAPDOOR_1 = registerBlock("yellow_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_TRAPDOOR_1 = registerBlock("lime_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_TRAPDOOR_1 = registerBlock("green_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_TRAPDOOR_1 = registerBlock("cyan_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_TRAPDOOR_1 = registerBlock("light_blue_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_TRAPDOOR_1 = registerBlock("blue_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_TRAPDOOR_1 = registerBlock("purple_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_TRAPDOOR_1 = registerBlock("magenta_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_TRAPDOOR_1 = registerBlock("pink_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_TRAPDOOR_1 = registerBlock("white_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_TRAPDOOR_1 = registerBlock("light_gray_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_TRAPDOOR_1 = registerBlock("gray_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_TRAPDOOR_1 = registerBlock("black_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_TRAPDOOR_1 = registerBlock("brown_stained_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR 2//
    public static final RegistryObject<Block> RED_STAINED_TRAPDOOR_2 = registerBlock("red_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_TRAPDOOR_2 = registerBlock("orange_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_TRAPDOOR_2 = registerBlock("yellow_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_TRAPDOOR_2 = registerBlock("lime_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_TRAPDOOR_2 = registerBlock("green_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_TRAPDOOR_2 = registerBlock("cyan_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_TRAPDOOR_2 = registerBlock("light_blue_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_TRAPDOOR_2 = registerBlock("blue_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_TRAPDOOR_2 = registerBlock("purple_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_TRAPDOOR_2 = registerBlock("magenta_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_TRAPDOOR_2 = registerBlock("pink_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_TRAPDOOR_2 = registerBlock("white_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_TRAPDOOR_2 = registerBlock("light_gray_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_TRAPDOOR_2 = registerBlock("gray_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_TRAPDOOR_2 = registerBlock("black_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_TRAPDOOR_2 = registerBlock("brown_stained_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
//TRAPDOOR 3//

    public static final RegistryObject<Block> RED_STAINED_TRAPDOOR_3 = registerBlock("red_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_TRAPDOOR_3 = registerBlock("orange_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_TRAPDOOR_3 = registerBlock("yellow_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_TRAPDOOR_3 = registerBlock("lime_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_TRAPDOOR_3 = registerBlock("green_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_TRAPDOOR_3 = registerBlock("cyan_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_TRAPDOOR_3 = registerBlock("light_blue_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_TRAPDOOR_3 = registerBlock("blue_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_TRAPDOOR_3 = registerBlock("purple_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_TRAPDOOR_3 = registerBlock("magenta_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_TRAPDOOR_3 = registerBlock("pink_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_TRAPDOOR_3 = registerBlock("white_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_TRAPDOOR_3 = registerBlock("light_gray_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_TRAPDOOR_3 = registerBlock("gray_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_TRAPDOOR_3 = registerBlock("black_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_TRAPDOOR_3 = registerBlock("brown_stained_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR 4//

    public static final RegistryObject<Block> RED_STAINED_TRAPDOOR_4 = registerBlock("red_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ORANGE_STAINED_TRAPDOOR_4 = registerBlock("orange_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> YELLOW_STAINED_TRAPDOOR_4 = registerBlock("yellow_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIME_STAINED_TRAPDOOR_4 = registerBlock("lime_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GREEN_STAINED_TRAPDOOR_4 = registerBlock("green_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CYAN_STAINED_TRAPDOOR_4 = registerBlock("cyan_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_TRAPDOOR_4 = registerBlock("light_blue_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLUE_STAINED_TRAPDOOR_4 = registerBlock("blue_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PURPLE_STAINED_TRAPDOOR_4 = registerBlock("purple_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> MAGENTA_STAINED_TRAPDOOR_4 = registerBlock("magenta_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PINK_STAINED_TRAPDOOR_4 = registerBlock("pink_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WHITE_STAINED_TRAPDOOR_4 = registerBlock("white_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_TRAPDOOR_4 = registerBlock("light_gray_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> GRAY_STAINED_TRAPDOOR_4 = registerBlock("gray_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BLACK_STAINED_TRAPDOOR_4 = registerBlock("black_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BROWN_STAINED_TRAPDOOR_4 = registerBlock("brown_stained_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);



    //WOOD PLANKS//
    public static final RegistryObject<Block> CRABAPPLE_PLANKS = registerBlock("crabapple_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_PLANKS = registerBlock("poinciana_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_PLANKS = registerBlock("laburnum_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_PLANKS = registerBlock("jade_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_PLANKS = registerBlock("paulownia_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_PLANKS = registerBlock("wisteria_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_PLANKS = registerBlock("jacaranda_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_PLANKS = registerBlock("dogwood_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_PLANKS = registerBlock("silverbell_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_PLANKS = registerBlock("cedar_planks",
            ()-> new Block(BlockBehaviour.Properties.of(Material.CLAY).strength(2.0f, 1.0f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //WOOD BOOKSHELVES//
    public static final RegistryObject<Block> CRABAPPLE_BOOKSHELF = registerBlock("crabapple_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_BOOKSHELF = registerBlock("poinciana_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_BOOKSHELF = registerBlock("laburnum_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_BOOKSHELF = registerBlock("jade_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_BOOKSHELF = registerBlock("paulownia_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_BOOKSHELF = registerBlock("wisteria_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_BOOKSHELF = registerBlock("jacaranda_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_BOOKSHELF = registerBlock("dogwood_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_BOOKSHELF = registerBlock("silverbell_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_BOOKSHELF = registerBlock("cedar_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_BOOKSHELF = registerBlock("oak_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength( 1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            ()-> new MaidensBookshelfBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //WOOD STAIRS//
public static final RegistryObject<Block> CRABAPPLE_STAIRS = registerBlock("crabapple_stairs",
        ()-> new StairBlock(ModBlocks.CRABAPPLE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_STAIRS = registerBlock("poinciana_stairs",
            ()-> new StairBlock(ModBlocks.POINCIANA_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_STAIRS = registerBlock("laburnum_stairs",
            ()-> new StairBlock(ModBlocks.LABURNUM_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_STAIRS = registerBlock("jade_stairs",
            ()-> new StairBlock(ModBlocks.JADE_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_STAIRS = registerBlock("paulownia_stairs",
            ()-> new StairBlock(ModBlocks.PAULOWNIA_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_STAIRS = registerBlock("wisteria_stairs",
            ()-> new StairBlock(ModBlocks.WISTERIA_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_STAIRS = registerBlock("jacaranda_stairs",
            ()-> new StairBlock(ModBlocks.JACARANDA_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_STAIRS = registerBlock("dogwood_stairs",
            ()-> new StairBlock(ModBlocks.DOGWOOD_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_STAIRS = registerBlock("silverbell_stairs",
            ()-> new StairBlock(ModBlocks.SILVERBELL_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_STAIRS = registerBlock("cedar_stairs",
            ()-> new StairBlock(ModBlocks.CEDAR_PLANKS.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.CLAY).strength(2.0F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
//WOOD SLABS//
public static final RegistryObject<Block> CRABAPPLE_SLAB = registerBlock("crabapple_slab",
        ()-> new SlabBlock(Block.Properties.copy(ModBlocks.CRABAPPLE_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_SLAB = registerBlock("poinciana_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.POINCIANA_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_SLAB = registerBlock("laburnum_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.LABURNUM_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_SLAB = registerBlock("jade_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.JADE_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_SLAB = registerBlock("paulownia_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.PAULOWNIA_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_SLAB = registerBlock("wisteria_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.WISTERIA_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_SLAB = registerBlock("jacaranda_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.JACARANDA_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_SLAB = registerBlock("dogwood_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.DOGWOOD_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_SLAB = registerBlock("silverbell_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.SILVERBELL_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_SLAB = registerBlock("cedar_slab",
            ()-> new SlabBlock(Block.Properties.copy(ModBlocks.CEDAR_PLANKS.get())),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //WOOD FENCES//
    public static final RegistryObject<Block> CRABAPPLE_FENCE = registerBlock("crabapple_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_FENCE = registerBlock("poinciana_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_FENCE = registerBlock("laburnum_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_FENCE = registerBlock("jade_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_FENCE = registerBlock("paulownia_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_FENCE = registerBlock("wisteria_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_FENCE = registerBlock("jacaranda_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_FENCE = registerBlock("dogwood_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_FENCE = registerBlock("silverbell_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_FENCE = registerBlock("cedar_fence",
            ()-> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
//WOOD FENCE GATES//
public static final RegistryObject<Block> CRABAPPLE_FENCE_GATE = registerBlock("crabapple_fence_gate",
        ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_FENCE_GATE = registerBlock("poinciana_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_FENCE_GATE = registerBlock("laburnum_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_FENCE_GATE = registerBlock("jade_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_FENCE_GATE = registerBlock("paulownia_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_FENCE_GATE = registerBlock("wisteria_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_FENCE_GATE = registerBlock("jacaranda_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_FENCE_GATE = registerBlock("dogwood_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_FENCE_GATE = registerBlock("silverbell_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_FENCE_GATE = registerBlock("cedar_fence_gate",
            ()-> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.4f, 2.5f)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
//WOOD PRESSURE PLATES//
public static final RegistryObject<Block> CRABAPPLE_PRESSURE_PLATE = registerBlock("crabapple_pressure_plate",
        ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.CRABAPPLE_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_PRESSURE_PLATE = registerBlock("poinciana_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.POINCIANA_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_PRESSURE_PLATE = registerBlock("laburnum_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.LABURNUM_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_PRESSURE_PLATE = registerBlock("jade_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.JADE_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_PRESSURE_PLATE = registerBlock("paulownia_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.PAULOWNIA_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_PRESSURE_PLATE = registerBlock("wisteria_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.WISTERIA_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_PRESSURE_PLATE = registerBlock("jacaranda_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.JACARANDA_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_PRESSURE_PLATE = registerBlock("dogwood_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.DOGWOOD_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_PRESSURE_PLATE = registerBlock("silverbell_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.SILVERBELL_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_PRESSURE_PLATE = registerBlock("cedar_pressure_plate",
            ()-> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,(Block.Properties.copy(ModBlocks.CEDAR_PLANKS.get()).sound(SoundType.WOOD))), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //WOOD BUTTONS//
public static final RegistryObject<Block> CRABAPPLE_BUTTON = registerBlock("crabapple_button",
        ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_BUTTON = registerBlock("poinciana_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_BUTTON = registerBlock("laburnum_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_BUTTON = registerBlock("jade_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_BUTTON = registerBlock("paulownia_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_BUTTON = registerBlock("wisteria_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_BUTTON = registerBlock("jacaranda_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_BUTTON = registerBlock("dogwood_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_BUTTON = registerBlock("silverbell_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_BUTTON = registerBlock("cedar_button",
            ()-> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
//DOORS//
    //DOOR 1//
public static final RegistryObject<Block> CRABAPPLE_DOOR_1 = registerBlock("crabapple_door_1",
        ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_DOOR_1 = registerBlock("poinciana_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_DOOR_1 = registerBlock("laburnum_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_DOOR_1 = registerBlock("jade_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_DOOR_1 = registerBlock("paulownia_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_DOOR_1 = registerBlock("wisteria_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_DOOR_1 = registerBlock("jacaranda_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_DOOR_1 = registerBlock("dogwood_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_DOOR_1 = registerBlock("silverbell_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_DOOR_1 = registerBlock("cedar_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_DOOR_1 = registerBlock("acacia_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_DOOR_1 = registerBlock("birch_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_DOOR_1 = registerBlock("oak_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_DOOR_1 = registerBlock("spruce_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_DOOR_1 = registerBlock("dark_oak_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_DOOR_1 = registerBlock("jungle_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_DOOR_1 = registerBlock("crimson_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_DOOR_1 = registerBlock("warped_door_1",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_DOOR_2 = registerBlock("acacia_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //DOOR 2//
    public static final RegistryObject<Block> CRABAPPLE_DOOR_2 = registerBlock("crabapple_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_DOOR_2 = registerBlock("poinciana_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_DOOR_2 = registerBlock("laburnum_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_DOOR_2 = registerBlock("jade_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_DOOR_2 = registerBlock("paulownia_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_DOOR_2 = registerBlock("wisteria_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_DOOR_2 = registerBlock("jacaranda_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_DOOR_2 = registerBlock("dogwood_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_DOOR_2 = registerBlock("silverbell_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_DOOR_2 = registerBlock("cedar_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_DOOR_2 = registerBlock("birch_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_DOOR_2 = registerBlock("oak_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_DOOR_2 = registerBlock("spruce_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_DOOR_2 = registerBlock("dark_oak_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_DOOR_2 = registerBlock("jungle_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_DOOR_2 = registerBlock("crimson_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_DOOR_2 = registerBlock("warped_door_2",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //DOOR 3//
    public static final RegistryObject<Block> CRABAPPLE_DOOR_3 = registerBlock("crabapple_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_DOOR_3 = registerBlock("poinciana_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_DOOR_3 = registerBlock("laburnum_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_DOOR_3 = registerBlock("jade_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_DOOR_3 = registerBlock("paulownia_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_DOOR_3 = registerBlock("wisteria_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_DOOR_3 = registerBlock("jacaranda_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_DOOR_3 = registerBlock("dogwood_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_DOOR_3 = registerBlock("silverbell_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_DOOR_3 = registerBlock("cedar_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_DOOR_3 = registerBlock("acacia_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_DOOR_3 = registerBlock("birch_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_DOOR_3 = registerBlock("oak_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_DOOR_3 = registerBlock("spruce_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_DOOR_3 = registerBlock("dark_oak_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_DOOR_3 = registerBlock("jungle_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_DOOR_3 = registerBlock("crimson_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_DOOR_3 = registerBlock("warped_door_3",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //DOOR 4//
    public static final RegistryObject<Block> CRABAPPLE_DOOR_4 = registerBlock("crabapple_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_DOOR_4 = registerBlock("poinciana_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_DOOR_4 = registerBlock("laburnum_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_DOOR_4 = registerBlock("jade_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_DOOR_4 = registerBlock("paulownia_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_DOOR_4 = registerBlock("wisteria_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_DOOR_4 = registerBlock("jacaranda_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_DOOR_4 = registerBlock("dogwood_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_DOOR_4 = registerBlock("silverbell_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_DOOR_4 = registerBlock("cedar_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_DOOR_4 = registerBlock("acacia_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_DOOR_4 = registerBlock("birch_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_DOOR_4 = registerBlock("oak_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_DOOR_4 = registerBlock("spruce_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_DOOR_4 = registerBlock("dark_oak_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_DOOR_4 = registerBlock("jungle_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_DOOR_4 = registerBlock("crimson_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_DOOR_4 = registerBlock("warped_door_4",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    //DOOR 5//
    public static final RegistryObject<Block> CRABAPPLE_DOOR_5 = registerBlock("crabapple_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_DOOR_5 = registerBlock("poinciana_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_DOOR_5 = registerBlock("laburnum_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_DOOR_5 = registerBlock("jade_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_DOOR_5 = registerBlock("paulownia_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_DOOR_5 = registerBlock("wisteria_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_DOOR_5 = registerBlock("jacaranda_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_DOOR_5 = registerBlock("dogwood_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_DOOR_5 = registerBlock("silverbell_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_DOOR_5 = registerBlock("cedar_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_DOOR_5 = registerBlock("acacia_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_DOOR_5 = registerBlock("birch_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_DOOR_5 = registerBlock("oak_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_DOOR_5 = registerBlock("spruce_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_DOOR_5 = registerBlock("dark_oak_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_DOOR_5 = registerBlock("jungle_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_DOOR_5 = registerBlock("crimson_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_DOOR_5 = registerBlock("warped_door_5",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //DOOR 6//
    public static final RegistryObject<Block> CRABAPPLE_DOOR_6 = registerBlock("crabapple_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_DOOR_6 = registerBlock("poinciana_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_DOOR_6 = registerBlock("laburnum_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_DOOR_6 = registerBlock("jade_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_DOOR_6 = registerBlock("paulownia_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_DOOR_6 = registerBlock("wisteria_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_DOOR_6 = registerBlock("jacaranda_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_DOOR_6 = registerBlock("dogwood_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_DOOR_6 = registerBlock("silverbell_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_DOOR_6 = registerBlock("cedar_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> ACACIA_DOOR_6 = registerBlock("acacia_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_DOOR_6 = registerBlock("birch_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_DOOR_6 = registerBlock("oak_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_DOOR_6 = registerBlock("spruce_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_DOOR_6 = registerBlock("dark_oak_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_DOOR_6 = registerBlock("jungle_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_DOOR_6 = registerBlock("crimson_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_DOOR_6 = registerBlock("warped_door_6",
            ()-> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //TRAPDOORS//

//TRAPDOOR 1//
public static final RegistryObject<Block> CRABAPPLE_TRAPDOOR_1 = registerBlock("crabapple_trapdoor_1",
        ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_TRAPDOOR_1 = registerBlock("poinciana_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_TRAPDOOR_1 = registerBlock("laburnum_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TRAPDOOR_1 = registerBlock("jade_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_TRAPDOOR_1 = registerBlock("paulownia_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_TRAPDOOR_1 = registerBlock("wisteria_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_TRAPDOOR_1 = registerBlock("jacaranda_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_TRAPDOOR_1 = registerBlock("dogwood_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_TRAPDOOR_1 = registerBlock("silverbell_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_TRAPDOOR_1 = registerBlock("cedar_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_TRAPDOOR_1 = registerBlock("acacia_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_TRAPDOOR_1 = registerBlock("birch_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_TRAPDOOR_1 = registerBlock("oak_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR_1 = registerBlock("spruce_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR_1 = registerBlock("dark_oak_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR_1 = registerBlock("jungle_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_TRAPDOOR_1 = registerBlock("crimson_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_TRAPDOOR_1 = registerBlock("warped_trapdoor_1",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_TRAPDOOR_2 = registerBlock("acacia_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    //TRAPDOOR 2//
    public static final RegistryObject<Block> CRABAPPLE_TRAPDOOR_2 = registerBlock("crabapple_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_TRAPDOOR_2 = registerBlock("poinciana_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_TRAPDOOR_2 = registerBlock("laburnum_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TRAPDOOR_2 = registerBlock("jade_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_TRAPDOOR_2 = registerBlock("paulownia_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_TRAPDOOR_2 = registerBlock("wisteria_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_TRAPDOOR_2 = registerBlock("jacaranda_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_TRAPDOOR_2 = registerBlock("dogwood_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_TRAPDOOR_2 = registerBlock("silverbell_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_TRAPDOOR_2 = registerBlock("cedar_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_TRAPDOOR_2 = registerBlock("birch_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_TRAPDOOR_2 = registerBlock("oak_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR_2 = registerBlock("spruce_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR_2 = registerBlock("dark_oak_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR_2 = registerBlock("jungle_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_TRAPDOOR_2 = registerBlock("crimson_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_TRAPDOOR_2 = registerBlock("warped_trapdoor_2",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR 3//
    public static final RegistryObject<Block> CRABAPPLE_TRAPDOOR_3 = registerBlock("crabapple_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_TRAPDOOR_3 = registerBlock("poinciana_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_TRAPDOOR_3 = registerBlock("laburnum_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TRAPDOOR_3 = registerBlock("jade_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_TRAPDOOR_3 = registerBlock("paulownia_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_TRAPDOOR_3 = registerBlock("wisteria_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_TRAPDOOR_3 = registerBlock("jacaranda_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_TRAPDOOR_3 = registerBlock("dogwood_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_TRAPDOOR_3 = registerBlock("silverbell_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_TRAPDOOR_3 = registerBlock("cedar_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ACACIA_TRAPDOOR_3 = registerBlock("acacia_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_TRAPDOOR_3 = registerBlock("birch_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_TRAPDOOR_3 = registerBlock("oak_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR_3 = registerBlock("spruce_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR_3 = registerBlock("dark_oak_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR_3 = registerBlock("jungle_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_TRAPDOOR_3 = registerBlock("crimson_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_TRAPDOOR_3 = registerBlock("warped_trapdoor_3",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR 4//
    public static final RegistryObject<Block> CRABAPPLE_TRAPDOOR_4 = registerBlock("crabapple_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> POINCIANA_TRAPDOOR_4 = registerBlock("poinciana_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> LABURNUM_TRAPDOOR_4 = registerBlock("laburnum_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JADE_TRAPDOOR_4 = registerBlock("jade_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> PAULOWNIA_TRAPDOOR_4 = registerBlock("paulownia_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WISTERIA_TRAPDOOR_4 = registerBlock("wisteria_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JACARANDA_TRAPDOOR_4 = registerBlock("jacaranda_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DOGWOOD_TRAPDOOR_4 = registerBlock("dogwood_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SILVERBELL_TRAPDOOR_4 = registerBlock("silverbell_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CEDAR_TRAPDOOR_4 = registerBlock("cedar_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> ACACIA_TRAPDOOR_4 = registerBlock("acacia_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> BIRCH_TRAPDOOR_4 = registerBlock("birch_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> OAK_TRAPDOOR_4 = registerBlock("oak_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> SPRUCE_TRAPDOOR_4 = registerBlock("spruce_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> DARK_OAK_TRAPDOOR_4 = registerBlock("dark_oak_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> JUNGLE_TRAPDOOR_4 = registerBlock("jungle_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> CRIMSON_TRAPDOOR_4 = registerBlock("crimson_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> WARPED_TRAPDOOR_4 = registerBlock("warped_trapdoor_4",
            ()-> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(0.5F, 2.0F)), MarvelousMaterials.MAIDENS_BLOCKS_GROUP);




    //VASES//

public static final RegistryObject<Block> VASE_RED = registerBlock("vase_red",
        () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

public static final RegistryObject<Block> VASE_ORANGE = registerBlock("vase_orange",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_YELLOW = registerBlock("vase_yellow",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_LIME = registerBlock("vase_lime",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_GREEN = registerBlock("vase_green",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_CYAN = registerBlock("vase_cyan",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_LIGHT_BLUE = registerBlock("vase_light_blue",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_BLUE = registerBlock("vase_blue",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_PURPLE = registerBlock("vase_purple",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_MAGENTA = registerBlock("vase_magenta",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_PINK = registerBlock("vase_pink",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_WHITE = registerBlock("vase_white",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_LIGHT_GRAY = registerBlock("vase_light_gray",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_GRAY = registerBlock("vase_gray",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_BLACK = registerBlock("vase_black",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> VASE_BROWN = registerBlock("vase_brown",
            () -> new VaseBlock(BlockBehaviour.Properties.of(Material.CLAY).noOcclusion().instabreak()),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    //CHESTS//
    public static final RegistryObject<ModChestBlock> ACACIA_CHEST = registerBlock("acacia_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> BIRCH_CHEST = registerBlock("birch_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> OAK_CHEST = registerBlock("oak_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> SPRUCE_CHEST = registerBlock("spruce_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> DARK_OAK_CHEST = registerBlock("dark_oak_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> JUNGLE_CHEST = registerBlock("jungle_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> CRIMSON_CHEST = registerBlock("crimson_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> WARPED_CHEST = registerBlock("warped_chest",
            () -> new ModChestBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    //FOREST WOODS//
    public static final RegistryObject<ModChestBlock> CRABAPPLE_CHEST = registerBlock("crabapple_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.CRABAPPLE_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> POINCIANA_CHEST = registerBlock("poinciana_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.POINCIANA_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> LABURNUM_CHEST = registerBlock("laburnum_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.LABURNUM_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> JADE_CHEST = registerBlock("jade_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.JADE_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> PAULOWNIA_CHEST = registerBlock("paulownia_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.PAULOWNIA_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> WISTERIA_CHEST = registerBlock("wisteria_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.WISTERIA_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> JACARANDA_CHEST = registerBlock("jacaranda_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.JACARANDA_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> DOGWOOD_CHEST = registerBlock("dogwood_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.DOGWOOD_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> SILVERBELL_CHEST = registerBlock("silverbell_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.SILVERBELL_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<ModChestBlock> CEDAR_CHEST = registerBlock("cedar_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.CEDAR_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);
    //STAINED WOODS//
    public static final RegistryObject<ModChestBlock> RED_STAINED_CHEST = registerBlock("red_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.RED_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> ORANGE_STAINED_CHEST = registerBlock("orange_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.ORANGE_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> YELLOW_STAINED_CHEST = registerBlock("yellow_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.YELLOW_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> LIME_STAINED_CHEST = registerBlock("lime_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.LIME_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> GREEN_STAINED_CHEST = registerBlock("green_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.GREEN_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> CYAN_STAINED_CHEST = registerBlock("cyan_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.CYAN_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> LIGHT_BLUE_STAINED_CHEST = registerBlock("light_blue_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.LIGHT_BLUE_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> BLUE_STAINED_CHEST = registerBlock("blue_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.BLUE_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> PURPLE_STAINED_CHEST = registerBlock("purple_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.PURPLE_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> MAGENTA_STAINED_CHEST = registerBlock("magenta_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.MAGENTA_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> PINK_STAINED_CHEST = registerBlock("pink_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.PINK_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> WHITE_STAINED_CHEST = registerBlock("white_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.WHITE_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> LIGHT_GRAY_STAINED_CHEST = registerBlock("light_gray_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.LIGHT_GRAY_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> GRAY_STAINED_CHEST = registerBlock("gray_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.GRAY_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> BLACK_STAINED_CHEST = registerBlock("black_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.BLACK_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<ModChestBlock> BROWN_STAINED_CHEST = registerBlock("brown_stained_chest",
            ()-> new ModChestBlock(Block.Properties.copy(ModBlocks.BROWN_STAINED_PLANKS.get()).strength(0.5F)),MarvelousMaterials.MAIDENS_BLOCKS_GROUP);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(MarvelousMaterials.MAIDENS_BLOCKS_GROUP)));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


    public static final List<Block> GRASS= new ArrayList<Block>();
    public static List<Block> VALID_BLOCKS = new ArrayList<>();

}