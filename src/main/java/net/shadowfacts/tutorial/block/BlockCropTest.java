package net.shadowfacts.tutorial.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.ModItems;

public class BlockCropTest extends BlockCrops{
	
	public BlockCropTest()
	{
		setUnlocalizedName("cropTest");
		setRegistryName("cropTest");
		setCreativeTab(TutorialMod.creativeTab);
	}
	
	@Override
	protected Item getSeed() {
		return ModItems.seedTest;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.foodTest;
	}

}
