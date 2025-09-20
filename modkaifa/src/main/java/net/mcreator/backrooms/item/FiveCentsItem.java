
package net.mcreator.backrooms.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FiveCentsItem extends Item {
	public FiveCentsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
