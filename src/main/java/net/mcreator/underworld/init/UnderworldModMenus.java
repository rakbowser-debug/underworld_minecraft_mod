/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.underworld.world.inventory.EnchantedPlayerGuiMenu;
import net.mcreator.underworld.world.inventory.DelusionWoodSignGuiMenu;
import net.mcreator.underworld.network.MenuStateUpdateMessage;
import net.mcreator.underworld.UnderworldMod;

import java.util.Map;

public class UnderworldModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, UnderworldMod.MODID);
	public static final RegistryObject<MenuType<EnchantedPlayerGuiMenu>> ENCHANTED_PLAYER_GUI = REGISTRY.register("enchanted_player_gui", () -> IForgeMenuType.create(EnchantedPlayerGuiMenu::new));
	public static final RegistryObject<MenuType<DelusionWoodSignGuiMenu>> DELUSION_WOOD_SIGN_GUI = REGISTRY.register("delusion_wood_sign_gui", () -> IForgeMenuType.create(DelusionWoodSignGuiMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				UnderworldMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof UnderworldModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				UnderworldMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}