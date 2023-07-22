package com.maideniles.maidensmaterials;


import com.google.common.collect.Maps;
import com.maideniles.maidensmaterials.client.RenderLayers;
import com.maideniles.maidensmaterials.config.MarvelousClientConfig;
import com.maideniles.maidensmaterials.config.MarvelousCommonConfig;
import com.maideniles.maidensmaterials.init.*;
import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.gen.biome.ModRegion;
import com.maideniles.maidensmaterials.world.gen.biome.OrnamentalForestSurfaceData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.util.Locale;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MarvelousMaterials.MOD_ID)
public class MarvelousMaterials {
    public static final String MOD_ID = "maidensmaterials";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();


    public static final CreativeModeTab MAIDENS_BLOCKS_GROUP = new CreativeModeTab("maidens_blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.AMETHYST_BLOCK);
        }
    };

    public static final CreativeModeTab MAIDENS_ITEMS_GROUP = new CreativeModeTab("maidens_items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.AMETHYST_SHARD);
        }
    };

    public MarvelousMaterials() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Registration.register(eventBus);
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        RenderLayers.safeRunClient();
        ModPotions.register(eventBus);
        ModEffects.register(eventBus);


      //  ModFeatures.FEATURES.register(eventBus);
      //  ModTreeDecoratorTypes.TREE_DECORATORS.register(eventBus);

        ModTreeDecoratorTypes.register();
        ModEnchantments.register();

        ModBlockEntities.BLOCK_ENTITIES.register(eventBus);



        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MarvelousClientConfig.SPEC, "maidensmaterials-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarvelousCommonConfig.SPEC, "maidensmaterials-common.toml");
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // add a comment

    private void setup(final FMLCommonSetupEvent event) {



        event.enqueueWork(() -> {

            Regions.register(new ModRegion(new ResourceLocation(MOD_ID, "overworld"), MarvelousCommonConfig.ORNAMENTAL_FOREST_WEIGHT.get()));

            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, OrnamentalForestSurfaceData.makeRules());

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ORNAMENTAL_MUSHROOM.getId(), ModBlocks.POTTED_ORNAMENTAL_MUSHROOM);


            BrewingRecipeRegistry.addRecipe(new ModPotions.BetterBrewingRecipe(Potions.MUNDANE,
                    ModItems.FLORAL_ESSENCE.get(), ModPotions.FLORAL_FORTUNE_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new ModPotions.BetterBrewingRecipe(Potions.MUNDANE,
                    ModItems.EARTHEN_ESSENCE.get(), ModPotions.GATHERERS_GLEE_POTION.get()));


            AxeItem.STRIPPABLES = Maps.newHashMap(AxeItem.STRIPPABLES);
            AxeItem.STRIPPABLES.put(ModBlocks.CRABAPPLE_LOG.get(), ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.POINCIANA_LOG.get(), ModBlocks.STRIPPED_POINCIANA_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.LABURNUM_LOG.get(), ModBlocks.STRIPPED_LABURNUM_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.JADE_LOG.get(), ModBlocks.STRIPPED_JADE_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.PAULOWNIA_LOG.get(), ModBlocks.STRIPPED_PAULOWNIA_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.WISTERIA_LOG.get(), ModBlocks.STRIPPED_WISTERIA_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.JACARANDA_LOG.get(), ModBlocks.STRIPPED_JACARANDA_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.DOGWOOD_LOG.get(), ModBlocks.STRIPPED_DOGWOOD_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.SILVERBELL_LOG.get(), ModBlocks.STRIPPED_SILVERBELL_LOG.get());
            AxeItem.STRIPPABLES.put(ModBlocks.CEDAR_LOG.get(), ModBlocks.STRIPPED_CEDAR_LOG.get());


            AxeItem.STRIPPABLES.put(ModBlocks.CRABAPPLE_WOOD.get(), ModBlocks.STRIPPED_CRABAPPLE_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.POINCIANA_WOOD.get(), ModBlocks.STRIPPED_POINCIANA_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.LABURNUM_WOOD.get(), ModBlocks.STRIPPED_LABURNUM_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.JADE_WOOD.get(), ModBlocks.STRIPPED_JADE_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.PAULOWNIA_WOOD.get(), ModBlocks.STRIPPED_PAULOWNIA_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.WISTERIA_WOOD.get(), ModBlocks.STRIPPED_WISTERIA_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.JACARANDA_WOOD.get(), ModBlocks.STRIPPED_JACARANDA_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.DOGWOOD_WOOD.get(), ModBlocks.STRIPPED_DOGWOOD_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.SILVERBELL_WOOD.get(), ModBlocks.STRIPPED_SILVERBELL_WOOD.get());
            AxeItem.STRIPPABLES.put(ModBlocks.CEDAR_WOOD.get(), ModBlocks.STRIPPED_CEDAR_WOOD.get());

        });
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }

}