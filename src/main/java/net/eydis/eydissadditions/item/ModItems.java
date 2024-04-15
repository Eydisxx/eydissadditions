package net.eydis.eydissadditions.item;

import net.eydis.eydissadditions.MCCourseMod;
import net.eydis.eydissadditions.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister <Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);
    //Item 1
    public static final RegistryObject<Item> PURPURONYXSTONE = ITEMS.register("purpuronyxstone",
            () -> new Item(new Item.Properties() ));
    //Item 2
    public static final RegistryObject<Item> RAW_PURPURONYXSTONE =ITEMS.register("raw_purpuronyxstone",
            () -> new Item(new Item.Properties() ));

    //Item 3 durability 512
    public static final RegistryObject<Item> METAL_DETECTOR =ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(512) ));
    public static void register(IEventBus eventBUS) {
        ITEMS.register(eventBUS);
    }
}
