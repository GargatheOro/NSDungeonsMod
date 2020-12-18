package net.GargatheOro.NSDungeons.Item.Items;

import net.GargatheOro.NSDungeons.Core.IHasModel;
import net.GargatheOro.NSDungeons.Core.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerModel(this, 0);
	}
}