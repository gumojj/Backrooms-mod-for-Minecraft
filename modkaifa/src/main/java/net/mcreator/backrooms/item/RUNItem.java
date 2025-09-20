
package net.mcreator.backrooms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class RUNItem extends RecordItem {
	public RUNItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("backrooms:run")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 0);
	}
}
