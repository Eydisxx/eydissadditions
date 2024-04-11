package net.eydis.eydissadditions.item;

import net.eydis.eydissadditions.MCCourseMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister <Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);
    //Item 1
    public static final RegistryObject<Item> ONIXSTONE = ITEMS.register("onyxstone",
            () -> new Item(new Item.Properties() ));
    //Item 2
    public static final RegistryObject<Item> ONIXORE =ITEMS.register("onixore",
            () -> new Item(new Item.Properties() ));
    public static void register(IEventBus eventBUS) {
        ITEMS.register(eventBUS);
    }
}