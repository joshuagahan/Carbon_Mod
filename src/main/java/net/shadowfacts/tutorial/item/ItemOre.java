package net.shadowfacts.tutorial.item;

import net.shadowfacts.tutorial.ItemBase;
import net.minecraftforge.oredict.OreDictionary;
//if it was up to me, I'd have named this class ItemDict to be inclusive of Items that are not ores that use this class.
//this class exists to help register our items with forge's ore dictionary.
public class ItemOre extends ItemBase implements ItemOreDict {

	private String oreName;
	
	public ItemOre(String name, String oreName)	{
		super(name);
		
		this.oreName = oreName;
	}
	
	@Override
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);

	}

}
