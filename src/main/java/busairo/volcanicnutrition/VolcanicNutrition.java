package busairo.volcanicnutrition;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class VolcanicNutrition extends JavaPlugin 
{
	PluginManager plm;
	String VNDescription;
	
	public void onEnable() 
	{	
		getLogger().info("CS185C Volcanic Nutrition Custom Plugin has been loaded.");
		plm = this.getServer().getPluginManager();
		plm.registerEvents(new PlayerJoin(), this);
	}

	public void onDisable()
	{	getLogger().info("CS185C Volcanic Nutrition Custom Plugin has been de-loaded.  Most likely since server is going down.");	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		Player player = (Player) sender;
		PlayerInventory playerinv = player.getInventory();
		
		VNDescription = "Volcanic Nutrition Plugin:  A Bukkit plugin that allows players to grow food that will double the satiety of the currently available raw editable foods. Carrots, Potatoes, and Melons.  Basically saying"
				+ " food that is grown on the biome with the special dirt near the volcano will make the food give you double the food sticks then the default.";
		
		if(cmd.getName().equalsIgnoreCase("volcanicnutrition") && sender instanceof Player) {	 
			sender.sendMessage(ChatColor.RED + VNDescription);	
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("getpotentdirtblock") ) {	 
			potentDirtBlock potentDirtBlock = new potentDirtBlock();
			playerinv.addItem(potentDirtBlock);
			sender.sendMessage("You should've received a potent dirt block. Which is still under construction for this mod.");
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("getpowercarrot") && sender instanceof Player) {	 
			powerCarrot powerCarrot = new powerCarrot();
			playerinv.addItem(powerCarrot);
			sender.sendMessage("Power Carrot has been put into your inventory.  Not yet programmed to fill you more yet.");
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("getpowerpotatoe") && sender instanceof Player) {
			powerPotatoe powerPotatoe = new powerPotatoe();
			playerinv.addItem(powerPotatoe);
			sender.sendMessage("Power Potatoe has been put into your inventory.  Not yet programmed to fill you more yet.");
			return true;
		}
	
		else if(cmd.getName().equalsIgnoreCase("getpowermelon") && sender instanceof Player)
		{	 
			powerMelon powerMelon = new powerMelon();
			playerinv.addItem(powerMelon);
			sender.sendMessage("Power Melon has been put into your inventory.  Not yet programmed to fill you more yet.");
			return true;
		}

		return false;
	}

}
