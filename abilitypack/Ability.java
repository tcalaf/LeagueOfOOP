package abilitypack;

import heropack.Hero;
import map.MiniMap;

public abstract class Ability {
    private final float baseDmg;
    private final float levelUpAddDmg;

    public Ability(final float baseDmg, final float levelUpAddDmg) {
        this.baseDmg = baseDmg;
        this.levelUpAddDmg = levelUpAddDmg;
    }

    public final float getBaseDmg() {
        return baseDmg;
    }

    public final float getLevelUpAddDmg() {
        return levelUpAddDmg;
    }

    // Each ability overrides injure using their own race modifier
    public abstract void injure(Hero source, Hero receiver,
                                MiniMap minimap);

}
