
package net.mcreator.backrooms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.backrooms.entity.Entity10qiepizheEntity;

public class Entity10qiepizheRenderer extends HumanoidMobRenderer<Entity10qiepizheEntity, HumanoidModel<Entity10qiepizheEntity>> {
	public Entity10qiepizheRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Entity10qiepizheEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Entity10qiepizheEntity entity) {
		return new ResourceLocation("backrooms:textures/entities/entity10qiepizhe1.png");
	}
}
