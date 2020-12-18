package net.GargatheOro.NSDungeons.Blocks;

import java.util.ArrayList;
import java.util.List;

import net.GargatheOro.NSDungeons.Core.Main;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//ITEM INITIALIZATION
	public static final Block CASTLE_BRICKS = new BlockBase("bricks_castle", Material.ROCK ,Main.CORE, SoundType.STONE, "pickaxe", 2);
}