package me.swanis.boosters.profile;

import me.swanis.boosters.booster.Booster;
import org.bukkit.entity.Player;

import java.util.Map;

public abstract class Profile {

    public abstract Player getPlayer();

    public abstract Map<Booster, Integer> getBoosters();

    public abstract void setBoosters(Map<Booster, Integer> boosters);

    public abstract Map<Booster, Integer> getPersonalBoosters();

    public abstract void setPersonalBoosters(Map<Booster, Integer> personalBoosters);

}
