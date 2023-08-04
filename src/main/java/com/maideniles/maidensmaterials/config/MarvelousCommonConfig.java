package com.maideniles.maidensmaterials.config;

import net.minecraft.network.chat.Component;
import net.minecraftforge.common.ForgeConfigSpec;
import org.lwjgl.system.CallbackI;

public class MarvelousCommonConfig {

    public static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.BooleanValue CRABAPPLE_ENABLED;
    public static ForgeConfigSpec.BooleanValue POINCIANA_ENABLED;
    public static ForgeConfigSpec.BooleanValue LABURNUM_ENABLED;
    public static ForgeConfigSpec.BooleanValue JADE_ENABLED;
    public static ForgeConfigSpec.BooleanValue PAULOWNIA_ENABLED;
    public static ForgeConfigSpec.BooleanValue WISTERIA_ENABLED;
    public static ForgeConfigSpec.BooleanValue JACARANDA_ENABLED;
    public static ForgeConfigSpec.BooleanValue DOGWOOD_ENABLED;
    public static ForgeConfigSpec.BooleanValue SILVERBELL_ENABLED;
    public static ForgeConfigSpec.BooleanValue CEDAR_ENABLED;
    public static ForgeConfigSpec.BooleanValue ORNAMENTAL_MUSHROOMS_ENABLED;


/*    public static ForgeConfigSpec.IntValue CITRINE_STONE_VEINS;
    public static ForgeConfigSpec.IntValue CITRINE_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue JADE_STONE_VEINS;
    public static ForgeConfigSpec.IntValue JADE_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue JASPER_STONE_VEINS;
    public static ForgeConfigSpec.IntValue JASPER_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue MOONSTONE_STONE_VEINS;
    public static ForgeConfigSpec.IntValue MOONSTONE_DEEPSLATE_VEINS;


    public static ForgeConfigSpec.IntValue AVENTURINE_STONE_VEINS;
    public static ForgeConfigSpec.IntValue AVENTURINE_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue LABRADORITE_STONE_VEINS;
    public static ForgeConfigSpec.IntValue LABRADORITE_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue MICA_STONE_VEINS;
    public static ForgeConfigSpec.IntValue MICA_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue ROSE_QUARTZ_STONE_VEINS;
    public static ForgeConfigSpec.IntValue ROSE_QUARTZ_DEEPSLATE_VEINS;


    public static ForgeConfigSpec.IntValue AMETHYST_STONE_VEINS;
    public static ForgeConfigSpec.IntValue AMETHYST_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue CARNELIAN_STONE_VEINS;
    public static ForgeConfigSpec.IntValue CARNELIAN_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue CHALCOPYRITE_STONE_VEINS;
    public static ForgeConfigSpec.IntValue CHALCOPYRITE_DEEPSLATE_VEINS;

    public static ForgeConfigSpec.IntValue SODALITE_STONE_VEINS;
    public static ForgeConfigSpec.IntValue SODALITE_DEEPSLATE_VEINS;
*/
    public static ForgeConfigSpec.IntValue EARTHEN_ESSENCE_DROP_RATE;

    public static ForgeConfigSpec.IntValue FLORAL_FORTUNE_DURATION;
    public static ForgeConfigSpec.IntValue GATHERERS_GLEE_DURATION;

    public static ForgeConfigSpec.IntValue ORNAMENTAL_FOREST_WEIGHT;


static {
    SERVER_BUILDER.push("Common Configs for Marvelous Materials Mod");

    CRABAPPLE_ENABLED = SERVER_BUILDER.comment("Allow Crabapple Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_crabapple_trees", true);

    POINCIANA_ENABLED = SERVER_BUILDER.comment("Allow Poinciana Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_poinciana_trees",true);

    LABURNUM_ENABLED = SERVER_BUILDER.comment("Allow Laburnum Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_laburnum_trees",true);

    JADE_ENABLED = SERVER_BUILDER.comment("Allow Jade Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_jade_trees",true);

    PAULOWNIA_ENABLED = SERVER_BUILDER.comment("Allow Paulownia Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_paulownia_trees",true);

    WISTERIA_ENABLED = SERVER_BUILDER.comment("Allow Wisteria Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_wisteria_trees",true);

    JACARANDA_ENABLED = SERVER_BUILDER.comment("Allow Jacaranda Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_jacaranda_trees",true);

    DOGWOOD_ENABLED = SERVER_BUILDER.comment("Allow Dogwood Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_dogwood_trees",true);

    SILVERBELL_ENABLED = SERVER_BUILDER.comment("Allow Silverbell Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_silverbell_trees",true);

    CEDAR_ENABLED = SERVER_BUILDER.comment("Allow Cedar Trees to gen naturally in Ornamental Forest. Set false to disable.")
            .define("allow_cedar_trees",true);

    ORNAMENTAL_MUSHROOMS_ENABLED = SERVER_BUILDER.comment("Allow Ornamental Mushrooms to generate naturally in Ornamental Forest. Set false to disable")
            .define("allow_ornamental_mushrooms",true);

    //ORNAMENTAL FOREST BIOME WEIGHT//
    ORNAMENTAL_FOREST_WEIGHT = SERVER_BUILDER.comment("Customize the biome weight of Ornamental Forest. Min 1, Max 100")
            .defineInRange("ornamental_forest_weight", 2,1,100);

//POTION DURATIONS//
    FLORAL_FORTUNE_DURATION = SERVER_BUILDER.comment("Customize the duration of Floral Fortune Potion.  Min 600, Max 3600")
            .defineInRange("floral_fortune_duration", 900, 600, 3600);

    GATHERERS_GLEE_DURATION = SERVER_BUILDER.comment("Customize the duration of Gatherer's Glee Potion.  Min 600, Max 3600")
            .defineInRange("gatherers_glee_duration", 900, 600, 3600);

    EARTHEN_ESSENCE_DROP_RATE = SERVER_BUILDER.comment("Customize the drop rate of Earthen Essence. Default chance is 1 in 200." +
                    "This will change the '200' to your desired chance. For example: 1 in 30 or 1 in 500.  Min 1, Max 10,000")
            .defineInRange("earthen_essence_drops", 200, 1, 10000);

//COMMON ORES//
  /*
    CITRINE_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Citrine Ore. Min 1, Max 100")
            .defineInRange("citrine_stone_veins", 18, 1, 100);

    CITRINE_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Citrine Ore. Min 1, Max 100")
            .defineInRange("citrine_deepslate_veins", 18, 1, 100);

    JADE_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Jade Ore. Min 1, Max 100")
            .defineInRange("jade_stone_veins", 16, 1, 100);

    JADE_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Jade Ore. Min 1, Max 100")
            .defineInRange("jade_deepslate_veins", 16, 1, 100);

    JASPER_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Jasper Ore. Min 1, Max 100")
            .defineInRange("jasper_stone_veins", 20, 1, 100);

    JASPER_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Jasper Ore. Min 1, Max 100")
            .defineInRange("jasper_deepslate_veins", 20, 1, 100);

    MOONSTONE_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Moonstone Ore. Min 1, Max 100")
            .defineInRange("moonstone_stone_veins", 14, 1, 100);

    MOONSTONE_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Moonstone Ore. Min 1, Max 100")
            .defineInRange("moonstone_deepslate_veins", 14, 1, 100);

    //UNCOMMON ORES//

    AVENTURINE_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Aventurine Ore. Min 1, Max 100")
            .defineInRange("aventurine_stone_veins", 12, 1, 100);

    AVENTURINE_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Aventurine Ore. Min 1, Max 100")
            .defineInRange("aventurine_deepslate_veins", 12, 1, 100);

    LABRADORITE_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Labradorite Ore. Min 1, Max 100")
            .defineInRange("labradorite_stone_veins", 14, 1, 100);

    LABRADORITE_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Labradorite Ore. Min 1, Max 100")
            .defineInRange("labradorite_deepslate_veins", 14, 1, 100);

    MICA_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Mica Ore. Min 1, Max 100")
            .defineInRange("mica_stone_veins", 12, 1, 100);

    MICA_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Mica Ore. Min 1, Max 100")
            .defineInRange("mica_deepslate_veins", 12, 1, 100);

    ROSE_QUARTZ_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Rose Quartz Ore. Min 1, Max 100")
            .defineInRange("rose_quartz_stone_veins", 14, 1, 100);

    ROSE_QUARTZ_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Rose Quartz Ore. Min 1, Max 100")
            .defineInRange("rose_quartz_deepslate_veins", 14, 1, 100);

    //RARE ORES//

   AMETHYST_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Amethyst Ore. Min 1, Max 100")
            .defineInRange("amethyst_stone_veins", 8, 1, 100);

    AMETHYST_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Amethyst Ore. Min 1, Max 100")
            .defineInRange("amethyst_deepslate_veins", 6, 1, 100);

    CARNELIAN_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Carnelian Ore. Min 1, Max 100")
            .defineInRange("carnelian_stone_veins", 6, 1, 100);

    CARNELIAN_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Carnelian Ore. Min 1, Max 100")
            .defineInRange("carnelian_deepslate_veins", 7, 1, 100);

    CHALCOPYRITE_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Chalcopyrite Ore. Min 1, Max 100")
            .defineInRange("chalcopyrite_stone_veins", 7, 1, 100);

    CHALCOPYRITE_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Chalcopyrite Ore. Min 1, Max 100")
            .defineInRange("chalcopyrite_deepslate_veins", 7, 1, 100);

    SODALITE_STONE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Sodalite Ore. Min 1, Max 100")
            .defineInRange("sodalite_stone_veins", 7, 1, 100);

    SODALITE_DEEPSLATE_VEINS = SERVER_BUILDER.comment("Customize veins per chunk for Deepslate Sodalite Ore. Min 1, Max 100")
            .defineInRange("sodalite_deepslate_veins", 8, 1, 100);

*/












    SERVER_BUILDER.pop();
    SPEC = SERVER_BUILDER.build();

}
}
