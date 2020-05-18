package pl.idzikpro.xcom.service.soldiers;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

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

    public void drawUnitStats() {
        this.timeUnits = drawNumber(timeUnitsMin, timeUnitsMax);
        this.energy = drawNumber(energyMin, energyMax);
        this.health = drawNumber(healthMin, healthMax);
        this.bravery = drawNumber(braveryMin, braveryMax);
        this.reactions = drawNumber(reactionsMin, reactionsMax);
        this.firingAccuracy = drawNumber(firingAccuracyMin, firingAccuracyMax);
        this.throwingAccuracy = drawNumber(throwingAccuracyMin, throwingAccuracyMax);
        this.strength = drawNumber(strengthMin, strengthMax);
        this.psiSkill = drawNumber(psiSkillMin, psiSkillMax);
        this.psiStrength = drawNumber(psiStrengthMin, psiStrengthMax);
        this.meleeAccuracy = drawNumber(meleeAccuracyMin, meleeAccuracyMax);
        this.missions = drawNumber(missionsMix, missionsMax);
        this.killed = drawNumber(killedMin, killedMax);
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}