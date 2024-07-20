package io.github.chaoswaffle.createmath.item;

import io.github.chaoswaffle.createmath.CreateMath;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //TODO: Datagen loottable & tags -> recipes
    //TODO: Integcreate
    //TODO: Arbitrary number operation
    public static final Item NUMBER = registerBasicItem("number");
    public static final Item ZERO = registerBasicItem("zero");
    public static final Item ONE = registerBasicItem("one");
    public static final Item INFINITY = registerBasicItem("infinity");
    //TODO: new status effect for indef form
    public static final Item INDETERMINATE_FORM = registerItem("indeterminate_form",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder()
                    .build())));

    public static final Item ADD = registerBasicItem("add");
    public static final Item SUBTRACT = registerBasicItem("subtract");
    public static final Item MULTIPLY = registerBasicItem("multiply");
    public static final Item DIVIDE = registerBasicItem("divide");
    public static final Item EXPONENT = registerBasicItem("exponent");

    public static final Item NULL_SET = registerBasicItem("null_set");

    public static final Item AXIOMITE = registerBasicItem("axiomite");
    public static final Item VARIABLE = registerBasicItem("variable");
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CreateMath.MOD_ID, name), item);
    }
    private static Item registerBasicItem(String name){
        return registerItem(name, new Item(new FabricItemSettings()));
    }
    public static void registerItems(){
        CreateMath.LOGGER.info("Registering items for " + CreateMath.NAME);
    }
}
