package hero;

import abilityPack.Deflect;
import abilityPack.Drain;
import abilityPack.Execute;
import abilityPack.Slam;
import constants.Constants;
import gameEngine.Position;
import map.Terrain;

import java.util.ArrayList;

public class Wizard extends Hero{

    public Wizard(Position position) {
        super(HeroClass.WIZARD, position, Constants.getWizardHP(),
                Constants.getWizardHPperLvl(), new ArrayList<>() {{
                    add(new Drain());
                    add(new Deflect());
                }});
    }

    @Override
    void refillHP() {
        setHP(Constants.getWizardHP() + Constants.getWizardHPperLvl() * getLvl(this.getXP()));
    }

    @Override
    float terrainMultiplier(Terrain terrain) {
        if(terrain == Terrain.DESERT) {
            return 1.1f;
        }
        return 1f;
    }
}
