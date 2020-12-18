package net.GargatheOro.NSDungeons.Core;

import net.GargatheOro.NSDungeons.Core.ProxyHandlers.CommonProxy;
import net.GargatheOro.NSDungeons.Tabs.CoreTab;
import net.GargatheOro.NSDungeons.Tabs.GearTab;
import net.GargatheOro.NSDungeons.Tabs.MobsTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	public static final CreativeTabs CORE = new CoreTab("tabCore");
	public static final CreativeTabs GEAR = new GearTab("tabGear");
	public static final CreativeTabs MOBS = new MobsTab("tabMobs");
	
	@SidedProxy(clientSide = Main.CLIENTPROXY, serverSide = Main.COMMONPROXY)
	public static CommonProxy proxy;
	
	public static final String MODID = "nsdungeons";
	public static final String NAME = "NS Dungeons Core Mod";
	public static final String VERSION = "0.1.0000";
	public static final String COMMONPROXY = "net.GargatheOro.NSDungeons.Core.ProxyHandlers.CommonProxy";
	public static final String CLIENTPROXY = "net.GargatheOro.NSDungeons.Core.ProxyHandlers.ClientProxy";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}