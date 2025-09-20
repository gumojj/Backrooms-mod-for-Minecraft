
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.backrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.backrooms.BackroomsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BackroomsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BackroomsMod.MODID);
	public static final RegistryObject<CreativeModeTab> BACKROOMS = REGISTRY.register("backrooms",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.backrooms")).icon(() -> new ItemStack(BackroomsModBlocks.LEVEL_0QIANGZHI.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModBlocks.LEVEL_0QIANGZHI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0QIANGZHITIEDI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0DIBAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0TIANHUABAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0LIGHTS.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0O_2DITAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0O_2QIANGBI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_0O_2QIANGBITIEDI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1QIANGBI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1QIANGBIKAILIE.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1QIANGBITIEZHITOP.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1QIANGBITIEZHI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1QIANGBIWHITE.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1QIANGBIWHITEBROKEN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1QIANGBIWITHF.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1LIGHTS.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1SHUIGUANHUI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1SHUIGUAN_THUI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1SHUIGUANSHIZI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_1SHUIGUANZWHUI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_998QIANGBI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_998QIANGBITIEDI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_998SHYDIABAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_998SHYDIBAN_2.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_998SKYDIBAN_3.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_998TOLEVEL_999.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_14LEAVES.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_14TREEGAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_6QIANGBI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_2QIANGBI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_2DIBAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_2SHUIGUAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_2SHUIGUANZHUANWAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_2SHUIGUANSHIZI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_2SHUIGUANT.get().asItem());
				tabData.accept(BackroomsModBlocks.SUNLIGHTS.get().asItem());
				tabData.accept(BackroomsModBlocks.MIEHUOQI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_4QIANGBI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_4TIANHUABAN.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_4TIANHUABANWITHOUTLED.get().asItem());
				tabData.accept(BackroomsModBlocks.BANGONGYI.get().asItem());
				tabData.accept(BackroomsModBlocks.EXIT.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_3QIANGBIZHITIEDI.get().asItem());
				tabData.accept(BackroomsModBlocks.LEVEL_3DIBAN.get().asItem());
			}).build());
	public static final RegistryObject<CreativeModeTab> THE_BACKROOMSJIAFANGKUAI = REGISTRY.register("the_backroomsjiafangkuai",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.the_backroomsjiafangkuai")).icon(() -> new ItemStack(BackroomsModBlocks.JLEVEL_0QIANGZHITIEDI.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModBlocks.JLEVEL_0QIANGZHI.get().asItem());
				tabData.accept(BackroomsModBlocks.JLEVEL_0QIANGZHITIEDI.get().asItem());
				tabData.accept(BackroomsModBlocks.JLEVEL_0DIBAN.get().asItem());
				tabData.accept(BackroomsModBlocks.JLEVEL_1QIANGBI.get().asItem());
				tabData.accept(BackroomsModBlocks.JLEVEL_1QIANGBIWHITE.get().asItem());
			}).withTabsBefore(BACKROOMS.getId()).build());
	public static final RegistryObject<CreativeModeTab> COMMON_THING = REGISTRY.register("common_thing",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.common_thing")).icon(() -> new ItemStack(BackroomsModItems.RROUGUANTOU.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModItems.ONE_DOLLAR.get());
				tabData.accept(BackroomsModItems.XXIAOFANGFU.get());
				tabData.accept(BackroomsModItems.LVSHUGUANTOUKONG.get());
				tabData.accept(BackroomsModItems.ROUGUANTOUKONG.get());
				tabData.accept(BackroomsModItems.COLAEMPTY.get());
				tabData.accept(BackroomsModItems.GAOERFUQIUBANG.get());
				tabData.accept(BackroomsModItems.JINGGUN.get());
				tabData.accept(BackroomsModItems.ZHENGGUANEMPTY.get());
				tabData.accept(BackroomsModItems.LIANDAO.get());
				tabData.accept(BackroomsModItems.FRUITSGUANTOUEMPTY.get());
				tabData.accept(BackroomsModItems.LSSPEMPTY.get());
				tabData.accept(BackroomsModItems.CAIDAO.get());
				tabData.accept(BackroomsModItems.FRUITSDAO.get());
				tabData.accept(BackroomsModItems.SAMURAISWORD.get());
				tabData.accept(BackroomsModItems.CHUIZI.get());
				tabData.accept(BackroomsModItems.BISHOU.get());
				tabData.accept(BackroomsModItems.POBU.get());
				tabData.accept(BackroomsModBlocks.ME_GFANGDANBOLI.get().asItem());
				tabData.accept(BackroomsModItems.LVSHUGUANTOU.get());
				tabData.accept(BackroomsModItems.RROUGUANTOU.get());
				tabData.accept(BackroomsModItems.COLA.get());
				tabData.accept(BackroomsModItems.SSXS.get());
				tabData.accept(BackroomsModItems.YILIAOBAO.get());
				tabData.accept(BackroomsModItems.FRUITSGUANTOU.get());
				tabData.accept(BackroomsModItems.LSSP.get());
				tabData.accept(BackroomsModItems.BENGDAI.get());
				tabData.accept(BackroomsModItems.FIVE_CENTS.get());
			}).withTabsBefore(THE_BACKROOMSJIAFANGKUAI.getId()).build());
	public static final RegistryObject<CreativeModeTab> BACKROOMS_ITEMS = REGISTRY.register("backrooms_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.backrooms_items")).icon(() -> new ItemStack(BackroomsModItems.SUPERXRS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModItems.OBJECT_5TGYOUHAIFEILIAO.get());
				tabData.accept(BackroomsModItems.LEVEL_0.get());
				tabData.accept(BackroomsModItems.OBJECT_16HJKL.get());
				tabData.accept(BackroomsModItems.OBJECT_1XRS.get());
				tabData.accept(BackroomsModItems.SUPERXRS.get());
				tabData.accept(BackroomsModItems.RUN.get());
				tabData.accept(BackroomsModItems.LEVELO.get());
				tabData.accept(BackroomsModItems.BACKROOM.get());
				tabData.accept(BackroomsModItems.SIX_FORTY_SEVEN.get());
				tabData.accept(BackroomsModItems.DREAMCORE_1.get());
			}).withTabsBefore(COMMON_THING.getId()).build());
	public static final RegistryObject<CreativeModeTab> ENTITIES = REGISTRY.register("entities",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.entities")).icon(() -> new ItemStack(Items.ENDERMAN_SPAWN_EGG)).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModItems.ENTITY_3SMILER_SPAWN_EGG.get());
				tabData.accept(BackroomsModItems.ENTITY_15BEISHI_SPAWN_EGG.get());
				tabData.accept(BackroomsModItems.ENTITY_8LIEQUAN_SPAWN_EGG.get());
				tabData.accept(BackroomsModItems.ENTITY_10QIEPIZHE_SPAWN_EGG.get());
				tabData.accept(BackroomsModItems.ENTITY_9WUMIANLIN_SPAWN_EGG.get());
				tabData.accept(BackroomsModItems.XINCUNZHE_SPAWN_EGG.get());
			}).withTabsBefore(BACKROOMS_ITEMS.getId()).build());
	public static final RegistryObject<CreativeModeTab> SPBLOCKS = REGISTRY.register("spblocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.backrooms.spblocks")).icon(() -> new ItemStack(BackroomsModBlocks.SPBLOCK_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BackroomsModBlocks.SPBLOCK_1.get().asItem());
				tabData.accept(BackroomsModBlocks.SPBLOCK_3.get().asItem());
			}).withTabsBefore(ENTITIES.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(BackroomsModItems.OBJECT_2CJMYLV_4.get());
			tabData.accept(BackroomsModItems.OBJECT_2CJMYLV_6.get());
		}
	}
}
