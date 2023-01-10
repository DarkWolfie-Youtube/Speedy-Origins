
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyorigins.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import com.darksmp.speedyorigins.SpeedyoriginsMod;

public class SpeedyoriginsModPaintings {
	public static void load() {
		Registry.register(Registry.PAINTING_VARIANT, new ResourceLocation(SpeedyoriginsMod.MODID, "speedy_banner"), new PaintingVariant(32, 16));
	}
}
