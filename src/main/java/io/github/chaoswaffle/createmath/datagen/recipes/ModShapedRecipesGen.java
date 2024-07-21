package io.github.chaoswaffle.createmath.datagen.recipes;

import io.github.chaoswaffle.createmath.CreateMath;
import io.github.chaoswaffle.createmath.item.ModItems;
import io.github.chaoswaffle.createmath.util.ModTags;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.SpecialCraftingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class ModShapedRecipesGen {
    public static void generateShapedRecipes(Consumer<RecipeJsonProvider> exporter){
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZERO)
                .pattern("N*0")
                .input('N', ModTags.Items.NUMERIC)
                .input('*', ModItems.MULTIPLY)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.MULTIPLY), conditionsFromItem(ModItems.MULTIPLY))
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "zero_by_mult"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZERO)
                .pattern("0*N")
                .input('N', ModTags.Items.NUMERIC)
                .input('*', ModItems.MULTIPLY)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.MULTIPLY), conditionsFromItem(ModItems.MULTIPLY))
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "zero_by_mult_commutative"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZERO)
                .pattern("0/N")
                .input('N', ModTags.Items.NUMERIC)
                .input('/', ModItems.DIVIDE)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "zero_by_div"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INFINITY)
                .pattern("N/0")
                .input('N', ModTags.Items.NUMERIC)
                .input('/', ModItems.DIVIDE)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "infinity_by_div0"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("0/0")
                .input('0', ModItems.ZERO)
                .input('/', ModItems.DIVIDE)
                .criterion(hasItem(ModItems.ZERO), conditionsFromItem(ModItems.ZERO))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "indef_by_div0"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("i/i")
                .input('i', ModItems.INFINITY)
                .input('/', ModItems.DIVIDE)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "indef_by_div_inf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("i-i")
                .input('i', ModItems.INFINITY)
                .input('-', ModItems.SUBTRACT)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "indef_by_inf_minus_inf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("0*i")
                .input('0', ModItems.ZERO)
                .input('*', ModItems.MULTIPLY)
                .input('i', ModItems.INFINITY)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "indef_by_zero_times_inf"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("i*0")
                .input('0', ModItems.ZERO)
                .input('*', ModItems.MULTIPLY)
                .input('i', ModItems.INFINITY)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "indef_by_zero_times_inf_commutative"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("0^0")
                .input('0', ModItems.ZERO)
                .input('^', ModItems.EXPONENT)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "indef_by_zero_to_zero"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("i^0")
                .input('i', ModItems.INFINITY)
                .input('^', ModItems.EXPONENT)
                .input('0', ModItems.ZERO)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "indef_by_inf_to_zero"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INDETERMINATE_FORM)
                .pattern("1^i")
                .input('i', ModItems.INFINITY)
                .input('^', ModItems.EXPONENT)
                .input('1', ModItems.ONE)
                .criterion(hasItem(ModItems.INFINITY), conditionsFromItem(ModItems.INFINITY))
                .criterion(hasItem(ModItems.DIVIDE), conditionsFromItem(ModItems.DIVIDE))
                .offerTo(exporter, new Identifier(CreateMath.MOD_ID, "indef_by_one_to_inf"));

    }
}
