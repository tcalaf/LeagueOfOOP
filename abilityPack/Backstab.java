package abilityPack;

import constants.Constants;
import hero.HeroClass;

import java.util.HashMap;
import java.util.Map;

public class Backstab extends Ability {
    private final float critical = Constants.getBackstabCritical();
    private final float criticalTime = Constants.getBackstabCriticalGO();
    private int criticalCount = 0;

    public Backstab() {
        super(Constants.getBackstabDmg(), Constants.getBackstabDmgPerLvl());
    }

    private static Map<HeroClass, Float> backstabRMod = new HashMap<>() {{
        put(HeroClass.ROGUE, 1.2f);
        put(HeroClass.KNIGHT, 0.9f);
        put(HeroClass.PYROMANCER, 1.25f);
        put(HeroClass.WIZARD, 1.25f);
    }};
}
