package com.lucasmellof.mystical_missing_items.mods.agradditions;

import com.blakebr0.mysticalagriculture.config.ModConfigs;
import com.blakebr0.mysticalagriculture.item.armor.EssenceChestplateItem;
import com.blakebr0.mysticalagriculture.lib.ModTooltips;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorMaterial;

import java.util.function.Consumer;

public class InsaniumChestplateItem extends EssenceChestplateItem {
    public InsaniumChestplateItem(Identifier id, ArmorMaterial material, int tinkerableTier, int slots) {
        super(id, material, tinkerableTier, slots);
    }

    @Override
    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot) {
        super.inventoryTick(stack, level, entity, slot);

        if (slot == EquipmentSlot.CHEST && entity instanceof Player player
                && ModConfigs.AWAKENED_SUPREMIUM_SET_BONUS.get()
                && level.getGameTime() % 20L == 0 && hasInsaniumSet(player)) {
            handleGrowthTicks(level, player);
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag flag) {
        super.appendHoverText(stack, context, display, builder, flag);
        if (ModConfigs.AWAKENED_SUPREMIUM_SET_BONUS.get()) {
            builder.accept(ModTooltips.SET_BONUS.args(ModTooltips.AWAKENED_SUPREMIUM_SET_BONUS.toComponent()).toComponent());
        }
    }

    private static boolean hasInsaniumSet(Player player) {
        return player.getItemBySlot(EquipmentSlot.HEAD).is(AgradditionsCompat.INSANIUM_HELMET.get())
                && player.getItemBySlot(EquipmentSlot.CHEST).is(AgradditionsCompat.INSANIUM_CHESTPLATE.get())
                && player.getItemBySlot(EquipmentSlot.LEGS).is(AgradditionsCompat.INSANIUM_LEGGINGS.get())
                && player.getItemBySlot(EquipmentSlot.FEET).is(AgradditionsCompat.INSANIUM_BOOTS.get());
    }

    private static void handleGrowthTicks(ServerLevel level, Player player) {
        var pos = player.getOnPos();
        int range = 5;

        BlockPos.betweenClosedStream(pos.offset(-range, -range, -range), pos.offset(range, range, range)).forEach(aoePos -> {
            if (!level.hasChunkAt(aoePos) || level.getRandom().nextBoolean())
                return;

            var state = level.getBlockState(aoePos);
            if (state.is(BlockTags.CROPS)) {
                state.randomTick(level, aoePos, level.getRandom());

                double x = aoePos.getX() + level.getRandom().nextFloat();
                double y = aoePos.getY();
                double z = aoePos.getZ() + level.getRandom().nextFloat();
                level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 1, 0, 0, 0, 0.1D);
            }
        });
    }
}
