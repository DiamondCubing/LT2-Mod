package diamondgaming.lt2.init.blocks.activators;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.BlockPressurePlate.Sensitivity;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomPressurePlate extends BlockPressurePlate {
	
	public CustomPressurePlate(String name, float hardness, float resistance) {
		
		super(Material.WOOD, Sensitivity.MOBS);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		
	}
	
	@Override
	protected void playClickOnSound(World worldIn, BlockPos pos) {
		
		worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_WOOD_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 1.0F, 1.0F);
		
	}
	
	@Override
	protected void playClickOffSound(World worldIn, BlockPos pos) {

		worldIn.playSound((EntityPlayer)null, pos, SoundEvents.BLOCK_WOOD_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
		
	}

}
