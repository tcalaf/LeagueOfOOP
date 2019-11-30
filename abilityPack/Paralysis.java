package abilityPack;

import constants.Constants;
import hero.HeroClass;

import java.util.HashMap;
import java.util.Map;

public class Paralysis extends Ability {
    private final int duration = Constants.getParalysisDuration();
    private final int woodsDuration = Constants.getParalysisWoodsDuration();

    public Paralysis() {
        super(Constants.getParalysisDmg(), Constants.getParalysisDmgPerLvl());
    }

    private static Map<HeroClass, Float> paralysisRMod = new HashMap<>() {{
        put(HeroClass.ROGUE, 0.9f);
        put(HeroClass.KNIGHT, 0.8f);
        put(HeroClass.PYROMANCER, 1.2f);
        put(HeroClass.WIZARD, 1.25f);
    }};
}
