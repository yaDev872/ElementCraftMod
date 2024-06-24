package net.yaDev.ElementCraftMod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yaDev.ElementCraftMod.ElementCraftMod;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementCraftMod.MODID);

    public static final RegistryObject<Item> Flood_Rod = ITEMS.register("flood_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> Flood_Splash = ITEMS.register("flood_splash",
            () -> new Item(new Item.Properties()));

     public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
