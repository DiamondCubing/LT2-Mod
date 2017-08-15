package diamondgaming.lt2.init;

import diamondgaming.lt2.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {
	
	public static Item sapling_cherry;
	
	public static void init() {
		
		
		
	}
	
	public static void register() {
		

		
	}
	
	public static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, 
				new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}

}
