/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.froglegs.init;

import net.purejosh.froglegs.item.WarmFrogLegStewItem;
import net.purejosh.froglegs.item.WarmFrogLegItem;
import net.purejosh.froglegs.item.TemperateFrogLegStewItem;
import net.purejosh.froglegs.item.TemperateFrogLegItem;
import net.purejosh.froglegs.item.GoldenWarmFrogLegItem;
import net.purejosh.froglegs.item.GoldenTemperateFrogLegItem;
import net.purejosh.froglegs.item.GoldenColdFrogLegItem;
import net.purejosh.froglegs.item.FrogLegItem;
import net.purejosh.froglegs.item.CookedWarmFrogLegItem;
import net.purejosh.froglegs.item.CookedTemperateFrogLegItem;
import net.purejosh.froglegs.item.CookedFrogLegItem;
import net.purejosh.froglegs.item.CookedColdFrogLegItem;
import net.purejosh.froglegs.item.ColdFrogLegStewItem;
import net.purejosh.froglegs.item.ColdFrogLegItem;
import net.purejosh.froglegs.FroglegsMod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class FroglegsModItems {
	public static Item COLD_FROG_LEG;
	public static Item COOKED_COLD_FROG_LEG;
	public static Item GOLDEN_COLD_FROG_LEG;
	public static Item TEMPERATE_FROG_LEG;
	public static Item COOKED_TEMPERATE_FROG_LEG;
	public static Item GOLDEN_TEMPERATE_FROG_LEG;
	public static Item WARM_FROG_LEG;
	public static Item COOKED_WARM_FROG_LEG;
	public static Item GOLDEN_WARM_FROG_LEG;
	public static Item COLD_FROG_LEG_STEW;
	public static Item TEMPERATE_FROG_LEG_STEW;
	public static Item WARM_FROG_LEG_STEW;
	public static Item FROG_LEG;
	public static Item COOKED_FROG_LEG;
	public static Item OCHRE_FROGLIGHT_STAIRS;
	public static Item OCHRE_FROGLIGHT_SLAB;
	public static Item OCHRE_FROGLIGHT_BRICKS;
	public static Item OCHRE_FROGLIGHT_BRICK_STAIRS;
	public static Item OCHRE_FROGLIGHT_BRICK_SLAB;
	public static Item SMOOTH_OCHRE_FROGLIGHT;
	public static Item SMOOTH_OCHRE_FROGLIGHT_SLAB;
	public static Item VERDANT_FROGLIGHT_STAIRS;
	public static Item VERDANT_FROGLIGHT_SLAB;
	public static Item VERDANT_FROGLIGHT_BRICKS;
	public static Item VERDANT_FROGLIGHT_BRICK_STAIRS;
	public static Item VERDANT_FROGLIGHT_BRICK_SLAB;
	public static Item SMOOTH_VERDANT_FROGLIGHT;
	public static Item SMOOTH_VERDANT_FROGLIGHT_SLAB;
	public static Item PEARLESCENT_FROGLIGHT_STAIRS;
	public static Item PEARLESCENT_FROGLIGHT_SLAB;
	public static Item PEARLESCENT_FROGLIGHT_BRICKS;
	public static Item PEARLESCENT_FROGLIGHT_BRICK_STAIRS;
	public static Item PEARLESCENT_FROGLIGHT_BRICK_SLAB;
	public static Item SMOOTH_PEARLESCENT_FROGLIGHT;
	public static Item SMOOTH_PEARLESCENT_FROGLIGHT_SLAB;
	public static Item OCHRE_FROGLIGHT_ROD;
	public static Item VERDANT_FROGLIGHT_ROD;
	public static Item PEARLESCENT_FROGLIGHT_ROD;

	public static void load() {
		COLD_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "cold_frog_leg"), new ColdFrogLegItem());
		COOKED_COLD_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "cooked_cold_frog_leg"), new CookedColdFrogLegItem());
		GOLDEN_COLD_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "golden_cold_frog_leg"), new GoldenColdFrogLegItem());
		TEMPERATE_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "temperate_frog_leg"), new TemperateFrogLegItem());
		COOKED_TEMPERATE_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "cooked_temperate_frog_leg"), new CookedTemperateFrogLegItem());
		GOLDEN_TEMPERATE_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "golden_temperate_frog_leg"), new GoldenTemperateFrogLegItem());
		WARM_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "warm_frog_leg"), new WarmFrogLegItem());
		COOKED_WARM_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "cooked_warm_frog_leg"), new CookedWarmFrogLegItem());
		GOLDEN_WARM_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "golden_warm_frog_leg"), new GoldenWarmFrogLegItem());
		COLD_FROG_LEG_STEW = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "cold_frog_leg_stew"), new ColdFrogLegStewItem());
		TEMPERATE_FROG_LEG_STEW = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "temperate_frog_leg_stew"), new TemperateFrogLegStewItem());
		WARM_FROG_LEG_STEW = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "warm_frog_leg_stew"), new WarmFrogLegStewItem());
		FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "frog_leg"), new FrogLegItem());
		COOKED_FROG_LEG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "cooked_frog_leg"), new CookedFrogLegItem());
		OCHRE_FROGLIGHT_STAIRS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_stairs"), new BlockItem(FroglegsModBlocks.OCHRE_FROGLIGHT_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(OCHRE_FROGLIGHT_STAIRS));
		OCHRE_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_slab"), new BlockItem(FroglegsModBlocks.OCHRE_FROGLIGHT_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(OCHRE_FROGLIGHT_SLAB));
		OCHRE_FROGLIGHT_BRICKS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_bricks"), new BlockItem(FroglegsModBlocks.OCHRE_FROGLIGHT_BRICKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(OCHRE_FROGLIGHT_BRICKS));
		OCHRE_FROGLIGHT_BRICK_STAIRS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_brick_stairs"), new BlockItem(FroglegsModBlocks.OCHRE_FROGLIGHT_BRICK_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(OCHRE_FROGLIGHT_BRICK_STAIRS));
		OCHRE_FROGLIGHT_BRICK_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_brick_slab"), new BlockItem(FroglegsModBlocks.OCHRE_FROGLIGHT_BRICK_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(OCHRE_FROGLIGHT_BRICK_SLAB));
		SMOOTH_OCHRE_FROGLIGHT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "smooth_ochre_froglight"), new BlockItem(FroglegsModBlocks.SMOOTH_OCHRE_FROGLIGHT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(SMOOTH_OCHRE_FROGLIGHT));
		SMOOTH_OCHRE_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "smooth_ochre_froglight_slab"), new BlockItem(FroglegsModBlocks.SMOOTH_OCHRE_FROGLIGHT_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(SMOOTH_OCHRE_FROGLIGHT_SLAB));
		VERDANT_FROGLIGHT_STAIRS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_stairs"), new BlockItem(FroglegsModBlocks.VERDANT_FROGLIGHT_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(VERDANT_FROGLIGHT_STAIRS));
		VERDANT_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_slab"), new BlockItem(FroglegsModBlocks.VERDANT_FROGLIGHT_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(VERDANT_FROGLIGHT_SLAB));
		VERDANT_FROGLIGHT_BRICKS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_bricks"), new BlockItem(FroglegsModBlocks.VERDANT_FROGLIGHT_BRICKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(VERDANT_FROGLIGHT_BRICKS));
		VERDANT_FROGLIGHT_BRICK_STAIRS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_brick_stairs"), new BlockItem(FroglegsModBlocks.VERDANT_FROGLIGHT_BRICK_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(VERDANT_FROGLIGHT_BRICK_STAIRS));
		VERDANT_FROGLIGHT_BRICK_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_brick_slab"), new BlockItem(FroglegsModBlocks.VERDANT_FROGLIGHT_BRICK_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(VERDANT_FROGLIGHT_BRICK_SLAB));
		SMOOTH_VERDANT_FROGLIGHT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "smooth_verdant_froglight"), new BlockItem(FroglegsModBlocks.SMOOTH_VERDANT_FROGLIGHT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(SMOOTH_VERDANT_FROGLIGHT));
		SMOOTH_VERDANT_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "smooth_verdant_froglight_slab"), new BlockItem(FroglegsModBlocks.SMOOTH_VERDANT_FROGLIGHT_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(SMOOTH_VERDANT_FROGLIGHT_SLAB));
		PEARLESCENT_FROGLIGHT_STAIRS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_stairs"), new BlockItem(FroglegsModBlocks.PEARLESCENT_FROGLIGHT_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(PEARLESCENT_FROGLIGHT_STAIRS));
		PEARLESCENT_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_slab"), new BlockItem(FroglegsModBlocks.PEARLESCENT_FROGLIGHT_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(PEARLESCENT_FROGLIGHT_SLAB));
		PEARLESCENT_FROGLIGHT_BRICKS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_bricks"), new BlockItem(FroglegsModBlocks.PEARLESCENT_FROGLIGHT_BRICKS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(PEARLESCENT_FROGLIGHT_BRICKS));
		PEARLESCENT_FROGLIGHT_BRICK_STAIRS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_brick_stairs"),
				new BlockItem(FroglegsModBlocks.PEARLESCENT_FROGLIGHT_BRICK_STAIRS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(PEARLESCENT_FROGLIGHT_BRICK_STAIRS));
		PEARLESCENT_FROGLIGHT_BRICK_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_brick_slab"),
				new BlockItem(FroglegsModBlocks.PEARLESCENT_FROGLIGHT_BRICK_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(PEARLESCENT_FROGLIGHT_BRICK_SLAB));
		SMOOTH_PEARLESCENT_FROGLIGHT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "smooth_pearlescent_froglight"), new BlockItem(FroglegsModBlocks.SMOOTH_PEARLESCENT_FROGLIGHT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(SMOOTH_PEARLESCENT_FROGLIGHT));
		SMOOTH_PEARLESCENT_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "smooth_pearlescent_froglight_slab"),
				new BlockItem(FroglegsModBlocks.SMOOTH_PEARLESCENT_FROGLIGHT_SLAB, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(SMOOTH_PEARLESCENT_FROGLIGHT_SLAB));
		OCHRE_FROGLIGHT_ROD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_rod"), new BlockItem(FroglegsModBlocks.OCHRE_FROGLIGHT_ROD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.accept(OCHRE_FROGLIGHT_ROD));
		VERDANT_FROGLIGHT_ROD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_rod"), new BlockItem(FroglegsModBlocks.VERDANT_FROGLIGHT_ROD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.accept(VERDANT_FROGLIGHT_ROD));
		PEARLESCENT_FROGLIGHT_ROD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_rod"), new BlockItem(FroglegsModBlocks.PEARLESCENT_FROGLIGHT_ROD, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(content -> content.accept(PEARLESCENT_FROGLIGHT_ROD));
	}

	public static void clientLoad() {
	}
}
