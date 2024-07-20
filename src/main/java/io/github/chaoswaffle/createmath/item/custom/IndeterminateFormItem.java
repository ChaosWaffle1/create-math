package io.github.chaoswaffle.createmath.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class IndeterminateFormItem extends Item {
    public IndeterminateFormItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack itemStack, World world, LivingEntity user) {
        if(!world.isClient){ //Check that world is server
            Vec3d position = user.getPos();
            world.createExplosion(
                    null,
                    position.getX(),
                    position.getY(),
                    position.getZ(),
                    4,
                    World.ExplosionSourceType.BLOCK);
        }
        return itemStack;
    }
}
