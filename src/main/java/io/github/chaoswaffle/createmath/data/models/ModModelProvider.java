package io.github.chaoswaffle.createmath.data.models;

import io.github.chaoswaffle.createmath.block.ModBlocks;
import io.github.chaoswaffle.createmath.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

import java.util.List;
import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AXIOMITE_ORE);
    }
    private static void generateGeneratedItemModels(ItemModelGenerator itemModelGenerator, List<Item> include){
        generateGeneratedItemModels(itemModelGenerator, include, Optional.empty());
    }
    private static void generateGeneratedItemModels(ItemModelGenerator itemModelGenerator, List<Item> include, Optional<List<Item>> exclude){
        if (exclude.isEmpty()){
            include.forEach((item -> itemModelGenerator.register(item, Models.GENERATED)));
        }
        else {
            for (Item item : include) {
                if (!exclude.get().contains(item)) {
                    itemModelGenerator.register(item, Models.GENERATED);
                }
            }
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        generateGeneratedItemModels(itemModelGenerator, ModItems.ALL_ITEMS);
    }
}
