package io.github.chaoswaffle.createmath.effect;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.*;

public class IndeterminateFormEffect extends StatusEffect {
    public static final ArrayList<SoundEvent> SOUNDS = new ArrayList<>(List.of(
            SoundEvents.BLOCK_PORTAL_TRAVEL,
            SoundEvents.ENTITY_WITHER_SPAWN,
            SoundEvents.ENTITY_ENDER_DRAGON_DEATH,
            SoundEvents.MUSIC_DISC_STAL
    ));
    protected IndeterminateFormEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return this == ModEffects.INDETERMINATE_FORM_EFFECT;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        Random r = Random.create();
        if(this == ModEffects.INDETERMINATE_FORM_EFFECT){
            entity.setYaw((float) (r.nextDouble()*360%360 - 180));
            entity.setPitch((float) (r.nextDouble()*180%180 - 90));
        }

        SoundEvent sound = SOUNDS.get(Random.create().nextBetween(0,SOUNDS.size()-1));
        entity.getWorld().playSound(null,
                entity.getX(),
                entity.getY(),
                entity.getZ(),
                sound,
                SoundCategory.MASTER,
                1f,
                Random.create().nextFloat()*2);
    }

    @Override
    public void onRemoved(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        World world = entity.getWorld();
        if(!world.isClient){
            Vec3d position = entity.getPos();
            world.createExplosion(null, position.getX(), position.getY(), position.getZ(), 4, World.ExplosionSourceType.BLOCK);
        }
        MinecraftClient.getInstance().getSoundManager().stopAll();
        entity.getWorld().playSound(null,
                entity.getX(),
                entity.getY(),
                entity.getZ(),
                SoundEvents.ENTITY_VILLAGER_AMBIENT,
                SoundCategory.MASTER,
                2f,
                1f);
//        Registries.STATUS_EFFECT.getEntrySet().forEach(e -> {
//            entity.addStatusEffect(new StatusEffectInstance(e.getValue(), 5*10));
//        });
    }
}
