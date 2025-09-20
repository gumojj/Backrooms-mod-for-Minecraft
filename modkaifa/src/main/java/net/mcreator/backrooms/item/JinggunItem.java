
package net.mcreator.backrooms.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class JinggunItem extends SwordItem {
	public JinggunItem() {
		super(new Tier() {
			public int getUses() {
				return 628;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 6;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.OAK_PLANKS), new ItemStack(Blocks.SPRUCE_PLANKS), new ItemStack(Blocks.BIRCH_PLANKS), new ItemStack(Blocks.JUNGLE_PLANKS), new ItemStack(Blocks.ACACIA_PLANKS),
						new ItemStack(Blocks.DARK_OAK_PLANKS), new ItemStack(Blocks.CRIMSON_PLANKS), new ItemStack(Blocks.WARPED_PLANKS));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
