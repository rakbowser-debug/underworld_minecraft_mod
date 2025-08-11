/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.underworld.block.UnderWorldPortalBlock;
import net.mcreator.underworld.block.UnderStoneStairsBlock;
import net.mcreator.underworld.block.UnderStoneSlabBlock;
import net.mcreator.underworld.block.UnderStoneBricksWallBlock;
import net.mcreator.underworld.block.UnderStoneBricksStairsBlock;
import net.mcreator.underworld.block.UnderStoneBricksSlabBlock;
import net.mcreator.underworld.block.UnderStoneBricksCrackedBlock;
import net.mcreator.underworld.block.UnderStoneBricksBlock;
import net.mcreator.underworld.block.UnderStoneBlock;
import net.mcreator.underworld.block.UnderSandBlock;
import net.mcreator.underworld.block.UnderGrassBlock;
import net.mcreator.underworld.block.UnderDirtBlock;
import net.mcreator.underworld.block.UnderCobblestoneWallBlock;
import net.mcreator.underworld.block.UnderCobblestoneStairsBlock;
import net.mcreator.underworld.block.UnderCobblestoneSlabBlock;
import net.mcreator.underworld.block.UnderCobblestoneBlock;
import net.mcreator.underworld.block.TrippedDelusionWoodBlock;
import net.mcreator.underworld.block.TrippedDelusionLogBlock;
import net.mcreator.underworld.block.PlayerEnchantBlockBlock;
import net.mcreator.underworld.block.NihilisOreBlock;
import net.mcreator.underworld.block.LoggedWoodWoodBlock;
import net.mcreator.underworld.block.LoggedWoodStairsBlock;
import net.mcreator.underworld.block.LoggedWoodSlabBlock;
import net.mcreator.underworld.block.LoggedWoodPressurePlateBlock;
import net.mcreator.underworld.block.LoggedWoodPlanksBlock;
import net.mcreator.underworld.block.LoggedWoodLogBlock;
import net.mcreator.underworld.block.LoggedWoodLeavesBlock;
import net.mcreator.underworld.block.LoggedWoodFenceGateBlock;
import net.mcreator.underworld.block.LoggedWoodFenceBlock;
import net.mcreator.underworld.block.LoggedWoodButtonBlock;
import net.mcreator.underworld.block.DelusionWoodBlock;
import net.mcreator.underworld.block.DelusionTrapDoorBlock;
import net.mcreator.underworld.block.DelusionStairsBlock;
import net.mcreator.underworld.block.DelusionSlabBlock;
import net.mcreator.underworld.block.DelusionSignBlock;
import net.mcreator.underworld.block.DelusionPressurePlateBlock;
import net.mcreator.underworld.block.DelusionPlanksBlock;
import net.mcreator.underworld.block.DelusionLogBlock;
import net.mcreator.underworld.block.DelusionLeavesBlock;
import net.mcreator.underworld.block.DelusionFenceGateBlock;
import net.mcreator.underworld.block.DelusionFenceBlock;
import net.mcreator.underworld.block.DelusionDoorBlock;
import net.mcreator.underworld.block.DelusionButtonBlock;
import net.mcreator.underworld.UnderworldMod;

public class UnderworldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UnderworldMod.MODID);
	public static final RegistryObject<Block> UNDER_WORLD_PORTAL = REGISTRY.register("under_world_portal", () -> new UnderWorldPortalBlock());
	public static final RegistryObject<Block> PLAYER_ENCHANT_BLOCK = REGISTRY.register("player_enchant_block", () -> new PlayerEnchantBlockBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_LOG = REGISTRY.register("logged_wood_log", () -> new LoggedWoodLogBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_WOOD = REGISTRY.register("logged_wood_wood", () -> new LoggedWoodWoodBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_PLANKS = REGISTRY.register("logged_wood_planks", () -> new LoggedWoodPlanksBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_LEAVES = REGISTRY.register("logged_wood_leaves", () -> new LoggedWoodLeavesBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_STAIRS = REGISTRY.register("logged_wood_stairs", () -> new LoggedWoodStairsBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_SLAB = REGISTRY.register("logged_wood_slab", () -> new LoggedWoodSlabBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_FENCE = REGISTRY.register("logged_wood_fence", () -> new LoggedWoodFenceBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_FENCE_GATE = REGISTRY.register("logged_wood_fence_gate", () -> new LoggedWoodFenceGateBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_PRESSURE_PLATE = REGISTRY.register("logged_wood_pressure_plate", () -> new LoggedWoodPressurePlateBlock());
	public static final RegistryObject<Block> LOGGED_WOOD_BUTTON = REGISTRY.register("logged_wood_button", () -> new LoggedWoodButtonBlock());
	public static final RegistryObject<Block> UNDER_STONE = REGISTRY.register("under_stone", () -> new UnderStoneBlock());
	public static final RegistryObject<Block> DELUSION_LOG = REGISTRY.register("delusion_log", () -> new DelusionLogBlock());
	public static final RegistryObject<Block> DELUSION_LEAVES = REGISTRY.register("delusion_leaves", () -> new DelusionLeavesBlock());
	public static final RegistryObject<Block> DELUSION_WOOD = REGISTRY.register("delusion_wood", () -> new DelusionWoodBlock());
	public static final RegistryObject<Block> DELUSION_PLANKS = REGISTRY.register("delusion_planks", () -> new DelusionPlanksBlock());
	public static final RegistryObject<Block> TRIPPED_DELUSION_LOG = REGISTRY.register("tripped_delusion_log", () -> new TrippedDelusionLogBlock());
	public static final RegistryObject<Block> TRIPPED_DELUSION_WOOD = REGISTRY.register("tripped_delusion_wood", () -> new TrippedDelusionWoodBlock());
	public static final RegistryObject<Block> DELUSION_STAIRS = REGISTRY.register("delusion_stairs", () -> new DelusionStairsBlock());
	public static final RegistryObject<Block> DELUSION_SLAB = REGISTRY.register("delusion_slab", () -> new DelusionSlabBlock());
	public static final RegistryObject<Block> DELUSION_FENCE = REGISTRY.register("delusion_fence", () -> new DelusionFenceBlock());
	public static final RegistryObject<Block> DELUSION_FENCE_GATE = REGISTRY.register("delusion_fence_gate", () -> new DelusionFenceGateBlock());
	public static final RegistryObject<Block> DELUSION_DOOR = REGISTRY.register("delusion_door", () -> new DelusionDoorBlock());
	public static final RegistryObject<Block> DELUSION_PRESSURE_PLATE = REGISTRY.register("delusion_pressure_plate", () -> new DelusionPressurePlateBlock());
	public static final RegistryObject<Block> DELUSION_BUTTON = REGISTRY.register("delusion_button", () -> new DelusionButtonBlock());
	public static final RegistryObject<Block> DELUSION_TRAP_DOOR = REGISTRY.register("delusion_trap_door", () -> new DelusionTrapDoorBlock());
	public static final RegistryObject<Block> UNDER_STONE_BRICKS = REGISTRY.register("under_stone_bricks", () -> new UnderStoneBricksBlock());
	public static final RegistryObject<Block> UNDER_STONE_BRICKS_CRACKED = REGISTRY.register("under_stone_bricks_cracked", () -> new UnderStoneBricksCrackedBlock());
	public static final RegistryObject<Block> UNDER_COBBLESTONE = REGISTRY.register("under_cobblestone", () -> new UnderCobblestoneBlock());
	public static final RegistryObject<Block> UNDER_COBBLESTONE_STAIRS = REGISTRY.register("under_cobblestone_stairs", () -> new UnderCobblestoneStairsBlock());
	public static final RegistryObject<Block> UNDER_COBBLESTONE_SLAB = REGISTRY.register("under_cobblestone_slab", () -> new UnderCobblestoneSlabBlock());
	public static final RegistryObject<Block> UNDER_COBBLESTONE_WALL = REGISTRY.register("under_cobblestone_wall", () -> new UnderCobblestoneWallBlock());
	public static final RegistryObject<Block> UNDER_STONE_STAIRS = REGISTRY.register("under_stone_stairs", () -> new UnderStoneStairsBlock());
	public static final RegistryObject<Block> UNDER_STONE_SLAB = REGISTRY.register("under_stone_slab", () -> new UnderStoneSlabBlock());
	public static final RegistryObject<Block> UNDER_STONE_BRICKS_STAIRS = REGISTRY.register("under_stone_bricks_stairs", () -> new UnderStoneBricksStairsBlock());
	public static final RegistryObject<Block> UNDER_STONE_BRICKS_SLAB = REGISTRY.register("under_stone_bricks_slab", () -> new UnderStoneBricksSlabBlock());
	public static final RegistryObject<Block> UNDER_STONE_BRICKS_WALL = REGISTRY.register("under_stone_bricks_wall", () -> new UnderStoneBricksWallBlock());
	public static final RegistryObject<Block> UNDER_SAND = REGISTRY.register("under_sand", () -> new UnderSandBlock());
	public static final RegistryObject<Block> DELUSION_SIGN = REGISTRY.register("delusion_sign", () -> new DelusionSignBlock());
	public static final RegistryObject<Block> UNDER_DIRT = REGISTRY.register("under_dirt", () -> new UnderDirtBlock());
	public static final RegistryObject<Block> UNDER_GRASS = REGISTRY.register("under_grass", () -> new UnderGrassBlock());
	public static final RegistryObject<Block> NIHILIS_ORE = REGISTRY.register("nihilis_ore", () -> new NihilisOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}