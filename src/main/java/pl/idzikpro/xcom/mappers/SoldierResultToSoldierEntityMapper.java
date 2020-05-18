package pl.idzikpro.xcom.mappers;

import pl.idzikpro.xcom.entity.SoldierEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoldierResultToSoldierEntityMapper {

    public SoldierEntity convert(SoldierEntity input, SoldierEntity output) {
        List<String> ranks = new ArrayList<>(Arrays.asList("rookie", "squaddie", "sergeant",
                "captain", "colonel", "commander"));
        List<String> armours = new ArrayList<>(Arrays.asList("none", "personal armour",
                "power suit", "flying suit"));
        if (ranks.contains(input.getRank().toLowerCase())) {
            output.setRank(input.getRank().toLowerCase());
        } else output.setRank("rookie");
        if (armours.contains(input.getArmourType().toLowerCase())) {
            output.setArmourType(input.getArmourType().toLowerCase());
        } else output.setArmourType("none");
        switch (input.getArmourType()) {
            case "personal armour": {
                output.setPicture("personal-armour");
                break;
            }
            case "power suit": {
                output.setPicture("power-suit");
                break;
            }
            case "flying suit": {
                output.setPicture("flying-suit");
                break;
            }
            default:
                output.setPicture("no-armour");
        }
        output.setName(input.getName());
        switch (input.getNationality()) {
            case "us": {
                output.setNationality("us");
                break;
            }
            case "gb": {
                output.setNationality("gb");
                break;
            }
            case "fr": {
                output.setNationality("fr");
                break;
            }
            case "de": {
                output.setNationality("de");
                break;
            }
            case "jp": {
                output.setNationality("jp");
                break;
            }
            default: {
                output.setNationality("ru");
            }
        }
        output.setTimeUnits(input.getTimeUnits());
        output.setEnergy(input.getEnergy());
        output.setHealth(input.getHealth());
        output.setBravery(input.getBravery());
        output.setReactions(input.getReactions());
        output.setFiringAccuracy(input.getFiringAccuracy());
        output.setThrowingAccuracy(input.getThrowingAccuracy());
        output.setStrength(input.getStrength());
        output.setPsiSkill(input.getPsiSkill());
        output.setPsiStrength(input.getPsiStrength());
        output.setMeleeAccuracy(input.getMeleeAccuracy());
        output.setMissions(input.getMissions());
        output.setKilled(input.getKilled());
        return output;
    }
}