package net.shadowfacts.tutorial.block;
// a BlockOre is just a BlockBase with the specific properties of stone.
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;
import net.shadowfacts.tutorial.BlockBase;
import net.shadowfacts.tutorial.item.ItemOreDict;

public class BlockOre extends BlockBase implements ItemOreDict {

	private String oreName;
	
	public BlockOre(String name, String oreName) {
		super(Material.ROCK, name);
		this.oreName = oreName;
		setHardness(3f);
		setResistance(5f);
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}