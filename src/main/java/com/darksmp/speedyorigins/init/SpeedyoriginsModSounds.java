
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.darksmp.speedyorigins.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class SpeedyoriginsModSounds {
	public static SoundEvent SPEEDYLAUGH = new SoundEvent(new ResourceLocation("speedyorigins", "speedylaugh"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("speedyorigins", "speedylaugh"), SPEEDYLAUGH);
	}
}
