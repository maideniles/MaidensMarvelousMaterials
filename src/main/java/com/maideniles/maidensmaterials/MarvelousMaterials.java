package com.maideniles.maidensmaterials;


import com.google.common.collect.Maps;
import com.maideniles.maidensmaterials.config.MarvelousClientConfig;
import com.maideniles.maidensmaterials.config.MarvelousCommonConfig;
import com.maideniles.maidensmaterials.init.*;
import com.maideniles.maidensmaterials.util.Registration;
import com.maideniles.maidensmaterials.world.gen.biome.ModBiomeModifier;
import com.maideniles.maidensmaterials.world.gen.biome.ModBiomes;
import com.maideniles.maidensmaterials.world.gen.biome.ModRegion;
import com.maideniles.maidensmaterials.world.gen.biome.OrnamentalForestSurfaceData;
import com.mojang.serialization.Codec;
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
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MarvelousClientConfig.SPEC, "maidensmaterials-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarvelousCommonConfig.SPEC, "maidensmaterials-common.toml");


        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        Registration.register(eventBus);

        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);


        ModPotions.register(eventBus);
        ModEffects.register(eventBus);

        ModBiomes.BIOME_REGISTER.register(eventBus);
        ModBiomes.registerBiomes();

        ModFeatures.register(eventBus);
        ModPlacements.register(eventBus);

        ModTreeDecoratorTypes.register();
        ModEnchantments.register();

        ModBlockEntities.BLOCK_ENTITIES.register(eventBus);



        eventBus.addListener(this::setup);



        //VEGETAL FEATURE GEN IN ModBiomeModifier//
        final DeferredRegister<Codec<? extends BiomeModifier>> crabapple_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        crabapple_serializers.register(eventBus);
        crabapple_serializers.register("add_crabapple", ModBiomeModifier.CrabappleModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> poinciana_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        poinciana_serializers.register(eventBus);
        poinciana_serializers.register("add_poinciana", ModBiomeModifier.PoincianaModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> laburnum_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        laburnum_serializers.register(eventBus);
        laburnum_serializers.register("add_laburnum", ModBiomeModifier.LaburnumModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> jade_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        jade_serializers.register(eventBus);
        jade_serializers.register("add_jade", ModBiomeModifier.JadeModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> paulownia_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        paulownia_serializers.register(eventBus);
        paulownia_serializers.register("add_paulownia", ModBiomeModifier.PaulowniaModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> wisteria_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        wisteria_serializers.register(eventBus);
        wisteria_serializers.register("add_wisteria", ModBiomeModifier.WisteriaModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> jacaranda_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        jacaranda_serializers.register(eventBus);
        jacaranda_serializers.register("add_jacaranda", ModBiomeModifier.JacarandaModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> dogwood_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        dogwood_serializers.register(eventBus);
        dogwood_serializers.register("add_dogwood", ModBiomeModifier.DogwoodModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> silverbell_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        silverbell_serializers.register(eventBus);
        silverbell_serializers.register("add_silverbell", ModBiomeModifier.SilverbellModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> cedar_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        cedar_serializers.register(eventBus);
        cedar_serializers.register("add_cedar", ModBiomeModifier.CedarModifier::makeCodec);

        final DeferredRegister<Codec<? extends BiomeModifier>> ornamental_mushrooms_serializers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MOD_ID);
        ornamental_mushrooms_serializers.register(eventBus);
        ornamental_mushrooms_serializers.register("add_ornamental_mushrooms", ModBiomeModifier.OrnamentalMushroomsModifier::makeCodec);



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

    }



    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }

}