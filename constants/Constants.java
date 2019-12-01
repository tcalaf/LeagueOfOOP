package constants;

public final class Constants {
    private Constants() {
    }
    private static final int BASEXP = 0;
    private static final int LVL_ONE_CONST = 250;
    private static final int LVL_MULTIPLIER = 50;
    private static final int BASE_LVL = 0;
    private static final int PYROMANCER_HP = 500;
    private static final int PYROMANCER_HP_PER_LVL = 50;
    private static final int KNIGHT_HP = 900;
    private static final int KNIGHT_HP_LVL = 80;
    private static final int ROGUE_HP = 600;
    private static final int ROGUE_HP_LVL = 40;
    private static final int WIZARD_HP = 400;
    private static final int WIZARD_HP_LVL = 30;
    private static final int FIREBLAST_DMG = 350;
    private static final int FIREBLAST_DMG_PER_LVL = 50;
    private static final int IGNITE_DMG = 150;
    private static final int IGNITE_DMG_PER_LVL = 20;
    private static final int IGNITE_ROUND_DMG = 50;
    private static final int IGNITE_ROUND_LVL_DMG = 30;
    private static final int IGNITE_DURATION = 2;
    private static final int EXECUTE_DMG = 200;
    private static final int EXECUTE_DMG_PER_LVL = 30;
    private static final float EXECUTE_LOW_HP_LIMIT = 0.2f;
    private static final float EXECUTE_LVL_HP_LIMIT = 0.01f;
    private static final float EXECUTE_MAX_HP_LIMIT = 0.4f;
    private static final int SLAM_DMG = 100;
    private static final int SLAM_DMG_PER_LVL = 40;
    private static final int SLAM_DURATION = 1;
    private static final float DRAIN_DMG = 0.2f;
    private static final float DRAIN_DMG_PER_LVL = 0.05f;
    private static final float DRAIN_HP_LIMIT = 0.3f;
    private static final float DEFLECT_DMG = 0.35f;
    private static final float DEFLECT_DMG_PER_LVL = 0.02f;
    private static final int BACKSTAB_DMG = 200;
    private static final int BACKSTAB_DMG_PER_LVL = 20;
    private static final float BACKSTAB_CRITICAL = 1.5f;
    private static final int PARALYSIS_DMG = 40;
    private static final int PARALYSIS_DMG_PER_LVL = 10;
    private static final int PARALYSIS_DURATION = 3;
    private static final int PASALYSISWOODS = 6;
    private static final float BACKSTAB_R = 1.2f;
    private static final float BACKSTAB_K = 0.9f;
    private static final float BACKSTAB_P = 1.25f;
    private static final float BACKSTAB_W = 1.25f;
    private static final float DEFLECT_R = 1.2f;
    private static final float DEFLECT_K = 1.4f;
    private static final float DEFLECT_P = 1.3f;
    private static final float DEFLECT_W = 0.0f;
    private static final float DRAIN_R = 0.8f;
    private static final float DRAIN_K = 1.2f;
    private static final float DRAIN_P = 0.9f;
    private static final float DRAIN_W = 1.05f;
    private static final float EXECUTE_R = 1.15f;
    private static final float EXECUTE_K = 1f;
    private static final float EXECUTE_P = 1.1f;
    private static final float EXECUTE_W = 0.8f;
    private static final float FIREBLAST_R = 0.8f;
    private static final float FIREBLAST_K = 1.2f;
    private static final float FIREBLAST_P = 0.9f;
    private static final float FIREBLAST_W = 1.05f;
    private static final float IGNITE_R = 0.8f;
    private static final float IGNITE_K = 1.2f;
    private static final float IGNITE_P = 0.9f;
    private static final float IGNITE_W = 1.05f;
    private static final float PARALYSIS_R = 0.9f;
    private static final float PARALYSIS_K = 0.8f;
    private static final float PARALYSIS_P = 1.2f;
    private static final float PARALYSIS_W = 1.25f;
    private static final float SLAM_R = 0.8f;
    private static final float SLAM_K = 1.2f;
    private static final float SLAM_P = 0.9f;
    private static final float SLAM_W = 1.05f;
    private static final float VOLCANIC_MOD = 1.25f;
    private static final float LAND_MOD = 1.15f;
    private static final float DESERT_MOD = 1.1f;
    private static final float WOODS_MOD = 1.15f;

    public static float getVolcanicMod() {
        return VOLCANIC_MOD;
    }

    public static float getLandMod() {
        return LAND_MOD;
    }

    public static float getDesertMod() {
        return DESERT_MOD;
    }

    public static float getWoodsMod() {
        return WOODS_MOD;
    }

    public static int getParalysisDmg() {
        return PARALYSIS_DMG;
    }

    public static int getParalysisDmgPerLvl() {
        return PARALYSIS_DMG_PER_LVL;
    }

    public static int getParalysisDuration() {
        return PARALYSIS_DURATION;
    }

    public static int getPasalysiswoods() {
        return PASALYSISWOODS;
    }

    public static float getDeflectDmg() {
        return DEFLECT_DMG;
    }

    public static float getDeflectDmgPerLvl() {
        return DEFLECT_DMG_PER_LVL;
    }

    public static int getBackstabDmg() {
        return BACKSTAB_DMG;
    }

    public static int getBackstabDmgPerLvl() {
        return BACKSTAB_DMG_PER_LVL;
    }

    public static float getBackstabCritical() {
        return BACKSTAB_CRITICAL;
    }

    public static int getBasexp() {
        return BASEXP;
    }

    public static int getLvlOneConst() {
        return LVL_ONE_CONST;
    }

    public static int getLvlMultiplier() {
        return LVL_MULTIPLIER;
    }

    public static int getBaseLvl() {
        return BASE_LVL;
    }

    public static int getPyromancerHp() {
        return PYROMANCER_HP;
    }

    public static int getPyromancerHpPerLvl() {
        return PYROMANCER_HP_PER_LVL;
    }

    public static int getKnightHp() {
        return KNIGHT_HP;
    }

    public static int getKnightHpLvl() {
        return KNIGHT_HP_LVL;
    }

    public static int getRogueHp() {
        return ROGUE_HP;
    }

    public static int getRogueHpLvl() {
        return ROGUE_HP_LVL;
    }

    public static int getWizardHp() {
        return WIZARD_HP;
    }

    public static int getWizardHpLvl() {
        return WIZARD_HP_LVL;
    }

    public static int getFireblastDmg() {
        return FIREBLAST_DMG;
    }

    public static int getFireblastDmgPerLvl() {
        return FIREBLAST_DMG_PER_LVL;
    }

    public static int getIgniteDmg() {
        return IGNITE_DMG;
    }

    public static int getIgniteDmgPerLvl() {
        return IGNITE_DMG_PER_LVL;
    }

    public static int getIgniteRoundDmg() {
        return IGNITE_ROUND_DMG;
    }

    public static int getIgniteRoundLvlDmg() {
        return IGNITE_ROUND_LVL_DMG;
    }

    public static int getIgniteDuration() {
        return IGNITE_DURATION;
    }

    public static int getExecuteDmg() {
        return EXECUTE_DMG;
    }

    public static int getExecuteDmgPerLvl() {
        return EXECUTE_DMG_PER_LVL;
    }

    public static float getExecuteLowHpLimit() {
        return EXECUTE_LOW_HP_LIMIT;
    }

    public static float getExecuteLvlHpLimit() {
        return EXECUTE_LVL_HP_LIMIT;
    }

    public static float getExecuteMaxHpLimit() {
        return EXECUTE_MAX_HP_LIMIT;
    }

    public static int getSlamDmg() {
        return SLAM_DMG;
    }

    public static int getSlamDmgPerLvl() {
        return SLAM_DMG_PER_LVL;
    }

    public static int getSlamDuration() {
        return SLAM_DURATION;
    }

    public static float getDrainDmg() {
        return DRAIN_DMG;
    }

    public static float getDrainDmgPerLvl() {
        return DRAIN_DMG_PER_LVL;
    }

    public static float getDrainHpLimit() {
        return DRAIN_HP_LIMIT;
    }

    public static int getPASALYSISWOODS() {
        return PASALYSISWOODS;
    }

    public static float getBackstabR() {
        return BACKSTAB_R;
    }

    public static float getBackstabK() {
        return BACKSTAB_K;
    }

    public static float getBackstabP() {
        return BACKSTAB_P;
    }

    public static float getBackstabW() {
        return BACKSTAB_W;
    }

    public static float getDeflectR() {
        return DEFLECT_R;
    }

    public static float getDeflectK() {
        return DEFLECT_K;
    }

    public static float getDeflectP() {
        return DEFLECT_P;
    }

    public static float getDeflectW() {
        return DEFLECT_W;
    }

    public static float getDrainR() {
        return DRAIN_R;
    }

    public static float getDrainK() {
        return DRAIN_K;
    }

    public static float getDrainP() {
        return DRAIN_P;
    }

    public static float getDrainW() {
        return DRAIN_W;
    }

    public static float getExecuteR() {
        return EXECUTE_R;
    }

    public static float getExecuteK() {
        return EXECUTE_K;
    }

    public static float getExecuteP() {
        return EXECUTE_P;
    }

    public static float getExecuteW() {
        return EXECUTE_W;
    }

    public static float getFireblastR() {
        return FIREBLAST_R;
    }

    public static float getFireblastK() {
        return FIREBLAST_K;
    }

    public static float getFireblastP() {
        return FIREBLAST_P;
    }

    public static float getFireblastW() {
        return FIREBLAST_W;
    }

    public static float getIgniteR() {
        return IGNITE_R;
    }

    public static float getIgniteK() {
        return IGNITE_K;
    }

    public static float getIgniteP() {
        return IGNITE_P;
    }

    public static float getIgniteW() {
        return IGNITE_W;
    }

    public static float getParalysisR() {
        return PARALYSIS_R;
    }

    public static float getParalysisK() {
        return PARALYSIS_K;
    }

    public static float getParalysisP() {
        return PARALYSIS_P;
    }

    public static float getParalysisW() {
        return PARALYSIS_W;
    }

    public static float getSlamR() {
        return SLAM_R;
    }

    public static float getSlamK() {
        return SLAM_K;
    }

    public static float getSlamP() {
        return SLAM_P;
    }

    public static float getSlamW() {
        return SLAM_W;
    }
}
