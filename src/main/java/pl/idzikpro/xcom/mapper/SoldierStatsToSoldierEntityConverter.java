package pl.idzikpro.xcom.mapper;

import org.springframework.core.convert.converter.Converter;
import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.service.soldiers.SoldierStats;
import pl.idzikpro.xcom.tools.SoldierNameService;
import pl.idzikpro.xcom.tools.SoldierService;

public class SoldierStatsToSoldierEntityConverter implements Converter<SoldierStats, SoldierEntity> {
    @Override
    public SoldierEntity convert(SoldierStats soldierStats) {
        return SoldierEntity.builder()
                .name(SoldierNameService.selectRandomName(soldierStats.getNationality()))
                .nationality(soldierStats.getNationality())
                .rank(soldierStats.getRank())
                .timeUnits(soldierStats.getTimeUnits())
                .energy(soldierStats.getEnergy())
                .health(soldierStats.getHealth())
                .bravery(soldierStats.getBravery())
                .reactions(soldierStats.getReactions())
                .firingAccuracy(soldierStats.getFiringAccuracy())
                .throwingAccuracy(soldierStats.getThrowingAccuracy())
                .strength(soldierStats.getStrength())
                .psiSkill(soldierStats.getPsiSkill())
                .psiStrength(soldierStats.getPsiStrength())
                .meleeAccuracy(soldierStats.getMeleeAccuracy())
                .missions(soldierStats.getMissions())
                .killed(soldierStats.getKilled())
                .armourType(soldierStats.getArmourType())
                .picture(soldierStats.getPicture())
                .build();
    }
}
