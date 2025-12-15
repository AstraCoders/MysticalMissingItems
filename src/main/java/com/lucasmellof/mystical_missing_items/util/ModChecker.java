package com.lucasmellof.mystical_missing_items.util;

import net.minecraftforge.fml.ModList;

public enum ModChecker {
    MYSTICAL_AGRADDITIONS("mysticalagradditions"),
    MYSTICAL_EXTENDED_TIER("mystical_extended_tier");
    private final String modId;

    ModChecker(String modId) {
        this.modId = modId;
    }

    public boolean isModLoaded() {
        return ModList.get().isLoaded(this.modId);
    }
}
