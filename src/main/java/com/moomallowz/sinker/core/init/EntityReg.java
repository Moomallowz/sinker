package com.moomallowz.sinker.core.init;

import com.moomallowz.sinker.Sinker;
import com.moomallowz.sinker.common.entity.WormEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityReg {
	private EntityReg() {}
	
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Sinker.MODID);

	public static final RegistryObject<EntityType<WormEntity>> WORM = ENTITIES.register("worm", () -> EntityType.Builder.of(WormEntity::new, MobCategory.CREATURE).sized(0.5f, 0.5f).build(new ResourceLocation(Sinker.MODID, "worm").toString()));
}
