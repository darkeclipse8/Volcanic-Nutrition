package busairo.volcanicnutrition;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class powerMelon extends ItemStack {
	
	private ArrayList<String> lore;
	private String description;
	
	public powerMelon() {
		super(Material.MELON,1);
		lore = new ArrayList<String>();
		ItemMeta meta = this.getItemMeta();
		description =  "Melon that fills you more then a regular melon";
		meta.setDisplayName("Power Melon");
		lore.add(description);
		meta.setLore(lore);
		this.setItemMeta(meta);
	}
	
	public ArrayList<String> getLore() {
		return lore;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String new_description) {
		description = new_description;
	}

}
