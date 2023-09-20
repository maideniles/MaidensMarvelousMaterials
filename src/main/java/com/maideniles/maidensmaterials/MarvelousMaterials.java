package com.maideniles.maidensmaterials;


import com.google.common.collect.Maps;
import com.maideniles.maidensmaterials.config.MarvelousClientConfig;
import com.maideniles.maidensmaterials.config.MarvelousCommonConfig;
import com.maideniles.maidensmaterials.init.*;
import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.gen.biome.*;
import com.mojang.serialization.Codec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.util.Locale;

import static com.maideniles.maidensmaterials.init.ModCreativeModeTabs.CREATIVE_MODE_TABS;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MarvelousMaterials.MOD_ID)
public class MarvelousMaterials {
    public static final String MOD_ID = "maidensmaterials";


    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();






    public MarvelousMaterials() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MarvelousClientConfig.SPEC, "maidensmaterials-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarvelousCommonConfig.SPEC, "maidensmaterials-common.toml");


        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        Registration.register(eventBus);





        ModSoundEvents.register(eventBus);
        ModPotions.register(eventBus);
        ModEffects.register(eventBus);



        CREATIVE_MODE_TABS.register(eventBus);

        ModTreeDecoratorTypes.register(eventBus);
        ModEnchantments.register();

        ModBlockEntities.BLOCK_ENTITIES.register(eventBus);



        eventBus.addListener(this::setup);






        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // add a comment

    private void setup(final FMLCommonSetupEvent event) {



        event.enqueueWork(() -> {

            // Weights are kept intentionally low as we add minimal biomes
            Regions.register(new OFRegion1(new ResourceLocation(MOD_ID, "ornamental_forest"), 2));


            // Register our surface rules
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, MMSurfaceRuleData.makeRules());
        });
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

            ComposterBlock.COMPOSTABLES.put(ModItems.CRABAPPLE_BLOSSOMS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.POINCIANA_BLOSSOMS.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.LABURNUM_BLOSSOMS.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.JADE_BLOSSOMS.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.PAULOWNIA_BLOSSOMS.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.WISTERIA_BLOSSOMS.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.JACARANDA_BLOSSOMS.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.DOGWOOD_BLOSSOMS.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.SILVERBELL_BLOSSOMS.get(),0.65F);

            ComposterBlock.COMPOSTABLES.put(ModBlocks.CRABAPPLE_LEAVES.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.POINCIANA_LEAVES.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LABURNUM_LEAVES.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.JADE_LEAVES.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PAULOWNIA_LEAVES.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WISTERIA_LEAVES.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.JACARANDA_LEAVES.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOGWOOD_LEAVES.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SILVERBELL_LEAVES.get(),0.3F);

            ComposterBlock.COMPOSTABLES.put(ModBlocks.CRABAPPLE_SAPLING.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.POINCIANA_SAPLING.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LABURNUM_SAPLING.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.JADE_SAPLING.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PAULOWNIA_SAPLING.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WISTERIA_SAPLING.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.JACARANDA_SAPLING.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOGWOOD_SAPLING.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SILVERBELL_SAPLING.get(),0.3F);

            ComposterBlock.COMPOSTABLES.put(ModBlocks.CRABAPPLE_VINE.get(), 0.5F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.POINCIANA_VINE.get(),0.5F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.LABURNUM_VINE.get(),0.5F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.JADE_VINE.get(),0.5F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.PAULOWNIA_VINE.get(),0.5F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WISTERIA_VINE.get(),0.5F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.JACARANDA_VINE.get(),0.5F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.DOGWOOD_VINE.get(),0.5F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.SILVERBELL_VINE.get(),0.5F);

            ComposterBlock.COMPOSTABLES.put(ModBlocks.FAIRY_GLOW_CUP.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.ORNAMENTAL_MUSHROOM.get(),0.65F);

        }
        // some preinit code





    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }

}