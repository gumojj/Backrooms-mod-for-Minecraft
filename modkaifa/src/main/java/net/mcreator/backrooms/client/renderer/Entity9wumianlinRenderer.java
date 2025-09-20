
package net.mcreator.backrooms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.backrooms.entity.Entity9wumianlinEntity;

public class Entity9wumianlinRenderer extends HumanoidMobRenderer<Entity9wumianlinEntity, HumanoidModel<Entity9wumianlinEntity>> {
	public Entity9wumianlinRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<Entity9wumianlinEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(Entity9wumianlinEntity entity) {
		return new ResourceLocation("backrooms:textures/entities/wumianling.png");
	}
}
