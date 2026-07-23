package com.lucasmellof.mystical_missing_items.registry;

import com.blakebr0.mysticalagriculture.init.ModItems;
import com.blakebr0.mysticalagriculture.item.tool.*;
import com.blakebr0.cucumber.item.BaseBlockItem;
import com.lucasmellof.mystical_missing_items.Const;
import com.lucasmellof.mystical_missing_items.MysticalMissingItems;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class ModRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, MysticalMissingItems.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(Registries.BLOCK, MysticalMissingItems.MOD_ID);

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Const.MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB =
            TABS.register("tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Const.MOD_ID + ".tab"))
                    .icon(() -> ModItems.AWAKENED_SUPREMIUM_CHESTPLATE.get().getDefaultInstance())
                    .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static DeferredHolder<Item, Item> registerBow(
            String id, ToolMaterial material, int tinkerable, int slot, float speed, float damage) {
        return ITEMS.register(id, () -> new EssenceBowItem(Const.of(id), material, tinkerable, slot, speed, damage));
    }

    public static DeferredHolder<Item, Item> registerCrossbow(
            String id, ToolMaterial material, int tinkerable, int slot, float speed, float damage) {
        return ITEMS.register(id, () -> new EssenceCrossbowItem(Const.of(id), material, tinkerable, slot, speed, damage));
    }

    public static DeferredHolder<Item, Item> registerFishingRod(String id, ToolMaterial material, int tinkerable, int slot) {
        return ITEMS.register(id, () -> new EssenceFishingRodItem(Const.of(id), material, tinkerable, slot));
    }

    public static DeferredHolder<Item, Item> registerSickle(
            String id, ToolMaterial material, int range, ChatFormatting formatting, int tinkerable, int slot) {
        return ITEMS.register(id, () -> new EssenceSickleItem(Const.of(id), material, range, formatting, tinkerable, slot));
    }

    public static DeferredHolder<Item, Item> registerScythe(
            String id, ToolMaterial material, int range, ChatFormatting formatting, int tinkerable, int slot) {
        return ITEMS.register(id, () -> new EssenceScytheItem(Const.of(id), material, range, formatting, tinkerable, slot));
    }


    private static <T extends Block> DeferredHolder<Item, Item> registerBlockItem(String name, DeferredHolder<Block, T> block) {
        return ITEMS.register(name, () -> new BaseBlockItem(Const.of(name), block.get()));
    }

    private static <T extends Block> DeferredHolder<Block, T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    public static <T extends Block> DeferredHolder<Block, T> registerBlock(String name, Supplier<T> block) {
        DeferredHolder<Block, T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
}
