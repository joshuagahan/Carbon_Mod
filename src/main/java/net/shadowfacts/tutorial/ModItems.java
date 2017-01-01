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

	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
		itemTest = register(new ItemBase("itemTest").setCreativeTab(CreativeTabs.MATERIALS));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}

		return item;
	}

}
