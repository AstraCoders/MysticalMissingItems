package com.lucasmellof.mystical_missing_items.mods.agradditions;

import com.blakebr0.mysticalagradditions.init.ModItems;
import com.blakebr0.mysticalagradditions.lib.ModCropTiers;
import com.blakebr0.mysticalagriculture.item.EssenceWateringCanItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceBootsItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceChestplateItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceHelmetItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceLeggingsItem;
import com.blakebr0.mysticalagriculture.item.tool.*;
import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.EnumMap;
import java.util.List;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class AgradditionsCompat {
	public static final DeferredHolder<ArmorMaterial, ArmorMaterial> INSANIUM = ModRegistry.MATERIALS.register("insanium", () -> new ArmorMaterial(Util.make(
			new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 10);
				map.put(ArmorItem.Type.LEGGINGS, 12);
				map.put(ArmorItem.Type.CHESTPLATE, 14);
				map.put(ArmorItem.Type.HELMET, 8);
			}),
			24,
			SoundEvents.ARMOR_EQUIP_GOLD,
			() -> Ingredient.of(ModItems.INSANIUM_INGOT.get()),
			List.of(
					new ArmorMaterial.Layer(Const.of("insanium"), "", false)
			),
			4f, 0.0f
	));

	public static final DeferredHolder<Item, Item> INSANIUM_SWORD = ModRegistry.ITEMS.register("insanium_sword", () -> new EssenceSwordItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_PICKAXE = ModRegistry.ITEMS.register("insanium_pickaxe", () -> new EssencePickaxeItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_SHOVEL = ModRegistry.ITEMS.register("insanium_shovel", () -> new EssenceShovelItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_AXE = ModRegistry.ITEMS.register("insanium_axe", () -> new EssenceAxeItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_HOE = ModRegistry.ITEMS.register("insanium_hoe", () -> new EssenceHoeItem(AgradditionsTier.INSANIUM, 6, 2));
//	public static final DeferredHolder<Item, Item> INSANIUM_STAFF = ModRegistry.ITEMS.register("insanium_staff", () -> new EssenceStaffItem(6, 1));
	public static final DeferredHolder<Item, Item> INSANIUM_WATERING_CAN = ModRegistry.ITEMS.register("insanium_watering_can", () -> new EssenceWateringCanItem(15, 0.50, ModCropTiers.SIX.getTextColor()));
	public static final DeferredHolder<Item, Item> INSANIUM_BOW = ModRegistry.registerBow("insanium_bow", AgradditionsTier.INSANIUM, 6, 2, 2.35F, 5.0F);
	public static final DeferredHolder<Item, Item> INSANIUM_CROSSBOW = ModRegistry.registerCrossbow("insanium_crossbow", AgradditionsTier.INSANIUM, 6, 2, 2.35F, 5.0F);
	public static final DeferredHolder<Item, Item> INSANIUM_SHEARS = ModRegistry.ITEMS.register("insanium_shears", () -> new EssenceShearsItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_FISHING_ROD = ModRegistry.registerFishingRod("insanium_fishing_rod", AgradditionsTier.INSANIUM, 6, 2);
	public static final DeferredHolder<Item, Item> INSANIUM_SICKLE = ModRegistry.registerSickle("insanium_sickle", AgradditionsTier.INSANIUM, 9, ModCropTiers.SIX.getTextColor(), 6, 2);
	public static final DeferredHolder<Item, Item> INSANIUM_SCYTHE = ModRegistry.registerScythe("insanium_scythe", AgradditionsTier.INSANIUM, 9, ModCropTiers.SIX.getTextColor(), 6, 2);
	public static final DeferredHolder<Item, Item> INSANIUM_HELMET = ModRegistry.ITEMS.register("insanium_helmet", () -> new EssenceHelmetItem(INSANIUM, 370, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_CHESTPLATE = ModRegistry.ITEMS.register("insanium_chestplate", () -> new EssenceChestplateItem(INSANIUM, 370, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_LEGGINGS = ModRegistry.ITEMS.register("insanium_leggings", () -> new EssenceLeggingsItem(INSANIUM, 370, 6, 2));
	public static final DeferredHolder<Item, Item> INSANIUM_BOOTS = ModRegistry.ITEMS.register("insanium_boots", () -> new EssenceBootsItem(INSANIUM, 370, 6, 2));

	public static void init() {
		// to be called to load the class
	}

}
