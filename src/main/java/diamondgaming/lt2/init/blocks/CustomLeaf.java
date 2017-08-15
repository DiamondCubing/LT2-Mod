package diamondgaming.lt2.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class CustomLeaf extends Block {

	public CustomLeaf(String name, float hardness, float resistance) {
		
		super(Material.LEAVES);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		
		return false;
		
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		
		return BlockRenderLayer.TRANSLUCENT;
		
	}

}
