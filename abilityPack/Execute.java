package abilityPack;

import constants.Constants;
import hero.HeroClass;

import java.util.HashMap;
import java.util.Map;

public class Execute extends Ability {
    private final float lowHPLimit = Constants.getExecuteLowHPLimit();
    private final float maxHPLimit = Constants.getExecuteMaxHPLimit();
    private final float lvlHPLimit = Constants.getExecuteLvlHPLimit();

    public Execute() {
        super(Constants.getExecuteDmg(), Constants.getExecuteDmgPerLvl());
    }

    private static Map<HeroClass, Float> executeRMod = new HashMap<>() {{
        put(HeroClass.ROGUE, 1.15f);
        put(HeroClass.KNIGHT, 1f);
        put(HeroClass.PYROMANCER, 1.1f);
        put(HeroClass.WIZARD, 0.8f);
    }};
}
