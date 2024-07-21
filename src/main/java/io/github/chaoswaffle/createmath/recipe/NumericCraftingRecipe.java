package io.github.chaoswaffle.createmath.recipe;


import com.google.gson.JsonObject;
import io.github.chaoswaffle.createmath.CreateMath;
import io.github.chaoswaffle.createmath.item.ModItems;
import net.minecraft.inventory.RecipeInputInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.CraftingRecipeCategory;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class NumericCraftingRecipe extends ShapedRecipe {

    public NumericCraftingRecipe(
            Identifier id,
            String group,
            CraftingRecipeCategory category,
            int width,
            int height,
            DefaultedList<Ingredient> input,
            ItemStack output,
            boolean showNotification
    ) {
        super(id, group, category, width, height, input, output, showNotification);
    }
    private static NumericCraftingRecipe fromShaped(ShapedRecipe recipe) {
        return new NumericCraftingRecipe(
                recipe.getId(),
                recipe.getGroup(),
                recipe.getCategory(),
                recipe.getWidth(),
                recipe.getHeight(),
                recipe.getIngredients(),
                recipe.getOutput(null),
                recipe.showNotification()
        );
    }
    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return new ItemStack(ModItems.INFINITY);
    }

    @Override
    public ItemStack craft(RecipeInputInventory recipeInputInventory, DynamicRegistryManager dynamicRegistryManager) {
        return new ItemStack(ModItems.INFINITY);
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    public static class Type implements RecipeType<NumericCraftingRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "numeric_crafting_shaped";
    }

    public static class Serializer extends ShapedRecipe.Serializer {
        public static final Serializer INSTANCE = new Serializer();
        public static final Identifier ID = new Identifier(CreateMath.MOD_ID, "numeric_crafting_shaped");
    }
}
