package heropack;

import abilitypack.Fireblast;
import abilitypack.Ignite;
import constants.Constants;
import game.Position;
import map.Terrain;

import java.util.ArrayList;

public final class Pyromancer extends Hero {

    public Pyromancer(final Position position) {
        super(HeroClass.PYROMANCER, position, Constants.getPyromancerHp(),
                Constants.getPyromancerHpPerLvl(), new ArrayList<>() {{
                    add(new Fireblast());
                    add(new Ignite());
                }});
    }

    @Override
    public int getMaxHP() {
        return Constants.getPyromancerHp()
                + Constants.getPyromancerHpPerLvl() * getLvl(this.getXp());
    }

    @Override
    public float terrainMultiplier(final Terrain terrain) {
        if (terrain == Terrain.VOLCANIC) {
            return Constants.getVolcanicMod();
        }
        return 1f;
    }
}
