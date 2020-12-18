package net.GargatheOro.NSDungeons.Tabs;

import net.GargatheOro.NSDungeons.Item.Items.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GearTab extends CreativeTabs {

	public GearTab(String label) {
		super("tabCore");
		this.setBackgroundImageName("dungeontab.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.SILVER_COIN);
	}
}