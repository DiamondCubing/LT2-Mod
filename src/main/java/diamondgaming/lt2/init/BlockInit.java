package diamondgaming.lt2.init;

import diamondgaming.lt2.init.blocks.CustomBlock;
import diamondgaming.lt2.init.blocks.CustomLog;
import diamondgaming.lt2.init.blocks.CustomPlank;
import diamondgaming.lt2.init.blocks.fence.CustomFence;
import diamondgaming.lt2.init.blocks.fence.CustomFenceGate;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit {
	
	//No doors yet
	public static Block log_cherry, planks_cherry, fence_cherry, fence_gate_cherry, leaves_cherry;
	
	public static void init() {
		
		log_cherry = new CustomLog("log_cherry", 2.0F, 10.0F);
		planks_cherry = new CustomPlank("planks_cherry", 2.0F, 15.0F);
		fence_cherry = new CustomFence("fence_cherry", 2.0F, 15.0F);
		fence_gate_cherry = new CustomFenceGate("fence_gate_cherry", 2.0F, 15.0F);
		leaves_cherry = new CustomBlock("leaves_cherry", 0.2F, 1.0F);
		
	}
	
	public static void register() {
		
		registerBlock(log_cherry);
		registerBlock(planks_cherry);
		registerBlock(fence_cherry);
		registerBlock(fence_gate_cherry);
		registerBlock(leaves_cherry);
		
	}
	
	public static void registerBlock(Block block) {
		
		ForgeRegistries.BLOCKS.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		//
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
	

}
