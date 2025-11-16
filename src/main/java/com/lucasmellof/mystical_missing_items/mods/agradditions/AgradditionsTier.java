package com.lucasmellof.mystical_missing_items.mods.agradditions;

import com.blakebr0.mysticalagradditions.init.ModItems;
import com.google.common.base.Suppliers;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public enum AgradditionsTier implements Tier {
    INSANIUM(
            AgradditionsTags.Blocks.INCORRECT_FOR_INSANIUM_TOOL,
            0,
            32.0F,
            27.5F,
            23,
            () -> Ingredient.of(ModItems.INSANIUM_INGOT.get()));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    AgradditionsTier(
            TagKey<Block> incorrectBlocksForDrops,
            int maxUses,
            float efficiency,
            float attackDamage,
            int enchantability,
            Supplier<Ingredient> repairMaterial) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = Suppliers.memoize(repairMaterial::get);
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
