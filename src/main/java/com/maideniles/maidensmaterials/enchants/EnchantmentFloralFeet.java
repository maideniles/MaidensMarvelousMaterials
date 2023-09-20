package com.maideniles.maidensmaterials.enchants;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModEnchantments;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FrostedIceBlock;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MarvelousMaterials.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EnchantmentFloralFeet extends Enchantment {

    public EnchantmentFloralFeet() {
        super(Rarity.VERY_RARE, EnchantmentCategory.ARMOR_FEET, new EquipmentSlot[] {EquipmentSlot.FEET});


        ModBlocks.GRASS.add(ModBlocks.ORNAMENTAL_GRASS.get());
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }


    @Override
    public int getMinCost(int enchantmentLevel) {
        return 1 + 10 * (enchantmentLevel - 1);
    }

    @Override
    public int getMaxCost(int enchantmentLevel) {
        return super.getMinCost(enchantmentLevel) + 15;
    }



    @Override
    public boolean checkCompatibility(Enchantment ench)
    {
        return super.checkCompatibility(ench)
                || ench == Enchantments.DEPTH_STRIDER
                || ench == Enchantments.FROST_WALKER
                || ench == Enchantments.FALL_PROTECTION
                || ench == Enchantments.ALL_DAMAGE_PROTECTION
                || ench == Enchantments.FIRE_PROTECTION
                || ench == Enchantments.THORNS
                || ench == Enchantments.MENDING
                || ench == Enchantments.BLAST_PROTECTION;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return true;
    }



/*
    public static void GrowFlowersUnderFeet(LivingEntity entity, Level level, BlockPos p_45021_, int p_45022_) {
        if (entity.isOnGround()) {
            BlockState blockstate = ModBlocks.WALK_FLOWERS.get().defaultBlockState();
            float f = (float) Math.min(16, 2 + p_45022_);
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

            for (BlockPos blockpos : BlockPos.betweenClosed(p_45021_.offset((double) (-f), -1.0D, (double) (-f)), p_45021_.offset((double) f, -1.0D, (double) f))) {
                if (blockpos.closerToCenterThan(entity.position(), (double) f)) {
                    blockpos$mutableblockpos.set(blockpos.getX(), blockpos.getY() + 1, blockpos.getZ());
                    BlockState blockstate1 = level.getBlockState(blockpos$mutableblockpos);
                    if (blockstate1.isAir()) {
                        BlockState blockstate2 = level.getBlockState(blockpos);

                        boolean isGrass = blockstate2.getBlock() == Blocks.GRASS || blockstate2.getBlock() instanceof GrassBlock;

                        if (blockstate2.getMaterial() == Material.WATER && isGrass && blockstate.canSurvive(level, blockpos) && level.isUnobstructed(blockstate, blockpos, CollisionContext.empty()) && !net.minecraftforge.event.ForgeEventFactory.onBlockPlace(entity, net.minecraftforge.common.util.BlockSnapshot.create(level.dimension(), level, blockpos), net.minecraft.core.Direction.UP)) {


                            level.setBlockAndUpdate(blockpos, blockstate);
                            level.scheduleTick(blockpos, ModBlocks.WALK_FLOWERS.get(), Mth.nextInt(entity.getRandom(), 60, 120));

                        }
                    }

                }
            }

        }

    }

*/
    @SubscribeEvent
    public static void growFlowersUnderFeet2(LivingEvent.LivingTickEvent event) {
        if (event.getEntity().onGround()) {
        }

        if (!event.getEntity().level().isClientSide()) {
            int level = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.FANCY_FEET.get(),
                    event.getEntity());

            if (level > 0 && event.getEntity().onGround()) {
                LivingEntity entity = event.getEntity();
                if (entity instanceof LivingEntity && entity.isSpectator()) {
                    return;
                }

                Level world = entity.level();
                int r = level + 1;
                BlockPos pos = entity.getOnPos().above();
                for (int x = -r; x <= r; x++) {
                    for (int z = -r; z <= r; z++) {
                        BlockPos blockpos = pos.offset(x, -1, z);
                        if (blockpos.distSqr(pos) > r * r) {
                            continue;
                        }

                        BlockState iblockstate = world.getBlockState(blockpos);

                        if (iblockstate.getBlock() == Blocks.GRASS

                                || iblockstate.getBlock()instanceof GrassBlock) {
                            if (world.getBlockState(entity.getOnPos()).getBlock() != Blocks.SNOW ||
                                    iblockstate.canSurvive(world,blockpos) && world.isUnobstructed(iblockstate, blockpos, CollisionContext.empty()) ) {

                                if (ModBlocks.WALK_FLOWERS.get().canSurvive(iblockstate, world, pos)) {
                                    world.setBlockAndUpdate(pos,ModBlocks.WALK_FLOWERS.get().defaultBlockState());
                                    //Debug System.out.println("GROW FLOWERS!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }





}