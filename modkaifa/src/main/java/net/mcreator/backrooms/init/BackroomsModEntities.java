
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.backrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.backrooms.entity.XincunzheEntity;
import net.mcreator.backrooms.entity.Entity9wumianlinEntity;
import net.mcreator.backrooms.entity.Entity8liequanEntity;
import net.mcreator.backrooms.entity.Entity3smilerEntity;
import net.mcreator.backrooms.entity.Entity15beishiEntity;
import net.mcreator.backrooms.entity.Entity10qiepizheEntity;
import net.mcreator.backrooms.BackroomsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BackroomsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BackroomsMod.MODID);
	public static final RegistryObject<EntityType<Entity3smilerEntity>> ENTITY_3SMILER = register("entity_3smiler",
			EntityType.Builder.<Entity3smilerEntity>of(Entity3smilerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Entity3smilerEntity::new)

					.sized(1f, 0.9f));
	public static final RegistryObject<EntityType<Entity15beishiEntity>> ENTITY_15BEISHI = register("entity_15beishi",
			EntityType.Builder.<Entity15beishiEntity>of(Entity15beishiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Entity15beishiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Entity8liequanEntity>> ENTITY_8LIEQUAN = register("entity_8liequan",
			EntityType.Builder.<Entity8liequanEntity>of(Entity8liequanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Entity8liequanEntity::new)

					.sized(0.8f, 0.9f));
	public static final RegistryObject<EntityType<Entity10qiepizheEntity>> ENTITY_10QIEPIZHE = register("entity_10qiepizhe",
			EntityType.Builder.<Entity10qiepizheEntity>of(Entity10qiepizheEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Entity10qiepizheEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Entity9wumianlinEntity>> ENTITY_9WUMIANLIN = register("entity_9wumianlin",
			EntityType.Builder.<Entity9wumianlinEntity>of(Entity9wumianlinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Entity9wumianlinEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<XincunzheEntity>> XINCUNZHE = register("xincunzhe",
			EntityType.Builder.<XincunzheEntity>of(XincunzheEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(XincunzheEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Entity3smilerEntity.init();
			Entity15beishiEntity.init();
			Entity8liequanEntity.init();
			Entity10qiepizheEntity.init();
			Entity9wumianlinEntity.init();
			XincunzheEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENTITY_3SMILER.get(), Entity3smilerEntity.createAttributes().build());
		event.put(ENTITY_15BEISHI.get(), Entity15beishiEntity.createAttributes().build());
		event.put(ENTITY_8LIEQUAN.get(), Entity8liequanEntity.createAttributes().build());
		event.put(ENTITY_10QIEPIZHE.get(), Entity10qiepizheEntity.createAttributes().build());
		event.put(ENTITY_9WUMIANLIN.get(), Entity9wumianlinEntity.createAttributes().build());
		event.put(XINCUNZHE.get(), XincunzheEntity.createAttributes().build());
	}
}
