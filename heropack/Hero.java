package heropack;

import abilitypack.Ability;
import constants.Constants;
import game.Position;
import map.MiniMap;
import map.Terrain;

import java.util.ArrayList;

public abstract class Hero {
    private int hp;
    private int xp = Constants.getBasexp();
    private int levelUpAddHP;
    private HeroClass heroClass;
    private Position position;
    private ArrayList<Ability> abilities;
    private int overTimeDmg = 0;
    private int overTimeDuration = 0;
    private int moveIncapacity = 0;

    public Hero(final HeroClass heroClass, final Position position, final int hp,
                final int levelUpAddHP, final ArrayList<Ability> abilities) {
        this.heroClass = heroClass;
        this.position = position;
        this.hp = hp;
        this.levelUpAddHP = levelUpAddHP;
        this.abilities = abilities;
    }

    public static int getLvl(final int xp) {
        if ((xp - Constants.getLvlOneConst()) >= 0) {
            return ((xp - Constants.getLvlOneConst()) / Constants.getLvlMultiplier()) + 1;
        } else {
            return Constants.getBaseLvl();
        }
    }

    public final int getHp() {
        return hp;
    }

    public final char getRace() {
        switch (heroClass) {
            case WIZARD: return 'W';
            case ROGUE: return 'R';
            case KNIGHT: return 'K';
            case PYROMANCER: return 'P';
            default: return '?';
        }
    }

    public final int getMoveIncapacity() {
        return moveIncapacity;
    }

    public final void setMoveIncapacity(final int moveIncapacity) {
        this.moveIncapacity = moveIncapacity;
    }

    public abstract int getMaxHP();

    public final void setHp(final int hp) {
        this.hp = hp;
    }

    public final int getXp() {
        return xp;
    }

    public final void setOvertimeDmg(final int overTimeDmg) {
        this.overTimeDmg = overTimeDmg;
    }

    public final int getOverTimeDmg() {
        return overTimeDmg;
    }

    public final int getOverTimeDuration() {
        return overTimeDuration;
    }

    public final void setOverTimeDuration(final int overTimeDuration) {
        this.overTimeDuration = overTimeDuration;
    }

    // Method used by spell to damage players
    public final void fight(final Hero enemy, final MiniMap minimap) {
        for (int skill = 0; skill < this.getAbilities().size(); skill++) {
            this.getAbilities().get(skill).injure(this, enemy, minimap);
        }
    }

    public final HeroClass getHeroClass() {
        return heroClass;
    }

    public final Position getPosition() {
        return position;
    }

    public final void setPosition(final Position position) {
        this.position = position;
    }

    public final ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public abstract float terrainMultiplier(Terrain terrain);


    public final boolean isDead() {
        return getHp() <= 0;
    }

    public final void getInjured(final int dmg) {
        this.hp -= dmg;
    }
}
