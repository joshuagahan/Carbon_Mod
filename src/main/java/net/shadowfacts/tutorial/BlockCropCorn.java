package net.shadowfacts.tutorial;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.shadowfacts.tutorial.ModItems;
//this class is for the crop corn you see in the world growing
public class BlockCropCorn extends BlockCrops{
	
	public BlockCropCorn()// gives the corn its name
	{
		setUnlocalizedName("cropCorn");
		setRegistryName("cropCorn");
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
