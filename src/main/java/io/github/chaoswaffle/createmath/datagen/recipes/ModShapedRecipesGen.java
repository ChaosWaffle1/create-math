package io.github.chaoswaffle.createmath.datagen.recipes;

import io.github.chaoswaffle.createmath.CreateMath;
import io.github.chaoswaffle.createmath.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class ModShapedRecipesGen {
    public static void generateShapedRecipes(Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZERO)
                .pattern("N*0")
                .input('N', ModItems.NUMBER)
                .input('*', ModItems.MULTIPLY)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.MULTIPLY), conditionsFromItem(ModItems.MULTIPLY))
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .offerTo(exporter, new Identifier(CreateMath.ID, "zero_by_mult"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZERO)
                .pattern("0*N")
                .input('N', ModItems.NUMBER)
                .input('*', ModItems.MULTIPLY)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.MULTIPLY), conditionsFromItem(ModItems.MULTIPLY))
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .offerTo(exporter, new Identifier(CreateMath.ID, "zero_by_mult_commutative"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZERO)
                .pattern("0/N")
                .input('N', ModItems.NUMBER)
                .input('/', ModItems.DIVIDE)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.ID, "zero_by_div"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INFINITY)
                .pattern("N/0")
                .input('N', ModItems.NUMBER)
                .input('/', ModItems.DIVIDE)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.ID, "infinity_by_div0"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("#/#")
                .input('#', ModItems.ZERO)
                .input('/', ModItems.DIVIDE)
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.ID, "indef_by_div0"));
    }
}
