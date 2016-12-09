    package com.example.examplemod;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ExampleTab extends CreativeTabs {

	public ExampleTab(int id, String name) {
		super(id, name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return I18n.format("creativeTabs.examplemod.testtab.title", new Object[0]);
	};

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		return new ItemStack(Items.APPLE, 1, 0);
	}

	@Override
    @SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return ItemStack.EMPTY;
	}
}
