package com.lucasmellof.mystical_missing_items.mods.agradditions;

import com.lucasmellof.mystical_missing_items.client.ClientStuff;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 16/11/2025
 */
public class AgradditionsClient {
	public static void onSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ClientStuff.registerBow(AgradditionsCompat.INSANIUM_BOW.get());
			ClientStuff.registerCrossbow(AgradditionsCompat.INSANIUM_CROSSBOW.get());
			ClientStuff.registerFishingRod(AgradditionsCompat.INSANIUM_FISHING_ROD.get());
		});
	}

}
