// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelVampire_Humanoid_Entity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "vampire_humanoid_entity"), "main");
	private final ModelPart alex;
	private final ModelPart Wing_bone;

	public ModelVampire_Humanoid_Entity(ModelPart root) {
		this.alex = root.getChild("alex");
		this.Wing_bone = this.alex.getChild("Wing_bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition alex = partdefinition.addOrReplaceChild("alex",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -23.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(-4.0F, -15.5F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(-7.0F, -15.5F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(4.0F, -15.5F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(0.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 48)
						.addBox(-4.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 94)
						.addBox(-4.5F, -24.0F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(69, 80)
						.addBox(-4.0F, -16.03F, -2.51F, 8.0F, 13.01F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.5F, -16.0F, -2.5F, 4.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(33, 46)
						.addBox(3.5F, -16.0F, -2.5F, 4.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.5F, -4.0F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -4.0F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-8.0F, 16.0F, 8.0F));

		PartDefinition Wing_bone = alex.addOrReplaceChild("Wing_bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightwing_fabric_r1 = Wing_bone.addOrReplaceChild("rightwing_fabric_r1",
				CubeListBuilder.create().texOffs(0, 106).addBox(-9.0F, -2.0F, 4.0F, 14.0F, 20.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -14.0F, -2.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition leftwing_fabric_r1 = Wing_bone.addOrReplaceChild("leftwing_fabric_r1",
				CubeListBuilder.create().texOffs(0, 106).addBox(-5.0F, -2.0F, 4.0F, 14.0F, 20.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -14.0F, -2.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		alex.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}