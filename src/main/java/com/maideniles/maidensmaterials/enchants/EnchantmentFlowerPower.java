package com.maideniles.maidensmaterials.enchants;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber


public class EnchantmentFlowerPower extends Enchantment {

    public EnchantmentFlowerPower() {
        super(Rarity.UNCOMMON, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND});


    }

    @Override
    public int getMinLevel() {
        return 1;
    }
    @Override
    public int getMaxLevel() {
        return 1;
    }



    @Override
    public boolean canEnchant(ItemStack p_44689_) {
        return true;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return canEnchant(stack);
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }



    @Override
    protected boolean checkCompatibility(Enchantment ench) {
        return super.checkCompatibility(ench) && ench != Enchantments.SILK_TOUCH;
    }

    @Override
    public int getMinCost(int enchantmentLevel) {
        return 1 + 10 * (enchantmentLevel - 1);
    }


    @Override
    public int getMaxCost(int enchantmentLevel) {
        return super.getMinCost(enchantmentLevel) + 15;
    }



}