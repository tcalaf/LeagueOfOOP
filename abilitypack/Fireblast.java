package abilitypack;

import constants.Constants;
import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;

import java.util.HashMap;
import java.util.Map;

public final class Fireblast extends Ability {
    public Fireblast() {
        super(Constants.getFireblastDmg(), Constants.getFireblastDmgPerLvl());
    }

    private static Map<HeroClass, Float> fireblastRaceMod = new HashMap<>() {{
        put(HeroClass.ROGUE, Constants.getFireblastR());
        put(HeroClass.KNIGHT, Constants.getFireblastK());
        put(HeroClass.PYROMANCER, Constants.getFireblastP());
        put(HeroClass.WIZARD, Constants.getFireblastW());
    }};

    @Override
    public void injure(final Hero source, final Hero receiver,
                       final MiniMap minimap) {
        float pureDamage = this.getBaseDmg() + this.getLevelUpAddDmg()
                * Hero.getLvl(source.getXp());
        float modDamage = pureDamage * fireblastRaceMod.get(receiver.getHeroClass())
                * source.terrainMultiplier(minimap.getTerrain(source.getPosition()));
        receiver.getInjured(Math.round(modDamage));
    }
}
