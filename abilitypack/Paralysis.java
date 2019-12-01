package abilitypack;

import constants.Constants;
import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;
import map.Terrain;

import java.util.HashMap;
import java.util.Map;

public final class Paralysis extends Ability {
    private final int duration = Constants.getParalysisDuration();
    private final int woodsDuration = Constants.getPasalysiswoods();

    public Paralysis() {
        super(Constants.getParalysisDmg(), Constants.getParalysisDmgPerLvl());
    }

    private static Map<HeroClass, Float> paralysisRaceMod = new HashMap<>() {{
        put(HeroClass.ROGUE, Constants.getParalysisR());
        put(HeroClass.KNIGHT, Constants.getParalysisK());
        put(HeroClass.PYROMANCER, Constants.getParalysisP());
        put(HeroClass.WIZARD, Constants.getParalysisW());
    }};

    @Override
    public void injure(final Hero source, final Hero receiver, final MiniMap minimap) {
        float pureDamage = this.getBaseDmg() + this.getLevelUpAddDmg()
                * Hero.getLvl(source.getXp());
        float modDamage = pureDamage * paralysisRaceMod.get(receiver.getHeroClass())
                * source.terrainMultiplier(minimap.getTerrain(source.getPosition()));
        receiver.getInjured(Math.round(modDamage));

        int paralysis = duration;

        if (minimap.getTerrain(source.getPosition()) == Terrain.WOODS) {
            paralysis = woodsDuration;
        }
        receiver.setMoveIncapacity(paralysis);
    }
}
