// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelentity10qiepizhe extends EntityModel<Entity> {
	private final ModelRenderer h;
	private final ModelRenderer b;
	private final ModelRenderer la;
	private final ModelRenderer ra;
	private final ModelRenderer ll;
	private final ModelRenderer rl;

	public Modelentity10qiepizhe() {
		textureWidth = 64;
		textureHeight = 64;

		h = new ModelRenderer(this);
		h.setRotationPoint(0.0F, 24.0F, 0.0F);
		h.setTextureOffset(0, 0).addBox(-4.0F, -32.0F, -1.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);

		b = new ModelRenderer(this);
		b.setRotationPoint(0.0F, 24.0F, 0.0F);
		b.setTextureOffset(0, 14).addBox(-4.0F, -24.0F, 0.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		la = new ModelRenderer(this);
		la.setRotationPoint(6.0F, 0.0F, 0.0F);
		la.setTextureOffset(20, 26).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		ra = new ModelRenderer(this);
		ra.setRotationPoint(-6.0F, 0.0F, 0.0F);
		ra.setTextureOffset(24, 10).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		ll = new ModelRenderer(this);
		ll.setRotationPoint(2.0F, 12.0F, 0.0F);
		ll.setTextureOffset(0, 30).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rl = new ModelRenderer(this);
		rl.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rl.setTextureOffset(36, 22).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		h.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		b.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		la.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		ra.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		ll.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rl.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.ll.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.la.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rl.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.ra.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}