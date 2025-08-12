package net.mcreator.underworld.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.underworld.init.UnderworldModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FortuneAndSilkTouchProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem) {
				if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("underworld:fortune")))) {
					if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem().isCorrectToolForDrops((world.getBlockState(BlockPos.containing(x, y, z))))) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) == 1) {
							if (Math.random() < 0.3) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData()
											.getLootTable(ResourceLocation.parse((((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).replace("underworld:", "underworld:blocks/"))).toLowerCase(java.util.Locale.ENGLISH)))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) == 2) {
							if (Math.random() < 0.32) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData()
											.getLootTable(ResourceLocation.parse((((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).replace("underworld:", "underworld:blocks/"))).toLowerCase(java.util.Locale.ENGLISH)))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (Math.random() < 0.2) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData()
											.getLootTable(ResourceLocation.parse((((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).replace("underworld:", "underworld:blocks/"))).toLowerCase(java.util.Locale.ENGLISH)))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(Enchantments.BLOCK_FORTUNE) == 3) {
							if (Math.random() < 0.38) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData()
											.getLootTable(ResourceLocation.parse((((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).replace("underworld:", "underworld:blocks/"))).toLowerCase(java.util.Locale.ENGLISH)))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (Math.random() < 0.25) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData()
											.getLootTable(ResourceLocation.parse((((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).replace("underworld:", "underworld:blocks/"))).toLowerCase(java.util.Locale.ENGLISH)))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
							if (Math.random() < 0.1) {
								if (!world.isClientSide() && world.getServer() != null) {
									for (ItemStack itemstackiterator : world.getServer().getLootData()
											.getLootTable(ResourceLocation.parse((((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString()).replace("underworld:", "underworld:blocks/"))).toLowerCase(java.util.Locale.ENGLISH)))
											.getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
										if (world instanceof ServerLevel _level) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
									}
								}
							}
						}
					}
				}
			} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem) {
					if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("underworld:silktouch")))) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						} else if (event != null && event.hasResult()) {
							event.setResult(Event.Result.DENY);
						}
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem().isCorrectToolForDrops((world.getBlockState(BlockPos.containing(x, y, z))))) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
										new ItemStack(ForgeRegistries.ITEMS.getValue(ResourceLocation.parse(((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString())).toLowerCase(java.util.Locale.ENGLISH)))));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == UnderworldModBlocks.UNDER_GRASS.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == UnderworldModBlocks.DELUSION_LEAVES.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == UnderworldModBlocks.LOGGED_WOOD_LEAVES.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == UnderworldModBlocks.LOGGED_WOOD_LEAVES.get()) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
								new ItemStack(ForgeRegistries.ITEMS.getValue(ResourceLocation.parse(((ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString())).toLowerCase(java.util.Locale.ENGLISH)))));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}