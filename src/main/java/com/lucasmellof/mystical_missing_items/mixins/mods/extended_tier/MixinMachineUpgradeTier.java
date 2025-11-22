package com.lucasmellof.mystical_missing_items.mixins.mods.extended_tier;

import com.blakebr0.mysticalagriculture.api.crop.CropTier;
import com.blakebr0.mysticalagriculture.api.machine.MachineUpgradeTier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import velvet.mysticalextendedtier.lib.ModCropTiers;

import java.util.Arrays;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 22/11/2025
 */
@Mixin(MachineUpgradeTier.class)
public abstract class MixinMachineUpgradeTier {
	@Mutable
	@Shadow
	@Final
	private static MachineUpgradeTier[] $VALUES;

	@Invoker("<init>")
	public static MachineUpgradeTier invokeInit(
			String internalName, int ordinal,
			CropTier tier,
			double operationTimeMultiplier,
			double fuelUsageMultiplier,
			double fuelCapacityMultiplier,
			int addedRange
	) {
		throw new UnsupportedOperationException("this should never be called");
	}

	@Inject(method = "<clinit>", at = @At("TAIL"))
	private static void addExtraTier(CallbackInfo ci) {
		MachineUpgradeTier ornium = invokeInit(
				"ORNIUM",
				$VALUES.length,
				ModCropTiers.SEVEN,
				0.003,
				192,
				9,
				8
		);
		MachineUpgradeTier lightium = invokeInit(
				"LIGHTIUM",
				$VALUES.length,
				ModCropTiers.EIGHT,
				0.0025,
				256,
				10,
				9
		);
		MachineUpgradeTier tornium = invokeInit(
				"TORNIUM",
				$VALUES.length,
				ModCropTiers.NINE,
				0.002,
				384,
				11,
				10
		);
		MachineUpgradeTier newTier = invokeInit(
				"OURANIUM",
				$VALUES.length,
				ModCropTiers.TEN,
				0.001,
				512,
				12,
				11
		);


		MachineUpgradeTier[] oldTiers = $VALUES;
		MachineUpgradeTier[] newTiers = Arrays.copyOf(oldTiers, oldTiers.length + 4);
		newTiers[oldTiers.length] = ornium;
		newTiers[oldTiers.length + 1] = lightium;
		newTiers[oldTiers.length + 2] = tornium;
		newTiers[oldTiers.length + 3] = newTier;
		$VALUES = newTiers;
	}

}
