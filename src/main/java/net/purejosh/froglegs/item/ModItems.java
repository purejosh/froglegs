package net.purejosh.froglegs.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.purejosh.froglegs.FrogLegs;
import net.purejosh.froglegs.component.type.ModFoodComponents;

import java.util.List;

public class ModItems {
    // Food
    public static final Item COLD_FROG_LEG = register("cold_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG)));
    public static final Item COOKED_COLD_FROG_LEG = register("cooked_cold_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_COOKED)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_200"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_1"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item GOLDEN_COLD_FROG_LEG = register("golden_cold_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_GOLDEN)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_2_400"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COLD_FROG_LEG_STEW = register("cold_frog_leg_stew", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_STEW).maxCount(1)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_2_1200"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    
    public static final Item TEMPERATE_FROG_LEG = register("temperate_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG)));
    public static final Item COOKED_TEMPERATE_FROG_LEG = register("cooked_temperate_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_COOKED)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_200"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_1"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item GOLDEN_TEMPERATE_FROG_LEG = register("golden_temperate_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_GOLDEN)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_2_400"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item TEMPERATE_FROG_LEG_STEW = register("temperate_frog_leg_stew", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_STEW).maxCount(1)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_2_1200"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    
    public static final Item WARM_FROG_LEG = register("warm_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG)));
    public static final Item COOKED_WARM_FROG_LEG = register("cooked_warm_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_COOKED)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_200"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_1"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item GOLDEN_WARM_FROG_LEG = register("golden_warm_frog_leg", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_GOLDEN)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_2_400"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item WARM_FROG_LEG_STEW = register("warm_frog_leg_stew", new Item(new Item.Settings()
            .food(ModFoodComponents.FROG_LEG_STEW).maxCount(1)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("item.froglegs.jump_boost_2_1200"));
            tooltip.add(Text.translatable("item.froglegs.blank_line"));
            tooltip.add(Text.translatable("item.froglegs.when_applied"));
            tooltip.add(Text.translatable("item.froglegs.safe_fall_2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    
    // Helper method for registering an item.
    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FrogLegs.MOD_ID, id), item);
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
