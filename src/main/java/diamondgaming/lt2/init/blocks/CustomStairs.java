package diamondgaming.lt2.init.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class CustomStairs extends BlockStairs {

	public CustomStairs(String name, IBlockState modelState) {
		
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;

	}

}
