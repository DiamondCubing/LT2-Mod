package diamondgaming.lt2.init;

import diamondgaming.lt2.Reference;
import diamondgaming.lt2.init.blocks.CustomLog;
import diamondgaming.lt2.init.blocks.CustomPlank;
import diamondgaming.lt2.init.blocks.item.ItemBlockVariants;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit {
	
	public static Block log, planks, leaves;
	
	public static void init() {
		
		planks = new CustomPlank("planks");
		log = new CustomLog("log");
		
	}
	
	public static void register() {
		
		registerBlock(planks, new ItemBlockVariants(planks));
		registerBlock(log, new ItemBlockVariants(log));
		
	}
	
	public static void registerRenders() {
		
		for(int i = 0; i < CustomPlank.EnumType.values().length; i++) {
			
			registerRender(planks, i, "planks_" + CustomPlank.EnumType.values()[i].getName());
			
		}
		
		for(int i = 0; i < CustomLog.EnumType.values().length; i++) {
			
			registerRender(log, i, "log_" + CustomLog.EnumType.values()[i].getName());
			
		}
		
	}
	
	public static void registerBlock(Block block) {
		
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock) {
		
		ForgeRegistries.BLOCKS.register(block);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

	}
	
	public static void registerBlockWithVariants(Block block, ItemBlock itemblock) {
		
		ForgeRegistries.BLOCKS.register(block);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

	}
	
	public static void registerRender(Block block, int meta, String filename) {
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), "inventory"));
		
	}

}
