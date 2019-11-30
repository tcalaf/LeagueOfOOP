package hero;

import abilityPack.Fireblast;
import abilityPack.Ignite;
import constants.Constants;
import gameEngine.Position;
import map.Terrain;

import java.util.ArrayList;

public class Pyromancer extends Hero {

    public Pyromancer(Position position) {
        super(HeroClass.PYROMANCER, position, Constants.getPyromancerHP(),
                Constants.getPyromancerHPperLvl(),new ArrayList<>() {{
                    add(new Fireblast());
                    add(new Ignite());
                }});
    }

    @Override
    void refillHP() {
        setHP(Constants.getPyromancerHP() + Constants.getPyromancerHPperLvl() * getLvl(this.getXP()));
    }

    @Override
    float terrainMultiplier(Terrain terrain) {
        if(terrain == Terrain.VOLCANIC) {
            return 1.25f;
        }
        return 1f;
    }
}
