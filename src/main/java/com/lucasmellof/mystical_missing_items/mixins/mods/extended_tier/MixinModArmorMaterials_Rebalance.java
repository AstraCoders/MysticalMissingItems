package com.lucasmellof.mystical_missing_items.mixins.mods.extended_tier;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import velvet.mysticalextendedtier.init.ModArmorMaterials;

import java.util.EnumMap;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
@Mixin(ModArmorMaterials.class)
public class MixinModArmorMaterials_Rebalance {
    @Redirect(
            method = "lambda$static$0",
            at =
                    @At(
                            value = "INVOKE",
                            target = "Ljava/util/EnumMap;put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;"))
    private static <K extends Enum<K>, V> V onPut(EnumMap instance, K key, V value) {
        return (V) instance.put(key, (Integer) value + 2);
    }

    @Redirect(
            method = "lambda$static$3",
            at =
                    @At(
                            value = "INVOKE",
                            target = "Ljava/util/EnumMap;put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;"))
    private static <K extends Enum<K>, V> V onPut$3(EnumMap instance, K key, V value) {
        return (V) instance.put(key, (Integer) value + 2);
    }

    @Redirect(
            method = "lambda$static$6",
            at =
                    @At(
                            value = "INVOKE",
                            target = "Ljava/util/EnumMap;put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;"))
    private static <K extends Enum<K>, V> V onPut$6(EnumMap instance, K key, V value) {
        return (V) instance.put(key, (Integer) value + 2);
    }

    @Redirect(
            method = "lambda$static$9",
            at =
                    @At(
                            value = "INVOKE",
                            target = "Ljava/util/EnumMap;put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;"))
    private static <K extends Enum<K>, V> V onPut$9(EnumMap instance, K key, V value) {
        return (V) instance.put(key, (Integer) value + 2);
    }
}
