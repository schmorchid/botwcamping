package net.schmorchid.botwcamping.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.schmorchid.botwcamping.BOTWCamping;
import net.schmorchid.botwcamping.block.ModBlocks;
import net.schmorchid.botwcamping.item.custom.BananaItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BOTWCamping.MOD_ID);

    public static final RegistryObject<Item> NEHEHEHE = ITEMS.register("nehehehe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TRUFFLE = ITEMS.register("truffle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOTWC_FOOD).food(ModFoods.TRUFFLE)));

    public static final RegistryObject<Item> PALM_FRUIT = ITEMS.register("palm_fruit",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOTWC_FOOD).food(ModFoods.PALM_FRUIT)));

    public static final RegistryObject<Item> SALT_CHUNK = ITEMS.register("salt_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOTWC_ITEMS)));

    public static final RegistryObject<Item> SALTS = ITEMS.register("salts",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOTWC_ITEMS)));

    public static final RegistryObject<Item> MEAT_SKEWER = ITEMS.register("meat_skewer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOTWC_FOOD).food(ModFoods.MEAT_SKEWER)));

    public static final RegistryObject<Item> GLAZED_MEAT_SKEWER = ITEMS.register("glazed_meat_skewer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOTWC_FOOD).food(ModFoods.GLAZED_MEAT_SKEWER)));

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new BananaItem(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.BOTWC_FOOD).food(ModFoods.BANANA)));

    //public static final RegistryObject<Item> BANANA_PEEL = ITEMS.register("banana_peel",
    //        () -> new BlockItem(ModBlocks.BANANA_PEEL, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_FOOD)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
