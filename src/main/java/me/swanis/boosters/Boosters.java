package me.swanis.boosters;

import me.swanis.boosters.booster.BoosterManager;
import me.swanis.boosters.profile.ProfileManager;
import me.swanis.boosters.storage.Storable;

public abstract class Boosters {

    public abstract BoosterManager getBoosterManager();

    public abstract ProfileManager getProfileManager();

    public abstract Storable getStorage();

}
