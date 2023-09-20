package com.maideniles.maidensmaterials.world.gen.biome;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class MMSurfaceRuleData
{
    public static final SurfaceRules.ConditionSource WATER_CHECK = SurfaceRules.waterBlockCheck(-1, 0);
    public static final SurfaceRules.ConditionSource HEIGHT_CHECK = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(256), 0);


    public static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.RuleSource ornamentalSurface = SurfaceRules.sequence(
                SurfaceRules.ifTrue(HEIGHT_CHECK,SurfaceRules.state(ModBlocks.ORNAMENTAL_GRASS.get().defaultBlockState())),
                SurfaceRules.sequence(SurfaceRules.ifTrue(WATER_CHECK,
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.state(ModBlocks.ORNAMENTAL_GRASS.get().defaultBlockState()))))
        );

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(MMBiomes.ORNAMENTAL_FOREST), ornamentalSurface)




        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
