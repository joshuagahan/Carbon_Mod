package net.shadowfacts.tutorial.block;
// a BlockOre is just a BlockBase with the specific properties of stone.
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.shadowfacts.tutorial.BlockBase;

public class BlockOre extends BlockBase {

	public BlockOre(String name) {
		super(Material.ROCK, name);

		setHardness(3f);
		setResistance(5f);
	}

	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}