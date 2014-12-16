package foods;

import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class potentBakedPotatoe extends ItemFood {
	
	private String name = "potentBakedPotatoe";
	private static final int heal_amount = 7;
	
	public potentBakedPotatoe(float saturation, boolean wolfMeat) {
		super(heal_amount, saturation, wolfMeat);
		setUnlocalizedName(Constants.MODID + " " + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(this,name);
	}
}
