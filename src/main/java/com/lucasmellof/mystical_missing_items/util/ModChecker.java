package com.lucasmellof.mystical_missing_items.util;

import net.neoforged.fml.ModList;

public enum ModChecker {
    MYSTICAL_AGRADDITIONS("mysticalagradditions"),
    MYSTICAL_EXTENDED_TIER("mysticalextendedtier");
    private final String modId;

    ModChecker(String modId) {
        this.modId = modId;
    }

    public boolean isModLoaded() {
        return ModList.get().isLoaded(this.modId);
    }
}
