
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyorigins.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.speedyorigins.block.SpeedyLogoBlock;
import com.darksmp.speedyorigins.SpeedyoriginsMod;

public class SpeedyoriginsModBlocks {
	public static Block SPEEDY_LOGO;

	public static void load() {
		SPEEDY_LOGO = Registry.register(Registry.BLOCK, new ResourceLocation(SpeedyoriginsMod.MODID, "speedy_logo"), new SpeedyLogoBlock());
	}

	public static void clientLoad() {
		SpeedyLogoBlock.clientInit();
	}
}
