package abilitypack;

import constants.Constants;
import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;

import java.util.HashMap;
import java.util.Map;

public final class Slam extends Ability {
    private final int duration = Constants.getSlamDuration();

    public Slam() {
        super(Constants.getSlamDmg(), Constants.getSlamDmgPerLvl());
    }

    private static Map<HeroClass, Float> slamRaceMod = new HashMap<>() {{
        put(HeroClass.ROGUE, Constants.getSlamR());
        put(HeroClass.KNIGHT, Constants.getSlamK());
        put(HeroClass.PYROMANCER, Constants.getSlamP());
        put(HeroClass.WIZARD, Constants.getSlamW());
    }};

    @Override
    public void injure(final Hero source, final Hero receiver, final MiniMap minimap) {
        float pureDamage = this.getBaseDmg() + this.getLevelUpAddDmg()
                * Hero.getLvl(source.getXp());
        float modDamage = pureDamage *  slamRaceMod.get(receiver.getHeroClass())
                * source.terrainMultiplier(minimap.getTerrain(source.getPosition()));
        receiver.getInjured(Math.round(modDamage));
        receiver.setMoveIncapacity(duration);
    }
}
