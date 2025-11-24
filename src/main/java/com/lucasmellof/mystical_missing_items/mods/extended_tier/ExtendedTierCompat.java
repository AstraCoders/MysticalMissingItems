package com.lucasmellof.mystical_missing_items.mods.extended_tier;

import com.blakebr0.mysticalagriculture.api.machine.MachineUpgradeTier;
import com.blakebr0.mysticalagriculture.item.MachineUpgradeItem;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import velvet.mysticalextendedtier.lib.ModItemTier;
import velvet.mysticalextendedtier.lib.ModCropTiers;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class ExtendedTierCompat {
	public static final DeferredHolder<Item, Item> ORNIUM_BOW = ModRegistry.registerBow("ornium_bow", ModItemTier.ORNIUM, 7, 2, 2.6F, 6.0F);
	public static final DeferredHolder<Item, Item> ORNIUM_CROSSBOW = ModRegistry.registerCrossbow("ornium_crossbow", ModItemTier.ORNIUM, 7, 2, 2.6F, 6.0F);
	public static final DeferredHolder<Item, Item> ORNIUM_FISHING_ROD = ModRegistry.registerFishingRod("ornium_fishing_rod", ModItemTier.ORNIUM, 7, 2);
	public static final DeferredHolder<Item, Item> ORNIUM_SICKLE = ModRegistry.registerSickle("ornium_sickle", ModItemTier.ORNIUM, 10, ModCropTiers.SEVEN.getTextColor(), 7, 2);
	public static final DeferredHolder<Item, Item> ORNIUM_SCYTHE = ModRegistry.registerScythe("ornium_scythe", ModItemTier.ORNIUM, 10, ModCropTiers.SEVEN.getTextColor(), 7, 2);


	public static final DeferredHolder<Item, Item> LIGHTIUM_BOW = ModRegistry.registerBow("lightium_bow", ModItemTier.LIGHTIUM, 8, 2, 2.85F, 7.0F);
	public static final DeferredHolder<Item, Item> LIGHTIUM_CROSSBOW = ModRegistry.registerCrossbow("lightium_crossbow", ModItemTier.LIGHTIUM, 8, 2, 2.85F, 7.0F);
	public static final DeferredHolder<Item, Item> LIGHTIUM_FISHING_ROD = ModRegistry.registerFishingRod("lightium_fishing_rod", ModItemTier.LIGHTIUM, 8, 2);
	public static final DeferredHolder<Item, Item> LIGHTIUM_SICKLE = ModRegistry.registerSickle("lightium_sickle", ModItemTier.LIGHTIUM, 11, ModCropTiers.EIGHT.getTextColor(), 8, 2);
	public static final DeferredHolder<Item, Item> LIGHTIUM_SCYTHE = ModRegistry.registerScythe("lightium_scythe", ModItemTier.LIGHTIUM, 11, ModCropTiers.EIGHT.getTextColor(), 8, 2);


	public static final DeferredHolder<Item, Item> TORNIUM_BOW = ModRegistry.registerBow("tornium_bow", ModItemTier.TORNIUM, 9, 2, 3.1F, 8.0F);
	public static final DeferredHolder<Item, Item> TORNIUM_CROSSBOW = ModRegistry.registerCrossbow("tornium_crossbow", ModItemTier.TORNIUM, 9, 2, 3.1F, 8.0F);
	public static final DeferredHolder<Item, Item> TORNIUM_FISHING_ROD = ModRegistry.registerFishingRod("tornium_fishing_rod", ModItemTier.TORNIUM, 9, 2);
	public static final DeferredHolder<Item, Item> TORNIUM_SICKLE = ModRegistry.registerSickle("tornium_sickle", ModItemTier.TORNIUM, 12, ModCropTiers.NINE.getTextColor(), 9, 2);
	public static final DeferredHolder<Item, Item> TORNIUM_SCYTHE = ModRegistry.registerScythe("tornium_scythe", ModItemTier.TORNIUM, 12, ModCropTiers.NINE.getTextColor(), 9, 2);

	public static final DeferredHolder<Item, Item> OURANIUM_BOW = ModRegistry.registerBow("ouranium_bow", ModItemTier.OURANIUM, 10, 2, 3.35F, 9.0F);
	public static final DeferredHolder<Item, Item> OURANIUM_CROSSBOW = ModRegistry.registerCrossbow("ouranium_crossbow", ModItemTier.OURANIUM, 10, 2, 3.35F, 9.0F);
	public static final DeferredHolder<Item, Item> OURANIUM_FISHING_ROD = ModRegistry.registerFishingRod("ouranium_fishing_rod", ModItemTier.OURANIUM, 10, 2);
	public static final DeferredHolder<Item, Item> OURANIUM_SICKLE = ModRegistry.registerSickle("ouranium_sickle", ModItemTier.OURANIUM, 13, ModCropTiers.TEN.getTextColor(), 10, 2);
	public static final DeferredHolder<Item, Item> OURANIUM_SCYTHE = ModRegistry.registerScythe("ouranium_scythe", ModItemTier.OURANIUM, 13, ModCropTiers.TEN.getTextColor(), 10, 2);


	public static final MachineUpgradeTier ORNIUM_UPGRADE = Enum.valueOf(MachineUpgradeTier.class, "ORNIUM");
	public static final MachineUpgradeTier LIGHTIUM_UPGRADE = Enum.valueOf(MachineUpgradeTier.class, "LIGHTIUM");
	public static final MachineUpgradeTier TORNIUM_UPGRADE = Enum.valueOf(MachineUpgradeTier.class, "TORNIUM");
	public static final MachineUpgradeTier OURANIUM_UPGRADE = Enum.valueOf(MachineUpgradeTier.class, "OURANIUM");

	public static final DeferredHolder<Item, Item> ORNIUM_MACHINE_UPGRADE = ModRegistry.ITEMS.register("ornium_upgrade", () -> new MachineUpgradeItem(ORNIUM_UPGRADE));
	public static final DeferredHolder<Item, Item> LIGHTIUM_MACHINE_UPGRADE = ModRegistry.ITEMS.register("lightium_upgrade", () -> new MachineUpgradeItem(LIGHTIUM_UPGRADE));
	public static final DeferredHolder<Item, Item> TORNIUM_MACHINE_UPGRADE = ModRegistry.ITEMS.register("tornium_upgrade", () -> new MachineUpgradeItem(TORNIUM_UPGRADE));
	public static final DeferredHolder<Item, Item> OURANIUM_MACHINE_UPGRADE = ModRegistry.ITEMS.register("ouranium_upgrade", () -> new MachineUpgradeItem(OURANIUM_UPGRADE));


	public static void init() {
	}

}
