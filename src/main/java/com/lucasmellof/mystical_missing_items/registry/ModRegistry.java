package com.lucasmellof.mystical_missing_items.registry;

import com.blakebr0.mysticalagriculture.init.ModItems;
import com.blakebr0.mysticalagriculture.item.tool.*;
import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.MysticalMissingItems;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class ModRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, MysticalMissingItems.MOD_ID);

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Const.MOD_ID);
    public static final RegistryObject<CreativeModeTab> TAB =
            TABS.register("tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Const.MOD_ID + ".tab"))
                    .icon(() -> ModItems.AWAKENED_SUPREMIUM_CHESTPLATE.get().getDefaultInstance())
                    .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
        ITEMS.register(bus);
    }

    public static RegistryObject<Item> registerBow(
            String id, Tier tier, int tinkerable, int slot, float speed, float damage) {
        return ModRegistry.ITEMS.register(id, () -> new EssenceBowItem(tier, tinkerable, slot, speed, damage));
    }

    public static RegistryObject<Item> registerCrossbow(
            String id, Tier tier, int tinkerable, int slot, float speed, float damage) {
        return ModRegistry.ITEMS.register(id, () -> new EssenceCrossbowItem(tier, tinkerable, slot, speed, damage));
    }

    public static RegistryObject<Item> registerFishingRod(String id, Tier tier, int tinkerable, int slot) {
        return ModRegistry.ITEMS.register(id, () -> new EssenceFishingRodItem(tier, tinkerable, slot));
    }

    public static RegistryObject<Item> registerSickle(
            String id, Tier tier, int range, ChatFormatting formatting, int tinkerable, int slot) {
        return ModRegistry.ITEMS.register(id, () -> new EssenceSickleItem(tier, range, formatting, tinkerable, slot));
    }

    public static RegistryObject<Item> registerScythe(
            String id, Tier tier, int range, ChatFormatting formatting, int tinkerable, int slot) {
        return ModRegistry.ITEMS.register(id, () -> new EssenceScytheItem(tier, range, formatting, tinkerable, slot));
    }
}
