package net.yaDev.ElementCraftMod.Item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yaDev.ElementCraftMod.ElementCraftMod;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementCraftMod.MODID);

    public static final RegistryObject<CreativeModeTab> ElementCraft = CREATIVE_MODE_TABS.register("ElementCraft",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Flood_Rod.get()))
                    .title(Component.translatable("creativetab.elementcraftmod"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Flood_Rod.get());
                        pOutput.accept(ModItems.Flood_Splash.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}