
package net.mcreator.backrooms.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.backrooms.procedures.Object5tgyouhaifeiliaoDangYouJianDianJiKongQiShiProcedure;

public class Object5tgyouhaifeiliaoItem extends Item {
	public Object5tgyouhaifeiliaoItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Object5tgyouhaifeiliaoDangYouJianDianJiKongQiShiProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
