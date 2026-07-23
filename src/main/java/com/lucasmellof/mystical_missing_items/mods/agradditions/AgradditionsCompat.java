package com.lucasmellof.mystical_missing_items.mods.agradditions;

import com.blakebr0.mysticalagradditions.init.ModItems;
import com.blakebr0.mysticalagradditions.lib.ModCropTiers;
import com.blakebr0.mysticalagriculture.block.GrowthAcceleratorBlock;
import com.blakebr0.mysticalagriculture.api.machine.MachineUpgradeTier;
import com.blakebr0.mysticalagriculture.item.EssenceWateringCanItem;
import com.blakebr0.mysticalagriculture.item.MachineUpgradeItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceBootsItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceChestplateItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceHelmetItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceLeggingsItem;
import com.blakebr0.mysticalagriculture.item.tool.*;
import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.EnumMap;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class AgradditionsCompat {

	private static final ResourceKey<EquipmentAsset> INSANIUM_ASSET =
			ResourceKey.create(EquipmentAssets.ROOT_ID, Const.of("insanium"));

	public static final ArmorMaterial INSANIUM = new ArmorMaterial(
			370,
			Util.make(new EnumMap<>(ArmorType.class), map -> {
				map.put(ArmorType.BOOTS, 10);
				map.put(ArmorType.LEGGINGS, 12);
				map.put(ArmorType.CHESTPLATE, 14);
				map.put(ArmorType.HELMET, 8);
			}),
			24,
			SoundEvents.ARMOR_EQUIP_GOLD,
			4f,
			0.0f,
			AgradditionsTags.Items.REPAIRS_INSANIUM_ARMOR,
			INSANIUM_ASSET
	);

	public static final DeferredHolder<Item, Item> INSANIUM_SWORD = ModRegistry.ITEMS.register("insanium_sword", () -> new EssenceSwordItem(Const.of("insanium_sword"), AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_PICKAXE = ModRegistry.ITEMS.register("insanium_pickaxe", () -> new EssencePickaxeItem(Const.of("insanium_pickaxe"), AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_SHOVEL = ModRegistry.ITEMS.register("insanium_shovel", () -> new EssenceShovelItem(Const.of("insanium_shovel"), AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_AXE = ModRegistry.ITEMS.register("insanium_axe", () -> new EssenceAxeItem(Const.of("insanium_axe"), AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_HOE = ModRegistry.ITEMS.register("insanium_hoe", () -> new EssenceHoeItem(Const.of("insanium_hoe"), AgradditionsTier.INSANIUM, 6, 2));
//	public static final DeferredHolder<Item, Item> INSANIUM_STAFF = ModRegistry.ITEMS.register("insanium_staff", () -> new EssenceStaffItem(6, 1));
	public static final DeferredHolder<Item, Item> INSANIUM_WATERING_CAN = ModRegistry.ITEMS.register("insanium_watering_can", () -> new EssenceWateringCanItem(Const.of("insanium_watering_can"), 15, 0.50, ModCropTiers.SIX.getTextColor()));
	public static final DeferredHolder<Item, Item> INSANIUM_BOW = ModRegistry.registerBow("insanium_bow", AgradditionsTier.INSANIUM, 6, 2, 2.35F, 5.0F);
	public static final DeferredHolder<Item, Item> INSANIUM_CROSSBOW = ModRegistry.registerCrossbow("insanium_crossbow", AgradditionsTier.INSANIUM, 6, 2, 2.35F, 5.0F);
	public static final DeferredHolder<Item, Item> INSANIUM_SHEARS = ModRegistry.ITEMS.register("insanium_shears", () -> new EssenceShearsItem(Const.of("insanium_shears"), AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_FISHING_ROD = ModRegistry.registerFishingRod("insanium_fishing_rod", AgradditionsTier.INSANIUM, 6, 2);
	public static final DeferredHolder<Item, Item> INSANIUM_SICKLE = ModRegistry.registerSickle("insanium_sickle", AgradditionsTier.INSANIUM, 9, ModCropTiers.SIX.getTextColor(), 6, 2);
	public static final DeferredHolder<Item, Item> INSANIUM_SCYTHE = ModRegistry.registerScythe("insanium_scythe", AgradditionsTier.INSANIUM, 9, ModCropTiers.SIX.getTextColor(), 6, 2);
	public static final DeferredHolder<Item, Item> INSANIUM_HELMET = ModRegistry.ITEMS.register("insanium_helmet", () -> new EssenceHelmetItem(Const.of("insanium_helmet"), INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_CHESTPLATE = ModRegistry.ITEMS.register("insanium_chestplate", () -> new EssenceChestplateItem(Const.of("insanium_chestplate"), INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_LEGGINGS = ModRegistry.ITEMS.register("insanium_leggings", () -> new EssenceLeggingsItem(Const.of("insanium_leggings"), INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_BOOTS = ModRegistry.ITEMS.register("insanium_boots", () -> new EssenceBootsItem(Const.of("insanium_boots"), INSANIUM, 6, 2));

	public static final MachineUpgradeTier INSANIUM_UPGRADE = Enum.valueOf(MachineUpgradeTier.class, "INSANIUM");

	public static final DeferredHolder<Item, Item> INSANIUM_MACHINE_UPGRADE = ModRegistry.ITEMS.register("insanium_upgrade", () -> new MachineUpgradeItem(Const.of("insanium_upgrade"), INSANIUM_UPGRADE));

    public static final DeferredHolder<Block, Block> INSANIUM_GROWTH_ACCELERATOR = ModRegistry.registerBlock(
            "insanium_growth_accelerator",
            () -> new GrowthAcceleratorBlock(Const.of("insanium_growth_accelerator"), 64, ModCropTiers.SIX.getTextColor()));

	public static void init() {
		// to be called to load the class
	}

}
