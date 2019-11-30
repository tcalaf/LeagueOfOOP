package abilityPack;

import constants.Constants;
import hero.HeroClass;

import java.util.HashMap;
import java.util.Map;

public class Ignite extends Ability {
    private final int roundDmg = Constants.getIgniteRoundDmg();
    private final int roundLvlDmg = Constants.getIgniteRoundLvlDmg();
    private final int duration = Constants.getIgniteDuration();

    public Ignite() {
        super(Constants.getIgniteDmg(), Constants.getIgniteDmgPerLvl());
    }

    private static Map<HeroClass, Float> igniteRMod = new HashMap<>() {{
        put(HeroClass.ROGUE, 0.8f);
        put(HeroClass.KNIGHT, 1.2f);
        put(HeroClass.PYROMANCER, 0.9f);
        put(HeroClass.WIZARD, 1.05f);
    }};
}
