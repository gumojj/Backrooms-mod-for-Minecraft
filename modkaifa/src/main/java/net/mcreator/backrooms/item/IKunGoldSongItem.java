
package net.mcreator.backrooms.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class IKunGoldSongItem extends RecordItem {
	public IKunGoldSongItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("backrooms:ikungoldsong")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 0);
	}
}
