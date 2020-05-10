package pl.idzikpro.xcom.service.aliens;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import pl.idzikpro.xcom.tools.Tools;

import java.util.List;

@ToString
@Data
@Builder
public class AlienStats {
    private String name;
    private String rank;
    private int timeUnitsMin;
    private int timeUnitsMax;
    private int healthMin;
    private int healthMax;
    private int energyMin;
    private int energyMax;
    private int reactionsMin;
    private int reactionsMax;
    private int strengthMin;
    private int strengthMax;
    private int braveryMin;
    private int braveryMax;
    private int firingAccuracyMin;
    private int firingAccuracyMax;
    private int throwingAccuracyMin;
    private int throwingAccuracyMax;
    private int psiSkillMin;
    private int psiSkillMax;
    private int psiStrengthMin;
    private int psiStrengthMax;
    private int meleeAccuracyMin;
    private int meleeAccuracyMax;
    private int armourFrontMin;
    private int armourFrontMax;
    private int armourLeftMin;
    private int armourLeftMax;
    private int armourRightMin;
    private int armourRightMax;
    private int armourRearMin;
    private int armourRearMax;
    private int armourUnderMin;
    private int armourUnderMax;
    private int energyRecoveryMin;
    private int energyRecoveryMax;
    private int victoryPointsMin;
    private int victoryPointsMax;
    private int aggressionMin;
    private int aggressionMax;
    private int intelligenceMin;
    private int intelligenceMax;
    private int heightStandingMin;
    private int heightStandingMax;
    private int heightKneelingMin;
    private int heightKneelingMax;
    private boolean validRankSoldier;
    private boolean validRankNavigator;
    private boolean validRankMedic;
    private boolean validRankEngineer;
    private boolean validRankTerrorist;
    private boolean validRankLeader;
    private boolean validRankCommander;
    private List<String> validRanks;

    private int timeUnits;
    private int health;
    private int energy;
    private int reactions;
    private int strength;
    private int bravery;
    private int firingAccuracy;
    private int throwingAccuracy;
    private int psiSkill;
    private int psiStrength;
    private int meleeAccuracy;
    private int armourFront;
    private int armourLeft;
    private int armourRight;
    private int armourRear;
    private int armourUnder;
    private int energyRecovery;
    private int victoryPoints;
    private int aggression;
    private int intelligence;
    private int heightStanding;
    private int heightKneeling;

    public void drawUnitStats(){
        this.timeUnits = Tools.drawNumber(timeUnitsMin, timeUnitsMax);
        this.health = Tools.drawNumber(healthMin, healthMax);
        this.energy = Tools.drawNumber(energyMin, energyMax);
        this.reactions = Tools.drawNumber(reactionsMin, reactionsMax);
        this.strength = Tools.drawNumber(strengthMin, strengthMax);
        this.bravery = Tools.drawNumber(braveryMin, braveryMax);
        this.firingAccuracy = Tools.drawNumber(firingAccuracyMin, firingAccuracyMax);
        this.throwingAccuracy = Tools.drawNumber(throwingAccuracyMin, throwingAccuracyMax);
        this.psiSkill = Tools.drawNumber(psiSkillMin, psiSkillMax);
        this.psiStrength = Tools.drawNumber(psiSkillMin, psiStrengthMax);
        this.meleeAccuracy = Tools.drawNumber(meleeAccuracyMin, meleeAccuracyMax);
        this.armourFront = Tools.drawNumber(armourFrontMin, armourFrontMax);
        this.armourLeft = Tools.drawNumber(armourLeftMin, armourLeftMax);
        this.armourRight = Tools.drawNumber(armourRightMin, armourRightMax);
        this.armourRear = Tools.drawNumber(armourRearMin, armourRearMax);
        this.armourUnder = Tools.drawNumber(armourUnderMin, armourUnderMax);
        this.energyRecovery = Tools.drawNumber(energyRecoveryMin, energyRecoveryMax);
        this.victoryPoints = Tools.drawNumber(victoryPointsMin, victoryPointsMax);
        this.aggression = Tools.drawNumber(aggressionMin, aggressionMax);
        this.intelligence = Tools.drawNumber(intelligenceMin, intelligenceMax);
        this.heightStanding = Tools.drawNumber(heightStandingMin, heightStandingMax);
        this.heightKneeling = Tools.drawNumber(heightKneelingMin, heightKneelingMax);
    }

    public void setRank(String rank){
        String alienRank;
        if (validRanks.contains(rank)) {
            alienRank = rank;
        } else {
            alienRank = validRanks.get(Tools.drawNumber(0, validRanks.size() - 1));
        }
        this.rank=alienRank;
    }
}
