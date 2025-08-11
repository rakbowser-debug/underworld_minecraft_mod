package net.mcreator.underworld.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.underworld.init.UnderworldModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VampireHealingProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity, double amount) {
		execute(null, damagesource, entity, amount);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity, double amount) {
		if (damagesource == null || entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(UnderworldModMobEffects.VAMPIRE.get()) || (damagesource.getEntity()) instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(UnderworldModMobEffects.VAMPIRE.get())) {
			if ((damagesource.getEntity()) instanceof LivingEntity _entity)
				_entity.setHealth((float) (((damagesource.getEntity()) instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + amount * 0.8));
			if ((damagesource.getEntity()) instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) (((damagesource.getEntity()) instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + amount));
		}
	}
}