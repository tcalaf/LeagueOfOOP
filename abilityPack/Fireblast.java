package abilityPack;

import constants.Constants;
import hero.HeroClass;

import java.util.HashMap;
import java.util.Map;

public class Fireblast extends Ability {
    public Fireblast() {
        super(Constants.getFireblastDmg(), Constants.getFireblastDmgPerLvl());
    }

    private static Map<HeroClass, Float> fireblastRMod = new HashMap<>() {{
        put(HeroClass.ROGUE, 0.8f);
        put(HeroClass.KNIGHT, 1.2f);
        put(HeroClass.PYROMANCER, 0.9f);
        put(HeroClass.WIZARD, 1.05f);
    }};
}
