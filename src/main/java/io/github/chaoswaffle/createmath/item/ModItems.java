package io.github.chaoswaffle.createmath.item;

import io.github.chaoswaffle.createmath.CreateMath;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //TODO: Datagen loottable
    //TODO: Tagging numbers & implement in recipes
    //TODO: Integcreate
    //TODO: Arbitrary number operation
    public static final Item NUMBER = registerItem("number");
    public static final Item ZERO = registerItem("zero");
    public static final Item ONE = registerItem("one");
    public static final Item INFINITY = registerItem("infinity");
    //TODO: new status effect for indef form
    public static final Item INDETERMINATE_FORM = registerItem("indeterminate_form",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder()
                    .build())));

    public static final Item ADD = registerItem("add");
    public static final Item SUBTRACT = registerItem("subtract");
    public static final Item MULTIPLY = registerItem("multiply");
    public static final Item DIVIDE = registerItem("divide");

    public static final Item AXIOMITE = registerItem("axiomite");
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(CreateMath.ID, name), item);
    }
    private static Item registerItem(String name){
        return registerItem(name, new Item(new FabricItemSettings()));
    }
    public static void registerItems(){
        CreateMath.LOGGER.info("Registering items for " + CreateMath.NAME);
    }
}
