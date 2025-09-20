
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.backrooms.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BackroomsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(BackroomsModItems.FIVE_CENTS.get(), 20),

					new ItemStack(BackroomsModItems.ONE_DOLLAR.get()), 100, 5, 0f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(BackroomsModItems.ONE_DOLLAR.get()),

					new ItemStack(BackroomsModItems.FIVE_CENTS.get(), 20), 100, 5, 0f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.DIAMOND), new ItemStack(Items.IRON_INGOT), new ItemStack(BackroomsModItems.FIVE_CENTS.get(), 10), 10, 5, 0f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(BackroomsModItems.ONE_DOLLAR.get()),

					new ItemStack(Items.DIAMOND), 10, 5, 0.05f));
		}
	}
}
