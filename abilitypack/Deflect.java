package abilitypack;

import constants.Constants;
import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;

import java.util.HashMap;
import java.util.Map;

public final class Deflect extends Ability {

    public Deflect() {
        super(Constants.getDeflectDmg(), Constants.getDeflectDmgPerLvl());
    }

    private static Map<HeroClass, Float> deflectRaceMod = new HashMap<>() {{
        put(HeroClass.ROGUE, Constants.getDeflectR());
        put(HeroClass.KNIGHT, Constants.getDeflectK());
        put(HeroClass.PYROMANCER, Constants.getDeflectP());
        put(HeroClass.WIZARD, Constants.getDeflectW());
    }};

    @Override
    public void injure(final Hero source, final Hero receiver, final MiniMap minimap) {

    }
}
