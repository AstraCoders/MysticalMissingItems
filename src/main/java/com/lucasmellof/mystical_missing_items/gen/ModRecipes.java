package com.lucasmellof.mystical_missing_items.gen;

import com.blakebr0.mysticalagradditions.init.ModItems;
import com.lucasmellof.mystical_missing_items.mods.agradditions.AgradditionsCompat;
import com.lucasmellof.mystical_missing_items.mods.extended_tier.ExtendedTierCompat;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 22/11/2025
 */
public class ModRecipes extends RecipeProvider implements IConditionBuilder {
	public ModRecipes(PackOutput output) {
		super(output);
	}


	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> output) {
		// Watering Can - uses crafting_shaped
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AgradditionsCompat.INSANIUM_WATERING_CAN.get())
				.pattern("FGF")
				.pattern("ISI")
				.pattern("FGF")
				.define('F', com.blakebr0.mysticalagriculture.init.ModItems.MYSTICAL_FERTILIZER.get())
				.define('G', ModItems.INSANIUM_INGOT.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_WATERING_CAN.get())
				.unlockedBy("has_awakened_supremium_watering_can", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_WATERING_CAN.get()))
				.save(output);

		// Sword - uses cucumber:shaped_transfer_damage (using ShapedRecipeBuilder for now)
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AgradditionsCompat.INSANIUM_SWORD.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SWORD.get())
				.unlockedBy("has_awakened_supremium_sword", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SWORD.get()))
				.save(output);

		// Pickaxe
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AgradditionsCompat.INSANIUM_PICKAXE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_PICKAXE.get())
				.unlockedBy("has_awakened_supremium_pickaxe", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_PICKAXE.get()))
				.save(output);

		// Axe
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AgradditionsCompat.INSANIUM_AXE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_AXE.get())
				.unlockedBy("has_awakened_supremium_axe", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_AXE.get()))
				.save(output);

		// Shovel
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AgradditionsCompat.INSANIUM_SHOVEL.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SHOVEL.get())
				.unlockedBy("has_awakened_supremium_shovel", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SHOVEL.get()))
				.save(output);

		// Hoe
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AgradditionsCompat.INSANIUM_HOE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_HOE.get())
				.unlockedBy("has_awakened_supremium_hoe", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_HOE.get()))
				.save(output);

		// Bow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AgradditionsCompat.INSANIUM_BOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_BOW.get())
				.unlockedBy("has_awakened_supremium_bow", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_BOW.get()))
				.save(output);

		// Crossbow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AgradditionsCompat.INSANIUM_CROSSBOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_CROSSBOW.get())
				.unlockedBy("has_awakened_supremium_crossbow", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_CROSSBOW.get()))
				.save(output);

		// Shears
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AgradditionsCompat.INSANIUM_SHEARS.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SHEARS.get())
				.unlockedBy("has_awakened_supremium_shears", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SHEARS.get()))
				.save(output);

		// Fishing Rod
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AgradditionsCompat.INSANIUM_FISHING_ROD.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_FISHING_ROD.get())
				.unlockedBy("has_awakened_supremium_fishing_rod", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_FISHING_ROD.get()))
				.save(output);

		// Sickle
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AgradditionsCompat.INSANIUM_SICKLE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SICKLE.get())
				.unlockedBy("has_awakened_supremium_sickle", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SICKLE.get()))
				.save(output);

		// Scythe
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, AgradditionsCompat.INSANIUM_SCYTHE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SCYTHE.get())
				.unlockedBy("has_awakened_supremium_scythe", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_SCYTHE.get()))
				.save(output);

		// Helmet
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AgradditionsCompat.INSANIUM_HELMET.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_HELMET.get())
				.unlockedBy("has_awakened_supremium_helmet", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_HELMET.get()))
				.save(output);

		// Chestplate
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AgradditionsCompat.INSANIUM_CHESTPLATE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_CHESTPLATE.get())
				.unlockedBy("has_awakened_supremium_chestplate", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_CHESTPLATE.get()))
				.save(output);

		// Leggings
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AgradditionsCompat.INSANIUM_LEGGINGS.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_LEGGINGS.get())
				.unlockedBy("has_awakened_supremium_leggings", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_LEGGINGS.get()))
				.save(output);

		// Boots
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, AgradditionsCompat.INSANIUM_BOOTS.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', ModItems.INSANIUM_GEMSTONE.get())
				.define('I', ModItems.INSANIUM_INGOT.get())
				.define('S', com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_BOOTS.get())
				.unlockedBy("has_awakened_supremium_boots", has(com.blakebr0.mysticalagriculture.init.ModItems.AWAKENED_SUPREMIUM_BOOTS.get()))
				.save(output);
		// ========== EXTENDED TIER RECIPES ==========

		// ORNIUM - upgrades from INSANIUM
		// Bow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ExtendedTierCompat.ORNIUM_BOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_INGOT.get())
				.define('S', AgradditionsCompat.INSANIUM_BOW.get())
				.unlockedBy("has_insanium_bow", has(AgradditionsCompat.INSANIUM_BOW.get()))
				.save(output);

		// Crossbow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ExtendedTierCompat.ORNIUM_CROSSBOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_INGOT.get())
				.define('S', AgradditionsCompat.INSANIUM_CROSSBOW.get())
				.unlockedBy("has_insanium_crossbow", has(AgradditionsCompat.INSANIUM_CROSSBOW.get()))
				.save(output);

		// Fishing Rod
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.ORNIUM_FISHING_ROD.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_INGOT.get())
				.define('S', AgradditionsCompat.INSANIUM_FISHING_ROD.get())
				.unlockedBy("has_insanium_fishing_rod", has(AgradditionsCompat.INSANIUM_FISHING_ROD.get()))
				.save(output);

		// Sickle
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.ORNIUM_SICKLE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_INGOT.get())
				.define('S', AgradditionsCompat.INSANIUM_SICKLE.get())
				.unlockedBy("has_insanium_sickle", has(AgradditionsCompat.INSANIUM_SICKLE.get()))
				.save(output);

		// Scythe
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.ORNIUM_SCYTHE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.ORNIUM_INGOT.get())
				.define('S', AgradditionsCompat.INSANIUM_SCYTHE.get())
				.unlockedBy("has_insanium_scythe", has(AgradditionsCompat.INSANIUM_SCYTHE.get()))
				.save(output);

		// LIGHTIUM - upgrades from ORNIUM
		// Bow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ExtendedTierCompat.LIGHTIUM_BOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_INGOT.get())
				.define('S', ExtendedTierCompat.ORNIUM_BOW.get())
				.unlockedBy("has_ornium_bow", has(ExtendedTierCompat.ORNIUM_BOW.get()))
				.save(output);

		// Crossbow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ExtendedTierCompat.LIGHTIUM_CROSSBOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_INGOT.get())
				.define('S', ExtendedTierCompat.ORNIUM_CROSSBOW.get())
				.unlockedBy("has_ornium_crossbow", has(ExtendedTierCompat.ORNIUM_CROSSBOW.get()))
				.save(output);

		// Fishing Rod
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.LIGHTIUM_FISHING_ROD.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_INGOT.get())
				.define('S', ExtendedTierCompat.ORNIUM_FISHING_ROD.get())
				.unlockedBy("has_ornium_fishing_rod", has(ExtendedTierCompat.ORNIUM_FISHING_ROD.get()))
				.save(output);

		// Sickle
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.LIGHTIUM_SICKLE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_INGOT.get())
				.define('S', ExtendedTierCompat.ORNIUM_SICKLE.get())
				.unlockedBy("has_ornium_sickle", has(ExtendedTierCompat.ORNIUM_SICKLE.get()))
				.save(output);

		// Scythe
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.LIGHTIUM_SCYTHE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.LIGHTIUM_INGOT.get())
				.define('S', ExtendedTierCompat.ORNIUM_SCYTHE.get())
				.unlockedBy("has_ornium_scythe", has(ExtendedTierCompat.ORNIUM_SCYTHE.get()))
				.save(output);

		// TORNIUM - upgrades from LIGHTIUM
		// Bow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ExtendedTierCompat.TORNIUM_BOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_INGOT.get())
				.define('S', ExtendedTierCompat.LIGHTIUM_BOW.get())
				.unlockedBy("has_lightium_bow", has(ExtendedTierCompat.LIGHTIUM_BOW.get()))
				.save(output);

		// Crossbow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ExtendedTierCompat.TORNIUM_CROSSBOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_INGOT.get())
				.define('S', ExtendedTierCompat.LIGHTIUM_CROSSBOW.get())
				.unlockedBy("has_lightium_crossbow", has(ExtendedTierCompat.LIGHTIUM_CROSSBOW.get()))
				.save(output);

		// Fishing Rod
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.TORNIUM_FISHING_ROD.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_INGOT.get())
				.define('S', ExtendedTierCompat.LIGHTIUM_FISHING_ROD.get())
				.unlockedBy("has_lightium_fishing_rod", has(ExtendedTierCompat.LIGHTIUM_FISHING_ROD.get()))
				.save(output);

		// Sickle
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.TORNIUM_SICKLE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_INGOT.get())
				.define('S', ExtendedTierCompat.LIGHTIUM_SICKLE.get())
				.unlockedBy("has_lightium_sickle", has(ExtendedTierCompat.LIGHTIUM_SICKLE.get()))
				.save(output);

		// Scythe
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.TORNIUM_SCYTHE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.TORNIUM_INGOT.get())
				.define('S', ExtendedTierCompat.LIGHTIUM_SCYTHE.get())
				.unlockedBy("has_lightium_scythe", has(ExtendedTierCompat.LIGHTIUM_SCYTHE.get()))
				.save(output);

		// OURANIUM - upgrades from TORNIUM
		// Bow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ExtendedTierCompat.OURANIUM_BOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_INGOT.get())
				.define('S', ExtendedTierCompat.TORNIUM_BOW.get())
				.unlockedBy("has_tornium_bow", has(ExtendedTierCompat.TORNIUM_BOW.get()))
				.save(output);

		// Crossbow
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ExtendedTierCompat.OURANIUM_CROSSBOW.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_INGOT.get())
				.define('S', ExtendedTierCompat.TORNIUM_CROSSBOW.get())
				.unlockedBy("has_tornium_crossbow", has(ExtendedTierCompat.TORNIUM_CROSSBOW.get()))
				.save(output);

		// Fishing Rod
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.OURANIUM_FISHING_ROD.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_INGOT.get())
				.define('S', ExtendedTierCompat.TORNIUM_FISHING_ROD.get())
				.unlockedBy("has_tornium_fishing_rod", has(ExtendedTierCompat.TORNIUM_FISHING_ROD.get()))
				.save(output);

		// Sickle
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.OURANIUM_SICKLE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_INGOT.get())
				.define('S', ExtendedTierCompat.TORNIUM_SICKLE.get())
				.unlockedBy("has_tornium_sickle", has(ExtendedTierCompat.TORNIUM_SICKLE.get()))
				.save(output);

		// Scythe
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ExtendedTierCompat.OURANIUM_SCYTHE.get())
				.pattern(" G ")
				.pattern("ISI")
				.pattern(" G ")
				.define('G', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_GEMSTONE.get())
				.define('I', Velvet.mystical_extended_tier.init.ModItems.OURANIUM_INGOT.get())
				.define('S', ExtendedTierCompat.TORNIUM_SCYTHE.get())
				.unlockedBy("has_tornium_scythe", has(ExtendedTierCompat.TORNIUM_SCYTHE.get()))
				.save(output);
	}
}
