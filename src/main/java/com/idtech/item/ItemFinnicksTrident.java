package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemFinnicksTrident extends QuickItem {

    // This will be the battle trident
    {
        name = "Finnicks Trident";
        tab = CreativeTabs.COMBAT;
        texture = "structuregel";
    }

    // We want this to be a one throw win when dueling
    public void onRightClick(){

    }

}