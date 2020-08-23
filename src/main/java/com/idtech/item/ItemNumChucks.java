package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemNumChucks extends QuickItem {

    // Lightning Num Chucks
    {
        name = "Num Chucks";
        tab = CreativeTabs.COMBAT;
        texture = "numchucks";
    }

    // What we want the lightning num chucks to do on right click
    public void onRightClick(){
        // When hitting the mob, we want to electricute them
        // Spawn a Skeleton Mob that fights them
    }

}
