
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.backrooms.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.backrooms.client.renderer.XincunzheRenderer;
import net.mcreator.backrooms.client.renderer.Entity9wumianlinRenderer;
import net.mcreator.backrooms.client.renderer.Entity8liequanRenderer;
import net.mcreator.backrooms.client.renderer.Entity3smilerRenderer;
import net.mcreator.backrooms.client.renderer.Entity15beishiRenderer;
import net.mcreator.backrooms.client.renderer.Entity10qiepizheRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BackroomsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BackroomsModEntities.ENTITY_3SMILER.get(), Entity3smilerRenderer::new);
		event.registerEntityRenderer(BackroomsModEntities.ENTITY_15BEISHI.get(), Entity15beishiRenderer::new);
		event.registerEntityRenderer(BackroomsModEntities.ENTITY_8LIEQUAN.get(), Entity8liequanRenderer::new);
		event.registerEntityRenderer(BackroomsModEntities.ENTITY_10QIEPIZHE.get(), Entity10qiepizheRenderer::new);
		event.registerEntityRenderer(BackroomsModEntities.ENTITY_9WUMIANLIN.get(), Entity9wumianlinRenderer::new);
		event.registerEntityRenderer(BackroomsModEntities.XINCUNZHE.get(), XincunzheRenderer::new);
	}
}
