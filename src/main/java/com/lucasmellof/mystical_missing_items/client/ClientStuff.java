package com.lucasmellof.mystical_missing_items.client;

import com.blakebr0.mysticalagriculture.item.tool.EssenceBowItem;
import com.blakebr0.mysticalagriculture.item.tool.EssenceCrossbowItem;
import com.blakebr0.mysticalagriculture.item.tool.EssenceFishingRodItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 16/11/2025
 */
public class ClientStuff {

	public static void registerBow(Item item) {
		ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), EssenceBowItem.getPullPropertyGetter());
		ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), EssenceBowItem.getPullingPropertyGetter());
	}
	public static void registerCrossbow(Item item) {
		ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"), EssenceCrossbowItem.getPullPropertyGetter());
		ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"), EssenceCrossbowItem.getPullingPropertyGetter());
		ItemProperties.register(item, ResourceLocation.withDefaultNamespace("charged"), EssenceCrossbowItem.getChargedPropertyGetter());
		ItemProperties.register(item, ResourceLocation.withDefaultNamespace("firework"), EssenceCrossbowItem.getFireworkPropertyGetter());
	}

	public static void registerFishingRod(Item item) {
		ItemProperties.register(item, ResourceLocation.withDefaultNamespace("cast"), EssenceFishingRodItem.getCastPropertyGetter());
	}
}
