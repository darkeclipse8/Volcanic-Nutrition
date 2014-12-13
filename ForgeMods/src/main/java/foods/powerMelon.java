package foods;

import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class powerMelon extends ItemFood {
	
	private String name = "powerMelon";
	private static final int heal_amount = 4;
	
	public powerMelon(float saturation, boolean wolfMeat) {
		super(heal_amount, saturation, wolfMeat);
		setUnlocalizedName(Constants.MODID + " " + name);
		setTextureName(Constants.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabFood);
		GameRegistry.registerItem(this,name);
	}

}
