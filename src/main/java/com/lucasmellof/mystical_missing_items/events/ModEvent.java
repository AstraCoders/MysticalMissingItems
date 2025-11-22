package com.lucasmellof.mystical_missing_items.events;

import com.lucasmellof.mystical_missing_items.gen.ModRecipes;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 22/11/2025
 */
@EventBusSubscriber
public class ModEvent {
	@SubscribeEvent
	static void onGen(GatherDataEvent event) {
        event.addProvider(new ModRecipes(event.getGenerator().getPackOutput(), event.getLookupProvider()));
	}
}
