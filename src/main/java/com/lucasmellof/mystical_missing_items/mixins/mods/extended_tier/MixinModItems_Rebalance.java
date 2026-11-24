package com.lucasmellof.mystical_missing_items.mixins.mods.extended_tier;

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
import Velvet.mysticalextendedtier.init.ExtendedItems;
import Velvet.mysticalextendedtier.lib.ExtendedCropTiers;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
@Mixin(ExtendedItems.class)
public class MixinModItems_Rebalance {
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
        ((AccessorDeferredRegister_Rebalance<?>) REGISTRY).getOriginalEntries().remove(ORNIUM_WATERING_CAN);
        ((AccessorDeferredRegister_Rebalance<?>) REGISTRY).getOriginalEntries().remove(LIGHTIUM_WATERING_CAN);
        ((AccessorDeferredRegister_Rebalance<?>) REGISTRY).getOriginalEntries().remove(TORNIUM_WATERING_CAN);
        ((AccessorDeferredRegister_Rebalance<?>) REGISTRY).getOriginalEntries().remove(OURANIUM_WATERING_CAN);


        REGISTRY.register(
                "ornium_watering_can", (id) -> new EssenceWateringCanItem(id, 17, 0.55, ExtendedCropTiers.SEVEN.getTextColor()));
        REGISTRY.register(
                "lightium_watering_can", (id) -> new EssenceWateringCanItem(id, 19, 0.6, ExtendedCropTiers.EIGHT.getTextColor()));
        REGISTRY.register(
                "tornium_watering_can", (id) -> new EssenceWateringCanItem(id, 21, 0.65, ExtendedCropTiers.NINE.getTextColor()));
        REGISTRY.register(
                "ouranium_watering_can", (id) -> new EssenceWateringCanItem(id, 23, 0.7, ExtendedCropTiers.TEN.getTextColor()));
        System.out.println("[Mystical Missing Items] Replaced Extended Tiers watering cans!");
    }
}
