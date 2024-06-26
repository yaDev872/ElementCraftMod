package net.yaDev.ElementCraftMod.Block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yaDev.ElementCraftMod.ElementCraftMod;
import net.yaDev.ElementCraftMod.Item.ModItems;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ElementCraftMod.MODID);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem((block.get()), new Item.Properties()));
    }

    public static final RegistryObject<Block> Aqua_Block = registerBlock("aqua_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static final RegistryObject<Block> Polished_Prismarine = registerBlock("polished_prismarine",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
