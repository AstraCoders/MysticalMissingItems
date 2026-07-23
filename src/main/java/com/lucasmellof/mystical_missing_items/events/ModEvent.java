package com.lucasmellof.mystical_missing_items.events;

import com.lucasmellof.mystical_missing_items.gen.ModRecipes;
import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.ExecutionException;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 22/11/2025
 */
@EventBusSubscriber
public class ModEvent {
	@SubscribeEvent
	static void onGen(GatherDataEvent.Server event) {
		DataGenerator gen = event.getGenerator();
		gen.addProvider(true, new ModRecipes.Runner(gen.getPackOutput(), event.getLookupProvider()));
	}
}
