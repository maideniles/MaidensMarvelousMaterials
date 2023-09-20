package com.maideniles.maidensmaterials.datagen.loot;

import com.google.common.collect.Sets;
import net.minecraft.resources.ResourceLocation;

import java.util.Collections;
import java.util.Set;

public class ModLootTables {

    private static final Set<ResourceLocation> MOD_LOOT_TABLES = Sets.newHashSet();
    public static final int DEFAULT_PLACE_FLAG = 2;

    public static Set<ResourceLocation> allBuiltin() {
        return Collections.unmodifiableSet(MOD_LOOT_TABLES);
    }
}