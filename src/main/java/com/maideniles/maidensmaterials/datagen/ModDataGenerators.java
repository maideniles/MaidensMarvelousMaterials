package com.maideniles.maidensmaterials.datagen;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.datagen.assets.ModBlockStateProvider;
import com.maideniles.maidensmaterials.datagen.assets.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MarvelousMaterials.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        DataGenerator generator = evt.getGenerator();
        ExistingFileHelper helper = evt.getExistingFileHelper();


        generator.addProvider(true, new ModBlockStateProvider(generator, helper));
        generator.addProvider(true, new ModItemModelProvider(generator, helper));
        generator.addProvider(true, new ModLootTableProvider(generator));

    }
}
