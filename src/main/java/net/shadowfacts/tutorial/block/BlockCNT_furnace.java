package net.shadowfacts.tutorial.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.shadowfacts.tutorial.BlockBase;

public class BlockCNT_furnace extends BlockBase {
	
	public BlockCNT_furnace() {
		super(Material.ROCK, "CNT_furnace");
	}

	@Override
	@Deprecated
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	@Deprecated
	public boolean isFullCube(IBlockState state) {
		return false;
	}


}
