package hero;

import abilityPack.Execute;
import abilityPack.Slam;
import constants.Constants;
import gameEngine.Position;
import map.Terrain;

import java.util.ArrayList;

public class Knight extends Hero{

    public Knight(Position position) {
        super(HeroClass.KNIGHT, position, Constants.getKnightHP(),
                Constants.getKnightHPperLvl(), new ArrayList<>() {{
                    add(new Execute());
                    add(new Slam());
                }});
    }

    @Override
    void refillHP() {
        setHP(Constants.getKnightHP() + Constants.getKnightHPperLvl() * getLvl(this.getXP()));
    }

    @Override
    float terrainMultiplier(Terrain terrain) {
        if(terrain == Terrain.LAND) {
            return 1.15f;
        }
        return 1f;
    }
}
