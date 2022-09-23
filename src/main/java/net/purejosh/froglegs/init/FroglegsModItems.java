
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.froglegs.init;

import net.purejosh.froglegs.item.FrogLegItem;
import net.purejosh.froglegs.item.CookedFrogLegItem;
import net.purejosh.froglegs.FroglegsMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class FroglegsModItems {
	public static Item FROG_LEG;
	public static Item COOKED_FROG_LEG;

	public static void load() {
		FROG_LEG = Registry.register(Registry.ITEM, new ResourceLocation(FroglegsMod.MODID, "frog_leg"), new FrogLegItem());
		COOKED_FROG_LEG = Registry.register(Registry.ITEM, new ResourceLocation(FroglegsMod.MODID, "cooked_frog_leg"), new CookedFrogLegItem());
	}
}
