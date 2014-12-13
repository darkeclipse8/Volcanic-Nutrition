package biome;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenCustomDirt extends BiomeGenBase 
{
	public BiomeGenCustomDirt(int id) {
		super(id);
		
		//this.theBiomeDecorator.treesPerChunk = 5;
		//this.theBiomeDecorator.grassPerChunk = 2;
		
		this.topBlock = blocks.ModBlocks.potentDirtBlock;
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 5, 2, 10));
	
	}
}