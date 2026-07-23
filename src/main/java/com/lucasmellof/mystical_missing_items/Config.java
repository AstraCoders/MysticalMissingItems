package com.lucasmellof.mystical_missing_items;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = MysticalMissingItems.MOD_ID)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue ENABLE_REBALANCE =
            BUILDER.comment("Enable rebalance for extended tier items. When enabled, mixins will modify extended tier items to rebalance them.")
                    .define("enableRebalance", true);

    static final ModConfigSpec SPEC = BUILDER.build();

    public static boolean enableRebalance;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        enableRebalance = ENABLE_REBALANCE.get();
    }
}
