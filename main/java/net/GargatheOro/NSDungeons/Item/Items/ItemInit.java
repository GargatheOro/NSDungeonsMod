package net.GargatheOro.NSDungeons.Item.Items;

import java.util.ArrayList;
import java.util.List;

import net.GargatheOro.NSDungeons.Core.Main;
import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//ITEM INITIALIZATION
	public static final Item GOLD_COIN = new ItemBase("coin_gold", Main.CORE);
	public static final Item SILVER_COIN = new ItemBase("coin_silver", Main.CORE);
	public static final Item COPPER_COIN = new ItemBase("coin_copper", Main.CORE);
}