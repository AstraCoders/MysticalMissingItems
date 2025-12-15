package com.lucasmellof.mystical_missing_items.events;

import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.gen.ModRecipes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 22/11/2025
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Const.MOD_ID)
public class ModEvent {
	@SubscribeEvent
	static void onGen(GatherDataEvent event) {
		event.getGenerator().addProvider(event.includeServer(), new ModRecipes(event.getGenerator().getPackOutput()));
	}
}
