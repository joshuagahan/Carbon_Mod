package net.shadowfacts.tutorial.item;
/* This class is responsible for all the items in the mod. Each item exists here
 * as an instanced ItemBase object that is then registered with forge, adding it
 * to the game while also setting its creative tab.
 */
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.shadowfacts.tutorial.ItemBase;
import net.shadowfacts.tutorial.ItemModelProvider;

public class ModItems {
	public static ItemBase ingotCopper;
	public static ItemBase itemTest;
	public static ItemCornSeed cornSeed;
	public static ItemBase corn;
	public static ItemSeedTest seedTest;
	public static ItemBase foodTest;
	
	//these names should NEVER CHANGE
	//this method instantiates the items
	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper"));
		itemTest = register(new ItemBase("itemTest"));
		cornSeed = register(new ItemCornSeed());
		corn = register(new ItemBase("corn"));
		seedTest = register(new ItemSeedTest());
		foodTest = register(new ItemBase("foodTest"));
		
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
