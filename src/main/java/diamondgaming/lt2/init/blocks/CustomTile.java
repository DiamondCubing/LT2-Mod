package diamondgaming.lt2.init.blocks;

import net.minecraft.block.BlockCarpet;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class CustomTile extends BlockCarpet {
	
public CustomTile(String name, float hardness, float resistance) {
		
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		
	}

	public boolean isOpaqueCube(IBlockState state)
	{
	    return false;
	}
	
	public boolean isFullCube(IBlockState state)
	{
	    return false;
	}

}
