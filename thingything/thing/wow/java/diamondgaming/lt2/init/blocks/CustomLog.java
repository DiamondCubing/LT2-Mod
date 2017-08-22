package diamondgaming.lt2.init.blocks;

import diamondgaming.lt2.util.IMetaName;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class CustomLog extends BlockRotatedPillar implements IMetaName {

	public static final PropertyEnum<CustomLog.EnumType> VARIANT = PropertyEnum.<CustomLog.EnumType>create("variant", CustomLog.EnumType.class);
	
	public CustomLog(String name) {
		
		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, CustomLog.EnumType.CHERRY).withProperty(AXIS, EnumFacing.Axis.Y));
		
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		
		return ((CustomLog.EnumType)state.getValue(VARIANT)).getMeta();
		
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		
		for(CustomLog.EnumType customplank$enumtype : CustomLog.EnumType.values()) {
			
			items.add(new ItemStack(this, 1, customplank$enumtype.getMeta()));
			
		}
		
	}
	
	public IBlockState getStateFromMeta(int meta) {
		
		return this.getDefaultState().withProperty(VARIANT, CustomLog.EnumType.byMetadata(meta));
		
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		
		return ((CustomLog.EnumType)state.getValue(VARIANT)).getMeta();
		
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
		
	}
	
	@Override
	protected BlockStateContainer createBlockState() {

		return new BlockStateContainer(this, new IProperty[] {VARIANT});
		
	}
	
	public static enum EnumType implements IStringSerializable {
		
		CHERRY(0, "cherry"),
		ELM(1, "elm"),
		LAVA(2, "lava"),
		WALNUT(3, "walnut"),
		FIR(4, "fir"),
		PINE(5, "pine"),
		GOLD(6, "gold"),
		ZOMBIE(7, "zombie"),
		PALM(8, "palm"),
		CAVECRAWLER(9, "cavecrawler"),
		SPOOK(10, "spook"),
		SINISTER(11, "sinister"),
		END_TIMES(12, "end_times"),
		SNOWGLOW(13, "snowglow");
		
		private static final CustomLog.EnumType[] META_LOOKUP = new CustomLog.EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name) {
			
			this(meta, name, name);
			
		}
		
		private EnumType(int meta, String name, String unlocalizedName) {
			
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
			
		}

		@Override
		public String getName() {

			return this.name;
			
		}
		
		public int getMeta() {
			
			return this.meta;
			
		}
		
		public String getUnlocalizedName() {
			
			return this.unlocalizedName;
			
		}
		
		public String toString() {
			
			return this.name;
			
		}
		
		public static CustomLog.EnumType byMetadata(int meta) {
			
			return META_LOOKUP[meta];
			
		}
		
		static {
			
			for(CustomLog.EnumType customplank$enumtype : values()) {
				
				META_LOOKUP[customplank$enumtype.getMeta()] = customplank$enumtype;
				
			}
			
		}
		
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		
		return CustomLog.EnumType.values()[stack.getItemDamage()].getName();
		
	}
}