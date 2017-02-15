package net.shadowfacts.tutorial.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.shadowfacts.tutorial.BlockBase;

public class BlockChalice extends BlockBase {
	
	public BlockChalice() {
		super(Material.ANVIL, "blockCup");
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
