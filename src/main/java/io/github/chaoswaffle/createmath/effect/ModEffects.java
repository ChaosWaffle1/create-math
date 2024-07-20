package io.github.chaoswaffle.createmath.effect;

import io.github.chaoswaffle.createmath.CreateMath;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect INDETERMINATE_FORM_EFFECT = registerEffect(
            "indeterminate_form_effect",
            new IndeterminateFormEffect(StatusEffectCategory.HARMFUL, 0x000ff));
    private static StatusEffect registerEffect(String name, StatusEffect effect){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(CreateMath.MOD_ID, name), effect);
    }
    public static void registerEffects(){
        CreateMath.LOGGER.info("Registering effects for " + CreateMath.NAME);
    }
}
