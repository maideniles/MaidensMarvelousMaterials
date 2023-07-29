package com.maideniles.maidensmaterials.world.gen.biome;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes
{

    public static DeferredRegister<Biome> BIOME_REGISTER = DeferredRegister.create(Registry.BIOME_REGISTRY, MarvelousMaterials.MOD_ID);


    public static void registerBiomes()
    {
        register(ModBiomeKeys.ORNAMENTAL_FOREST, ModOverworldBiomes::ornamentalForest);

    }

    public static RegistryObject<Biome> register(ResourceKey<Biome> key, Supplier<Biome> biomeSupplier)
    {
        return BIOME_REGISTER.register(key.location().getPath(), biomeSupplier);
    }


}









