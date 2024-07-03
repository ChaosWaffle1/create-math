package io.github.chaoswaffle.createmath.item;

import io.github.chaoswaffle.createmath.CreateMath;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CREATE_MATH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateMath.ID, "createmath"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.createmath"))
                    .icon(() -> new ItemStack(ModItems.ADD))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NUMBER);
                        entries.add(ModItems.ZERO);
                        entries.add(ModItems.ONE);
                        entries.add(ModItems.INFINITY);
                        entries.add(ModItems.ADD);
                        entries.add(ModItems.SUBTRACT);
                        entries.add(ModItems.MULTIPLY);
                        entries.add(ModItems.DIVIDE);
                    })
                    .build());
    public static void registerItemGroups(){
        CreateMath.LOGGER.info("Registering item groups for " + CreateMath.NAME);
    }
}
