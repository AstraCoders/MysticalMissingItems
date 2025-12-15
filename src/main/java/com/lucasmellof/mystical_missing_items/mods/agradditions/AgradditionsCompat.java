package com.lucasmellof.mystical_missing_items.mods.agradditions;

import com.blakebr0.mysticalagradditions.init.ModCropTiers;
import com.blakebr0.mysticalagradditions.init.ModItems;
import com.blakebr0.mysticalagriculture.item.EssenceWateringCanItem;
import com.blakebr0.mysticalagriculture.item.MachineUpgradeItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceBootsItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceChestplateItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceHelmetItem;
import com.blakebr0.mysticalagriculture.item.armor.EssenceLeggingsItem;
import com.blakebr0.mysticalagriculture.item.tool.*;
import com.blakebr0.mysticalagriculture.util.MachineUpgradeTier;
import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class AgradditionsCompat {

	public static final RegistryObject<Item> INSANIUM_SWORD = ModRegistry.ITEMS.register("insanium_sword", () -> new EssenceSwordItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final RegistryObject<Item> INSANIUM_PICKAXE = ModRegistry.ITEMS.register("insanium_pickaxe", () -> new EssencePickaxeItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final RegistryObject<Item> INSANIUM_SHOVEL = ModRegistry.ITEMS.register("insanium_shovel", () -> new EssenceShovelItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final RegistryObject<Item> INSANIUM_AXE = ModRegistry.ITEMS.register("insanium_axe", () -> new EssenceAxeItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final RegistryObject<Item> INSANIUM_HOE = ModRegistry.ITEMS.register("insanium_hoe", () -> new EssenceHoeItem(AgradditionsTier.INSANIUM, 6, 2));
//	public static final RegistryObject<Item> INSANIUM_STAFF = ModRegistry.ITEMS.register("insanium_staff", () -> new EssenceStaffItem(6, 1));
	public static final RegistryObject<Item> INSANIUM_WATERING_CAN = ModRegistry.ITEMS.register("insanium_watering_can", () -> new EssenceWateringCanItem(15, 0.50, ModCropTiers.SIX.getTextColor()));
	public static final RegistryObject<Item> INSANIUM_BOW = ModRegistry.registerBow("insanium_bow", AgradditionsTier.INSANIUM, 6, 2, 2.35F, 5.0F);
	public static final RegistryObject<Item> INSANIUM_CROSSBOW = ModRegistry.registerCrossbow("insanium_crossbow", AgradditionsTier.INSANIUM, 6, 2, 2.35F, 5.0F);
	public static final RegistryObject<Item> INSANIUM_SHEARS = ModRegistry.ITEMS.register("insanium_shears", () -> new EssenceShearsItem(AgradditionsTier.INSANIUM, 6, 2));
	public static final RegistryObject<Item> INSANIUM_FISHING_ROD = ModRegistry.registerFishingRod("insanium_fishing_rod", AgradditionsTier.INSANIUM, 6, 2);
	public static final RegistryObject<Item> INSANIUM_SICKLE = ModRegistry.registerSickle("insanium_sickle", AgradditionsTier.INSANIUM, 9, ModCropTiers.SIX.getTextColor(), 6, 2);
	public static final RegistryObject<Item> INSANIUM_SCYTHE = ModRegistry.registerScythe("insanium_scythe", AgradditionsTier.INSANIUM, 9, ModCropTiers.SIX.getTextColor(), 6, 2);
	public static final RegistryObject<Item> INSANIUM_HELMET = ModRegistry.ITEMS.register("insanium_helmet", () -> new EssenceHelmetItem(AgradditionsArmorMaterial.INSANIUM, 6, 2));
	public static final RegistryObject<Item> INSANIUM_CHESTPLATE = ModRegistry.ITEMS.register("insanium_chestplate", () -> new EssenceChestplateItem(AgradditionsArmorMaterial.INSANIUM, 6,  2));
	public static final RegistryObject<Item> INSANIUM_LEGGINGS = ModRegistry.ITEMS.register("insanium_leggings", () -> new EssenceLeggingsItem(AgradditionsArmorMaterial.INSANIUM, 6,  2));
	public static final RegistryObject<Item> INSANIUM_BOOTS = ModRegistry.ITEMS.register("insanium_boots", () -> new EssenceBootsItem(AgradditionsArmorMaterial.INSANIUM, 6,  2));

	public static final MachineUpgradeTier INSANIUM_UPGRADE = Enum.valueOf(MachineUpgradeTier.class, "INSANIUM");

	public static final RegistryObject<Item> INSANIUM_MACHINE_UPGRADE = ModRegistry.ITEMS.register("insanium_upgrade", () -> new MachineUpgradeItem(INSANIUM_UPGRADE));

	public static void init() {
		// to be called to load the class
	}

	public enum AgradditionsArmorMaterial implements ArmorMaterial {
	INSANIUM("insanium", 350, Util.make(
			new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 10);
				map.put(ArmorItem.Type.LEGGINGS, 12);
				map.put(ArmorItem.Type.CHESTPLATE, 14);
				map.put(ArmorItem.Type.HELMET, 8);
			}), 25,
			SoundEvents.ARMOR_EQUIP_GOLD,
			4f, 0f,
			() -> Ingredient.of(ModItems.INSANIUM_INGOT.get())
			);
		private final String name;
		private final int durabilityMultiplier;
		private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
		private final int enchantmentValue;
		private final SoundEvent sound;
		private final float toughness;
		private final float knockbackResistance;
		private final LazyLoadedValue<Ingredient> repairIngredient;

		private AgradditionsArmorMaterial(String pName, int pDurabilityMultiplier, EnumMap<ArmorItem.Type, Integer> pProtectionFunctionForType, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
			this.name = pName;
			this.durabilityMultiplier = pDurabilityMultiplier;
			this.protectionFunctionForType = pProtectionFunctionForType;
			this.enchantmentValue = pEnchantmentValue;
			this.sound = pSound;
			this.toughness = pToughness;
			this.knockbackResistance = pKnockbackResistance;
			this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
		}


		private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 16, 15, 11};
		public int getDurabilityForType(ArmorItem.Type type) {
			return MAX_DAMAGE_ARRAY[type.ordinal()] * this.durabilityMultiplier;
		}

		public int getDefenseForType(ArmorItem.Type pType) {
			return this.protectionFunctionForType.get(pType);
		}

		public int getEnchantmentValue() {
			return this.enchantmentValue;
		}

		public SoundEvent getEquipSound() {
			return this.sound;
		}

		public Ingredient getRepairIngredient() {
			return this.repairIngredient.get();
		}

		public String getName() {
			return this.name;
		}

		public float getToughness() {
			return this.toughness;
		}

		public float getKnockbackResistance() {
			return this.knockbackResistance;
		}
	}

}
