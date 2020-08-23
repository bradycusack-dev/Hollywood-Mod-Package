package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemEthansTrident extends QuickItem {
    // This will be the battle trident
    {
        name = "Ethans Trident";
        tab = CreativeTabs.COMBAT;
        // Need to add texture
        texture = "structuregel";
    }

    // We want this to be a one throw win when dueling
    public void onRightClick(){

    }
}
