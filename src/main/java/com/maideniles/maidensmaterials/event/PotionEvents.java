package com.maideniles.maidensmaterials.event;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.config.MarvelousCommonConfig;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModEffects;
import com.maideniles.maidensmaterials.init.ModEnchantments;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid= MarvelousMaterials.MOD_ID)
public class PotionEvents {

    private static final Random rand = new Random();

    //ADD EARTHEN ESSENCE DROPS TO ORE AND WOOD BLOCKS//


    @SubscribeEvent
    public static void onBlockBreakEvent3(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();

        if (!player.isCreative())
            if (ModBlocks.VALID_BLOCKS.contains(event.getState().getBlock())) {
                if (rand.nextInt(MarvelousCommonConfig.EARTHEN_ESSENCE_DROP_RATE.get()) == 0) {
                    ItemEntity item = new ItemEntity((Level) event.getLevel(), event.getPos().getX() + 0.5,
                            event.getPos().getY(), event.getPos().getZ() + 0.5, new ItemStack((ModItems.EARTHEN_ESSENCE.get()), 1));
                    if (!event.getLevel().isClientSide()) {
                        item.setPickUpDelay(40); // To Set a Small Pickup Delay

                        event.getLevel().addFreshEntity(item);


                    }
                }
            }
    }

    //GATHERER'S GLEE POTION--GET EXTRA DROPS  1 IN 20 CHANCE OF DOUBLING ORE//
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();

        if (!player.isCreative() && player.hasEffect(ModEffects.GATHERERS_GLEE_EFFECT.get())) {

            if (ModBlocks.VALID_BLOCKS.contains(event.getState().getBlock())) {

                ItemEntity item = new ItemEntity((Level) event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(event.getState().getBlock(), 1));

                if (!event.getLevel().isClientSide()) {
                    item.setPickUpDelay(40); // To Set a Small Pickup Delay
                    if (rand.nextInt(20) == 0)  //set 1 in 20 chance?// {
                        event.getLevel().addFreshEntity(item);

                }
            }
        }
    }

    //MAKE ORNAMENTAL GRASS DROP WHILE POTION ACTIVE
    @SubscribeEvent
    public static void onBlockBreak2(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        InteractionHand hand = event.getPlayer().getUsedItemHand();
        ItemStack itemstack = player.getItemInHand(hand);
        int enchLevel = EnchantmentHelper.getItemEnchantmentLevel(ModEnchantments.FLOWER_POWER.get(), itemstack);
        boolean hasEnchant = enchLevel >=1;
        ItemEntity dirt = new ItemEntity((Level) event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(),
                new ItemStack(Item.byBlock(Blocks.DIRT), 1));
        ItemEntity item = new ItemEntity((Level) event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(),
                new ItemStack(Item.byBlock(ModBlocks.ORNAMENTAL_GRASS.get()), 1));


        if (ModBlocks.GRASS.contains(event.getState().getBlock())) {

            if (!player.isCreative() && player.hasEffect(ModEffects.FLORAL_FORTUNE_EFFECT.get()) ||
                    hasEnchant) {


                if (!event.getLevel().isClientSide()) {
                    item.setPickUpDelay(10); // To Set a Small Pickup Delay
                    event.getLevel().addFreshEntity(item);

                }

            } else if (!event.getLevel().isClientSide()) {
                dirt.setPickUpDelay(10); // To Set a Small Pickup Delay
                event.getLevel().addFreshEntity(dirt);

            }

        }
    }



}
