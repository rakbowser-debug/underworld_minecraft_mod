package net.mcreator.underworld.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.underworld.entity.VampireCoreEntity;
import net.mcreator.underworld.client.model.ModelShade_of_VampireCore;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VampireCoreRenderer extends EntityRenderer<VampireCoreEntity> {
	private static final ResourceLocation texture = ResourceLocation.parse("underworld:textures/entities/cryingobsidian.png");
	private final ModelShade_of_VampireCore model;

	public VampireCoreRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelShade_of_VampireCore(context.bakeLayer(ModelShade_of_VampireCore.LAYER_LOCATION));
	}

	@Override
	public void render(VampireCoreEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(VampireCoreEntity entity) {
		return texture;
	}
}