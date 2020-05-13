package pl.idzikpro.xcom.service.soldiers;

import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.converters.SoldierStatsToSoldierEntityConverter;

public class AddSquaddie implements AddSoldierInterface{
    @Override
    public SoldierEntity add(String nationality) {
        SoldierStats soldierStats=SoldierStatsRepository.getSquaddieStats();
        soldierStats.drawUnitStats();
        soldierStats.setNationality(nationality);
        soldierStats.setArmourType("no-armour");
        soldierStats.setPicture("no-armour");
        return new SoldierStatsToSoldierEntityConverter().convert(soldierStats);
    }
}
