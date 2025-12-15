package com.lucasmellof.mystical_missing_items.events;

import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.mods.agradditions.AgradditionsClient;
import com.lucasmellof.mystical_missing_items.mods.agradditions.AgradditionsCompat;
import com.lucasmellof.mystical_missing_items.mods.extended_tier.ExtendedTierClient;
import com.lucasmellof.mystical_missing_items.mods.extended_tier.ExtendedTierCompat;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import com.lucasmellof.mystical_missing_items.util.ModChecker;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = Const.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModClientEvents {
    @SubscribeEvent
    static void onTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() != ModRegistry.TAB.getKey()) {
            return;
        }
        for (var entry : ModRegistry.ITEMS.getEntries()) {
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
