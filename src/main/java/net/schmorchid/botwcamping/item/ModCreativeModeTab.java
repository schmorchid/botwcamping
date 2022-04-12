package net.schmorchid.botwcamping.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.schmorchid.botwcamping.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab BOTWC_BLOCKS = new CreativeModeTab("botwc_blocks_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SALT_ORE.get());
        }
    };

    public static final CreativeModeTab BOTWC_ITEMS = new CreativeModeTab("botwc_items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SALT_CHUNK.get());
        }
    };

    public static final CreativeModeTab BOTWC_FOOD = new CreativeModeTab("botwc_food_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MEAT_SKEWER.get());
        }
    };
}
