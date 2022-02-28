package com.moomallowz.sinker.client.event;

import com.moomallowz.sinker.Sinker;
import com.moomallowz.sinker.client.renderer.WormEntityRenderer;
import com.moomallowz.sinker.client.renderer.model.WormEntityModel;
import com.moomallowz.sinker.core.init.EntityReg;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Sinker.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {
	
	private ClientModEvents() {}
		
	@SubscribeEvent
	public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {	
		event.registerLayerDefinition(WormEntityModel.LAYER_LOCATION, WormEntityModel::createBodyLayer);
	}
	
	@SubscribeEvent
	public static void registerRenders(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EntityReg.WORM.get(), WormEntityRenderer::new);
	}
}
