package heropack;

import abilitypack.Execute;
import abilitypack.Slam;
import constants.Constants;
import game.Position;
import map.Terrain;

import java.util.ArrayList;

public final class Knight extends Hero {

    public Knight(final Position position) {
        super(HeroClass.KNIGHT, position, Constants.getKnightHp(),
                Constants.getKnightHpLvl(), new ArrayList<>() {{
                    add(new Execute());
                    add(new Slam());
                }});
    }

    @Override
    public int getMaxHP() {
        return Constants.getKnightHp()
                + Constants.getKnightHpLvl() * getLvl(this.getXp());
    }

    @Override
    public float terrainMultiplier(final Terrain terrain) {
        if (terrain == Terrain.LAND) {
            return Constants.getLandMod();
        }
        return 1f;
    }

}
