package net.mcreator.underworld.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class VampireMobEffect extends MobEffect {
	public VampireMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13434880);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}