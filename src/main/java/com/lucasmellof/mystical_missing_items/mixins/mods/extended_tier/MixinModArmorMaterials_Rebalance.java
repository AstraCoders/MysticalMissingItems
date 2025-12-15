package com.lucasmellof.mystical_missing_items.mixins.mods.extended_tier;

import net.minecraft.sounds.SoundEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import Velvet.mystical_extended_tier.lib.ModArmorMaterial;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Supplier;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
@Mixin(ModArmorMaterial.class)
public class MixinModArmorMaterials_Rebalance {

    @Inject(method = "<init>", at = @At("RETURN"))
    private void mysticalmissingitems$afterInit(String enumName, int ordinal, String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier par10, CallbackInfo ci) {

        for (int i = 0; i < damageReductionAmountArray.length; i++) {
            damageReductionAmountArray[i] += 2;
        }
    }
}
