/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.underworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;

import net.mcreator.underworld.block.entity.PlayerEnchantBlockBlockEntity;
import net.mcreator.underworld.block.entity.DelusionSignBlockEntity;
import net.mcreator.underworld.UnderworldMod;

public class UnderworldModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, UnderworldMod.MODID);
	public static final RegistryObject<BlockEntityType<PlayerEnchantBlockBlockEntity>> PLAYER_ENCHANT_BLOCK = register("player_enchant_block", UnderworldModBlocks.PLAYER_ENCHANT_BLOCK, PlayerEnchantBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<DelusionSignBlockEntity>> DELUSION_SIGN = register("delusion_sign", UnderworldModBlocks.DELUSION_SIGN, DelusionSignBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}