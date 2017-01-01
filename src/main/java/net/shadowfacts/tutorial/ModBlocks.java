package net.shadowfacts.tutorial;
// similar to ModItems class, except here there are some additional properties of blocks,
// specifically ItemBlocks that are taken care of here.
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static BlockOre oreCopper;
	public static BlockBase blockTest;
	
	public static void init() {
		oreCopper = register(new BlockOre("oreCopper").setCreativeTab(CreativeTabs.MATERIALS));
		blockTest = register(new BlockBase(Material.ROCK, "blockTest").setCreativeTab(CreativeTabs.MATERIALS));
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);

		if (block instanceof BlockBase) {
			((BlockBase)block).registerItemModel(itemBlock);
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}