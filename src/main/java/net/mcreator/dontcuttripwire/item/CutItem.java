
package net.mcreator.dontcuttripwire.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.dontcuttripwire.procedures.CutYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure;

import java.util.List;

public class CutItem extends Item {
	public CutItem() {
		super(new Item.Properties().durability(100).rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 4f;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CutYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
