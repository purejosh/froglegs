package net.purejosh.froglegs.component.type;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent FROG_LEG = new FoodComponent.Builder()
            .nutrition(4).saturationModifier(0.3f).build();
    public static final FoodComponent FROG_LEG_COOKED = new FoodComponent.Builder()
            .nutrition(6).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200, 0),1.0f)
            .build();
    public static final FoodComponent FROG_LEG_GOLDEN = new FoodComponent.Builder()
            .nutrition(7).saturationModifier(1.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 400, 1),1.0f)
            .build();
    public static final FoodComponent FROG_LEG_STEW = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(0.8f)
            .usingConvertsTo(Items.BOWL)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 1),1.0f)
            .build();
}
