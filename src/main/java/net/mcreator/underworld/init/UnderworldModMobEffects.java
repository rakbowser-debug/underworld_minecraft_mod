/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.underworld.potion.VampireMobEffect;
import net.mcreator.underworld.UnderworldMod;

public class UnderworldModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, UnderworldMod.MODID);
	public static final RegistryObject<MobEffect> VAMPIRE = REGISTRY.register("vampire", () -> new VampireMobEffect());
}