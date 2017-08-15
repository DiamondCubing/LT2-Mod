package diamondgaming.lt2.init.blocks.activators;

import net.minecraft.block.BlockButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomButton extends BlockButton {
	
	public CustomButton(String name, float hardness, float resistance) {
		
		super(false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		
	}
	
	@Override
	protected void playClickSound(EntityPlayer player, World worldIn, BlockPos pos) {
		
		worldIn.playSound(player, pos, SoundEvents.BLOCK_WOOD_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 1.0F, 1.0F);
		
	}
	
	@Override
	protected void playReleaseSound(World worldIn, BlockPos pos) {

		worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_WOOD_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
		
	}

}
