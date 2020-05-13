package pl.idzikpro.xcom.service.soldiers;

import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.mapper.SoldierStatsToSoldierEntityConverter;

public class AddCaptain implements AddSoldierInterface{
    @Override
    public SoldierEntity add(String nationality) {
        SoldierStats soldierStats=SoldierStatsRepository.getCaptainStats();
        soldierStats.drawUnitStats();
        soldierStats.setNationality(nationality);
        soldierStats.setArmourType("power suit");
        soldierStats.setPicture("power suit");
        return new SoldierStatsToSoldierEntityConverter().convert(soldierStats);
    }
}
