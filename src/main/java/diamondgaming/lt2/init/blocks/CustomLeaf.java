package diamondgaming.lt2.init.blocks;

import net.minecraft.block.state.IBlockState;

public class CustomLeaf extends CustomBlock {

	public CustomLeaf(String name, float hardness, float resistance) {
		
		super(name, hardness, resistance);

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			
			return false;
			
		}
		
	}

}
