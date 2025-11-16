package com.lucasmellof.mystical_missing_items.mods.extended_tier;

import com.lucasmellof.mystical_missing_items.client.ClientStuff;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 16/11/2025
 */
public class ExtendedTierClient {
	public static void onSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ClientStuff.registerBow(ExtendedTierCompat.LIGHTIUM_BOW.get());
			ClientStuff.registerCrossbow(ExtendedTierCompat.LIGHTIUM_CROSSBOW.get());
			ClientStuff.registerFishingRod(ExtendedTierCompat.LIGHTIUM_FISHING_ROD.get());
			ClientStuff.registerBow(ExtendedTierCompat.ORNIUM_BOW.get());
			ClientStuff.registerCrossbow(ExtendedTierCompat.ORNIUM_CROSSBOW.get());
			ClientStuff.registerFishingRod(ExtendedTierCompat.ORNIUM_FISHING_ROD.get());
			ClientStuff.registerBow(ExtendedTierCompat.OURANIUM_BOW.get());
			ClientStuff.registerCrossbow(ExtendedTierCompat.OURANIUM_CROSSBOW.get());
			ClientStuff.registerFishingRod(ExtendedTierCompat.OURANIUM_FISHING_ROD.get());
			ClientStuff.registerBow(ExtendedTierCompat.TORNIUM_BOW.get());
			ClientStuff.registerCrossbow(ExtendedTierCompat.TORNIUM_CROSSBOW.get());
			ClientStuff.registerFishingRod(ExtendedTierCompat.TORNIUM_FISHING_ROD.get());
		});
	}

}
