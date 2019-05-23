package me.swanis.boosters.profile;

import org.bukkit.entity.Player;

import java.util.Collection;

public abstract class ProfileManager {

    public abstract void load(Profile profile);

    public abstract void unload(Profile profile);

    public abstract Profile getProfile(Player player);

    public abstract Collection<Profile> getProfiles();

}
