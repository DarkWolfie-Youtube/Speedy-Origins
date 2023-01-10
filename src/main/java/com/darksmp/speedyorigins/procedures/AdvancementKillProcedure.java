package com.darksmp.speedyorigins.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

import com.darksmp.speedyorigins.SpeedyoriginsMod;

public class AdvancementKillProcedure {
	public AdvancementKillProcedure() {
		ServerLivingEntityEvents.ALLOW_DEATH.register((entity, damageSource, amount) -> {
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("entity", entity);
			dependencies.put("x", entity.getX());
			dependencies.put("y", entity.getY());
			dependencies.put("z", entity.getZ());
			dependencies.put("world", entity.level);
			dependencies.put("sourceentity", damageSource.getEntity());
			execute(dependencies);
			return true;
		});
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SpeedyoriginsMod.LOGGER.warn("Failed to load dependency entity for procedure AdvancementKill!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SpeedyoriginsMod.LOGGER.warn("Failed to load dependency sourceentity for procedure AdvancementKill!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof Player) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("a zombie"), (false));
				if (entity instanceof LivingEntity _livEnt ? _livEnt.isBaby() : false) {
					if (sourceentity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("speedyorigins:killachild"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
			} else {
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Not a zombie"), (false));
			}
		}
	}
}
