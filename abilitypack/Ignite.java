package abilitypack;

import constants.Constants;
import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;

import java.util.HashMap;
import java.util.Map;

public final class Ignite extends Ability {
    private final int roundDmg = Constants.getIgniteRoundDmg();
    private final int roundLvlDmg = Constants.getIgniteRoundLvlDmg();
    private final int duration = Constants.getIgniteDuration();

    public Ignite() {
        super(Constants.getIgniteDmg(), Constants.getIgniteDmgPerLvl());
    }

    private static Map<HeroClass, Float> igniteRaceMod = new HashMap<>() {{
        put(HeroClass.ROGUE, Constants.getIgniteR());
        put(HeroClass.KNIGHT, Constants.getIgniteK());
        put(HeroClass.PYROMANCER, Constants.getIgniteP());
        put(HeroClass.WIZARD, Constants.getIgniteW());
    }};

    @Override
    public void injure(final Hero source, final Hero receiver, final MiniMap minimap) {
        float pureDamage = this.getBaseDmg() + this.getLevelUpAddDmg()
                * Hero.getLvl(source.getXp());
        float modDamage = pureDamage * igniteRaceMod.get(receiver.getHeroClass())
                * receiver.terrainMultiplier(minimap.getTerrain(receiver.getPosition()));
        receiver.getInjured((Math.round(modDamage)));

        int overTimeDmg = Math.round(roundDmg + roundLvlDmg * Hero.getLvl(source.getXp()));
        receiver.setOvertimeDmg(overTimeDmg);
        receiver.setOverTimeDuration(duration);
    }
}
