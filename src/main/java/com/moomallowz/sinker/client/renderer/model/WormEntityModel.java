package com.moomallowz.sinker.client.renderer.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.moomallowz.sinker.Sinker;
import com.moomallowz.sinker.common.entity.WormEntity;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class WormEntityModel<Type extends WormEntity> extends EntityModel<Type> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Sinker.MODID, "worm"), "main");
	private final ModelPart tail;
	private final ModelPart middle;
	private final ModelPart head;

	public WormEntityModel(ModelPart root) {
		this.tail = root.getChild("tail");
		this.middle = root.getChild("middle");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		partdefinition.addOrReplaceChild("middle", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.002F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(8, 2).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        if (entity.isAlive()) {
            this.tail.z = Mth.sin(limbSwing * 1.5F) * 2.0F * limbSwingAmount - 0.5F;
            this.middle.y = Mth.sin(limbSwing * 1.5F) * 2.0F * limbSwingAmount + 23.5F;
            this.head.z = Mth.sin(limbSwing * -1.5F) * 2.0F * limbSwingAmount + 0.5F;
        }
    }

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.tail.render(poseStack, buffer, packedLight, packedOverlay);
		this.middle.render(poseStack, buffer, packedLight, packedOverlay);
		this.head.render(poseStack, buffer, packedLight, packedOverlay);
	}
}