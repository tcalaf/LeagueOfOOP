package abilityPack;

import constants.Constants;
import hero.HeroClass;

import java.util.HashMap;
import java.util.Map;

public class Slam extends Ability {
    private final int duration = Constants.getSlamDuration();

    public Slam() {
        super(Constants.getSlamDmg(), Constants.getSlamDmgPerLvl());
    }

    private static Map<HeroClass, Float> slamRMod = new HashMap<>() {{
        put(HeroClass.ROGUE, 0.8f);
        put(HeroClass.KNIGHT, 1.2f);
        put(HeroClass.PYROMANCER, 0.9f);
        put(HeroClass.WIZARD, 1.05f);
    }};
}
