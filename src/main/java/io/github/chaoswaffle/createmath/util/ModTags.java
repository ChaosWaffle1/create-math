package io.github.chaoswaffle.createmath.util;

import io.github.chaoswaffle.createmath.CreateMath;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import javax.swing.text.html.HTML;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(CreateMath.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> NUMERIC = createTag("numeric");
        public static final TagKey<Item> NON_ZERO_NUMERIC = createTag("non_zero_numeric");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(CreateMath.MOD_ID, name));
        }
    }
}
