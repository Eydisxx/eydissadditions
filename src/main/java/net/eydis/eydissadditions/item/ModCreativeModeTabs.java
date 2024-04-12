package net.eydis.eydissadditions.item;

import net.eydis.eydissadditions.MCCourseMod;
import net.eydis.eydissadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
    //Creative TAB
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);
    //Creative TAB ITEM DISPLAY
    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_PURPURONYXSTONE.get()))
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.PURPURONYXSTONE.get());
                        output.accept(ModItems.RAW_PURPURONYXSTONE.get());

                        output.accept(ModBlocks.PURPURONYXSTONEBLOCK.get());
                        output.accept(ModBlocks.PURPURONYXSTONE_ORE.get());

                    }).build());

    public static void register(IEventBus eventBus){

        CREATIVE_MODE_TABS.register(eventBus);
    }
}
