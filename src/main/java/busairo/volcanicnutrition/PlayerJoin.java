package busairo.volcanicnutrition;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener 
{
	public VolcanicNutrition plugin;
	String oldPlayerMessage;
	String newPlayerMessage;
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		oldPlayerMessage = "Volcanic Nutrition Plugin: You should know what this plugin does after reading it from your first time in right? If not type /volcanicnutrition";
		newPlayerMessage = "Volcanic Nutrition Plugin: This is a new plugin made by Busairo for a Minecraft class.  This plugin allows you to plant food near a volcano "
				+ "and eating that food will give you double the food sticks then the default.  If you want to see an explanation again, type /volcanicnutrition in chat.";
		player.sendMessage(ChatColor.BLUE + newPlayerMessage);	
		
	}
}
