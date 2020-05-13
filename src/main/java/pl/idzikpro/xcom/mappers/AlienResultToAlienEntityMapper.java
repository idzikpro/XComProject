package pl.idzikpro.xcom.mappers;

import pl.idzikpro.xcom.entity.AlienEntity;
import pl.idzikpro.xcom.tools.Tools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlienResultToAlienEntityMapper {
    public static AlienEntity convert(AlienEntity input,AlienEntity output){
//        List<String> ranks=new ArrayList<>(Arrays.asList("soldier","medic","engineer","navigator","terrorist","leader","commander"));
        List<String> breeds=new ArrayList<>(Arrays.asList("celatid","chryssalid","cyberdisc",
                "ethereal","floater","muton","reaper","sectoid","sectopod","silacoid",
                "snakeman","zombie"));
        List<String> ranksOfEthereal=new ArrayList<>(Arrays.asList(
                "soldier","leader","commander"
        ));
        List<String> ranksOfFloater=new ArrayList<>(Arrays.asList(
                "soldier","medic","engineer","navigator","leader","commander"
        ));
        List<String> ranksOfMuton=new ArrayList<>(Arrays.asList(
                "soldier","leader","commander"
        ));
        List<String> ranksOfSectoid=new ArrayList<>(Arrays.asList(
                "soldier","medic","engineer","navigator","leader","commander"
        ));
        List<String> ranksOfSnakeman=new ArrayList<>(Arrays.asList(
                "soldier","engineer","navigator","leader","commander"
        ));
        if (breeds.contains(input.getBreed().toLowerCase())){
            output.setBreed(input.getBreed().toLowerCase());
        }
        else output.setBreed("sectoid");
        switch (output.getBreed()){
            case "celatid": case "chryssalid": case "cyberdisc":
            case "reaper": case "sectopod": case "silacoid":
            case "zombie": {
                output.setRank("terrorist");
                break;
            }
            case "ethereal": {
                if (ranksOfEthereal.contains(input.getRank().toLowerCase())){
                    output.setRank(input.getRank().toLowerCase());
                }
                else output.setRank(ranksOfEthereal.get(Tools.drawNumber(0,ranksOfEthereal.size()-1)));
                break;
            }
            case "floater": {
                if (ranksOfFloater.contains(input.getRank().toLowerCase())){
                    output.setRank(input.getRank().toLowerCase());
                }
                else output.setRank(ranksOfFloater.get(Tools.drawNumber(0,ranksOfFloater.size()-1)));
                break;
            }
            case "muton": {
                if (ranksOfMuton.contains(input.getRank().toLowerCase())){
                    output.setRank(input.getRank().toLowerCase());
                }
                else output.setRank(ranksOfMuton.get(Tools.drawNumber(0,ranksOfMuton.size()-1)));
                break;
            }
            case "sectoid": {
                if (ranksOfSectoid.contains(input.getRank().toLowerCase())){
                    output.setRank(input.getRank().toLowerCase());
                }
                else output.setRank(ranksOfSectoid.get(Tools.drawNumber(0,ranksOfSectoid.size()-1)));
                break;
            }
            case "snakeman": {
                if (ranksOfSnakeman.contains(input.getRank().toLowerCase())){
                    output.setRank(input.getRank().toLowerCase());
                }
                else output.setRank(ranksOfSnakeman.get(Tools.drawNumber(0,ranksOfSnakeman.size()-1)));
                break;
            }
        }
        output.setTimeUnits(input.getTimeUnits());
        output.setHealth(input.getHealth());
        output.setEnergy(input.getEnergy());
        output.setReactions(input.getReactions());
        output.setStrength(input.getStrength());
        output.setBravery(input.getBravery());
        output.setFiringAccuracy(input.getFiringAccuracy());
        output.setThrowingAccuracy(input.getThrowingAccuracy());
        output.setPsiSkill(input.getPsiSkill());
        output.setPsiStrength(input.getPsiStrength());
        output.setMeleeAccuracy(input.getMeleeAccuracy());
        output.setArmourFront(input.getArmourFront());
        output.setArmourLeft(input.getArmourLeft());
        output.setArmourRight(input.getArmourRight());
        output.setArmourRear(input.getArmourRear());
        output.setArmourUnder(input.getArmourUnder());
        output.setEnergyRecovery(input.getEnergyRecovery());
        output.setVictoryPoints(input.getVictoryPoints());
        output.setAggression(input.getAggression());
        output.setIntelligence(input.getIntelligence());
        output.setHeightStanding(input.getHeightStanding());
        output.setHeightKneeling(input.getHeightKneeling());
        return output;
    }
}
