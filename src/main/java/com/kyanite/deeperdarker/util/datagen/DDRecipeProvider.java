package com.kyanite.deeperdarker.util.datagen;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.DDBlocks;
import com.kyanite.deeperdarker.content.DDItems;
import com.kyanite.deeperdarker.util.DDTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.UpgradeRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.function.Consumer;

public class DDRecipeProvider extends FabricRecipeProvider {
    public DDRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateRecipes(Consumer<FinishedRecipe> exporter) {
        UpgradeRecipeBuilder NETHERITE_HELMET_TO_WARDEN_HELMET_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_HELMET)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_HELMET);
        UpgradeRecipeBuilder NETHERITE_CHESTPLATE_TO_WARDEN_CHESTPLATE_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_CHESTPLATE)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_CHESTPLATE);
        UpgradeRecipeBuilder NETHERITE_LEGGINGS_TO_WARDEN_LEGGINGS_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_LEGGINGS)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_LEGGINGS);
        UpgradeRecipeBuilder NETHERITE_BOOTS_TO_WARDEN_BOOTS_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_BOOTS)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_BOOTS);
        UpgradeRecipeBuilder NETHERITE_SWORD_TO_WARDEN_SWORD_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_SWORD)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_SWORD);
        UpgradeRecipeBuilder NETHERITE_PICKAXE_TO_WARDEN_PICKAXE_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_PICKAXE)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_PICKAXE);
        UpgradeRecipeBuilder NETHERITE_AXE_TO_WARDEN_AXE_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_AXE)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_AXE);
        UpgradeRecipeBuilder NETHERITE_SHOVEL_TO_WARDEN_SHOVEL_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_SHOVEL)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_SHOVEL);
        UpgradeRecipeBuilder NETHERITE_HOE_TO_WARDEN_HOE_UPGRADE = UpgradeRecipeBuilder.smithing(
                Ingredient.of(new ItemStack(Items.NETHERITE_HOE)),
                Ingredient.of(new ItemStack(DDItems.REINFORCED_ECHO_SHARD)),
                DDItems.WARDEN_HOE);

        NETHERITE_HELMET_TO_WARDEN_HELMET_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_CHESTPLATE_TO_WARDEN_CHESTPLATE_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_LEGGINGS_TO_WARDEN_LEGGINGS_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_BOOTS_TO_WARDEN_BOOTS_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_SWORD_TO_WARDEN_SWORD_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_SHOVEL_TO_WARDEN_SHOVEL_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_PICKAXE_TO_WARDEN_PICKAXE_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_AXE_TO_WARDEN_AXE_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_HOE_TO_WARDEN_HOE_UPGRADE.unlocks(FabricRecipeProvider.getHasName(DDItems.REINFORCED_ECHO_SHARD), FabricRecipeProvider.has(DDItems.REINFORCED_ECHO_SHARD));
        NETHERITE_HELMET_TO_WARDEN_HELMET_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_helmet_to_warden_helmet_upgrade"));
        NETHERITE_CHESTPLATE_TO_WARDEN_CHESTPLATE_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_chestplate_to_warden_chestplate_upgrade"));
        NETHERITE_LEGGINGS_TO_WARDEN_LEGGINGS_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_leggings_to_warden_leggings_upgrade"));
        NETHERITE_BOOTS_TO_WARDEN_BOOTS_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_boots_to_warden_boots_upgrade"));
        NETHERITE_SWORD_TO_WARDEN_SWORD_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_sword_to_warden_sword_upgrade"));
        NETHERITE_PICKAXE_TO_WARDEN_PICKAXE_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_pickaxe_to_warden_pickaxe_upgrade"));
        NETHERITE_AXE_TO_WARDEN_AXE_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_axe_to_warden_axe_upgrade"));
        NETHERITE_SHOVEL_TO_WARDEN_SHOVEL_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_shovel_to_warden_shovel_upgrade"));
        NETHERITE_HOE_TO_WARDEN_HOE_UPGRADE.save(exporter, new ResourceLocation(DeeperDarker.MOD_ID, "netherite_hoe_to_warden_hoe_upgrade"));

        // Wood stuff
        planksFromLogs(exporter, DDBlocks.ECHO_PLANKS, DDTags.Items.ECHO_LOGS);
        ShapedRecipeBuilder.shaped(DDBlocks.ECHO_WOOD, 3).define('L', DDBlocks.ECHO_LOG).pattern("LL").pattern("LL").unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_LOG), FabricRecipeProvider.has(DDBlocks.ECHO_LOG)).save(exporter);
        ShapedRecipeBuilder.shaped(DDBlocks.STRIPPED_ECHO_WOOD, 3).define('L', DDBlocks.STRIPPED_ECHO_LOG).pattern("LL").pattern("LL").unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_LOG), FabricRecipeProvider.has(DDBlocks.ECHO_LOG)).save(exporter);
        oneToOneConversionRecipe(exporter, DDBlocks.ECHO_BUTTON, DDBlocks.ECHO_PLANKS, "wooden_button");
        doorBuilder(DDBlocks.ECHO_DOOR, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        fenceGateBuilder(DDBlocks.ECHO_FENCE_GATE, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        fenceBuilder(DDBlocks.ECHO_FENCE, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        pressurePlate(exporter, DDBlocks.ECHO_PRESSURE_PLATE, DDBlocks.ECHO_PLANKS);
        signBuilder(DDBlocks.ECHO_SIGN, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS));
        slab(exporter, DDBlocks.ECHO_SLAB, DDBlocks.ECHO_PLANKS);
        stairBuilder(DDBlocks.ECHO_STAIRS, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        trapdoorBuilder(DDBlocks.ECHO_TRAPDOOR, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy(FabricRecipeProvider.getHasName(DDBlocks.ECHO_PLANKS), FabricRecipeProvider.has(DDBlocks.ECHO_PLANKS)).save(exporter);
        woodenBoat(exporter, DDItems.ECHO_BOAT, DDBlocks.ECHO_PLANKS);
        chestBoat(exporter, DDItems.ECHO_CHEST_BOAT, DDBlocks.ECHO_PLANKS);

        // Sculk Stone
        stairBuilder(DDBlocks.SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.SCULK_STONE));
        stonecutterResultFromBase(exporter, DDBlocks.SCULK_STONE_STAIRS, DDBlocks.SCULK_STONE);
        slab(exporter, DDBlocks.SCULK_STONE_SLAB, DDBlocks.SCULK_STONE);
        stonecutterResultFromBase(exporter, DDBlocks.SCULK_STONE_SLAB, DDBlocks.SCULK_STONE, 2);
        wall(exporter, DDBlocks.SCULK_STONE_WALL, DDBlocks.SCULK_STONE);
        stonecutterResultFromBase(exporter, DDBlocks.SCULK_STONE_WALL, DDBlocks.SCULK_STONE);

        stairBuilder(DDBlocks.COBBLED_SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.COBBLED_SCULK_STONE));
        stonecutterResultFromBase(exporter, DDBlocks.COBBLED_SCULK_STONE_STAIRS, DDBlocks.COBBLED_SCULK_STONE);
        slab(exporter, DDBlocks.COBBLED_SCULK_STONE_SLAB, DDBlocks.COBBLED_SCULK_STONE);
        stonecutterResultFromBase(exporter, DDBlocks.COBBLED_SCULK_STONE_SLAB, DDBlocks.COBBLED_SCULK_STONE, 2);
        wall(exporter, DDBlocks.COBBLED_SCULK_STONE_WALL, DDBlocks.COBBLED_SCULK_STONE);
        stonecutterResultFromBase(exporter, DDBlocks.COBBLED_SCULK_STONE_WALL, DDBlocks.COBBLED_SCULK_STONE);

        polished(exporter, DDBlocks.POLISHED_SCULK_STONE, DDBlocks.SCULK_STONE);
        stonecutterResultFromBase(exporter, DDBlocks.POLISHED_SCULK_STONE, DDBlocks.SCULK_STONE);
        registerStairsSlabsAndWalls(exporter, DDBlocks.COBBLED_SCULK_STONE, DDBlocks.POLISHED_SCULK_STONE, DDBlocks.POLISHED_SCULK_STONE_STAIRS, DDBlocks.POLISHED_SCULK_STONE_SLAB, DDBlocks.POLISHED_SCULK_STONE_WALL);

        twoByTwoPacker(exporter, DDBlocks.SCULK_STONE_BRICKS, DDBlocks.COBBLED_SCULK_STONE);
        stonecutterResultFromBase(exporter, DDBlocks.SCULK_STONE_BRICKS, DDBlocks.COBBLED_SCULK_STONE);
        registerStairsSlabsAndWalls(exporter, DDBlocks.COBBLED_SCULK_STONE, DDBlocks.SCULK_STONE_BRICKS, DDBlocks.SCULK_STONE_BRICK_STAIRS, DDBlocks.SCULK_STONE_BRICK_SLAB, DDBlocks.SCULK_STONE_BRICK_WALL);

        stonecutterResultFromBase(exporter, DDBlocks.SCULK_STONE_TILES, DDBlocks.SCULK_STONE);
        registerStairsSlabsAndWalls(exporter, DDBlocks.COBBLED_SCULK_STONE, DDBlocks.SCULK_STONE_TILES, DDBlocks.SCULK_STONE_TILE_STAIRS, DDBlocks.SCULK_STONE_TILE_SLAB, DDBlocks.SCULK_STONE_TILE_WALL);

        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE), DDBlocks.SMOOTH_SCULK_STONE, 0.1f, 200, "sculk_stone");
        stairBuilder(DDBlocks.SMOOTH_SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.SMOOTH_SCULK_STONE));
        stonecutterResultFromBase(exporter, DDBlocks.SMOOTH_SCULK_STONE_STAIRS, DDBlocks.SMOOTH_SCULK_STONE);
        slab(exporter, DDBlocks.SMOOTH_SCULK_STONE_SLAB, DDBlocks.SMOOTH_SCULK_STONE);
        stonecutterResultFromBase(exporter, DDBlocks.SMOOTH_SCULK_STONE_SLAB, DDBlocks.SMOOTH_SCULK_STONE, 2);
        wall(exporter, DDBlocks.SMOOTH_SCULK_STONE_WALL, DDBlocks.SMOOTH_SCULK_STONE);
        stonecutterResultFromBase(exporter, DDBlocks.SMOOTH_SCULK_STONE_WALL, DDBlocks.SMOOTH_SCULK_STONE);

        polished(exporter, DDBlocks.CUT_SCULK_STONE, DDBlocks.SMOOTH_SCULK_STONE);
        registerStairsSlabsAndWalls(exporter, DDBlocks.SMOOTH_SCULK_STONE, DDBlocks.CUT_SCULK_STONE, DDBlocks.CUT_SCULK_STONE_STAIRS, DDBlocks.CUT_SCULK_STONE_SLAB, DDBlocks.CUT_SCULK_STONE_WALL);

        chiseled(exporter, DDBlocks.CHISELED_SCULK_STONE, DDBlocks.SCULK_STONE_BRICK_SLAB);

        // Sculk Grime
        twoByTwoPacker(exporter, DDBlocks.SCULK_GRIME, DDItems.GRIME_BALL);
        twoByTwoPacker(exporter, DDBlocks.SCULK_GRIME_BRICKS, DDItems.GRIME_BRICK);
        stonecutterResultFromBase(exporter, DDBlocks.SCULK_GRIME_BRICKS, DDBlocks.SCULK_GRIME);
        stairBuilder(DDBlocks.SCULK_GRIME_BRICK_STAIRS, Ingredient.of(DDBlocks.SCULK_GRIME_BRICKS));
        stonecutterResultFromBase(exporter, DDBlocks.SCULK_GRIME_BRICK_STAIRS, DDBlocks.SCULK_GRIME_BRICKS);
        slab(exporter, DDBlocks.SCULK_GRIME_BRICK_SLAB, DDBlocks.SCULK_GRIME_BRICKS);
        stonecutterResultFromBase(exporter, DDBlocks.SCULK_GRIME_BRICK_SLAB, DDBlocks.SCULK_GRIME_BRICKS, 2);
        wall(exporter, DDBlocks.SCULK_GRIME_BRICK_WALL, DDBlocks.SCULK_GRIME_BRICKS);
        stonecutterResultFromBase(exporter, DDBlocks.SCULK_GRIME_BRICK_WALL, DDBlocks.SCULK_GRIME_BRICKS);

        // Gloomslate
        stairBuilder(DDBlocks.GLOOMSLATE_STAIRS, Ingredient.of(DDBlocks.GLOOMSLATE));
        stonecutterResultFromBase(exporter, DDBlocks.GLOOMSLATE_STAIRS, DDBlocks.GLOOMSLATE);
        slab(exporter, DDBlocks.GLOOMSLATE_SLAB, DDBlocks.GLOOMSLATE);
        stonecutterResultFromBase(exporter, DDBlocks.GLOOMSLATE_SLAB, DDBlocks.GLOOMSLATE, 2);
        wall(exporter, DDBlocks.GLOOMSLATE_WALL, DDBlocks.GLOOMSLATE);
        stonecutterResultFromBase(exporter, DDBlocks.GLOOMSLATE_WALL, DDBlocks.GLOOMSLATE);

        stairBuilder(DDBlocks.COBBLED_GLOOMSLATE_STAIRS, Ingredient.of(DDBlocks.COBBLED_GLOOMSLATE)).unlockedBy(getHasName(DDBlocks.COBBLED_GLOOMSLATE), has(DDBlocks.COBBLED_GLOOMSLATE)).save(exporter);
        stonecutterResultFromBase(exporter, DDBlocks.COBBLED_GLOOMSLATE_STAIRS, DDBlocks.COBBLED_GLOOMSLATE);
        slab(exporter, DDBlocks.COBBLED_GLOOMSLATE_SLAB, DDBlocks.COBBLED_GLOOMSLATE);
        stonecutterResultFromBase(exporter, DDBlocks.COBBLED_GLOOMSLATE_SLAB, DDBlocks.COBBLED_GLOOMSLATE, 2);
        wall(exporter, DDBlocks.COBBLED_GLOOMSLATE_WALL, DDBlocks.COBBLED_GLOOMSLATE);
        stonecutterResultFromBase(exporter, DDBlocks.COBBLED_GLOOMSLATE_WALL, DDBlocks.COBBLED_GLOOMSLATE);

        polished(exporter, DDBlocks.POLISHED_GLOOMSLATE, DDBlocks.COBBLED_GLOOMSLATE);
        registerStairsSlabsAndWalls(exporter, DDBlocks.COBBLED_GLOOMSLATE, DDBlocks.POLISHED_GLOOMSLATE, DDBlocks.POLISHED_GLOOMSLATE_STAIRS, DDBlocks.POLISHED_GLOOMSLATE_SLAB, DDBlocks.POLISHED_GLOOMSLATE_WALL);

        twoByTwoPacker(exporter, DDBlocks.GLOOMSLATE_BRICKS, DDBlocks.COBBLED_GLOOMSLATE);
        stonecutterResultFromBase(exporter, DDBlocks.GLOOMSLATE_BRICKS, DDBlocks.GLOOMSLATE);
        registerStairsSlabsAndWalls(exporter, DDBlocks.COBBLED_GLOOMSLATE, DDBlocks.GLOOMSLATE_BRICKS, DDBlocks.GLOOMSLATE_BRICK_STAIRS, DDBlocks.GLOOMSLATE_BRICK_SLAB, DDBlocks.GLOOMSLATE_BRICK_WALL);

        stonecutterResultFromBase(exporter, DDBlocks.GLOOMSLATE_TILES, DDBlocks.COBBLED_GLOOMSLATE);
        registerStairsSlabsAndWalls(exporter, DDBlocks.COBBLED_GLOOMSLATE, DDBlocks.GLOOMSLATE_TILES, DDBlocks.GLOOMSLATE_TILE_STAIRS, DDBlocks.GLOOMSLATE_TILE_SLAB, DDBlocks.GLOOMSLATE_TILE_WALL);

        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE), DDBlocks.SMOOTH_GLOOMSLATE, 0.1f, 200, "sculk_stone");
        stairBuilder(DDBlocks.SMOOTH_GLOOMSLATE_STAIRS, Ingredient.of(DDBlocks.SMOOTH_GLOOMSLATE));
        stonecutterResultFromBase(exporter, DDBlocks.SMOOTH_GLOOMSLATE_STAIRS, DDBlocks.SMOOTH_GLOOMSLATE);
        slab(exporter, DDBlocks.SMOOTH_GLOOMSLATE_SLAB, DDBlocks.SMOOTH_GLOOMSLATE);
        stonecutterResultFromBase(exporter, DDBlocks.SMOOTH_GLOOMSLATE_SLAB, DDBlocks.SMOOTH_GLOOMSLATE, 2);
        wall(exporter, DDBlocks.SMOOTH_GLOOMSLATE_WALL, DDBlocks.SMOOTH_GLOOMSLATE);
        stonecutterResultFromBase(exporter, DDBlocks.SMOOTH_GLOOMSLATE_WALL, DDBlocks.SMOOTH_GLOOMSLATE);

        polished(exporter, DDBlocks.CUT_GLOOMSLATE, DDBlocks.SMOOTH_GLOOMSLATE);
        registerStairsSlabsAndWalls(exporter, DDBlocks.SMOOTH_GLOOMSLATE, DDBlocks.CUT_GLOOMSLATE, DDBlocks.CUT_GLOOMSLATE_STAIRS, DDBlocks.CUT_GLOOMSLATE_SLAB, DDBlocks.CUT_GLOOMSLATE_WALL);

        chiseled(exporter, DDBlocks.CHISELED_GLOOMSLATE, DDBlocks.GLOOMSLATE_BRICK_SLAB);

        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_COAL_ORE), Items.COAL, 0.1f, 200, "coal");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_COAL_ORE), Items.COAL, 0.1f, 100, "coal");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_IRON_ORE), Items.IRON_INGOT, 0.7f, 200, "iron_ingot");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_IRON_ORE), Items.IRON_INGOT, 0.7f, 100, "iron_ingot");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_COPPER_ORE), Items.COPPER_INGOT, 0.7f, 200, "copper_ingot");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_COPPER_ORE), Items.COPPER_INGOT, 0.7f, 100, "copper_ingot");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_GOLD_ORE), Items.GOLD_INGOT, 1.0f, 200, "gold_ingot");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_GOLD_ORE), Items.GOLD_INGOT, 1.0f, 100, "gold_ingot");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_REDSTONE_ORE), Items.REDSTONE, 0.7f, 200, "redstone");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_REDSTONE_ORE), Items.REDSTONE, 0.7f, 100, "redstone");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_EMERALD_ORE), Items.EMERALD, 1.0f, 200, "emerald");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_EMERALD_ORE), Items.EMERALD, 1.0f, 100, "emerald");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_LAPIS_ORE), Items.LAPIS_LAZULI, 0.2f, 200, "lapis_lazuli");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_LAPIS_ORE), Items.LAPIS_LAZULI, 0.2f, 100, "lapis_lazuli");
        oreSmelting(exporter, List.of(DDBlocks.SCULK_STONE_DIAMOND_ORE), Items.DIAMOND, 1.0f, 200, "diamond");
        oreBlasting(exporter, List.of(DDBlocks.SCULK_STONE_DIAMOND_ORE), Items.DIAMOND, 1.0f, 100, "diamond");
        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE_COAL_ORE), Items.COAL, 0.1f, 200, "coal");
        oreBlasting(exporter, List.of(DDBlocks.GLOOMSLATE_COAL_ORE), Items.COAL, 0.1f, 100, "coal");
        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE_IRON_ORE), Items.IRON_INGOT, 0.7f, 200, "iron_ingot");
        oreBlasting(exporter, List.of(DDBlocks.GLOOMSLATE_IRON_ORE), Items.IRON_INGOT, 0.7f, 100, "iron_ingot");
        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE_COPPER_ORE), Items.COPPER_INGOT, 0.7f, 200, "copper_ingot");
        oreBlasting(exporter, List.of(DDBlocks.GLOOMSLATE_COPPER_ORE), Items.COPPER_INGOT, 0.7f, 100, "copper_ingot");
        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE_GOLD_ORE), Items.GOLD_INGOT, 1.0f, 200, "gold_ingot");
        oreBlasting(exporter, List.of(DDBlocks.GLOOMSLATE_GOLD_ORE), Items.GOLD_INGOT, 1.0f, 100, "gold_ingot");
        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE_REDSTONE_ORE), Items.REDSTONE, 0.7f, 200, "redstone");
        oreBlasting(exporter, List.of(DDBlocks.GLOOMSLATE_REDSTONE_ORE), Items.REDSTONE, 0.7f, 100, "redstone");
        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE_EMERALD_ORE), Items.EMERALD, 1.0f, 200, "emerald");
        oreBlasting(exporter, List.of(DDBlocks.GLOOMSLATE_EMERALD_ORE), Items.EMERALD, 1.0f, 100, "emerald");
        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE_LAPIS_ORE), Items.LAPIS_LAZULI, 0.2f, 200, "lapis_lazuli");
        oreBlasting(exporter, List.of(DDBlocks.GLOOMSLATE_LAPIS_ORE), Items.LAPIS_LAZULI, 0.2f, 100, "lapis_lazuli");
        oreSmelting(exporter, List.of(DDBlocks.GLOOMSLATE_DIAMOND_ORE), Items.DIAMOND, 1.0f, 200, "diamond");
        oreBlasting(exporter, List.of(DDBlocks.GLOOMSLATE_DIAMOND_ORE), Items.DIAMOND, 1.0f, 100, "diamond");

        oreSmelting(exporter, List.of(DDItems.GRIME_BALL), DDItems.GRIME_BRICK, 0.3f, 200, "grime_brick");

        ShapedRecipeBuilder.shaped(DDItems.REINFORCED_ECHO_SHARD).define('P', Items.PHANTOM_MEMBRANE).define('C', DDItems.WARDEN_CARAPACE).define('E', Items.ECHO_SHARD).pattern("PCP").pattern("CEC").pattern("PCP").unlockedBy(FabricRecipeProvider.getHasName(Items.ECHO_SHARD), FabricRecipeProvider.has(Items.ECHO_SHARD)).save(exporter);
        ShapedRecipeBuilder.shaped(DDItems.SOUL_ELYTRA).define('B', DDItems.SCULK_BONE).define('D', DDItems.SOUL_DUST).define('E', Items.ELYTRA).define('S', DDItems.SOUL_CRYSTAL).pattern("BDB").pattern("DED").pattern("BSB").unlockedBy(FabricRecipeProvider.getHasName(Items.ELYTRA), FabricRecipeProvider.has(Items.ELYTRA)).save(exporter);

        oreSmelting(exporter, List.of(DDBlocks.GLOOMY_CACTUS), DDBlocks.GLOOMY_CACTUS, 1.0f, 200, "orange_dye");
    }

    private static void registerStairsSlabsAndWalls(Consumer<FinishedRecipe> exporter, ItemLike originalStone, ItemLike stone, ItemLike stairs, ItemLike slab, ItemLike wall) {
        stairBuilder(stairs, Ingredient.of(stone)).unlockedBy(getHasName(stone), has(stone)).save(exporter);
        stonecutterResultFromBase(exporter, stairs, stone);
        stonecutterResultFromBase(exporter, stairs, originalStone);
        slabBuilder(slab, Ingredient.of(stone)).unlockedBy(getHasName(stone), has(stone)).save(exporter, getConversionRecipeName(slab, stone));
        slabBuilder(slab, Ingredient.of(originalStone)).unlockedBy(getHasName(originalStone), has(originalStone)).save(exporter, getConversionRecipeName(slab, originalStone));
        stonecutterResultFromBase(exporter, slab, stone, 2);
        stonecutterResultFromBase(exporter, slab, originalStone, 2);
        wallBuilder(wall, Ingredient.of(stone)).unlockedBy(getHasName(stone), has(stone)).save(exporter, getConversionRecipeName(wall, stone));
        wallBuilder(wall, Ingredient.of(originalStone)).unlockedBy(getHasName(originalStone), has(originalStone)).save(exporter, getConversionRecipeName(wall, originalStone));
        stonecutterResultFromBase(exporter, wall, stone);
        stonecutterResultFromBase(exporter, wall, originalStone);
    }
    
    private static void twoByTwoPacker(Consumer<FinishedRecipe> consumer, Block block, ItemLike item) {
        ShapedRecipeBuilder.shaped(block).define('I', item).pattern("II").pattern("II").unlockedBy(getHasName(item), has(item)).save(consumer);
    }
}