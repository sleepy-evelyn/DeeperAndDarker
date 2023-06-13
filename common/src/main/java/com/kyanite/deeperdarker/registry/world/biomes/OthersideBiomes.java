package com.kyanite.deeperdarker.registry.world.biomes;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.config.DDConfig;
import com.kyanite.deeperdarker.platform.RegistryHelper;
import com.kyanite.deeperdarker.registry.entities.DDEntities;
import com.kyanite.deeperdarker.registry.sounds.DDSounds;
import com.kyanite.deeperdarker.registry.world.features.DDPlacedFeaturesOld;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.Carvers;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Musics;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class OthersideBiomes {
    public static final ResourceKey<Biome> OTHERSIDE_DEEPLANDS = ResourceKey.create(Registries.BIOME, new ResourceLocation(DeeperAndDarker.MOD_ID, "otherside_deeplands"));
    public static final ResourceKey<Biome> ECHOING_FOREST = ResourceKey.create(Registries.BIOME, new ResourceLocation(DeeperAndDarker.MOD_ID, "echoing_forest"));
    public static final ResourceKey<Biome> OVERCAST_COLUMNS = ResourceKey.create(Registries.BIOME, new ResourceLocation(DeeperAndDarker.MOD_ID, "overcast_columns"));

    public static void createBiomes() {
        RegistryHelper.registerBiome(OTHERSIDE_DEEPLANDS.location(), OthersideBiomes::deeplands);
        RegistryHelper.registerBiome(ECHOING_FOREST.location(), OthersideBiomes::forest);
        RegistryHelper.registerBiome(OVERCAST_COLUMNS.location(), OthersideBiomes::columns);
    }

    public static Biome columns() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(DDEntities.SCULK_SNAPPER.get(), 95, 4, 4));

        HolderGetter<PlacedFeature> placedFeature = (HolderGetter<PlacedFeature>) Registries.PLACED_FEATURE;
        HolderGetter<ConfiguredWorldCarver<?>> worldCarver = (HolderGetter<ConfiguredWorldCarver<?>>) Registries.CONFIGURED_CARVER;
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeature, worldCarver);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.GLOOM_SCULK_VEGETATION.get()));
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.GLOOMSTONE_PILLAR.get()));
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.GLOOMSLATE.get()));
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.GEYSER.get()));

        biomeBuilder.addCarver(GenerationStep.Carving.AIR, Carvers.CAVE);

        return new Biome.BiomeBuilder().hasPrecipitation(false)
                .temperature(0.7f)
                .downfall(0.2f)
                .specialEffects((new BiomeSpecialEffects.Builder()).waterColor(0xcc9b33)
                        .waterFogColor(0xa88539)
                        .fogColor(0xd19f4f)
                        .skyColor(0x8f6014)
                        .ambientParticle(new AmbientParticleSettings(ParticleTypes.SMOKE, 0.055f))
                        .ambientLoopSound(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_LOOP)
                        .ambientMoodSound(new AmbientMoodSettings(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_MOOD, 6000, 8, 2.0D))
                        .ambientAdditionsSound(new AmbientAdditionsSettings(DDSounds.WARDEN_DREAMING, 0.00015D))
                        .backgroundMusic(Musics.createGameMusic(DDSounds.OVERCAST_AMBIENCE)).build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build()).build();
    }

    public static Biome forest() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        if(DDConfig.SHATTERED_SPAWNING.get())
            spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(DDEntities.SHATTERED.get(), 20, 0, 2));

        HolderGetter<PlacedFeature> placedFeature = (HolderGetter<PlacedFeature>) Registries.PLACED_FEATURE;
        HolderGetter<ConfiguredWorldCarver<?>> worldCarver = (HolderGetter<ConfiguredWorldCarver<?>>) Registries.CONFIGURED_CARVER;
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeature, worldCarver);

        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(DDPlacedFeaturesOld.ECHO_SAND.get()));
        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(DDPlacedFeaturesOld.SCULK_JAW.get()));
        addSculkDecoration(biomeBuilder);
        addSculkOres(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.SCULK_TENDRILS.get()));
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.ECHO_TREE_SPAWN.get()));

        biomeBuilder.addCarver(GenerationStep.Carving.AIR, Carvers.CAVE);

        return new Biome.BiomeBuilder().hasPrecipitation(false)
                .temperature(1.2f)
                .downfall(0.5f)
                .specialEffects((new BiomeSpecialEffects.Builder()).waterColor(0x1e055d)
                        .waterFogColor(0x1d1352)
                        .fogColor(0x61519c)
                        .skyColor(0x54458c)
                        .ambientParticle(new AmbientParticleSettings(ParticleTypes.ASH, 0.055f))
                        .ambientAdditionsSound(new AmbientAdditionsSettings(DDSounds.WARDEN_DREAMING, 0.00015D))
                        .backgroundMusic(Musics.createGameMusic(DDSounds.FOREST_AMBIENCE)).build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build()).build();
    }

    public static Biome deeplands() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        if(DDConfig.SNAPPER_SPAWNING.get())
            spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(DDEntities.SCULK_SNAPPER.get(), 120, 4, 6));

        if(DDConfig.PHANTOM_SPAWNING.get())
            spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.PHANTOM, 50, 0, 1));

        if(DDConfig.CENTIPEDE_SPAWNING.get())
            spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(DDEntities.SCULK_CENTIPEDE.get(), 55, 1, 3));

        HolderGetter<PlacedFeature> placedFeature = (HolderGetter<PlacedFeature>) Registries.PLACED_FEATURE;
        HolderGetter<ConfiguredWorldCarver<?>> worldCarver = (HolderGetter<ConfiguredWorldCarver<?>>) Registries.CONFIGURED_CARVER;
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeature, worldCarver);

        BiomeDefaultFeatures.addFossilDecoration(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(DDPlacedFeaturesOld.SCULK_JAW.get()));
        addSculkDecoration(biomeBuilder);
        addSculkOres(biomeBuilder);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.OTHERSIDE_PILLAR.get()));
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.SCULK_VINES.get()));
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.SCULK_GLEAM.get()));
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Holder.direct(DDPlacedFeaturesOld.SCULK_TENDRILS.get()));

        biomeBuilder.addCarver(GenerationStep.Carving.AIR, Carvers.CAVE);

        return new Biome.BiomeBuilder().hasPrecipitation(false)
                .temperature(0.3f)
                .downfall(0f)
                .specialEffects((new BiomeSpecialEffects.Builder()).waterColor(0x05305d)
                        .waterFogColor(0x0c2a57)
                        .fogColor(0x046b5d)
                        .skyColor(0x0b364a)
                        .ambientAdditionsSound(new AmbientAdditionsSettings(DDSounds.WARDEN_DREAMING, 0.00015D))
                        .backgroundMusic(Musics.createGameMusic(DDSounds.DEEPLANDS_AMBIENCE)).build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build()).build();
    }

    public static void addSculkOres(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.SCULK_COAL_ORE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.SCULK_IRON_ORE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.SCULK_COPPER_ORE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.SCULK_GOLD_ORE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.SCULK_REDSTONE_ORE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.SCULK_EMERALD_ORE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.SCULK_LAPIS_ORE.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, Holder.direct(DDPlacedFeaturesOld.SCULK_DIAMOND_ORE.get()));
    }

    public static void addSculkDecoration(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(DDPlacedFeaturesOld.SCULK.get()));
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, Holder.direct(DDPlacedFeaturesOld.INFESTED_SCULK.get()));
        if(DDConfig.SCULK_BLOCKS_IN_OTHERSIDE.get()) builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, (ResourceKey<PlacedFeature>) Holder.direct(CavePlacements.SCULK_PATCH_DEEP_DARK));
    }
}
