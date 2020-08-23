package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;

public class ItemRandomBlaster extends QuickItem {

    {
        name = "Random Blaster";
        tab = CreativeTabs.COMBAT;
        texture = "randomblaster";
    }

    /*
    * The Random Blaster will shoot weapon projectiles each time that it's click. Any projectile is game.
    */

    public void onRightClick() {
        /*
            Use the random number generator to randomly select from an array of predefined projectiles.
        */
    }
}
