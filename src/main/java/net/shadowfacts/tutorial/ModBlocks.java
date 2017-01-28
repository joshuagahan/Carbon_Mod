package net.shadowfacts.tutorial;
/* similar to ModItems class, except here there are some additional properties of blocks,
 * specifically ItemBlocks that are taken care of here.
 * this goes without saying, but make sure your lovely json files don't have any typos in them.
 * You think I'm kidding! I'm really not! DON'T MESS WITH JSON FILES!!!! :)
 * */
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockOre oreCopper;
	public static BlockBase blockTest;
	public static BlockCropCorn cropCorn;
	
	//these names should NEVER CHANGE (THIS INCLUDES THE ASSOCIATED .JSON FILES)
	//this method instantiates the blocks
	public static void init() { 
		oreCopper = register(new BlockOre("oreCopper").setCreativeTab(CreativeTabs.MATERIALS));
		blockTest = register(new BlockBase(Material.ROCK, "blockTest").setCreativeTab(CreativeTabs.MATERIALS));
		cropCorn = register(new BlockCropCorn(), null); //this is null because it doesn't have an ItemBlock
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block); //the thing you see in the world
		if (itemBlock != null && block instanceof ItemModelProvider) //this null check exists in case a block does not have an itemBlock associated with it, like a crop for example
		{ 
			GameRegistry.register(itemBlock); //the block shaped thing you see in your inventory
			((ItemModelProvider)block).registerItemModel(itemBlock); //gives the block its inventory form AKA itemBlock
		}
		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}