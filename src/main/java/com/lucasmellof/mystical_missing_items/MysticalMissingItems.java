package com.lucasmellof.mystical_missing_items;

import com.lucasmellof.mystical_missing_items.mods.agradditions.AgradditionsCompat;
import com.lucasmellof.mystical_missing_items.mods.extended_tier.ExtendedTierCompat;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import com.lucasmellof.mystical_missing_items.util.ModChecker;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(MysticalMissingItems.MOD_ID)
public class MysticalMissingItems {
    public static final String MOD_ID = "mystical_missing_items";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MysticalMissingItems(IEventBus modEventBus, ModContainer modContainer) {
        if (ModChecker.MYSTICAL_AGRADDITIONS.isModLoaded()) {
            AgradditionsCompat.init();
        }
        if (ModChecker.MYSTICAL_EXTENDED_TIER.isModLoaded()) {
            ExtendedTierCompat.init();
        }
        ModRegistry.init(modEventBus);
    }
}
