package com.kyanite.deeperdarker.content;

import com.kyanite.deeperdarker.DeeperDarker;
import com.kyanite.deeperdarker.content.items.*;
import com.kyanite.deeperdarker.util.DDArmorMaterials;
import com.kyanite.deeperdarker.util.DDTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class DDItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DeeperDarker.MOD_ID);

    public static final RegistryObject<Item> ECHO_SIGN = ITEMS.register("echo_sign", () -> new SignItem(new Item.Properties().stacksTo(16), DDBlocks.ECHO_SIGN.get(), DDBlocks.ECHO_WALL_SIGN.get()));
    public static final RegistryObject<Item> ECHO_HANGING_SIGN = ITEMS.register("echo_hanging_sign", () -> new HangingSignItem(DDBlocks.ECHO_HANGING_SIGN.get(), DDBlocks.ECHO_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> GRIME_BALL = ITEMS.register("grime_ball", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRIME_BRICK = ITEMS.register("grime_brick", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SOUL_ELYTRA = ITEMS.register("soul_elytra", () -> new SoulElytraItem(new Item.Properties().durability(956).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ECHO_BOAT = ITEMS.register("echo_boat", () -> new DDBoatItem(false, new Item.Properties().stacksTo(1), DDBlocks.ECHO));
    public static final RegistryObject<Item> ECHO_CHEST_BOAT = ITEMS.register("echo_chest_boat", () -> new DDBoatItem(true, new Item.Properties().stacksTo(1), DDBlocks.ECHO));

    public static final RegistryObject<Item> SCULK_BONE = ITEMS.register("sculk_bone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_DUST = ITEMS.register("soul_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_CRYSTAL = ITEMS.register("soul_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEART_OF_THE_DEEP = ITEMS.register("heart_of_the_deep", () -> new WardenHeartItem(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).fireResistant()));
    public static final RegistryObject<Item> WARDEN_CARAPACE = ITEMS.register("warden_carapace", () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> REINFORCED_ECHO_SHARD = ITEMS.register("reinforced_echo_shard", () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> WARDEN_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("warden_upgrade_smithing_template", () -> new SmithingTemplateItem(
            Component.translatable("item." + DeeperDarker.MOD_ID + ".smithing_template.warden_upgrade.applies_to").withStyle(ChatFormatting.BLUE),
            Component.translatable("item." + DeeperDarker.MOD_ID + ".smithing_template.warden_upgrade.ingredients").withStyle(ChatFormatting.BLUE),
            Component.translatable("upgrade." + DeeperDarker.MOD_ID + ".warden_upgrade").withStyle(ChatFormatting.GRAY),
            Component.translatable("item." + DeeperDarker.MOD_ID + ".smithing_template.warden_upgrade.base_slot_description"),
            Component.translatable("item." + DeeperDarker.MOD_ID + ".smithing_template.warden_upgrade.additions_slot_description"),
            SmithingTemplateItem.createNetheriteUpgradeIconList(), List.of(new ResourceLocation(DeeperDarker.MOD_ID, "item/empty_slot_shard"))
    ));

    public static final RegistryObject<Item> WARDEN_SHOVEL = ITEMS.register("warden_shovel", () -> new ShovelItem(DDTiers.WARDEN, 1.5f, -3, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> WARDEN_PICKAXE = ITEMS.register("warden_pickaxe", () -> new PickaxeItem(DDTiers.WARDEN, 1, -2.8f, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> WARDEN_AXE = ITEMS.register("warden_axe", () -> new AxeItem(DDTiers.WARDEN, 5, -3, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> WARDEN_HOE = ITEMS.register("warden_hoe", () -> new HoeItem(DDTiers.WARDEN, -4, 0, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> WARDEN_SWORD = ITEMS.register("warden_sword", () -> new SwordItem(DDTiers.WARDEN, 3, -2.4f, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> WARDEN_HELMET = ITEMS.register("warden_helmet", () -> new WardenArmorItem(DDArmorMaterials.WARDEN, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> WARDEN_CHESTPLATE = ITEMS.register("warden_chestplate", () -> new WardenArmorItem(DDArmorMaterials.WARDEN, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> WARDEN_LEGGINGS = ITEMS.register("warden_leggings", () -> new WardenArmorItem(DDArmorMaterials.WARDEN, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.RARE).fireResistant()));
    public static final RegistryObject<Item> WARDEN_BOOTS = ITEMS.register("warden_boots", () -> new WardenArmorItem(DDArmorMaterials.WARDEN, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> SCULK_TRANSMITTER = ITEMS.register("sculk_transmitter", () -> new SculkTransmitterItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    // public static final RegistryObject<Item> SONOROUS_STAFF = ITEMS.register("sonorous_staff", () -> new WardenStaffItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> SCULK_CENTIPEDE_SPAWN_EGG = ITEMS.register("sculk_centipede_spawn_egg", () -> new ForgeSpawnEggItem(DDEntities.SCULK_CENTIPEDE, 0x1a2340, 0xded697, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_LEECH_SPAWN_EGG = ITEMS.register("sculk_leech_spawn_egg", () -> new ForgeSpawnEggItem(DDEntities.SCULK_LEECH, 0x152b38, 0x47e5ed, new Item.Properties()));
    public static final RegistryObject<Item> SCULK_SNAPPER_SPAWN_EGG = ITEMS.register("sculk_snapper_spawn_egg", () -> new ForgeSpawnEggItem(DDEntities.SCULK_SNAPPER, 0xd1d6b6, 0x1d726f, new Item.Properties()));
    public static final RegistryObject<Item> SHATTERED_SPAWN_EGG = ITEMS.register("shattered_spawn_egg", () -> new ForgeSpawnEggItem(DDEntities.SHATTERED, 0x0e181d, 0x819699, new Item.Properties()));
    public static final RegistryObject<Item> SHRIEK_WORM_SPAWN_EGG = ITEMS.register("shriek_worm_spawn_egg", () -> new ForgeSpawnEggItem(DDEntities.SHRIEK_WORM, 0xd1d6b6, 0x009295, new Item.Properties()));
    public static final RegistryObject<Item> STALKER_SPAWN_EGG = ITEMS.register("stalker_spawn_egg", () -> new ForgeSpawnEggItem(DDEntities.STALKER, 0x172226, 0x6abdd9, new Item.Properties()));
}
