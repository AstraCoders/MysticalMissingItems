package com.lucasmellof.mystical_missing_items.mixins.mods.agradditions;

import com.blakebr0.mysticalagradditions.init.ModCropTiers;
import com.blakebr0.mysticalagriculture.api.crop.CropTier;
import com.blakebr0.mysticalagriculture.util.MachineUpgradeTier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

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
		MachineUpgradeTier newTier = invokeInit(
				"INSANIUM",
				$VALUES.length,
				ModCropTiers.SIX,
				0.004,
				128,
				8,
				7
		);

		MachineUpgradeTier[] oldTiers = $VALUES;
		MachineUpgradeTier[] newTiers = Arrays.copyOf(oldTiers, oldTiers.length + 1);
		newTiers[oldTiers.length] = newTier;
		$VALUES = newTiers;
	}

}
