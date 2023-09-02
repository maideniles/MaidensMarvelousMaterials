package com.maideniles.maidensmaterials.event;


import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.recipe.MortarPestleRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = MarvelousMaterials.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegisterEvent event) {


        event.register(ForgeRegistries.Keys.RECIPE_TYPES, helper -> {
                    helper.register(new ResourceLocation(MarvelousMaterials.MOD_ID, MortarPestleRecipe.Type.ID),
                            MortarPestleRecipe.Type.INSTANCE);



                }


        );
    }


}
