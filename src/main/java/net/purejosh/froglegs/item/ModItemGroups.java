package net.purejosh.froglegs.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.purejosh.froglegs.block.ModBlocks;

// This is used to arrange items in creative tabs.
public class ModItemGroups {
    public static void init() {
        // ModItems sorting
        // Food
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                Items.COOKED_RABBIT.getDefaultStack(), ModItems.COLD_FROG_LEG.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COLD_FROG_LEG.getDefaultStack(), ModItems.COOKED_COLD_FROG_LEG.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COOKED_COLD_FROG_LEG.getDefaultStack(), ModItems.GOLDEN_COLD_FROG_LEG.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.GOLDEN_COLD_FROG_LEG.getDefaultStack(), ModItems.TEMPERATE_FROG_LEG.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.TEMPERATE_FROG_LEG.getDefaultStack(), ModItems.COOKED_TEMPERATE_FROG_LEG.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COOKED_TEMPERATE_FROG_LEG.getDefaultStack(), ModItems.GOLDEN_TEMPERATE_FROG_LEG.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.GOLDEN_TEMPERATE_FROG_LEG.getDefaultStack(), ModItems.WARM_FROG_LEG.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.WARM_FROG_LEG.getDefaultStack(), ModItems.COOKED_WARM_FROG_LEG.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COOKED_WARM_FROG_LEG.getDefaultStack(), ModItems.GOLDEN_WARM_FROG_LEG.getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                Items.RABBIT_STEW.getDefaultStack(), ModItems.COLD_FROG_LEG_STEW.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.COLD_FROG_LEG_STEW.getDefaultStack(), ModItems.TEMPERATE_FROG_LEG_STEW.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                ModItems.TEMPERATE_FROG_LEG_STEW.getDefaultStack(), ModItems.WARM_FROG_LEG_STEW.getDefaultStack()));


        // ModBlocks sorting
        // Functional
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                Items.OCHRE_FROGLIGHT.asItem().getDefaultStack(), ModBlocks.OCHRE_FROGLIGHT_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.OCHRE_FROGLIGHT_STAIRS.asItem().getDefaultStack(), ModBlocks.OCHRE_FROGLIGHT_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.OCHRE_FROGLIGHT_SLAB.asItem().getDefaultStack(), ModBlocks.SMOOTH_OCHRE_FROGLIGHT.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_OCHRE_FROGLIGHT.asItem().getDefaultStack(), ModBlocks.SMOOTH_OCHRE_FROGLIGHT_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_OCHRE_FROGLIGHT_STAIRS.asItem().getDefaultStack(), ModBlocks.SMOOTH_OCHRE_FROGLIGHT_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_OCHRE_FROGLIGHT_SLAB.asItem().getDefaultStack(), ModBlocks.OCHRE_FROGLIGHT_BRICKS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.OCHRE_FROGLIGHT_BRICKS.asItem().getDefaultStack(), ModBlocks.OCHRE_FROGLIGHT_BRICK_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.OCHRE_FROGLIGHT_BRICK_STAIRS.asItem().getDefaultStack(), ModBlocks.OCHRE_FROGLIGHT_BRICK_SLAB.asItem().getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                Items.VERDANT_FROGLIGHT.asItem().getDefaultStack(), ModBlocks.VERDANT_FROGLIGHT_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.VERDANT_FROGLIGHT_STAIRS.asItem().getDefaultStack(), ModBlocks.VERDANT_FROGLIGHT_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.VERDANT_FROGLIGHT_SLAB.asItem().getDefaultStack(), ModBlocks.SMOOTH_VERDANT_FROGLIGHT.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_VERDANT_FROGLIGHT.asItem().getDefaultStack(), ModBlocks.SMOOTH_VERDANT_FROGLIGHT_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_VERDANT_FROGLIGHT_STAIRS.asItem().getDefaultStack(), ModBlocks.SMOOTH_VERDANT_FROGLIGHT_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_VERDANT_FROGLIGHT_SLAB.asItem().getDefaultStack(), ModBlocks.VERDANT_FROGLIGHT_BRICKS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.VERDANT_FROGLIGHT_BRICKS.asItem().getDefaultStack(), ModBlocks.VERDANT_FROGLIGHT_BRICK_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.VERDANT_FROGLIGHT_BRICK_STAIRS.asItem().getDefaultStack(), ModBlocks.VERDANT_FROGLIGHT_BRICK_SLAB.asItem().getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                Items.PEARLESCENT_FROGLIGHT.asItem().getDefaultStack(), ModBlocks.PEARLESCENT_FROGLIGHT_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.PEARLESCENT_FROGLIGHT_STAIRS.asItem().getDefaultStack(), ModBlocks.PEARLESCENT_FROGLIGHT_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.PEARLESCENT_FROGLIGHT_SLAB.asItem().getDefaultStack(), ModBlocks.SMOOTH_PEARLESCENT_FROGLIGHT.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_PEARLESCENT_FROGLIGHT.asItem().getDefaultStack(), ModBlocks.SMOOTH_PEARLESCENT_FROGLIGHT_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_PEARLESCENT_FROGLIGHT_STAIRS.asItem().getDefaultStack(), ModBlocks.SMOOTH_PEARLESCENT_FROGLIGHT_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.SMOOTH_PEARLESCENT_FROGLIGHT_SLAB.asItem().getDefaultStack(), ModBlocks.PEARLESCENT_FROGLIGHT_BRICKS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.PEARLESCENT_FROGLIGHT_BRICKS.asItem().getDefaultStack(), ModBlocks.PEARLESCENT_FROGLIGHT_BRICK_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.PEARLESCENT_FROGLIGHT_BRICK_STAIRS.asItem().getDefaultStack(), ModBlocks.PEARLESCENT_FROGLIGHT_BRICK_SLAB.asItem().getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                Items.END_ROD.asItem().getDefaultStack(), ModBlocks.OCHRE_FROGLIGHT_ROD.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.OCHRE_FROGLIGHT_ROD.asItem().getDefaultStack(), ModBlocks.VERDANT_FROGLIGHT_ROD.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.VERDANT_FROGLIGHT_ROD.asItem().getDefaultStack(), ModBlocks.PEARLESCENT_FROGLIGHT_ROD.asItem().getDefaultStack()));

    }
}
