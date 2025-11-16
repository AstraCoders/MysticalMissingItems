package com.lucasmellof.mystical_missing_items.mixins;

import com.blakebr0.mysticalagriculture.item.EssenceWateringCanItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import velvet.mysticalextendedtier.init.ModItems;
import velvet.mysticalextendedtier.lib.ModCropTiers;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
@Mixin(ModItems.class)
public class MixinModItems {
    @Shadow
    @Final
    public static DeferredRegister<Item> REGISTRY;

    @Shadow
    @Final
    public static DeferredHolder<Item, Item> ORNIUM_WATERING_CAN;

    @Shadow
    @Final
    public static DeferredHolder<Item, Item> TORNIUM_WATERING_CAN;

    @Shadow
    @Final
    public static DeferredHolder<Item, Item> LIGHTIUM_WATERING_CAN;

    @Shadow
    @Final
    public static DeferredHolder<Item, Item> OURANIUM_WATERING_CAN;

    @Inject(method = "<clinit>", at = @At(value = "TAIL"))
    private static void onPut(CallbackInfo ci) {
        ((AccessorDeferredRegister<?>) REGISTRY).getOriginalEntries().remove(ORNIUM_WATERING_CAN);
        ((AccessorDeferredRegister<?>) REGISTRY).getOriginalEntries().remove(LIGHTIUM_WATERING_CAN);
        ((AccessorDeferredRegister<?>) REGISTRY).getOriginalEntries().remove(TORNIUM_WATERING_CAN);
        ((AccessorDeferredRegister<?>) REGISTRY).getOriginalEntries().remove(OURANIUM_WATERING_CAN);

        REGISTRY.register(
                "ornium_watering_can", () -> new EssenceWateringCanItem(17, 0.55, ModCropTiers.SEVEN.getTextColor()));
        REGISTRY.register(
                "lightium_watering_can", () -> new EssenceWateringCanItem(19, 0.6, ModCropTiers.EIGHT.getTextColor()));
        REGISTRY.register(
                "tornium_watering_can", () -> new EssenceWateringCanItem(21, 0.65, ModCropTiers.NINE.getTextColor()));
        REGISTRY.register(
                "ouranium_watering_can", () -> new EssenceWateringCanItem(23, 0.7, ModCropTiers.TEN.getTextColor()));

        System.out.println("[Mystical Missing Items] Replaced Extended Tiers watering cans!");
    }
}
