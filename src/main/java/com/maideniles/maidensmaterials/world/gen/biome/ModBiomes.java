package com.maideniles.maidensmaterials.world.gen.biome;

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;



@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes
{
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event)
    {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registry.register(ModOverworldBiomes.ornamentalForest().setRegistryName(ModBiomeKeys.ORNAMENTAL_FOREST.location()));

    }


}









