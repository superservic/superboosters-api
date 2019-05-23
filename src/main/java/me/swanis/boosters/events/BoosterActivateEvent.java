package me.swanis.boosters.events;

import me.swanis.boosters.booster.ActiveBooster;
import me.swanis.boosters.profile.Profile;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BoosterActivateEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private ActiveBooster activeBooster;
    private Profile profile;
    private boolean force;

    public BoosterActivateEvent(ActiveBooster activeBooster, Profile profile, boolean force) {
        this.activeBooster = activeBooster;
        this.profile = profile;
        this.force = force;
    }

    public ActiveBooster getActiveBooster() {
        return activeBooster;
    }

    public Profile getProfile() {
        return profile;
    }

    public boolean isForce() {
        return force;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
