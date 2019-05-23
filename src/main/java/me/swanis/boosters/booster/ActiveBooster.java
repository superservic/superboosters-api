package me.swanis.boosters.booster;

import java.util.UUID;

public abstract class ActiveBooster {

    public abstract Booster getBooster();

    public abstract String getStarter();

    public abstract UUID getStarterUUID();

    public abstract long getTime();

    public abstract boolean isGlobal();

}
