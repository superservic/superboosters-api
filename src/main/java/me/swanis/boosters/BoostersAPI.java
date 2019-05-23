package me.swanis.boosters;

import me.swanis.boosters.booster.BoosterManager;
import me.swanis.boosters.profile.ProfileManager;
import me.swanis.boosters.storage.Storable;

public class BoostersAPI {

    private static Boosters instance;

    public static BoosterManager getBoosterManager() {
        return instance.getBoosterManager();
    }

    public static ProfileManager getProfileManager() {
        return instance.getProfileManager();
    }

    public static Storable getStorage() {
        return instance.getStorage();
    }
}
