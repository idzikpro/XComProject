package pl.idzikpro.xcom.service.soldiers;

import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.mapper.SoldierStatsToSoldierEntityConverter;

public class AddRookie implements AddSoldierInterface{
    @Override
    public SoldierEntity add(String nationality) {
        SoldierStats soldierStats=SoldierStatsRepository.getRookieStats();
        soldierStats.drawUnitStats();
        soldierStats.setNationality(nationality);
        soldierStats.setArmourType("no-armour");
        soldierStats.setPicture("no-armour");
        return new SoldierStatsToSoldierEntityConverter().convert(soldierStats);
    }
}
