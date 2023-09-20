package com.maideniles.maidensmaterials.datagen.assets;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.client.renderer.blockentity.ModChestRenderer;
import net.minecraft.client.renderer.texture.atlas.sources.SingleFile;
import net.minecraft.client.resources.model.Material;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SpriteSourceProvider;

import java.util.Optional;

public class ModAtlasGenerator extends SpriteSourceProvider {
    public ModAtlasGenerator(PackOutput output, ExistingFileHelper helper) {
        super(output, helper, MarvelousMaterials.MOD_ID);
    }

    @Override
    protected void addSources() {
        ModChestRenderer.MATERIALS.values().stream().flatMap(e -> e.values().stream()).map(Material::texture)
                .forEach(resourceLocation -> this.atlas(CHESTS_ATLAS).addSource(new SingleFile(resourceLocation, Optional.empty())));

    }
}