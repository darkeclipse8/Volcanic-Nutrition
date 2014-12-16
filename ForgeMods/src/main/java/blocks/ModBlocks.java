package blocks;

import net.minecraft.block.Block;

public final class ModBlocks {
	
	public static Block potentDirtBlock;
	public static Block potentFarmlandDirtBlock;
	public static Block potentMelonBlock;
	
	public static void init() {
		potentDirtBlock = new potentDirtBlock();
		potentFarmlandDirtBlock = new potentFarmlandDirtBlock();
		potentMelonBlock = new potentMelonBlock();
	}
}
