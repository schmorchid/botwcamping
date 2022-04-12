package net.schmorchid.botwcamping.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.schmorchid.botwcamping.BOTWCamping;
import net.schmorchid.botwcamping.item.ModCreativeModeTab;
import net.schmorchid.botwcamping.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BOTWCamping.MOD_ID);

    public static final RegistryObject<Block> HEY_LOIS = registerBlock("hey_lois",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).sound(SoundType.SLIME_BLOCK).instabreak().explosionResistance(1200f)), CreativeModeTab.TAB_MISC);

    public static final RegistryObject<Block> TRUFFLED_DIRT = registerBlock("truffled_dirt",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(0.5f).sound(SoundType.GRAVEL).explosionResistance(2f)), ModCreativeModeTab.BOTWC_BLOCKS);

    public static final RegistryObject<Block> TRUFFLED_COARSE_DIRT = registerBlock("truffled_coarse_dirt",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(0.5f).sound(SoundType.GRAVEL).explosionResistance(2f)), ModCreativeModeTab.BOTWC_BLOCKS);

    public static final RegistryObject<Block> TRUFFLED_ROOTED_DIRT = registerBlock("truffled_rooted_dirt",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(0.5f).sound(SoundType.GRAVEL).explosionResistance(2f)), ModCreativeModeTab.BOTWC_BLOCKS);

    public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).explosionResistance(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.BOTWC_BLOCKS);

    public static final RegistryObject<Block> POLISHED_SALT = registerBlock("polished_salt",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).sound(SoundType.STONE).explosionResistance(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.BOTWC_BLOCKS);


    public static final RegistryObject<Block> BANANA_PEEL = registerBlock("banana_peel",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noCollission()), ModCreativeModeTab.BOTWC_ITEMS);

    public static final RegistryObject<Block> RUSHROOM = registerBlock("rushroom",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 8,
                    BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).noCollission()), ModCreativeModeTab.BOTWC_ITEMS);

    public static final RegistryObject<Block> POTTED_RUSHROOM = registerBlockWithoutBlockItem("potted_rushroom",
            () -> new FlowerPotBlock(null, ModBlocks.RUSHROOM,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
