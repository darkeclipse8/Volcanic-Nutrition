package busairo.volcanicnutrition;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class powerPotatoe extends ItemStack {
	
	private ArrayList<String> lore;
	private String description;
	
	public powerPotatoe() {
		super(Material.POTATO_ITEM,1);
		lore = new ArrayList<String>();
		ItemMeta meta = this.getItemMeta();
		description =  "Potatoe that fills you more then a regular potatoe";
		meta.setDisplayName("Power Potatoe");
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
