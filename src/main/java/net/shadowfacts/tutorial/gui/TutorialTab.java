package net.shadowfacts.tutorial.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.ModItems;

public class TutorialTab extends CreativeTabs {
	
	public TutorialTab() {
		super(TutorialMod.modId); //the name of the tab goes here?
	
	}
	@Override
	public Item getTabIconItem() {
		return ModItems.ingotCopper;
	}
}
