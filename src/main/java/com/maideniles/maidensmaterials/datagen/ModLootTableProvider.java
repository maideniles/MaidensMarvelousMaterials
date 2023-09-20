package com.maideniles.maidensmaterials.datagen;

import com.maideniles.maidensmaterials.datagen.loot.ModBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ModLootTableProvider extends LootTableProvider {

        public ModLootTableProvider(PackOutput output) {
            super(output, (Set<ResourceLocation>) ModBlockLootTables.noDrop(), List.of(
                    new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK)
            ));
        }


    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationcontext) {

    }
}