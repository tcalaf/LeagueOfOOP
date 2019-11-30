package hero;

import abilityPack.Ability;
import constants.Constants;
import gameEngine.Position;
import map.Terrain;

import java.util.ArrayList;

public abstract class Hero {
    private int HP;
    private int XP = Constants.getBaseXP() ;
    private int levelUpAddHP;
    private HeroClass heroClass;
    private Position position;
    private ArrayList<Ability> abilities;

    public Hero(HeroClass heroClass, Position position, int HP, int levelUpAddHP, ArrayList<Ability> abilities) {
        this.heroClass = heroClass;
        this.position = position;
        this.HP = HP;
        this.levelUpAddHP = levelUpAddHP;
        this.abilities = abilities;
    }

    public static int getLvl(int XP) {
        if ((XP - Constants.getLvlOneConst()) >= 0) {
            return ((XP - Constants.getLvlOneConst()) / Constants.getLvlMultiplier()) + 1;
        }
        else {
            return Constants.getBaseLvl();
        }
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getXP() {
        return XP;
    }

    abstract void refillHP();

    public void checkLvlUp(int XP) {
        if(getLvl(XP) > getLvl(this.XP)) {
            this.refillHP();
        }
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public int getLevelUpAddHP() {
        return levelUpAddHP;
    }

    public void setLevelUpAddHP(int levelUpAddHP) {
        this.levelUpAddHP = levelUpAddHP;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    abstract float terrainMultiplier(Terrain terrain);


    public boolean isDead() {
        return getHP() <= 0;
    }
}
