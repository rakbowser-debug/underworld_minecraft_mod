/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.underworld.UnderworldMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderworldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UnderworldMod.MODID);
	public static final RegistryObject<CreativeModeTab> UNDER_WORLDS_NATURE = REGISTRY.register("under_worlds_nature",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.underworld.under_worlds_nature")).icon(() -> new ItemStack(UnderworldModBlocks.DELUSION_LOG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UnderworldModBlocks.DELUSION_LOG.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_LEAVES.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_WOOD.get().asItem());
				tabData.accept(UnderworldModBlocks.TRIPPED_DELUSION_LOG.get().asItem());
				tabData.accept(UnderworldModBlocks.TRIPPED_DELUSION_WOOD.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_COBBLESTONE.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_SAND.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_DIRT.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_GRASS.get().asItem());
				tabData.accept(UnderworldModBlocks.NIHILIS_ORE.get().asItem());
			}).build());
	public static final RegistryObject<CreativeModeTab> UNDER_WORLD_BUILDING_BLOCKS = REGISTRY.register("under_world_building_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.underworld.under_world_building_blocks")).icon(() -> new ItemStack(UnderworldModBlocks.DELUSION_PLANKS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UnderworldModBlocks.DELUSION_LOG.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_WOOD.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_PLANKS.get().asItem());
				tabData.accept(UnderworldModBlocks.TRIPPED_DELUSION_LOG.get().asItem());
				tabData.accept(UnderworldModBlocks.TRIPPED_DELUSION_WOOD.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_STAIRS.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_SLAB.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_FENCE.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_FENCE_GATE.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_DOOR.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_TRAP_DOOR.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_STONE_BRICKS.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_STONE_BRICKS_CRACKED.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_COBBLESTONE_STAIRS.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_COBBLESTONE_SLAB.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_COBBLESTONE_WALL.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_STONE_STAIRS.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_STONE_SLAB.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_STONE_BRICKS_STAIRS.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_STONE_BRICKS_SLAB.get().asItem());
				tabData.accept(UnderworldModBlocks.UNDER_STONE_BRICKS_WALL.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_SIGN.get().asItem());
			}).withTabsBefore(UNDER_WORLDS_NATURE.getId()).build());
	public static final RegistryObject<CreativeModeTab> UNDER_WORLD_FUNCTIONAL = REGISTRY.register("under_world_functional",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.underworld.under_world_functional")).icon(() -> new ItemStack(UnderworldModBlocks.PLAYER_ENCHANT_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UnderworldModBlocks.DELUSION_PRESSURE_PLATE.get().asItem());
				tabData.accept(UnderworldModBlocks.DELUSION_BUTTON.get().asItem());
			}).withTabsBefore(UNDER_WORLD_BUILDING_BLOCKS.getId()).build());
	public static final RegistryObject<CreativeModeTab> UNDER_WORLD_FOODS = REGISTRY.register("under_world_foods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.underworld.under_world_foods")).icon(() -> new ItemStack(UnderworldModItems.PLAYER_CORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UnderworldModItems.FRUIT_OF_FAVOUR.get());
			}).withSearchBar().withTabsBefore(UNDER_WORLD_FUNCTIONAL.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(UnderworldModItems.VAMPIRE_BAT_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_LOG.get().asItem());
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_WOOD.get().asItem());
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_PLANKS.get().asItem());
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_STAIRS.get().asItem());
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_SLAB.get().asItem());
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_FENCE.get().asItem());
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_FENCE_GATE.get().asItem());
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(UnderworldModBlocks.LOGGED_WOOD_LEAVES.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(UnderworldModItems.TEST.get());
		}
	}
}