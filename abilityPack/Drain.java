package abilityPack;

import constants.Constants;
import hero.HeroClass;

import java.util.HashMap;
import java.util.Map;

public class Drain extends Ability {
    private final float HPLimit = Constants.getDrainHPLimit();
    public Drain() {
        super(Constants.getDrainDmg(), Constants.getDrainDmgPerLvl());
    }

    private static Map<HeroClass, Float> drainRMod = new HashMap<>() {{
        put(HeroClass.ROGUE, 0.8f);
        put(HeroClass.KNIGHT, 1.2f);
        put(HeroClass.PYROMANCER, 0.9f);
        put(HeroClass.WIZARD, 1.05f);
    }};
}
