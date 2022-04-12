package net.schmorchid.botwcamping.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TRUFFLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties PALM_FRUIT = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties BANANA = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties MEAT_SKEWER = (new FoodProperties.Builder()).nutrition(10).saturationMod(1F).effect(new MobEffectInstance(MobEffects.SATURATION, 2400, 0), 1.0F).meat().build();
    public static final FoodProperties GLAZED_MEAT_SKEWER = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.2F).effect(new MobEffectInstance(MobEffects.SATURATION, 2400, 0), 1.0F).meat().build();
}
