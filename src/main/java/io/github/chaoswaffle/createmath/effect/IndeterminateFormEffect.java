package io.github.chaoswaffle.createmath.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class IndeterminateFormEffect extends StatusEffect {
    protected IndeterminateFormEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == ModEffects.INDETERMINATE_FORM_EFFECT;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        Random r = new Random();
        if(this == ModEffects.INDETERMINATE_FORM_EFFECT){
            entity.setYaw((float) (r.nextDouble(360) - 180));
            entity.setPitch((float) (r.nextDouble(180) - 90));
        }
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        World world = entity.getWorld();
        if(!world.isClient){
            Vec3d position = entity.getPos();
            world.createExplosion(null, position.getX(), position.getY(), position.getZ(), 4, World.ExplosionSourceType.BLOCK);
        }
    }
}
