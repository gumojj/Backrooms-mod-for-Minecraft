
package net.mcreator.backrooms.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.backrooms.procedures.SuperxrsDangShiWuBeiChiShiProcedure;
import net.mcreator.backrooms.procedures.SuperxrsDangHuoZhaoDeShiTiBeiGaiWuPinJiZhongProcedure;

public class SuperxrsItem extends Item {
	public SuperxrsItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(100).saturationMod(100f).build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		SuperxrsDangShiWuBeiChiShiProcedure.execute(entity);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SuperxrsDangHuoZhaoDeShiTiBeiGaiWuPinJiZhongProcedure.execute(entity.level(), entity);
		return retval;
	}
}
