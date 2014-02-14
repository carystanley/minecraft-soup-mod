package com.carystanley.soup.common.item;

import net.minecraft.item.ItemSoup;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;

public class SoupBase extends ItemSoup
{
    public SoupBase(int par1)
    {
        super(par1);
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }
}

