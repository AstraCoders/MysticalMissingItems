package com.lucasmellof.mystical_missing_items.mods.agradditions;

import com.blakebr0.mysticalagriculture.config.ModConfigs;
import com.blakebr0.mysticalagriculture.item.armor.EssenceChestplateItem;
import com.blakebr0.mysticalagriculture.lib.ModTooltips;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import java.util.List;

public class InsaniumChestplateItem extends EssenceChestplateItem {
    public InsaniumChestplateItem(Holder<ArmorMaterial> material, int durability, int tier, int slots) {
        super(material, durability, tier, slots);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, level, entity, slot, selected);
        if (!(level instanceof ServerLevel server) || !(entity instanceof Player player)
                || slot != 38 || !ModConfigs.AWAKENED_SUPREMIUM_SET_BONUS.get()
                || level.getGameTime() % 20 != 0
                || !player.getItemBySlot(EquipmentSlot.HEAD).is(AgradditionsCompat.INSANIUM_HELMET.get())
                || !player.getItemBySlot(EquipmentSlot.CHEST).is(AgradditionsCompat.INSANIUM_CHESTPLATE.get())
                || !player.getItemBySlot(EquipmentSlot.LEGS).is(AgradditionsCompat.INSANIUM_LEGGINGS.get())
                || !player.getItemBySlot(EquipmentSlot.FEET).is(AgradditionsCompat.INSANIUM_BOOTS.get())) {
            return;
        }

        var pos = player.getOnPos();
        BlockPos.betweenClosedStream(pos.offset(-5, -5, -5), pos.offset(5, 5, 5)).forEach(cropPos -> {
            if (!server.hasChunkAt(cropPos) || server.random.nextBoolean()) return;
            var state = server.getBlockState(cropPos);
            if (state.is(BlockTags.CROPS)) {
                state.randomTick(server, cropPos, server.random);
                server.sendParticles(ParticleTypes.HAPPY_VILLAGER, cropPos.getX() + server.random.nextFloat(),
                        cropPos.getY(), cropPos.getZ() + server.random.nextFloat(), 1, 0, 0, 0, 0.1D);
            }
        });
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);
        if (ModConfigs.AWAKENED_SUPREMIUM_SET_BONUS.get()) {
            tooltip.add(ModTooltips.SET_BONUS.args(ModTooltips.AWAKENED_SUPREMIUM_SET_BONUS.build()).build());
        }
    }
}

