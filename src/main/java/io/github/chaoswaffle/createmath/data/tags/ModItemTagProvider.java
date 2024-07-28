package io.github.chaoswaffle.createmath.data.tags;

import io.github.chaoswaffle.createmath.item.ModItems;
import io.github.chaoswaffle.createmath.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.NUMERIC)
                .add(ModItems.ZERO)
                .add(ModItems.ONE)
                .add(ModItems.TWO)
                .add(ModItems.THREE)
                .add(ModItems.FOUR)
                .add(ModItems.FIVE)
                .add(ModItems.SIX)
                .add(ModItems.SEVEN)
                .add(ModItems.EIGHT)
                .add(ModItems.NINE);
        getOrCreateTagBuilder(ModTags.Items.NON_ZERO_NUMERIC)
                .add(ModItems.ONE)
                .add(ModItems.TWO)
                .add(ModItems.THREE)
                .add(ModItems.FOUR)
                .add(ModItems.FIVE)
                .add(ModItems.SIX)
                .add(ModItems.SEVEN)
                .add(ModItems.EIGHT)
                .add(ModItems.NINE);
    }
}
