package net.eydis.eydissadditions.item.custom;

import net.eydis.eydissadditions.item.ModCreativeModeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ToolSharpenerItem extends Item {

    public ToolSharpenerItem() {
        super(new Item.Properties().stacksTo(1).tab(ModCreativeModeTabs.COURSE_TAB));
    }
    @Override
    public ActionResult<ItemStack> use(World worldIn, net.minecraft.entity.player.PlayerEntity playerIn, Hand handIn) {
        ItemStack offhandItemStack = playerIn.getItemInHand(Hand.OFF_HAND);
        if (!offhandItemStack.isEmpty() && offhandItemStack.isDamageable()) {
            offhandItemStack.setDamage(0);
            playerIn.getItemInHand(handIn).hurtAndBreak(1, playerIn, (entity) -> entity.broadcastBreakEvent(handIn));
            return ActionResult.success(offhandItemStack);
        } else {
            return ActionResult.fail(playerIn.getItemInHand(handIn));
        }
    }

}
