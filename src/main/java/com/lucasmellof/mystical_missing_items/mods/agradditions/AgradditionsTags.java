package com.lucasmellof.mystical_missing_items.mods.agradditions;

import com.lucasmellof.mystical_missing_items.Const;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 15/11/2025
 */
public class AgradditionsTags {

    public interface Blocks {
        TagKey<Block> INCORRECT_FOR_INSANIUM_TOOL = BlockTags.create(Const.of("incorrect_for_insanium_tool"));
    }
}
