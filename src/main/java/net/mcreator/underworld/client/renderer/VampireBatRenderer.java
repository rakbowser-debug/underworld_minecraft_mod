package net.mcreator.underworld.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.underworld.entity.VampireBatEntity;
import net.mcreator.underworld.client.model.ModelVampire_bat;
import net.mcreator.underworld.client.model.ModelVampire_Humanoid_Entity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VampireBatRenderer extends MobRenderer<VampireBatEntity, ModelVampire_bat<VampireBatEntity>> {
	public VampireBatRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVampire_bat<VampireBatEntity>(context.bakeLayer(ModelVampire_bat.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<VampireBatEntity, ModelVampire_bat<VampireBatEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("underworld:textures/entities/vampire_humanoid.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, VampireBatEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new ModelVampire_Humanoid_Entity(Minecraft.getInstance().getEntityModels().bakeLayer(ModelVampire_Humanoid_Entity.LAYER_LOCATION));
				this.getParentModel().copyPropertiesTo(model);
				model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
				model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(VampireBatEntity entity) {
		return ResourceLocation.parse("underworld:textures/entities/vampire_bat.png");
	}
}