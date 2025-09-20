
package net.mcreator.backrooms.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.backrooms.entity.XincunzheEntity;

public class XincunzheRenderer extends HumanoidMobRenderer<XincunzheEntity, HumanoidModel<XincunzheEntity>> {
	public XincunzheRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<XincunzheEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(XincunzheEntity entity) {
		return new ResourceLocation("backrooms:textures/entities/xincunzhe.png");
	}
}
