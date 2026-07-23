package com.lucasmellof.mystical_missing_items;

import net.minecraft.resources.Identifier;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class Const {
    public static final String MOD_ID = MysticalMissingItems.MOD_ID;

    public static Identifier of(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
