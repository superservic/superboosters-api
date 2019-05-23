package me.swanis.boosters.events;

import me.swanis.boosters.booster.ActiveBooster;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BoosterCancelEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    private ActiveBooster activeBooster;

    public BoosterCancelEvent(ActiveBooster activeBooster) {
        this.activeBooster = activeBooster;
    }

    public ActiveBooster getActiveBooster() {
        return activeBooster;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
