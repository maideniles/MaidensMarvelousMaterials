package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, MarvelousMaterials.MOD_ID);

    public static final RegistryObject<Potion> FLORAL_FORTUNE_POTION = POTIONS.register("floral_fortune_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.FLORAL_FORTUNE_EFFECT.get(), 900, 0)));

    public static final RegistryObject<Potion> GATHERERS_GLEE_POTION = POTIONS.register("gatherers_glee_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.GATHERERS_GLEE_EFFECT.get(), 900, 0)));






    public static class BetterBrewingRecipe implements IBrewingRecipe {
        private final Potion input;
        private final Item ingredient;
        private final Potion output;

        public BetterBrewingRecipe(Potion input, Item ingredient, Potion output) {
            this.input = input;
            this.ingredient = ingredient;
            this.output = output;
        }

        @Override
        public boolean isInput(ItemStack input) {
            return PotionUtils.getPotion(input) == this.input;
        }

        @Override
        public boolean isIngredient(ItemStack ingredient) {
            return ingredient.getItem() == this.ingredient;
        }

        @Override
        public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
            if(!this.isInput(input) || !this.isIngredient(ingredient)) {
                return ItemStack.EMPTY;
            }

            ItemStack itemStack = new ItemStack(input.getItem());
            itemStack.setTag(new CompoundTag());
            PotionUtils.setPotion(itemStack, this.output);
            return itemStack;
        }
    }




    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
