package io.github.chaoswaffle.createmath.data.recipes;

import io.github.chaoswaffle.createmath.CreateMath;
import io.github.chaoswaffle.createmath.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class ModShapelessRecipesGen {
    public static void generateShapelessRecipes(Consumer<RecipeJsonProvider> exporter){
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INFINITY, 2)
                .input(ModItems.INFINITY)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "infinity_from_infinity"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZERO, 1)
                .input(ModItems.NULL_SET)
                .criterion(hasItem(ModItems.NULL_SET), conditionsFromItem(ModItems.NULL_SET))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "zero_from_null_set"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ONE, 1)
                .input(ModItems.SET_OF_NULL_SET)
                .criterion(hasItem(ModItems.NULL_SET), conditionsFromItem(ModItems.NULL_SET))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "one_from_set_of_null_set"));
    }
}
