/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.underworld.client.gui.EnchantedPlayerGuiScreen;
import net.mcreator.underworld.client.gui.DelusionWoodSignGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UnderworldModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(UnderworldModMenus.ENCHANTED_PLAYER_GUI.get(), EnchantedPlayerGuiScreen::new);
			MenuScreens.register(UnderworldModMenus.DELUSION_WOOD_SIGN_GUI.get(), DelusionWoodSignGuiScreen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}