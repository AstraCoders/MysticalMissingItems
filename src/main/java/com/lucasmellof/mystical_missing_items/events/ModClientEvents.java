package com.lucasmellof.mystical_missing_items.events;

import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.mods.agradditions.AgradditionsClient;
import com.lucasmellof.mystical_missing_items.mods.agradditions.AgradditionsCompat;
import com.lucasmellof.mystical_missing_items.mods.extended_tier.ExtendedTierClient;
import com.lucasmellof.mystical_missing_items.mods.extended_tier.ExtendedTierCompat;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import com.lucasmellof.mystical_missing_items.util.ModChecker;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
@EventBusSubscriber(value = Dist.CLIENT, modid = Const.MOD_ID)
public class ModClientEvents {
    @SubscribeEvent
    static void onTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() != ModRegistry.TAB.getKey()) {
            return;
        }
        for (DeferredHolder<Item, ? extends Item> entry : ModRegistry.ITEMS.getEntries()) {
            event.accept(entry.get());
        }
    }

    @SubscribeEvent
    static void onSetup(FMLClientSetupEvent event) {
        if (ModChecker.MYSTICAL_AGRADDITIONS.isModLoaded()) {
            AgradditionsClient.onSetup(event);
        }
        if (ModChecker.MYSTICAL_EXTENDED_TIER.isModLoaded()) {
            ExtendedTierClient.onSetup(event);
        }
    }
}
