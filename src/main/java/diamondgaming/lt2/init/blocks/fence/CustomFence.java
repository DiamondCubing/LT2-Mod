package diamondgaming.lt2.init.blocks.fence;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class CustomFence extends BlockFence {

	public CustomFence(String name, float hardness, float resistance) {
		
		super(Material.WOOD, Material.WOOD.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(resistance);
		setHardness(hardness);
		this.useNeighborBrightness = true;
		
	}

}
