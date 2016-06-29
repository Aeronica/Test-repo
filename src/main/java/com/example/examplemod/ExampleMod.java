package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.8-2016-06-29";
    public static final CreativeTabs TAB_EXAMPLE = new ExampleTab(CreativeTabs.getNextID(), ExampleMod.MODID);
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK    >> "+Blocks.dirt.getUnlocalizedName());
        System.out.println("CACTUS        >> "+Blocks.cactus.getUnlocalizedName());
        System.out.println("DIAMOND BLOCK >> "+Blocks.diamond_block.getUnlocalizedName());
    }
}
