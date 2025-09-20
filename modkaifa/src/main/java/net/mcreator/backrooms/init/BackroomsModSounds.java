
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.backrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.backrooms.BackroomsMod;

public class BackroomsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BackroomsMod.MODID);
	public static final RegistryObject<SoundEvent> O = REGISTRY.register("o", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "o")));
	public static final RegistryObject<SoundEvent> RABBITD = REGISTRY.register("rabbitd", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "rabbitd")));
	public static final RegistryObject<SoundEvent> RUN = REGISTRY.register("run", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "run")));
	public static final RegistryObject<SoundEvent> COSK = REGISTRY.register("cosk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "cosk")));
	public static final RegistryObject<SoundEvent> US = REGISTRY.register("us", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "us")));
	public static final RegistryObject<SoundEvent> BACKROOMSMUSIC = REGISTRY.register("backroomsmusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "backroomsmusic")));
	public static final RegistryObject<SoundEvent> SIX_FORTY_SEVEN = REGISTRY.register("six_forty_seven", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "six_forty_seven")));
	public static final RegistryObject<SoundEvent> IKUNGOLDSONG = REGISTRY.register("ikungoldsong", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "ikungoldsong")));
	public static final RegistryObject<SoundEvent> HEYKIDS = REGISTRY.register("heykids", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("backrooms", "heykids")));
}
