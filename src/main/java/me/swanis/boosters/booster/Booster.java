package me.swanis.boosters.booster;

import org.bukkit.inventory.ItemStack;

public interface Booster {

    boolean isEnabled(); //If the booster is enabled or not

    String getName(); //The name of the booster

    int getGlobalMinutes(); //The amount of minutes the booster should last for

    ItemStack getGlobalActivateItem(); //The booster item in the global your boosters inventory

    ItemStack getGlobalBoostersItem(); //The booster item in the global active boosters inventory

    int getGlobalSlot(); //The slot where the global booster item will be placed in the guis

    int getPersonalMinutes(); //The amount of minutes the booster should last for

    ItemStack getPersonalActivateItem(); //The booster item in the personal your boosters inventory

    ItemStack getPersonalBoostersItem(); //The booster item in the personal active boosters inventory

    int getPersonalSlot(); //The slot where the personal booster item will be placed in the guis

    void reload();

}
