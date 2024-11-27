package net.purejosh.froglegs.block;

// Notice I've imported AbstractBlock.Settings, instead of stopping at AbstractBlock, to help shorten future code.
// This makes it possible to use "Settings.create", vs "AbstractBlock.Settings.create". Pretty neat. Thanks fzzyhmstrs!

import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.purejosh.froglegs.FrogLegs;

public class ModBlocks {
    // Register new blocks, and set their properties all in one. This helps me reduce the amount of files in my code.
    // Ochre
    public static final Block OCHRE_FROGLIGHT_STAIRS = register("ochre_froglight_stairs", new StairsBlock(Blocks.OCHRE_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);
    public static final Block OCHRE_FROGLIGHT_SLAB = register("ochre_froglight_slab", new SlabBlock(Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);
    public static final Block SMOOTH_OCHRE_FROGLIGHT = register("smooth_ochre_froglight", new Block(Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);
    public static final Block SMOOTH_OCHRE_FROGLIGHT_STAIRS = register("smooth_ochre_froglight_stairs", new StairsBlock(Blocks.OCHRE_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);
    public static final Block SMOOTH_OCHRE_FROGLIGHT_SLAB = register("smooth_ochre_froglight_slab", new SlabBlock(Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);
    public static final Block OCHRE_FROGLIGHT_BRICKS = register("ochre_froglight_bricks", new Block(Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);
    public static final Block OCHRE_FROGLIGHT_BRICK_STAIRS = register("ochre_froglight_brick_stairs", new StairsBlock(Blocks.OCHRE_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);
    public static final Block OCHRE_FROGLIGHT_BRICK_SLAB = register("ochre_froglight_brick_slab", new SlabBlock(Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);
    public static final Block OCHRE_FROGLIGHT_ROD = register("ochre_froglight_rod", new EndRodBlock(Settings.copy(Blocks.OCHRE_FROGLIGHT)), true);

    // Verdant
    public static final Block VERDANT_FROGLIGHT_STAIRS = register("verdant_froglight_stairs", new StairsBlock(Blocks.VERDANT_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);
    public static final Block VERDANT_FROGLIGHT_SLAB = register("verdant_froglight_slab", new SlabBlock(Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);
    public static final Block SMOOTH_VERDANT_FROGLIGHT = register("smooth_verdant_froglight", new Block(Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);
    public static final Block SMOOTH_VERDANT_FROGLIGHT_STAIRS = register("smooth_verdant_froglight_stairs", new StairsBlock(Blocks.VERDANT_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);
    public static final Block SMOOTH_VERDANT_FROGLIGHT_SLAB = register("smooth_verdant_froglight_slab", new SlabBlock(Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);
    public static final Block VERDANT_FROGLIGHT_BRICKS = register("verdant_froglight_bricks", new Block(Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);
    public static final Block VERDANT_FROGLIGHT_BRICK_STAIRS = register("verdant_froglight_brick_stairs", new StairsBlock(Blocks.VERDANT_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);
    public static final Block VERDANT_FROGLIGHT_BRICK_SLAB = register("verdant_froglight_brick_slab", new SlabBlock(Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);
    public static final Block VERDANT_FROGLIGHT_ROD = register("verdant_froglight_rod", new EndRodBlock(Settings.copy(Blocks.VERDANT_FROGLIGHT)), true);

    // Pearlescent
    public static final Block PEARLESCENT_FROGLIGHT_STAIRS = register("pearlescent_froglight_stairs", new StairsBlock(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);
    public static final Block PEARLESCENT_FROGLIGHT_SLAB = register("pearlescent_froglight_slab", new SlabBlock(Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);
    public static final Block SMOOTH_PEARLESCENT_FROGLIGHT = register("smooth_pearlescent_froglight", new Block(Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);
    public static final Block SMOOTH_PEARLESCENT_FROGLIGHT_STAIRS = register("smooth_pearlescent_froglight_stairs", new StairsBlock(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);
    public static final Block SMOOTH_PEARLESCENT_FROGLIGHT_SLAB = register("smooth_pearlescent_froglight_slab", new SlabBlock(Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);
    public static final Block PEARLESCENT_FROGLIGHT_BRICKS = register("pearlescent_froglight_bricks", new Block(Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);
    public static final Block PEARLESCENT_FROGLIGHT_BRICK_STAIRS = register("pearlescent_froglight_brick_stairs", new StairsBlock(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState(), Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);
    public static final Block PEARLESCENT_FROGLIGHT_BRICK_SLAB = register("pearlescent_froglight_brick_slab", new SlabBlock(Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);
    public static final Block PEARLESCENT_FROGLIGHT_ROD = register("pearlescent_froglight_rod", new EndRodBlock(Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)), true);

    // Helper methods
    // This is used to create an item version of a block. An item of a block is what you see in your inventory.
    public static Block register(String name, Block block, boolean shouldRegisterItem) {
        // This creates an id consisting of the mod id and the name of the block.
        Identifier id = Identifier.of(FrogLegs.MOD_ID, name);
        // Some blocks may not have an item version of them, such as air. Use this boolean to control that.
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    // Class initializer.
    public static void init() {
    }
}