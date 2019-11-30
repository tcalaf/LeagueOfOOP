package abilityPack;

public abstract class Ability {
    private final float baseDmg;
    private final float levelUpAddDmg;

    public Ability(float baseDmg, float levelUpAddDmg) {
        this.baseDmg = baseDmg;
        this.levelUpAddDmg = levelUpAddDmg;
    }

    public float getBaseDmg() {
        return baseDmg;
    }

    public float getLevelUpAddDmg() {
        return levelUpAddDmg;
    }

}
