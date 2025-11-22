package com.lucasmellof.mystical_missing_items.mixins.mods.extended_tier;

import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;
import java.util.function.Supplier;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
@Mixin(DeferredRegister.class)
public interface AccessorDeferredRegister_Rebalance<T> {
	@Accessor("entries")
	Map<DeferredHolder<T, ? extends T>, Supplier<? extends T>> getOriginalEntries();
}
