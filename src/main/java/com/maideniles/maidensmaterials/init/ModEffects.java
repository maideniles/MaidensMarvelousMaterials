package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.potion.FloralFortuneEffect;
import com.maideniles.maidensmaterials.potion.GatherersGleeEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {

    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MarvelousMaterials.MOD_ID);

    public static final RegistryObject<MobEffect> FLORAL_FORTUNE_EFFECT = EFFECTS.register("floral_fortune", FloralFortuneEffect::new);
    public static final RegistryObject<MobEffect> GATHERERS_GLEE_EFFECT = EFFECTS.register("gatherers_glee", GatherersGleeEffect::new);

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }

}