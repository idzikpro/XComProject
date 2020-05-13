package pl.idzikpro.xcom.service.soldiers;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import pl.idzikpro.xcom.stats.soldier.SquaddieStats;

import static pl.idzikpro.xcom.tools.Tools.drawNumber;

@ToString
@Data
@Builder
public class SoldierStats {
    private String rank;
    private String nationality;
    private int timeUnitsMin;
    private int timeUnitsMax;
    private int energyMin;
    private int energyMax;
    private int healthMin;
    private int healthMax;
    private int braveryMin;
    private int braveryMax;
    private int reactionsMin;
    private int reactionsMax;
    private int firingAccuracyMin;
    private int firingAccuracyMax;
    private int throwingAccuracyMin;
    private int throwingAccuracyMax;
    private int strengthMin;
    private int strengthMax;
    private int psiSkillMin;
    private int psiSkillMax;
    private int psiStrengthMin;
    private int psiStrengthMax;
    private int meleeAccuracyMin;
    private int meleeAccuracyMax;
    private int missionsMix;
    private int missionsMax;
    private int killedMin;
    private int killedMax;

    private int timeUnits;
    private int energy;
    private int health;
    private int bravery;
    private int reactions;
    private int firingAccuracy;
    private int throwingAccuracy;
    private int strength;
    private int psiSkill;
    private int psiStrength;
    private int meleeAccuracy;
    private int missions;
    private int killed;
    private String armourType;
    private String picture;

    public void drawUnitStats(){
        this.timeUnits = drawNumber(SquaddieStats.TIME_UNITS_MIN, SquaddieStats.TIME_UNITS_MAX);
        this.energy = drawNumber(SquaddieStats.ENERGY_MIN, SquaddieStats.ENERGY_MAX);
        this.health = drawNumber(SquaddieStats.HEALTH_MIN, SquaddieStats.HEALTH_MAX);
        this.bravery = drawNumber(SquaddieStats.BRAVERY_MIN, SquaddieStats.BRAVERY_MAX);
        this.reactions = drawNumber(SquaddieStats.REACTIONS_MIN, SquaddieStats.REACTIONS_MAX);
        this.firingAccuracy = drawNumber(SquaddieStats.FIRING_ACCURACY_MIN, SquaddieStats.FIRING_ACCURACY_MAX);
        this.throwingAccuracy = drawNumber(SquaddieStats.THROWING_ACCURACY_MIN, SquaddieStats.THROWING_ACCURACY_MAX);
        this.strength = drawNumber(SquaddieStats.STRENGTH_MIN, SquaddieStats.STRENGTH_MAX);
        this.psiSkill = drawNumber(SquaddieStats.PSI_SKILL_MIN, SquaddieStats.PSI_SKILL_MAX);
        this.psiStrength = drawNumber(SquaddieStats.PSI_STRENGTH_MIN, SquaddieStats.PSI_STRENGTH_MAX);
        this.meleeAccuracy = drawNumber(SquaddieStats.MELEE_ACCURACY_MIN, SquaddieStats.MELEE_ACCURACY_MAX);
        this.missions = drawNumber(SquaddieStats.MISSIONS_MIN, SquaddieStats.MISSIONS_MAX);
        this.killed = drawNumber(SquaddieStats.KILLED_MIN, SquaddieStats.KILLED_MAX);
    }

    public void setArmourType(String armourType){
        this.armourType=armourType;
    }

    public void setPicture(String picture){
        this.picture=picture;
    }

    public void setNationality(String nationality){
        this.nationality=nationality;
    }
}
