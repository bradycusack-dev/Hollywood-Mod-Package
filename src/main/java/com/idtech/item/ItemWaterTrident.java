package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemWaterTrident extends QuickItem {

    // This trident will be for fishing
    {
        name = "Water Trident";
        tab = CreativeTabs.COMBAT;
        // Texture needs to be created
        texture = "structuregel";
    }

    // On right click we want to be able to get the sharks and fish
    public void onRightClick(){
        /*
        * We want the trident to be thrown like a spear at the sharks and fish.
        * We want the trident to search for the fish in the water as it's going through the sea.
        */
    }

}
