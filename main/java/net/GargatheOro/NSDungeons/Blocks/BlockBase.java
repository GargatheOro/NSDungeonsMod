package net.GargatheOro.NSDungeons.Blocks;

import net.GargatheOro.NSDungeons.Core.IHasModel;
import net.GargatheOro.NSDungeons.Core.Main;
import net.GargatheOro.NSDungeons.Item.Items.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material, CreativeTabs tab, SoundType sound, String breaktool, int harvestlevel) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setSoundType(sound);
		setHardness(1.5F);
		setHarvestLevel(breaktool, harvestlevel);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}