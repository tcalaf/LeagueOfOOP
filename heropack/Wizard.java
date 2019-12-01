package heropack;

import abilitypack.Deflect;
import abilitypack.Drain;
import constants.Constants;
import game.Position;
import map.Terrain;

import java.util.ArrayList;

public final class Wizard extends Hero {

    public Wizard(final Position position) {
        super(HeroClass.WIZARD, position, Constants.getWizardHp(),
                Constants.getWizardHpLvl(), new ArrayList<>() {{
                    add(new Drain());
                    add(new Deflect());
                }});
    }

    @Override
    public int getMaxHP() {
        return Constants.getWizardHp()
                + Constants.getWizardHpLvl() * getLvl(this.getXp());
    }

    @Override
    public float terrainMultiplier(final Terrain terrain) {
        if (terrain == Terrain.DESERT) {
            return Constants.getDesertMod();
        }
        return 1f;
    }
}
