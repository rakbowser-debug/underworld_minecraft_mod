/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.underworld.UnderworldMod;

public class UnderworldModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, UnderworldMod.MODID);
	public static final RegistryObject<Potion> VAMPIRE_POTION = REGISTRY.register("vampire_potion", () -> new Potion(new MobEffectInstance(UnderworldModMobEffects.VAMPIRE.get(), -1, 0, false, true)));
}