package io.github.chaoswaffle.createmath.datagen.recipes;

import io.github.chaoswaffle.createmath.CreateMath;
import io.github.chaoswaffle.createmath.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class ModShapelessRecipes {
    public static void generateShapelessRecipes(Consumer<RecipeJsonProvider> exporter){
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INFINITY, 2)
                .input(ModItems.INFINITY)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .offerTo(exporter, new Identifier(CreateMath.ID, "infinity_by_infinity"));
    }
}
