package com.lucasmellof.mystical_missing_items.events;

import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
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
}
