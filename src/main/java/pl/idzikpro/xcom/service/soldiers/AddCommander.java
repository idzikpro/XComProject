package pl.idzikpro.xcom.service.soldiers;

import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.converters.SoldierStatsToSoldierEntityConverter;

public class AddCommander implements AddSoldierInterface{
    @Override
    public SoldierEntity add(String nationality) {
        SoldierStats soldierStats=SoldierStatsRepository.getCommanderStats();
        soldierStats.drawUnitStats();
        soldierStats.setNationality(nationality);
        soldierStats.setArmourType("flying suit");
        soldierStats.setPicture("flying suit");
        return new SoldierStatsToSoldierEntityConverter().convert(soldierStats);
    }
}
