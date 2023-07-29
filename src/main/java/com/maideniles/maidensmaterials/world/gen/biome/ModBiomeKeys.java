package com.maideniles.maidensmaterials.world.gen.biome;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeKeys
{
    public static final ResourceKey<Biome> ORNAMENTAL_FOREST = register("ornamental_forest");


    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(MarvelousMaterials.MOD_ID, name));
    }
}
