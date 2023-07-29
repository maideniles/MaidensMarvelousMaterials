package com.maideniles.maidensmaterials.world.gen.biome;


import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.config.MarvelousCommonConfig;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomeModifier {

    public record CrabappleModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_crabapple"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.CRABAPPLE_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.CrabappleModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.CrabappleModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.CrabappleModifier::plant)
            ).apply(builder, ModBiomeModifier.CrabappleModifier::new));
        }
    }

    public record PoincianaModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_poinciana"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.POINCIANA_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.PoincianaModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.PoincianaModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.PoincianaModifier::plant)
            ).apply(builder, ModBiomeModifier.PoincianaModifier::new));
        }
    }

    public record LaburnumModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_laburnum"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.LABURNUM_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.LaburnumModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.LaburnumModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.LaburnumModifier::plant)
            ).apply(builder, ModBiomeModifier.LaburnumModifier::new));
        }
    }

    public record JadeModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_jade"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.JADE_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.JadeModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.JadeModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.JadeModifier::plant)
            ).apply(builder, ModBiomeModifier.JadeModifier::new));
        }
    }

    public record PaulowniaModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_paulownia"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.PAULOWNIA_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.PaulowniaModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.PaulowniaModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.PaulowniaModifier::plant)
            ).apply(builder, ModBiomeModifier.PaulowniaModifier::new));
        }
    }

    public record WisteriaModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_wisteria"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.WISTERIA_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.WisteriaModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.WisteriaModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.WisteriaModifier::plant)
            ).apply(builder, ModBiomeModifier.WisteriaModifier::new));
        }
    }

    public record JacarandaModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_jacaranda"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.JACARANDA_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.JacarandaModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.JacarandaModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.JacarandaModifier::plant)
            ).apply(builder, ModBiomeModifier.JacarandaModifier::new));
        }
    }

    public record DogwoodModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_dogwood"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.DOGWOOD_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.DogwoodModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.DogwoodModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.DogwoodModifier::plant)
            ).apply(builder, ModBiomeModifier.DogwoodModifier::new));
        }
    }

    public record SilverbellModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_silverbell"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.SILVERBELL_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.SilverbellModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.SilverbellModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.SilverbellModifier::plant)
            ).apply(builder, ModBiomeModifier.SilverbellModifier::new));
        }
    }

    public record CedarModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_cedar"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.CEDAR_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.CedarModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.CedarModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.CedarModifier::plant)
            ).apply(builder, ModBiomeModifier.CedarModifier::new));
        }
    }

    public record OrnamentalMushroomsModifier(HolderSet<Biome> biomes, Holder<PlacedFeature> plant) implements BiomeModifier {
        private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(
                new ResourceLocation(MarvelousMaterials.MOD_ID, "add_ornamental_mushrooms"),
                ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MarvelousMaterials.MOD_ID);

        public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
            if (phase == Phase.ADD && this.biomes.contains(biome)) {

                if (MarvelousCommonConfig.ORNAMENTAL_MUSHROOMS_ENABLED.get()){
                    //add feature here
                    builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, plant);
                }
            }
        }

        @Override
        public Codec<? extends BiomeModifier> codec() {
            return SERIALIZER.get();
        }

        public static Codec<ModBiomeModifier.OrnamentalMushroomsModifier> makeCodec() {
            return RecordCodecBuilder.create(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(ModBiomeModifier.OrnamentalMushroomsModifier::biomes),
                    PlacedFeature.CODEC.fieldOf("plant").forGetter(ModBiomeModifier.OrnamentalMushroomsModifier::plant)
            ).apply(builder, ModBiomeModifier.OrnamentalMushroomsModifier::new));
        }
    }

}

