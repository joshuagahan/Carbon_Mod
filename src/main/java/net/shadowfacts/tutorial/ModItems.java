package net.shadowfacts.tutorial;
/* This class is responsible for all the items in the mod. Each item exists here
 * as an instanced ItemBase object that is then registered with forge, adding it
 * to the game while also setting its creative tab.
 */
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static ItemBase ingotCopper;
	public static ItemBase itemTest;
	public static ItemCornSeed cornSeed;
	public static ItemBase corn;
	
	//these names should NEVER CHANGE
	//this method instantiates the items
	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
		itemTest = register(new ItemBase("itemTest").setCreativeTab(CreativeTabs.MATERIALS));
		cornSeed = register(new ItemCornSeed());
		corn = register(new ItemBase("corn").setCreativeTab(CreativeTabs.FOOD));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item); //register all the items

		//gives each item its model if it has one (why wouldn't it?)
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}

		return item; // #done
	}

}
