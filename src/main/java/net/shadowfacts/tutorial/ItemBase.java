package net.shadowfacts.tutorial;
//used to add items quickly and easily by using instances of this class in ModItems class
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.shadowfacts.tutorial.TutorialMod;

public class ItemBase extends Item implements ItemModelProvider{

	protected String name;

	//gives items that forge can use 
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(TutorialMod.creativeTab);
	}
	
	//uses the proxy from the main class to give it its model
	@Override
	public void registerItemModel(Item item) {
		TutorialMod.proxy.registerItemRenderer(this, 0, name);
	}

	//sets the tab the item appears in when in creative mode
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}