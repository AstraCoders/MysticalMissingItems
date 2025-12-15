package com.lucasmellof.mystical_missing_items;

import com.lucasmellof.mystical_missing_items.mods.agradditions.AgradditionsCompat;
import com.lucasmellof.mystical_missing_items.mods.extended_tier.ExtendedTierCompat;
import com.lucasmellof.mystical_missing_items.registry.ModRegistry;
import com.lucasmellof.mystical_missing_items.util.ModChecker;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MysticalMissingItems.MOD_ID)
public class MysticalMissingItems {
    public static final String MOD_ID = "mystical_missing_items";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MysticalMissingItems() {
        FMLJavaModLoadingContext ctx = FMLJavaModLoadingContext.get();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        if (ModChecker.MYSTICAL_AGRADDITIONS.isModLoaded()) {
            LOGGER.info("[Mystical Missing Items] Mystical Agradditions detected! Initializing compatibility module.");
            AgradditionsCompat.init();
        }
        if (ModChecker.MYSTICAL_EXTENDED_TIER.isModLoaded()) {
            LOGGER.info("[Mystical Missing Items] Mystical Extended Tier detected! Initializing compatibility module.");
            ExtendedTierCompat.init();
        }
        ModRegistry.init(ctx.getModEventBus());

    }
}
