package com.maideniles.maidensmaterials.util;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {

    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS
            = DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, MarvelousMaterials.MOD_ID);

    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(ForgeRegistries.FEATURES, MarvelousMaterials.MOD_ID);

    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS,MarvelousMaterials.MOD_ID);



 //   public static final DeferredRegister<MenuType<?>> MENUS
 //           = DeferredRegister.create(ForgeRegistries.CONTAINERS, MarvelousMaterials.MOD_ID);


    public static void register(IEventBus eventBus){

        TREE_DECORATORS.register(eventBus);
        FEATURES.register(eventBus);
        ENCHANTMENTS.register(eventBus);

      //  MENUS.register(eventBus);
    }
}

