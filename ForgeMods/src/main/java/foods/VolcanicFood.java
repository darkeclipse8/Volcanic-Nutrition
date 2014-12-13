package foods;

import net.minecraft.item.ItemFood;

public final class VolcanicFood {
	
	public static ItemFood powerCarrot;
	public static ItemFood powerMelon;
	public static ItemFood powerPotatoe;
	
	public static void init() {
		powerCarrot = new powerCarrot(1.0f, false);
		powerMelon = new powerMelon(1.0f, false);
		powerPotatoe = new powerPotatoe(1.0f, false);
	}
}
