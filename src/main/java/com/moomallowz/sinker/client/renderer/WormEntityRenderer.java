package com.moomallowz.sinker.client.renderer;

import com.moomallowz.sinker.Sinker;
import com.moomallowz.sinker.client.renderer.model.WormEntityModel;
import com.moomallowz.sinker.common.entity.WormEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WormEntityRenderer<Type extends WormEntity> extends MobRenderer<Type, WormEntityModel<Type>> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(Sinker.MODID, "textures/entities/worm.png");

	public WormEntityRenderer(Context context) {
		super(context, new WormEntityModel<>(context.bakeLayer(WormEntityModel.LAYER_LOCATION)), 0.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		return TEXTURE;
	}

}
