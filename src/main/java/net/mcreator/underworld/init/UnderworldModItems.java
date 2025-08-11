/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.underworld.item.TestItem;
import net.mcreator.underworld.item.PlayerCoreItem;
import net.mcreator.underworld.item.NihilisItem;
import net.mcreator.underworld.item.FruitOfFavourItem;
import net.mcreator.underworld.UnderworldMod;

public class UnderworldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UnderworldMod.MODID);
	public static final RegistryObject<Item> VAMPIRE_BAT_SPAWN_EGG = REGISTRY.register("vampire_bat_spawn_egg", () -> new ForgeSpawnEggItem(UnderworldModEntities.VAMPIRE_BAT, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> PLAYER_ENCHANT_BLOCK = block(UnderworldModBlocks.PLAYER_ENCHANT_BLOCK);
	public static final RegistryObject<Item> PLAYER_CORE = REGISTRY.register("player_core", () -> new PlayerCoreItem());
	public static final RegistryObject<Item> LOGGED_WOOD_LOG = block(UnderworldModBlocks.LOGGED_WOOD_LOG);
	public static final RegistryObject<Item> LOGGED_WOOD_WOOD = block(UnderworldModBlocks.LOGGED_WOOD_WOOD);
	public static final RegistryObject<Item> LOGGED_WOOD_PLANKS = block(UnderworldModBlocks.LOGGED_WOOD_PLANKS);
	public static final RegistryObject<Item> LOGGED_WOOD_LEAVES = block(UnderworldModBlocks.LOGGED_WOOD_LEAVES);
	public static final RegistryObject<Item> LOGGED_WOOD_STAIRS = block(UnderworldModBlocks.LOGGED_WOOD_STAIRS);
	public static final RegistryObject<Item> LOGGED_WOOD_SLAB = block(UnderworldModBlocks.LOGGED_WOOD_SLAB);
	public static final RegistryObject<Item> LOGGED_WOOD_FENCE = block(UnderworldModBlocks.LOGGED_WOOD_FENCE);
	public static final RegistryObject<Item> LOGGED_WOOD_FENCE_GATE = block(UnderworldModBlocks.LOGGED_WOOD_FENCE_GATE);
	public static final RegistryObject<Item> LOGGED_WOOD_PRESSURE_PLATE = block(UnderworldModBlocks.LOGGED_WOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> LOGGED_WOOD_BUTTON = block(UnderworldModBlocks.LOGGED_WOOD_BUTTON);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> UNDER_STONE = block(UnderworldModBlocks.UNDER_STONE);
	public static final RegistryObject<Item> DELUSION_LOG = block(UnderworldModBlocks.DELUSION_LOG);
	public static final RegistryObject<Item> DELUSION_LEAVES = block(UnderworldModBlocks.DELUSION_LEAVES);
	public static final RegistryObject<Item> DELUSION_WOOD = block(UnderworldModBlocks.DELUSION_WOOD);
	public static final RegistryObject<Item> DELUSION_PLANKS = block(UnderworldModBlocks.DELUSION_PLANKS);
	public static final RegistryObject<Item> TRIPPED_DELUSION_LOG = block(UnderworldModBlocks.TRIPPED_DELUSION_LOG);
	public static final RegistryObject<Item> TRIPPED_DELUSION_WOOD = block(UnderworldModBlocks.TRIPPED_DELUSION_WOOD);
	public static final RegistryObject<Item> DELUSION_STAIRS = block(UnderworldModBlocks.DELUSION_STAIRS);
	public static final RegistryObject<Item> DELUSION_SLAB = block(UnderworldModBlocks.DELUSION_SLAB);
	public static final RegistryObject<Item> DELUSION_FENCE = block(UnderworldModBlocks.DELUSION_FENCE);
	public static final RegistryObject<Item> DELUSION_FENCE_GATE = block(UnderworldModBlocks.DELUSION_FENCE_GATE);
	public static final RegistryObject<Item> DELUSION_DOOR = doubleBlock(UnderworldModBlocks.DELUSION_DOOR);
	public static final RegistryObject<Item> DELUSION_PRESSURE_PLATE = block(UnderworldModBlocks.DELUSION_PRESSURE_PLATE);
	public static final RegistryObject<Item> DELUSION_BUTTON = block(UnderworldModBlocks.DELUSION_BUTTON);
	public static final RegistryObject<Item> DELUSION_TRAP_DOOR = block(UnderworldModBlocks.DELUSION_TRAP_DOOR);
	public static final RegistryObject<Item> UNDER_STONE_BRICKS = block(UnderworldModBlocks.UNDER_STONE_BRICKS);
	public static final RegistryObject<Item> UNDER_STONE_BRICKS_CRACKED = block(UnderworldModBlocks.UNDER_STONE_BRICKS_CRACKED);
	public static final RegistryObject<Item> UNDER_COBBLESTONE = block(UnderworldModBlocks.UNDER_COBBLESTONE);
	public static final RegistryObject<Item> UNDER_COBBLESTONE_STAIRS = block(UnderworldModBlocks.UNDER_COBBLESTONE_STAIRS);
	public static final RegistryObject<Item> UNDER_COBBLESTONE_SLAB = block(UnderworldModBlocks.UNDER_COBBLESTONE_SLAB);
	public static final RegistryObject<Item> UNDER_COBBLESTONE_WALL = block(UnderworldModBlocks.UNDER_COBBLESTONE_WALL);
	public static final RegistryObject<Item> UNDER_STONE_STAIRS = block(UnderworldModBlocks.UNDER_STONE_STAIRS);
	public static final RegistryObject<Item> UNDER_STONE_SLAB = block(UnderworldModBlocks.UNDER_STONE_SLAB);
	public static final RegistryObject<Item> UNDER_STONE_BRICKS_STAIRS = block(UnderworldModBlocks.UNDER_STONE_BRICKS_STAIRS);
	public static final RegistryObject<Item> UNDER_STONE_BRICKS_SLAB = block(UnderworldModBlocks.UNDER_STONE_BRICKS_SLAB);
	public static final RegistryObject<Item> UNDER_STONE_BRICKS_WALL = block(UnderworldModBlocks.UNDER_STONE_BRICKS_WALL);
	public static final RegistryObject<Item> UNDER_SAND = block(UnderworldModBlocks.UNDER_SAND);
	public static final RegistryObject<Item> DELUSION_SIGN = block(UnderworldModBlocks.DELUSION_SIGN);
	public static final RegistryObject<Item> FRUIT_OF_FAVOUR = REGISTRY.register("fruit_of_favour", () -> new FruitOfFavourItem());
	public static final RegistryObject<Item> UNDER_DIRT = block(UnderworldModBlocks.UNDER_DIRT);
	public static final RegistryObject<Item> UNDER_GRASS = block(UnderworldModBlocks.UNDER_GRASS);
	public static final RegistryObject<Item> NIHILIS = REGISTRY.register("nihilis", () -> new NihilisItem());
	public static final RegistryObject<Item> NIHILIS_ORE = block(UnderworldModBlocks.NIHILIS_ORE, new Item.Properties().rarity(Rarity.UNCOMMON));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}
}