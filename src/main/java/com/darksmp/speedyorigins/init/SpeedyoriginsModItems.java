
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyorigins.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.speedyorigins.SpeedyoriginsMod;

public class SpeedyoriginsModItems {
	public static Item SPEEDY_LOGO;

	public static void load() {
		SPEEDY_LOGO = Registry.register(Registry.ITEM, new ResourceLocation(SpeedyoriginsMod.MODID, "speedy_logo"),
				new BlockItem(SpeedyoriginsModBlocks.SPEEDY_LOGO, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
	}
}
