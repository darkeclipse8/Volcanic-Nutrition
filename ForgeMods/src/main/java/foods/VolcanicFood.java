package foods;

import lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public final class VolcanicFood {
	
	public static ItemFood powerCarrot;
	public static ItemFood powerMelon;
	public static ItemFood powerPotatoe;
	public static ItemFood potentBakedPotatoe;
	
	public static void init() {
		powerCarrot = new powerCarrot(0.72f, false);
		powerMelon = new powerMelon(0.24f, false);
		powerPotatoe = new powerPotatoe(0.12f, false);
		potentBakedPotatoe = new potentBakedPotatoe(0.8f, false);
		createRecipes();
	}
	
	public static void createRecipes() {
		
		//String nameOfItem = "potentBakedPotatoe";
		//Item potentBakedPotatoe = new ItemFood(7, 0.6F, false).setUnlocalizedName("potatoBaked").setTextureName(Constants.MODID + ":" + nameOfItem);
		GameRegistry.addSmelting(powerPotatoe, new ItemStack(potentBakedPotatoe), 4);
		
		// Recipe for melons to create melon block
		GameRegistry.addRecipe(new ItemStack(new blocks.ModBlocks().potentMelonBlock), new Object[] {
			"AAA",
			"AAA",
			"AAA",
			'A', powerMelon
		});
		
		// Recipe for two carrots to make the power carrot
		GameRegistry.addRecipe(new ItemStack(powerCarrot), new Object[] {
			"AA",
			'A', Items.carrot
		});
		
		// Recipe for two melons to make the power carrot
		GameRegistry.addRecipe(new ItemStack(powerMelon), new Object[] {
			"AA",
			'A', Items.melon
		});
		
		// Recipe for two potatoes to make the power potatoe
		GameRegistry.addRecipe(new ItemStack(powerPotatoe), new Object[] {
			"AA",
			'A', Items.potato
		});
	}
}
