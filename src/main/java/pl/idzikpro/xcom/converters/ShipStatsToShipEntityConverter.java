package pl.idzikpro.xcom.converters;

import org.springframework.core.convert.converter.Converter;
import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.service.ship.ShipStats;

public class ShipStatsToShipEntityConverter implements Converter<ShipStats, ShipEntity> {
    @Override
    public ShipEntity convert(ShipStats shipStats) {
        ShipEntity shipEntity = ShipEntity.builder()
                .size(shipStats.getSize())
                .name(shipStats.getName())
                .maxSpeed(shipStats.getMaxSpeed())
                .escapeTime(shipStats.getEscapeTime())
                .weaponPower(shipStats.getWeaponPower())
                .weaponRangeKm(shipStats.getWeaponRangeKm())
                .weaponRangeUnits(shipStats.getWeaponRangeUnits())
                .firingInterval(shipStats.getFiringInterval())
                .damageCapacity(shipStats.getDamageCapacity())
                .downedPoints(shipStats.getDownedPoints())
                .destroyedPoints(shipStats.getDestroyedPoints())
                .jpg0(shipStats.getJpg0())
                .jpg1(shipStats.getJpg1())
                .jpg2(shipStats.getJpg2())
                .jpg3(shipStats.getJpg3())
                .build();
        return shipEntity;
    }
}
