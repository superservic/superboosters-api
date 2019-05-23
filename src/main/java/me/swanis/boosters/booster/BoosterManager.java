package me.swanis.boosters.booster;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public abstract class BoosterManager {

    public abstract void register(Booster booster);

    public abstract void unregister(Booster booster);

    public abstract void addActiveBooster(Booster booster, String starter, long time);

    public abstract void addActivePersonalBooster(UUID uuid, Booster booster, String starter, long time);

    public abstract void removeActiveBooster(ActiveBooster activeBooster);

    public abstract void removeActivePersonalBooster(UUID uuid, ActiveBooster activeBooster);

    public abstract Booster getBooster(String string);

    public abstract ActiveBooster getActiveBooster(Booster booster);

    public abstract ActiveBooster getActivePersonalBooster(UUID uuid, Booster booster);

    public abstract Set<ActiveBooster> getActivePersonalBoosters(UUID uuid);

    public abstract Collection<Booster> getBoosters();

    public abstract Collection<ActiveBooster> getActiveBoosters();

    public abstract Map<UUID, Set<ActiveBooster>> getActivePersonalBoosters();

}
