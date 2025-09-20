
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.backrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.backrooms.BackroomsMod;

public class BackroomsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, BackroomsMod.MODID);
	public static final RegistryObject<PaintingVariant> LEVEL_0FIRSTPICTURE = REGISTRY.register("level_0firstpicture", () -> new PaintingVariant(64, 48));
	public static final RegistryObject<PaintingVariant> LEVEL_1FIRSTPICTURE = REGISTRY.register("level_1firstpicture", () -> new PaintingVariant(800, 600));
}
