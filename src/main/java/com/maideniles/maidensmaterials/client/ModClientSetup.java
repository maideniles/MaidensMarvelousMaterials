package com.maideniles.maidensmaterials.client;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.init.ModBlockEntities;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.item.ModChestItem;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD, modid = MarvelousMaterials. MOD_ID)
public class ModClientSetup {

    public static boolean optifinePresent = false;

    public static void init() {
        IEventBus busMod = FMLJavaModLoadingContext.get().getModEventBus();


    }

    @Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD, modid = MarvelousMaterials.   MOD_ID)
    public static class ForgeEvents {


        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent evt) {




            ModBlockEntities.registerTileEntityRenders();


            evt.enqueueWork(() -> {
             //    Sheets.addWoodType(ModBlocks.CRABAPPLE);
                //  Sheets.addWoodType(TFBlocks.CANOPY);
                //  Sheets.addWoodType(TFBlocks.MANGROVE);
                //  Sheets.addWoodType(TFBlocks.DARKWOOD);
                //  Sheets.addWoodType(TFBlocks.TIMEWOOD);
                //   Sheets.addWoodType(TFBlocks.TRANSFORMATION);
                //   Sheets.addWoodType(TFBlocks.MINING);
                //   Sheets.addWoodType(TFBlocks.SORTING);


            });

        }


    }

}