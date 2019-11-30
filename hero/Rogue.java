package hero;

import abilityPack.Backstab;
import abilityPack.Execute;
import abilityPack.Paralysis;
import abilityPack.Slam;
import constants.Constants;
import gameEngine.Position;
import map.Terrain;

import java.util.ArrayList;

public class Rogue extends Hero{

    public Rogue(Position position) {
        super(HeroClass.ROGUE, position, Constants.getRogueHP(),
                Constants.getRogueHPperLvl(), new ArrayList<>() {{
                    add(new Backstab());
                    add(new Paralysis());
                }});
    }

    @Override
    void refillHP() {
        setHP(Constants.getRogueHP() + Constants.getRogueHPperLvl() * getLvl(this.getXP()));
    }

    @Override
    float terrainMultiplier(Terrain terrain) {
        if(terrain == Terrain.WOODS) {
            return 1.15f;
        }
        return 1f;
    }
}
