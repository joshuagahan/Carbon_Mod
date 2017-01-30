package net.shadowfacts.tutorial.item;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.shadowfacts.tutorial.ItemModelProvider;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.block.ModBlocks;

public class ItemSeedTest extends ItemSeeds implements ItemModelProvider {

	public ItemSeedTest() {
		super(ModBlocks.cropTest, Blocks.FARMLAND);
		setUnlocalizedName("seedTest");
		setRegistryName("seedTest");
		setCreativeTab(TutorialMod.creativeTab);
	}
	
	@Override
	public void registerItemModel(Item item) {
		TutorialMod.proxy.registerItemRenderer(item, 0, "seedTest");
	}

}
