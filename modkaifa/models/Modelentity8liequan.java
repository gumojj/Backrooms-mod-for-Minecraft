// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelentity8liequan extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer fair;
	private final ModelRenderer afair;
	private final ModelRenderer afair2;
	private final ModelRenderer afair3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelentity8liequan() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(22, 26).addBox(-4.0F, -16.0F, -9.0F, 8.0F, 7.0F, 7.0F, 0.0F, false);

		fair = new ModelRenderer(this);
		fair.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(fair);
		fair.setTextureOffset(0, 24).addBox(-5.0F, -17.0F, -10.0F, 10.0F, 0.0F, 9.0F, 0.0F, false);
		fair.setTextureOffset(29, 24).addBox(-5.0F, -17.0F, -1.0F, 10.0F, 2.0F, 0.0F, 0.0F, false);

		afair = new ModelRenderer(this);
		afair.setRotationPoint(0.0F, 0.0F, 0.0F);
		fair.addChild(afair);
		afair.setTextureOffset(48, 0).addBox(4.0F, -17.0F, -10.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(48, 0).addBox(4.0F, -15.0F, -1.0F, 1.0F, 6.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(4, 42).addBox(2.0F, -17.0F, -10.0F, 1.0F, 12.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(2, 42).addBox(-4.0F, -17.0F, -10.0F, 1.0F, 12.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(28, 40).addBox(3.0F, -17.0F, -10.0F, 1.0F, 16.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(26, 40).addBox(-2.0F, -17.0F, -10.0F, 1.0F, 16.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(46, 40).addBox(0.0F, -17.0F, -10.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(48, 48).addBox(-3.0F, -17.0F, -10.0F, 1.0F, 8.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(6, 42).addBox(-5.0F, -17.0F, -10.0F, 1.0F, 11.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(42, 40).addBox(1.0F, -17.0F, -10.0F, 1.0F, 11.0F, 0.0F, 0.0F, false);
		afair.setTextureOffset(34, 40).addBox(-1.0F, -17.0F, -10.0F, 1.0F, 13.0F, 0.0F, 0.0F, false);

		afair2 = new ModelRenderer(this);
		afair2.setRotationPoint(-11.0F, 0.0F, -1.0F);
		fair.addChild(afair2);
		setRotationAngle(afair2, 0.0F, -1.5708F, 0.0F);
		afair2.setTextureOffset(46, 9).addBox(-1.0F, -17.0F, -16.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		afair2.setTextureOffset(0, 42).addBox(-3.0F, -17.0F, -16.0F, 1.0F, 12.0F, 0.0F, 0.0F, false);
		afair2.setTextureOffset(40, 40).addBox(-9.0F, -17.0F, -16.0F, 1.0F, 12.0F, 0.0F, 0.0F, false);
		afair2.setTextureOffset(24, 40).addBox(-2.0F, -17.0F, -16.0F, 1.0F, 16.0F, 0.0F, 0.0F, false);
		afair2.setTextureOffset(16, 0).addBox(-7.0F, -17.0F, -16.0F, 1.0F, 16.0F, 0.0F, 0.0F, false);
		afair2.setTextureOffset(46, 0).addBox(-5.0F, -17.0F, -16.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		afair2.setTextureOffset(48, 40).addBox(-8.0F, -17.0F, -16.0F, 1.0F, 8.0F, 0.0F, 0.0F, false);
		afair2.setTextureOffset(10, 42).addBox(-4.0F, -17.0F, -16.0F, 1.0F, 11.0F, 0.0F, 0.0F, false);
		afair2.setTextureOffset(32, 40).addBox(-6.0F, -17.0F, -16.0F, 1.0F, 13.0F, 0.0F, 0.0F, false);

		afair3 = new ModelRenderer(this);
		afair3.setRotationPoint(-21.0F, 0.0F, -1.0F);
		fair.addChild(afair3);
		setRotationAngle(afair3, 0.0F, -1.5708F, 0.0F);
		afair3.setTextureOffset(44, 40).addBox(-1.0F, -17.0F, -16.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		afair3.setTextureOffset(38, 40).addBox(-3.0F, -17.0F, -16.0F, 1.0F, 12.0F, 0.0F, 0.0F, false);
		afair3.setTextureOffset(36, 40).addBox(-9.0F, -17.0F, -16.0F, 1.0F, 12.0F, 0.0F, 0.0F, false);
		afair3.setTextureOffset(14, 0).addBox(-2.0F, -17.0F, -16.0F, 1.0F, 16.0F, 0.0F, 0.0F, false);
		afair3.setTextureOffset(12, 0).addBox(-7.0F, -17.0F, -16.0F, 1.0F, 16.0F, 0.0F, 0.0F, false);
		afair3.setTextureOffset(0, 24).addBox(-5.0F, -17.0F, -16.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		afair3.setTextureOffset(48, 9).addBox(-8.0F, -17.0F, -16.0F, 1.0F, 8.0F, 0.0F, 0.0F, false);
		afair3.setTextureOffset(8, 42).addBox(-4.0F, -17.0F, -16.0F, 1.0F, 11.0F, 0.0F, 0.0F, false);
		afair3.setTextureOffset(30, 40).addBox(-6.0F, -17.0F, -16.0F, 1.0F, 13.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(21.0F, 0.0F, 1.0F);
		afair3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.setTextureOffset(48, 0).addBox(-18.0F, -15.0F, 21.0F, 1.0F, 6.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-4.0F, -15.0F, -2.0F, 8.0F, 6.0F, 18.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.0F, 15.0F, 1.0F);
		leftarm.setTextureOffset(12, 37).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 15.0F, 1.0F);
		rightarm.setTextureOffset(34, 0).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(4.0F, 15.0F, 13.0F);
		leftleg.setTextureOffset(0, 30).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-4.0F, 15.0F, 13.0F);
		rightleg.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}