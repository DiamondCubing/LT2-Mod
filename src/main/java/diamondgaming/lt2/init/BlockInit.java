package diamondgaming.lt2.init;

import diamondgaming.lt2.init.blocks.CustomLeaf;
import diamondgaming.lt2.init.blocks.CustomLog;
import diamondgaming.lt2.init.blocks.CustomPlank;
import diamondgaming.lt2.init.blocks.CustomStairs;
import diamondgaming.lt2.init.blocks.CustomTile;
import diamondgaming.lt2.init.blocks.activators.CustomButton;
import diamondgaming.lt2.init.blocks.activators.CustomPressurePlate;
import diamondgaming.lt2.init.blocks.fence.CustomFence;
import diamondgaming.lt2.init.blocks.fence.CustomFenceGate;
import diamondgaming.lt2.init.blocks.slab.CustomDoubleSlab;
import diamondgaming.lt2.init.blocks.slab.CustomHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit {
	
	//Waiting for door help
	public static Block log_cherry, planks_cherry, fence_cherry, fence_gate_cherry, leaves_cherry, plate_cherry, button_cherry, tile_cherry, door_cherry, stair_cherry;
	public static CustomHalfSlab slab_cherry;
	public static CustomDoubleSlab double_slab_cherry;
	
	
	public static void init() {
		
		log_cherry = new CustomLog("log_cherry", 2.0F, 10.0F);
		planks_cherry = new CustomPlank("planks_cherry", 2.0F, 15.0F);
		fence_cherry = new CustomFence("fence_cherry", 2.0F, 15.0F);
		fence_gate_cherry = new CustomFenceGate("fence_gate_cherry", 2.0F, 15.0F);
		leaves_cherry = new CustomLeaf("leaves_cherry", 0.2F, 1.0F);
		plate_cherry = new CustomPressurePlate("plate_cherry", 0.5F, 2.5F);
		button_cherry = new CustomButton("button_cherry", 0.5F, 2.5F);
		tile_cherry = new CustomTile("tile_cherry", 0.5F, 2.5F);
//		door_cherry = new CustomDoor("door_cherry_block", 3.0F, 15.0F);
		stair_cherry = new CustomStairs("stair_cherry", planks_cherry.getDefaultState());
		slab_cherry = new CustomHalfSlab("slab_cherry");
		double_slab_cherry = new CustomDoubleSlab("double_slab_cherry");
		
	}
	
	public static void register() {
		
		registerBlock(log_cherry);
		registerBlock(planks_cherry);
		registerBlock(fence_cherry);
		registerBlock(fence_gate_cherry);
		registerBlock(leaves_cherry);
		registerBlock(plate_cherry);
		registerBlock(button_cherry);
		registerBlock(tile_cherry);
//		registerBlock(door_cherry);
		registerBlock(stair_cherry);
		registerBlock(slab_cherry, new ItemSlab(slab_cherry, slab_cherry, double_slab_cherry));
		
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
	

}
