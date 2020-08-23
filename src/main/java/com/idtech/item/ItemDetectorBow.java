package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemDetectorBow extends QuickItem {

    {
        name = "Detector Bow";
        tab = CreativeTabs.COMBAT;
        texture = "bowandarrow";
    }

    // This one will detect players and mobs nearby and hunt them.
    public void onRightClick(){
        // This will shoot arrows that track players and mobs nearby
    }

}