
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.froglegs.init;

import net.purejosh.froglegs.block.VerdantFroglightStairsBlock;
import net.purejosh.froglegs.block.VerdantFroglightSlabBlock;
import net.purejosh.froglegs.block.VerdantFroglightRodBlock;
import net.purejosh.froglegs.block.VerdantFroglightBricksBlock;
import net.purejosh.froglegs.block.VerdantFroglightBrickStairsBlock;
import net.purejosh.froglegs.block.VerdantFroglightBrickSlabBlock;
import net.purejosh.froglegs.block.SmoothVerdantFroglightSlabBlock;
import net.purejosh.froglegs.block.SmoothVerdantFroglightBlock;
import net.purejosh.froglegs.block.SmoothPearlescentFroglightSlabBlock;
import net.purejosh.froglegs.block.SmoothPearlescentFroglightBlock;
import net.purejosh.froglegs.block.SmoothOchreFroglightSlabBlock;
import net.purejosh.froglegs.block.SmoothOchreFroglightBlock;
import net.purejosh.froglegs.block.PearlescentFroglightStairsBlock;
import net.purejosh.froglegs.block.PearlescentFroglightSlabBlock;
import net.purejosh.froglegs.block.PearlescentFroglightRodBlock;
import net.purejosh.froglegs.block.PearlescentFroglightBricksBlock;
import net.purejosh.froglegs.block.PearlescentFroglightBrickStairsBlock;
import net.purejosh.froglegs.block.PearlescentFroglightBrickSlabBlock;
import net.purejosh.froglegs.block.OchreFroglightStairsBlock;
import net.purejosh.froglegs.block.OchreFroglightSlabBlock;
import net.purejosh.froglegs.block.OchreFroglightRodBlock;
import net.purejosh.froglegs.block.OchreFroglightBricksBlock;
import net.purejosh.froglegs.block.OchreFroglightBrickStairsBlock;
import net.purejosh.froglegs.block.OchreFroglightBrickSlabBlock;
import net.purejosh.froglegs.FroglegsMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class FroglegsModBlocks {
	public static Block OCHRE_FROGLIGHT_STAIRS;
	public static Block OCHRE_FROGLIGHT_SLAB;
	public static Block OCHRE_FROGLIGHT_BRICKS;
	public static Block OCHRE_FROGLIGHT_BRICK_STAIRS;
	public static Block OCHRE_FROGLIGHT_BRICK_SLAB;
	public static Block SMOOTH_OCHRE_FROGLIGHT;
	public static Block SMOOTH_OCHRE_FROGLIGHT_SLAB;
	public static Block VERDANT_FROGLIGHT_STAIRS;
	public static Block VERDANT_FROGLIGHT_SLAB;
	public static Block VERDANT_FROGLIGHT_BRICKS;
	public static Block VERDANT_FROGLIGHT_BRICK_STAIRS;
	public static Block VERDANT_FROGLIGHT_BRICK_SLAB;
	public static Block SMOOTH_VERDANT_FROGLIGHT;
	public static Block SMOOTH_VERDANT_FROGLIGHT_SLAB;
	public static Block PEARLESCENT_FROGLIGHT_STAIRS;
	public static Block PEARLESCENT_FROGLIGHT_SLAB;
	public static Block PEARLESCENT_FROGLIGHT_BRICKS;
	public static Block PEARLESCENT_FROGLIGHT_BRICK_STAIRS;
	public static Block PEARLESCENT_FROGLIGHT_BRICK_SLAB;
	public static Block SMOOTH_PEARLESCENT_FROGLIGHT;
	public static Block SMOOTH_PEARLESCENT_FROGLIGHT_SLAB;
	public static Block OCHRE_FROGLIGHT_ROD;
	public static Block VERDANT_FROGLIGHT_ROD;
	public static Block PEARLESCENT_FROGLIGHT_ROD;

	public static void load() {
		OCHRE_FROGLIGHT_STAIRS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_stairs"), new OchreFroglightStairsBlock());
		OCHRE_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_slab"), new OchreFroglightSlabBlock());
		OCHRE_FROGLIGHT_BRICKS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_bricks"), new OchreFroglightBricksBlock());
		OCHRE_FROGLIGHT_BRICK_STAIRS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_brick_stairs"), new OchreFroglightBrickStairsBlock());
		OCHRE_FROGLIGHT_BRICK_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_brick_slab"), new OchreFroglightBrickSlabBlock());
		SMOOTH_OCHRE_FROGLIGHT = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "smooth_ochre_froglight"), new SmoothOchreFroglightBlock());
		SMOOTH_OCHRE_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "smooth_ochre_froglight_slab"), new SmoothOchreFroglightSlabBlock());
		VERDANT_FROGLIGHT_STAIRS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_stairs"), new VerdantFroglightStairsBlock());
		VERDANT_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_slab"), new VerdantFroglightSlabBlock());
		VERDANT_FROGLIGHT_BRICKS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_bricks"), new VerdantFroglightBricksBlock());
		VERDANT_FROGLIGHT_BRICK_STAIRS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_brick_stairs"), new VerdantFroglightBrickStairsBlock());
		VERDANT_FROGLIGHT_BRICK_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_brick_slab"), new VerdantFroglightBrickSlabBlock());
		SMOOTH_VERDANT_FROGLIGHT = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "smooth_verdant_froglight"), new SmoothVerdantFroglightBlock());
		SMOOTH_VERDANT_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "smooth_verdant_froglight_slab"), new SmoothVerdantFroglightSlabBlock());
		PEARLESCENT_FROGLIGHT_STAIRS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_stairs"), new PearlescentFroglightStairsBlock());
		PEARLESCENT_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_slab"), new PearlescentFroglightSlabBlock());
		PEARLESCENT_FROGLIGHT_BRICKS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_bricks"), new PearlescentFroglightBricksBlock());
		PEARLESCENT_FROGLIGHT_BRICK_STAIRS = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_brick_stairs"), new PearlescentFroglightBrickStairsBlock());
		PEARLESCENT_FROGLIGHT_BRICK_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_brick_slab"), new PearlescentFroglightBrickSlabBlock());
		SMOOTH_PEARLESCENT_FROGLIGHT = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "smooth_pearlescent_froglight"), new SmoothPearlescentFroglightBlock());
		SMOOTH_PEARLESCENT_FROGLIGHT_SLAB = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "smooth_pearlescent_froglight_slab"), new SmoothPearlescentFroglightSlabBlock());
		OCHRE_FROGLIGHT_ROD = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "ochre_froglight_rod"), new OchreFroglightRodBlock());
		VERDANT_FROGLIGHT_ROD = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "verdant_froglight_rod"), new VerdantFroglightRodBlock());
		PEARLESCENT_FROGLIGHT_ROD = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(FroglegsMod.MODID, "pearlescent_froglight_rod"), new PearlescentFroglightRodBlock());
	}

	public static void clientLoad() {
		OchreFroglightStairsBlock.clientInit();
		OchreFroglightSlabBlock.clientInit();
		OchreFroglightBricksBlock.clientInit();
		OchreFroglightBrickStairsBlock.clientInit();
		OchreFroglightBrickSlabBlock.clientInit();
		SmoothOchreFroglightBlock.clientInit();
		SmoothOchreFroglightSlabBlock.clientInit();
		VerdantFroglightStairsBlock.clientInit();
		VerdantFroglightSlabBlock.clientInit();
		VerdantFroglightBricksBlock.clientInit();
		VerdantFroglightBrickStairsBlock.clientInit();
		VerdantFroglightBrickSlabBlock.clientInit();
		SmoothVerdantFroglightBlock.clientInit();
		SmoothVerdantFroglightSlabBlock.clientInit();
		PearlescentFroglightStairsBlock.clientInit();
		PearlescentFroglightSlabBlock.clientInit();
		PearlescentFroglightBricksBlock.clientInit();
		PearlescentFroglightBrickStairsBlock.clientInit();
		PearlescentFroglightBrickSlabBlock.clientInit();
		SmoothPearlescentFroglightBlock.clientInit();
		SmoothPearlescentFroglightSlabBlock.clientInit();
		OchreFroglightRodBlock.clientInit();
		VerdantFroglightRodBlock.clientInit();
		PearlescentFroglightRodBlock.clientInit();
	}
}
