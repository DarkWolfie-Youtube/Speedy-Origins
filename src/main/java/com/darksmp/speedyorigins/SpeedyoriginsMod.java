/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package com.darksmp.speedyorigins;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import com.darksmp.speedyorigins.init.SpeedyoriginsModSounds;
import com.darksmp.speedyorigins.init.SpeedyoriginsModProcedures;
import com.darksmp.speedyorigins.init.SpeedyoriginsModPaintings;
import com.darksmp.speedyorigins.init.SpeedyoriginsModItems;
import com.darksmp.speedyorigins.init.SpeedyoriginsModBlocks;

public class SpeedyoriginsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "speedyorigins";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing SpeedyoriginsMod");

		SpeedyoriginsModBlocks.load();
		SpeedyoriginsModItems.load();

		SpeedyoriginsModPaintings.load();
		SpeedyoriginsModProcedures.load();

		SpeedyoriginsModSounds.load();

	}
}
