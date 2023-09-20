package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.blockentity.ModChestEntity;
import com.maideniles.maidensmaterials.client.renderer.blockentity.ModChestRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MarvelousMaterials.MOD_ID);



    public static final RegistryObject<BlockEntityType<ModChestEntity>> MOD_CHEST = BLOCK_ENTITIES.register("mod_chest", () ->
            BlockEntityType.Builder.of(ModChestEntity::new,
                    ModBlocks.ACACIA_CHEST.get(),ModBlocks.BIRCH_CHEST.get(),ModBlocks.OAK_CHEST.get(),
                    ModBlocks.SPRUCE_CHEST.get(),ModBlocks.DARK_OAK_CHEST.get(), ModBlocks.JUNGLE_CHEST.get(),
                    ModBlocks.CRIMSON_CHEST.get(),ModBlocks.WARPED_CHEST.get(),ModBlocks.MANGROVE_CHEST.get(),

                    ModBlocks.CRABAPPLE_CHEST.get(),ModBlocks.POINCIANA_CHEST.get(),ModBlocks.LABURNUM_CHEST.get(),
                    ModBlocks.JADE_CHEST.get(),ModBlocks.PAULOWNIA_CHEST.get(),ModBlocks.WISTERIA_CHEST.get(),
                    ModBlocks.JACARANDA_CHEST.get(),ModBlocks.DOGWOOD_CHEST.get(),ModBlocks.SILVERBELL_CHEST.get(),
                    ModBlocks.CEDAR_CHEST.get(),

                    ModBlocks.RED_STAINED_CHEST.get(),ModBlocks.ORANGE_STAINED_CHEST.get(),ModBlocks.YELLOW_STAINED_CHEST.get(),
                    ModBlocks.LIME_STAINED_CHEST.get(),ModBlocks.GREEN_STAINED_CHEST.get(),ModBlocks.CYAN_STAINED_CHEST.get(),
                    ModBlocks.LIGHT_BLUE_STAINED_CHEST.get(),ModBlocks.BLUE_STAINED_CHEST.get(),ModBlocks.PURPLE_STAINED_CHEST.get(),
                    ModBlocks.MAGENTA_STAINED_CHEST.get(),ModBlocks.PINK_STAINED_CHEST.get(),ModBlocks.WHITE_STAINED_CHEST.get(),
                    ModBlocks.LIGHT_GRAY_STAINED_CHEST.get(),ModBlocks.GRAY_STAINED_CHEST.get(),ModBlocks.BLACK_STAINED_CHEST.get(),
                    ModBlocks.BROWN_STAINED_CHEST.get() ).build(null));





    @OnlyIn(Dist.CLIENT)
    public static void registerTileEntityRenders() {
        // tile entities

        BlockEntityRenderers.register(MOD_CHEST.get(), ModChestRenderer::new);

    }
}
