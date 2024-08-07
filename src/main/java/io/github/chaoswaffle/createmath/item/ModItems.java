package io.github.chaoswaffle.createmath.item;

import io.github.chaoswaffle.createmath.CreateMath;
import io.github.chaoswaffle.createmath.effect.ModEffects;
import io.github.chaoswaffle.createmath.item.custom.IndeterminateFormItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class ModItems {
    //TODO: Integcreate
    //TODO: Arbitrary number operation
    public static final ArrayList<Item> ALL_ITEMS = new ArrayList<>();
//    public static final Item NUMBER = registerBasicItem("number");
    public static final Item ONE = registerBasicItem("one");
    public static final Item TWO = registerBasicItem("two");
    public static final Item THREE = registerBasicItem("three");
    public static final Item FOUR = registerBasicItem("four");
    public static final Item FIVE = registerBasicItem("five");
    public static final Item SIX = registerBasicItem("six");
    public static final Item SEVEN = registerBasicItem("seven");
    public static final Item EIGHT = registerBasicItem("eight");
    public static final Item NINE = registerBasicItem("nine");
    public static final Item ZERO = registerBasicItem("zero");

    public static final Item INFINITY = registerBasicItem("infinity");
    public static final Item INDETERMINATE_FORM = registerItem("indeterminate_form",
            new IndeterminateFormItem(new FabricItemSettings().food(new FoodComponent.Builder()
                    .alwaysEdible()
                    .statusEffect(new StatusEffectInstance(ModEffects.INDETERMINATE_FORM_EFFECT, 8*20), 1)
                    .build())));

    public static final Item ADD = registerBasicItem("add");
    public static final Item SUBTRACT = registerBasicItem("subtract");
    public static final Item MULTIPLY = registerBasicItem("multiply");
    public static final Item DIVIDE = registerBasicItem("divide");
    public static final Item EXPONENT = registerBasicItem("exponent");

    public static final Item IDENTITY_MATRIX = registerBasicItem("identity_matrix");
    public static final Item SCALE_MATRIX = registerBasicItem("scale_matrix");

    public static final Item FOR_ALL = registerBasicItem("for_all");
    public static final Item THERE_EXISTS = registerBasicItem("there_exists");
    public static final Item OPEN_PARENTHESES = registerBasicItem("open_parentheses");
    public static final Item CLOSE_PARENTHESES = registerBasicItem("close_parentheses");
    public static final Item IS_AN_ELEMENT_OF = registerBasicItem("is_an_element_of");
    public static final Item IS_NOT_AN_ELEMENT_OF = registerBasicItem("is_not_an_element_of");

    public static final Item VARIABLE_X = registerBasicItem("variable_x");
    public static final Item SET_A = registerBasicItem("set_a");

    public static final Item NULL_SET = registerBasicItem("null_set");
    public static final Item SET_OF_NULL_SET = registerBasicItem("set_of_null_set");
    public static final Item NATURALS = registerBasicItem("naturals");
    public static final Item INTEGERS = registerBasicItem("integers");
    public static final Item RATIONALS = registerBasicItem("rationals");
    public static final Item REALS = registerBasicItem("reals");

    public static final Item AXIOMITE = registerBasicItem("axiomite");
    private static Item registerItem(String name, Item item){
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(CreateMath.MOD_ID, name), item);
        ALL_ITEMS.add(registeredItem);
        return registeredItem;
    }
    private static Item registerBasicItem(String name){
        return registerItem(name, new Item(new FabricItemSettings()));
    }
    public static void registerItems(){
        CreateMath.LOGGER.info("Registering items for " + CreateMath.NAME);
    }
}
