package net.mcreator.dontcuttripwire.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CutYouJiFangKuaiShiFangKuaiDeWeiZhiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("disarmed") instanceof BooleanProperty _booleanProp)
				world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
		}
	}
}
