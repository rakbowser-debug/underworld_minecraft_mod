package net.mcreator.underworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NihilisItem extends Item {
	public NihilisItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}