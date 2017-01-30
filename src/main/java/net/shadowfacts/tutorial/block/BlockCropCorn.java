package net.shadowfacts.tutorial.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.ModItems;
//this class is for the crop corn you see in the world growing
public class BlockCropCorn extends BlockCrops{
	
	public BlockCropCorn()// gives the corn its name
	{
		setUnlocalizedName("cropCorn");
		setRegistryName("cropCorn");
		setCreativeTab(TutorialMod.creativeTab);
	}
	
	@Override
	protected Item getSeed() {
		return ModItems.cornSeed;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.corn;
	}
	//the above two methods use minecraft's code to tell the corn crop block which seed and food items to drop
}
