package net.mcreator.underworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlayerCoreItem extends Item {
	public PlayerCoreItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}
}