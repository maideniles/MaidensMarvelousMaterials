package com.maideniles.maidensmaterials.world.gen.biome;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class OrnamentalForestSurfaceData {

    private static final SurfaceRules.RuleSource MOD_GRASS_BLOCK = makeStateRule(ModBlocks.ORNAMENTAL_GRASS.get());
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);

    public static final SurfaceRules.ConditionSource WATER_CHECK = SurfaceRules.waterBlockCheck(-1, 0);
    public static final SurfaceRules.ConditionSource HEIGHT_CHECK = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(256), 0);




    public static SurfaceRules.RuleSource makeRules() {




        SurfaceRules.RuleSource ornamentalSurface = SurfaceRules.sequence(
            SurfaceRules.ifTrue(HEIGHT_CHECK,SurfaceRules.state(ModBlocks.ORNAMENTAL_GRASS.get().defaultBlockState())),
                SurfaceRules.sequence(SurfaceRules.ifTrue(WATER_CHECK,
                    SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                            SurfaceRules.state(ModBlocks.ORNAMENTAL_GRASS.get().defaultBlockState()))))
                    );

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomeKeys.ORNAMENTAL_FOREST), ornamentalSurface)




        );


    }



 /*   SurfaceRules.RuleSource surfacerules$rulesource8 = SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
            SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.WOODED_BADLANDS),
                    SurfaceRules.ifTrue(surfacerules$conditionsource,
                            SurfaceRules.sequence(SurfaceRules.ifTrue(surfacerules$conditionsource14, COARSE_DIRT),
                                    SurfaceRules.ifTrue(surfacerules$conditionsource15, COARSE_DIRT),
                                    SurfaceRules.ifTrue(surfacerules$conditionsource16, COARSE_DIRT), surfacerules$rulesource))),
                    SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.SWAMP), SurfaceRules.ifTrue(surfacerules$conditionsource4,
                            SurfaceRules.ifTrue(SurfaceRules.not(surfacerules$conditionsource5),
                                    SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D), WATER)))))),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.BADLANDS, Biomes.ERODED_BADLANDS, Biomes.WOODED_BADLANDS),
                    SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                            SurfaceRules.sequence(SurfaceRules.ifTrue(surfacerules$conditionsource1, ORANGE_TERRACOTTA),
                                    SurfaceRules.ifTrue(surfacerules$conditionsource3,
                                            SurfaceRules.sequence(SurfaceRules.ifTrue(surfacerules$conditionsource14, TERRACOTTA),
                                                    SurfaceRules.ifTrue(surfacerules$conditionsource15, TERRACOTTA),
                                                    SurfaceRules.ifTrue(surfacerules$conditionsource16, TERRACOTTA),
                                                    SurfaceRules.bandlands())), SurfaceRules.ifTrue(surfacerules$conditionsource6,
                                            SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, RED_SANDSTONE), RED_SAND)),
                                    SurfaceRules.ifTrue(SurfaceRules.not(surfacerules$conditionsource9), ORANGE_TERRACOTTA),
                                    SurfaceRules.ifTrue(surfacerules$conditionsource8, WHITE_TERRACOTTA), surfacerules$rulesource2)),
                            SurfaceRules.ifTrue(surfacerules$conditionsource2,
                                    SurfaceRules.sequence(SurfaceRules.ifTrue(surfacerules$conditionsource5,
                                            SurfaceRules.ifTrue(SurfaceRules.not(surfacerules$conditionsource3), ORANGE_TERRACOTTA)),
                                            SurfaceRules.bandlands())), SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR,
                                    SurfaceRules.ifTrue(surfacerules$conditionsource8, WHITE_TERRACOTTA)))),
            SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(surfacerules$conditionsource6,
                    SurfaceRules.sequence(SurfaceRules.ifTrue(surfacerules$conditionsource10,
                            SurfaceRules.ifTrue(surfacerules$conditionsource9,
                                    SurfaceRules.sequence(SurfaceRules.ifTrue(surfacerules$conditionsource7, AIR),
                                            SurfaceRules.ifTrue(SurfaceRules.temperature(), ICE), WATER))), surfacerules$rulesource7))),
            SurfaceRules.ifTrue(surfacerules$conditionsource8, SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                    SurfaceRules.ifTrue(surfacerules$conditionsource10, SurfaceRules.ifTrue(surfacerules$conditionsource9, WATER))),
                    SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, surfacerules$rulesource6),
                    SurfaceRules.ifTrue(surfacerules$conditionsource12,
                            SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, SANDSTONE)),
                    SurfaceRules.ifTrue(surfacerules$conditionsource13,
                            SurfaceRules.ifTrue(SurfaceRules.VERY_DEEP_UNDER_FLOOR, SANDSTONE)))),
            SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                    SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.FROZEN_PEAKS, Biomes.JAGGED_PEAKS), STONE),
                            SurfaceRules.ifTrue(SurfaceRules.isBiome(Biomes.WARM_OCEAN, Biomes.LUKEWARM_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN),
                                    surfacerules$rulesource1), surfacerules$rulesource2)));

*/

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }

}


