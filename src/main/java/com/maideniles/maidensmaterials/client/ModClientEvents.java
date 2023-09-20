package com.maideniles.maidensmaterials.client;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.client.renderer.blockentity.ModChestRenderer;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = MarvelousMaterials.MOD_ID, value = Dist.CLIENT)
public class ModClientEvents {

        @Mod.EventBusSubscriber(modid = MarvelousMaterials.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
        public static class ModBusEvents {


        /*    @SubscribeEvent
            public static void texStitch(TextureStitchEvent.Pre evt) {
                TextureAtlas map = evt.getAtlas();

                if (Sheets.CHEST_SHEET.equals(map.location()))
                    ModChestRenderer.MATERIALS.values().stream()
                            .flatMap(e -> e.values().stream())
                            .map(Material::texture)
                            .forEach(evt::addSprite);


            }
*/
        }


}