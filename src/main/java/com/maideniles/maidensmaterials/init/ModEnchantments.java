package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.enchants.EnchantmentFloralFeet;
import com.maideniles.maidensmaterials.enchants.EnchantmentFlowerPower;
import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.RegistryObject;


public class ModEnchantments {



    public static final RegistryObject<Enchantment> FLOWER_POWER = Registration.ENCHANTMENTS.register("flower_power",
            () -> new EnchantmentFlowerPower());

    public static final RegistryObject<Enchantment> FANCY_FEET = Registration.ENCHANTMENTS.register("fancy_feet",
            () -> new EnchantmentFloralFeet());

    public static void register(){

    }
}