/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.underworld.enchantment.RestorationEnchantment;
import net.mcreator.underworld.enchantment.GraspEnchantment;
import net.mcreator.underworld.UnderworldMod;

public class UnderworldModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, UnderworldMod.MODID);
	public static final RegistryObject<Enchantment> GRASP = REGISTRY.register("grasp", () -> new GraspEnchantment());
	public static final RegistryObject<Enchantment> RESTORATION = REGISTRY.register("restoration", () -> new RestorationEnchantment());
}