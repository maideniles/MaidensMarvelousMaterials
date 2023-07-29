package com.maideniles.maidensmaterials.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MarvelousClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("Client Configs for Marvelous Materials Mod");

        // HERE DEFINE YOUR CONFIGS

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
