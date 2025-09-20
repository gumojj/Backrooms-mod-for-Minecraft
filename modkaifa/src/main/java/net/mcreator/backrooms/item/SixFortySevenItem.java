
package net.mcreator.backrooms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class SixFortySevenItem extends RecordItem {
	public SixFortySevenItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("backrooms:six_forty_seven")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 0);
	}
}
