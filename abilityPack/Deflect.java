package abilityPack;

import constants.Constants;
import hero.HeroClass;

import java.util.HashMap;
import java.util.Map;

public class Deflect extends Ability {
    private final float limit = Constants.getDeflectLimit();

    public Deflect() {
        super(Constants.getDeflectDmg(), Constants.getDeflectDmgPerLvl());
    }

    private static Map<HeroClass, Float> deflectRMod = new HashMap<>() {{
        put(HeroClass.ROGUE, 1.2f);
        put(HeroClass.KNIGHT, 1.4f);
        put(HeroClass.PYROMANCER, 1.3f);
        put(HeroClass.WIZARD, 0.0f);
    }};
}
