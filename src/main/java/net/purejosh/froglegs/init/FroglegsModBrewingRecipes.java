/*
* MCreator note: This file will be REGENERATED on each build.
*/
package net.purejosh.froglegs.init;

import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionBrewing;

public class FroglegsModBrewingRecipes {
	public static void load() {
		PotionBrewing.addMix(Potions.AWKWARD, FroglegsModItems.FROG_LEG, Potions.STRONG_LEAPING);
		PotionBrewing.addMix(Potions.AWKWARD, FroglegsModItems.COLD_FROG_LEG, Potions.STRONG_LEAPING);
		PotionBrewing.addMix(Potions.AWKWARD, FroglegsModItems.TEMPERATE_FROG_LEG, Potions.STRONG_LEAPING);
		PotionBrewing.addMix(Potions.AWKWARD, FroglegsModItems.WARM_FROG_LEG, Potions.STRONG_LEAPING);
	}
}
