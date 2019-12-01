package abilitypack;

import constants.Constants;
import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;
import map.Terrain;

import java.util.HashMap;
import java.util.Map;

public final class Backstab extends Ability {
    private final float critical = Constants.getBackstabCritical();
    private static int crit = 0;

    public Backstab() {
        super(Constants.getBackstabDmg(), Constants.getBackstabDmgPerLvl());
    }

    private static Map<HeroClass, Float> backstabRaceMod = new HashMap<>() {{
        put(HeroClass.ROGUE, Constants.getBackstabR());
        put(HeroClass.KNIGHT, Constants.getBackstabK());
        put(HeroClass.PYROMANCER, Constants.getBackstabP());
        put(HeroClass.WIZARD, Constants.getBackstabW());
    }};

    @Override
    public void injure(final Hero source, final Hero receiver, final MiniMap minimap) {
        float pureDamage = this.getBaseDmg() + this.getLevelUpAddDmg()
                * Hero.getLvl(source.getXp());
        float modDamage = pureDamage * backstabRaceMod.get(receiver.getHeroClass())
                * source.terrainMultiplier(minimap.getTerrain(source.getPosition()));

        if (minimap.getTerrain(source.getPosition()) == Terrain.WOODS && Backstab.getCrit() == 0) {
            receiver.getInjured(Math.round(modDamage * critical));
            Backstab.crit++;
        } else {
            receiver.getInjured(Math.round(modDamage));
        }
    }

    public static int getCrit() {
        return crit;
    }

    public static void setCrit(final int crit) {
        Backstab.crit = crit;
    }
}
