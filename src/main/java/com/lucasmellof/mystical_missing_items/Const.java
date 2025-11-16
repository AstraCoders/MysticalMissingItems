package com.lucasmellof.mystical_missing_items;

import net.minecraft.resources.ResourceLocation;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class Const {
    public static final String MOD_ID = MysticalMissingItems.MOD_ID;

    public static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
