package io.github.chaoswaffle.createmath.item;

import io.github.chaoswaffle.createmath.CreateMath;
import io.github.chaoswaffle.createmath.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CREATE_MATH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateMath.MOD_ID, "createmath"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.createmath"))
                    .icon(() -> new ItemStack(ModItems.ADD))
                    .entries((displayContext, entries) -> {
                        ModItems.ALL_ITEMS.forEach((entries::add));
                        entries.add(ModBlocks.AXIOMITE_ORE);
                    })
                    .build());
    public static void registerItemGroups(){
        CreateMath.LOGGER.info("Registering item groups for " + CreateMath.NAME);
    }
}
