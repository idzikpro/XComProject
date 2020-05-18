package pl.idzikpro.xcom.service.soldiers;

import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.converters.SoldierStatsToSoldierEntityConverter;

public class AddColonel implements AddSoldierInterface {
    @Override
    public SoldierEntity add(String nationality) {
        SoldierStats soldierStats = SoldierStatsRepository.getColonelStats();
        soldierStats.drawUnitStats();
        soldierStats.setNationality(nationality);
        soldierStats.setArmourType("flying suit");
        soldierStats.setPicture("flying suit");
        return new SoldierStatsToSoldierEntityConverter().convert(soldierStats);
    }
}