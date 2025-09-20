
package net.mcreator.backrooms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.backrooms.entity.Entity15beishiEntity;

public class Entity15beishiRenderer extends HumanoidMobRenderer<Entity15beishiEntity, HumanoidModel<Entity15beishiEntity>> {
	public Entity15beishiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Entity15beishiEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Entity15beishiEntity entity) {
		return new ResourceLocation("backrooms:textures/entities/beishi.png");
	}
}
