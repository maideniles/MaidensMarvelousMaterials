package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MarvelousMaterials.MOD_ID);


    public static final RegistryObject<SoundEvent> MORTAR_PESTLE_GRIND =
            registerSoundEvent("mortar_pestle_grind");

    public static final RegistryObject<SoundEvent> OF_MUSIC = registerSoundEvent("forest_music");






    private static RegistryObject<SoundEvent> registerSoundEvent(String sound) {
        return SOUND_EVENTS.register(sound, () -> SoundEvent.createVariableRangeEvent(MarvelousMaterials.prefix(sound)));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
