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
    public static final String VERSION = "1.9-2016-10-20";
    public static final CreativeTabs TAB_EXAMPLE = new ExampleTab(CreativeTabs.getNextID(), ExampleMod.MODID);
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK    >> "+Blocks.DIRT.getUnlocalizedName());
        System.out.println("CACTUS        >> "+Blocks.CACTUS.getUnlocalizedName());
        System.out.println("DIAMOND BLOCK >> "+Blocks.DIAMOND_BLOCK.getUnlocalizedName());
        System.out.println("BEACON BLOCK  >> "+Blocks.BEACON.getUnlocalizedName());
        System.out.println("CLAY BLOCK    >> "+Blocks.CLAY.getUnlocalizedName());
        System.out.println("ANVIL BLOCK   >> "+Blocks.ANVIL.getUnlocalizedName());
        System.out.println("BEDROCK BLOCK >> "+Blocks.BEDROCK.getUnlocalizedName());        
        System.out.println("AIR BLOCK     >> "+Blocks.AIR.getUnlocalizedName());        
    }
}
