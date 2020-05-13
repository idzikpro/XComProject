package pl.idzikpro.xcom.service.soldiers;

import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.converters.SoldierStatsToSoldierEntityConverter;

public class AddSergeant implements AddSoldierInterface{
    @Override
    public SoldierEntity add(String nationality) {
        SoldierStats soldierStats=SoldierStatsRepository.getSergeantStats();
        soldierStats.drawUnitStats();
        soldierStats.setNationality(nationality);
        soldierStats.setArmourType("personal armour");
        soldierStats.setPicture("personal armour");
        return new SoldierStatsToSoldierEntityConverter().convert(soldierStats);
    }
}
