package com.maideniles.maidensmaterials.potion;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.level.block.Blocks;

public class GatherersGleeEffect extends MobEffect {
    public GatherersGleeEffect() {
        super(MobEffectCategory.BENEFICIAL, 16776960);

        //ADD BLOCKS TO ORE LIST//
        ModBlocks.VALID_BLOCKS.add(Blocks.GLOWSTONE);
        ModBlocks.VALID_BLOCKS.add(Blocks.COAL_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.IRON_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.GOLD_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.EMERALD_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.REDSTONE_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.LAPIS_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.DIAMOND_ORE);

        ModBlocks.VALID_BLOCKS.add(Blocks.DEEPSLATE_COAL_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.DEEPSLATE_IRON_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.DEEPSLATE_GOLD_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.DEEPSLATE_EMERALD_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.DEEPSLATE_REDSTONE_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.DEEPSLATE_LAPIS_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.DEEPSLATE_DIAMOND_ORE);
        ModBlocks.VALID_BLOCKS.add(Blocks.NETHER_QUARTZ_ORE);

        ModBlocks.VALID_BLOCKS.add(ModBlocks.AMETHYST_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.AVENTURINE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CARNELIAN_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CHALCOPYRITE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CITRINE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.JADE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.JASPER_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.LABRADORITE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.MICA_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.MOONSTONE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.ROSE_QUARTZ_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.SODALITE_ORE.get());

        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_AMETHYST_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_AVENTURINE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_CARNELIAN_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_CHALCOPYRITE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_CITRINE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_JADE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_JASPER_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_LABRADORITE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_MICA_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_MOONSTONE_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DEEPSLATE_SODALITE_ORE.get());

        //ADD BLOCKS TO WOOD LIST//
        ModBlocks.VALID_BLOCKS.add(Blocks.ACACIA_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.BIRCH_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.OAK_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.DARK_OAK_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.SPRUCE_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.JUNGLE_LOG);
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CEDAR_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.CRABAPPLE_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.POINCIANA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.LABURNUM_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.JADE_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.PAULOWNIA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.WISTERIA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.JACARANDA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.DOGWOOD_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.SILVERBELL_LOG.get());

        ModBlocks.VALID_BLOCKS.add(Blocks.STRIPPED_ACACIA_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.STRIPPED_BIRCH_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.STRIPPED_OAK_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.STRIPPED_DARK_OAK_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.STRIPPED_SPRUCE_LOG);
        ModBlocks.VALID_BLOCKS.add(Blocks.STRIPPED_JUNGLE_LOG);
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_CEDAR_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_POINCIANA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_LABURNUM_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_JADE_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_PAULOWNIA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_WISTERIA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_JACARANDA_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_DOGWOOD_LOG.get());
        ModBlocks.VALID_BLOCKS.add(ModBlocks.STRIPPED_SILVERBELL_LOG.get());

    }


}
