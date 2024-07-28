package io.github.chaoswaffle.createmath.data.models;

import com.ibm.icu.text.Normalizer2;
import io.github.chaoswaffle.createmath.block.ModBlocks;
import io.github.chaoswaffle.createmath.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AXIOMITE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NUMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZERO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INFINITY, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDETERMINATE_FORM, Models.GENERATED);

        itemModelGenerator.register(ModItems.IDENTITY_MATRIX, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCALE_MATRIX, Models.GENERATED);

        itemModelGenerator.register(ModItems.ADD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUBTRACT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MULTIPLY, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIVIDE, Models.GENERATED);

        itemModelGenerator.register(ModItems.AXIOMITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NULL_SET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SET_OF_NULL_SET, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOR_ALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.THERE_EXISTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SET_A, Models.GENERATED);
        itemModelGenerator.register(ModItems.OPEN_PARENTHESES, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLOSE_PARENTHESES, Models.GENERATED);
        itemModelGenerator.register(ModItems.IS_AN_ELEMENT_OF, Models.GENERATED);
        itemModelGenerator.register(ModItems.IS_NOT_AN_ELEMENT_OF, Models.GENERATED);
        itemModelGenerator.register(ModItems.VARIABLE_X, Models.GENERATED);
    }
}
