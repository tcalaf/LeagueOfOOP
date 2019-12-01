package abilitypack;

import constants.Constants;
import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;

import java.util.HashMap;
import java.util.Map;

public final class Execute extends Ability {
    private final float lowHPLimit = Constants.getExecuteLowHpLimit();
    private final float maxHPLimit = Constants.getExecuteMaxHpLimit();
    private final float lvlHPLimit = Constants.getExecuteLvlHpLimit();

    public Execute() {
        super(Constants.getExecuteDmg(), Constants.getExecuteDmgPerLvl());
    }

    private static Map<HeroClass, Float> executeRaceMod = new HashMap<>() {{
        put(HeroClass.ROGUE, Constants.getExecuteR());
        put(HeroClass.KNIGHT, Constants.getExecuteK());
        put(HeroClass.PYROMANCER, Constants.getExecuteP());
        put(HeroClass.WIZARD, Constants.getExecuteW());
    }};

    @Override
    public void injure(final Hero source, final Hero receiver, final MiniMap minimap) {
        float pureDamage = this.getBaseDmg() + this.getLevelUpAddDmg()
                * Hero.getLvl(source.getXp());
        float modDamage = pureDamage * executeRaceMod.get(receiver.getHeroClass())
                * source.terrainMultiplier(minimap.getTerrain(source.getPosition()));

        float hpLimit = Math.min(lowHPLimit + Hero.getLvl(source.getXp())
                * lvlHPLimit, maxHPLimit) * source.getMaxHP();
        if (hpLimit  > receiver.getMaxHP()) {
            receiver.getInjured(receiver.getHp());
        } else {
            receiver.getInjured(Math.round(modDamage));
        }
    }
}
