
package net.mcreator.backrooms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.backrooms.entity.Entity3smilerEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Entity3smilerRenderer extends HumanoidMobRenderer<Entity3smilerEntity, HumanoidModel<Entity3smilerEntity>> {
	public Entity3smilerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Entity3smilerEntity>(context.bakeLayer(ModelLayers.PLAYER)), 1f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<Entity3smilerEntity, HumanoidModel<Entity3smilerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("backrooms:textures/entities/entity3smiler810.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, Entity3smilerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(Entity3smilerEntity entity) {
		return new ResourceLocation("backrooms:textures/entities/entity3smiler810.png");
	}
}
