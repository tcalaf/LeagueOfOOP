package heropack;

import abilitypack.Backstab;
import abilitypack.Paralysis;
import constants.Constants;
import game.Position;
import map.Terrain;

import java.util.ArrayList;

public final class Rogue extends Hero {

    public Rogue(final Position position) {
        super(HeroClass.ROGUE, position, Constants.getRogueHp(),
                Constants.getRogueHpLvl(), new ArrayList<>() {{
                    add(new Backstab());
                    add(new Paralysis());
                }});
    }

    @Override
    public int getMaxHP() {
        return Constants.getRogueHp()
                + Constants.getRogueHpLvl() * getLvl(this.getXp());
    }

    @Override
    public float terrainMultiplier(final Terrain terrain) {
        if (terrain == Terrain.WOODS) {
            return Constants.getWoodsMod();
        }
        return 1f;
    }
}
