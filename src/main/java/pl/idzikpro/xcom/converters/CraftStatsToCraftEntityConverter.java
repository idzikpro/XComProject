package pl.idzikpro.xcom.converters;

import org.springframework.core.convert.converter.Converter;
import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.service.craft.CraftStats;

public class CraftStatsToCraftEntityConverter implements Converter<CraftStats, CraftEntity> {

    @Override
    public CraftEntity convert(CraftStats craftStats) {
        return CraftEntity.builder()
                .name(craftStats.getName())
                .maxSpeed(craftStats.getMaxSpeed())
                .acceleration(craftStats.getAcceleration())
                .damageCapacity(craftStats.getDamageCapacity())
                .fuelCapacity(craftStats.getFuelCapacity())
                .cargoSpace(craftStats.getCargoSpace())
                .hwpCapacity(craftStats.getHwpCapacity())
                .weaponPods(craftStats.getWeaponPods())
                .jpg0(craftStats.getJpg0())
                .jpg1(craftStats.getJpg1())
                .jpg2(craftStats.getJpg2())
                .jpg3(craftStats.getJpg3())
                .build();
    }
}