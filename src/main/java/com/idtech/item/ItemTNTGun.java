package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemTNTGun extends QuickItem {

    {
        name = "TNT Gun";
        tab = CreativeTabs.COMBAT;
        texture = "tntgun";
    }

    // On right click - this one will shoot TNT far (range at least 100)
    public void onRightClick(){

    }

}