package biome;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry 
{
	public static BiomeGenBase customDirtBiome;
	
	public static void init()
	{	
		initializeBiome();
		registerBiome();
	}
	
	public static void initializeBiome()
	{
		customDirtBiome = new BiomeGenCustomDirt(137).setBiomeName("CustomDirt").setTemperatureRainfall(1.4F, 1.0F);
	}
	
	public static void registerBiome()
	{	
		BiomeDictionary.registerBiomeType(customDirtBiome, Type.FOREST);	
		BiomeManager.addSpawnBiome(customDirtBiome);	
	}
}
