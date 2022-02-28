package com.moomallowz.sinker.core.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class BowlItem extends Item {

    public BowlItem(Item.Properties pProperties) {
        super(pProperties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        super.finishUsingItem(stack, worldIn, entityLiving);

        if (stack.isEmpty()) {
            return new ItemStack(Items.BOWL);
        } else {
            if (entityLiving instanceof Player && !((Player)entityLiving).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(Items.BOWL);
                Player playerentity = (Player)entityLiving;
                if (!playerentity.getInventory().add(itemstack)) {
                    playerentity.drop(itemstack, false);
                }
            }
            return stack;
        }
    }
}