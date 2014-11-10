package busairo.volcanicnutrition;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class potentDirtBlock extends ItemStack {
	
	private ArrayList<String> lore;
	private String description;
	
	public potentDirtBlock() {
		super(Material.DIRT,1);
		lore = new ArrayList<String>();
		ItemMeta meta = this.getItemMeta();
		description =  "Allows you to grow power vegetables";
		meta.setDisplayName("Potent Dirt Block");
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
