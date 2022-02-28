package com.moomallowz.sinker.core.event;

import com.moomallowz.sinker.Sinker;
import com.moomallowz.sinker.core.init.EntityReg;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Sinker.MODID, bus = Bus.FORGE)
public class CommonForgeEvents {
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	
	public static void biomeLoading(BiomeLoadingEvent event) {
		
		if (event.getCategory() == BiomeCategory.PLAINS || event.getCategory() == BiomeCategory.EXTREME_HILLS || event.getCategory() == BiomeCategory.FOREST || event.getCategory() == BiomeCategory.RIVER || event.getCategory() == BiomeCategory.SWAMP || event.getCategory() == BiomeCategory.MUSHROOM || event.getCategory() == BiomeCategory.JUNGLE) {
			event.getSpawns().addSpawn(MobCategory.AMBIENT, new SpawnerData(EntityReg.WORM.get(), 6, 1, 3));
		}
	}
}
