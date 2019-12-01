package abilitypack;

import constants.Constants;
import heropack.Hero;
import heropack.HeroClass;
import map.MiniMap;

import java.util.HashMap;
import java.util.Map;

public final class Drain extends Ability {
    private final float hpLimit = Constants.getDrainHpLimit();
    public Drain() {
        super(Constants.getDrainDmg(), Constants.getDrainDmgPerLvl());
    }

    private static Map<HeroClass, Float> drainRaceMod = new HashMap<>() {{
        put(HeroClass.ROGUE, Constants.getDrainR());
        put(HeroClass.KNIGHT, Constants.getDrainK());
        put(HeroClass.PYROMANCER, Constants.getDrainP());
        put(HeroClass.WIZARD, Constants.getDrainW());
    }};

    @Override
    public void injure(final Hero source, final Hero receiver, final MiniMap minimap) {
        float percentage = this.getBaseDmg() + this.getLevelUpAddDmg()
                * Hero.getLvl(source.getXp());
        float baseHP = Math.min(hpLimit * receiver.getMaxHP(), receiver.getHp());
        float modDamage = percentage * baseHP * drainRaceMod.get(receiver.getHeroClass())
                * source.terrainMultiplier(minimap.getTerrain(source.getPosition()));
        receiver.getInjured(Math.round(modDamage));
    }
}
