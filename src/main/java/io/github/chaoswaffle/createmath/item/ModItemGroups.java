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
                        entries.add(ModItems.NUMBER);
                        entries.add(ModItems.ZERO);
                        entries.add(ModItems.ONE);
                        entries.add(ModItems.INFINITY);
                        entries.add(ModItems.INDETERMINATE_FORM);
                        entries.add(ModItems.ADD);
                        entries.add(ModItems.SUBTRACT);
                        entries.add(ModItems.MULTIPLY);
                        entries.add(ModItems.DIVIDE);
                        entries.add(ModItems.IDENTITY_MATRIX);
                        entries.add(ModItems.SCALE_MATRIX);
                        entries.add(ModBlocks.AXIOMITE_ORE);
                        entries.add(ModItems.AXIOMITE);
                        entries.add(ModItems.NULL_SET);
                        entries.add(ModItems.SET_OF_NULL_SET);
                        entries.add(ModItems.FOR_ALL);
                        entries.add(ModItems.THERE_EXISTS);
                        entries.add(ModItems.SET_A);
                        entries.add(ModItems.OPEN_PARENTHESES);
                        entries.add(ModItems.CLOSE_PARENTHESES);
                        entries.add(ModItems.IS_AN_ELEMENT_OF);
                        entries.add(ModItems.IS_NOT_AN_ELEMENT_OF);
                        entries.add(ModItems.VARIABLE_X);
                    })
                    .build());
    public static void registerItemGroups(){
        CreateMath.LOGGER.info("Registering item groups for " + CreateMath.NAME);
    }
}
