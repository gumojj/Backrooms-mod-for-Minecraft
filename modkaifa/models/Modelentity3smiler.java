// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelentity3smiler extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelentity3smiler() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(4, 2).addBox(-7.0F, -11.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 0).addBox(-6.0F, -9.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 8).addBox(-5.0F, -7.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 16).addBox(-4.0F, -6.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(15, 9).addBox(-3.0F, -5.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(4, 15).addBox(-2.0F, -5.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(15, 3).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(12, 13).addBox(0.0F, -5.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 13).addBox(1.0F, -5.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 12).addBox(2.0F, -5.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(12, 0).addBox(4.0F, -6.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(4, 11).addBox(5.0F, -7.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(7, 7).addBox(6.0F, -9.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 2).addBox(7.0F, -11.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(11, 9).addBox(3.0F, -6.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(11, 7).addBox(3.0F, -9.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 5).addBox(3.0F, -8.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(15, 16).addBox(-3.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 13).addBox(-2.0F, -10.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(16, 0).addBox(-4.0F, -10.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}