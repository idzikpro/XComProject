package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.converters.ShipStatsToShipEntityConverter;

public class AddSmallScout implements AddShipInterface {
    @Override
    public ShipEntity add() {
        ShipStats shipStats = ShipStatsRepository.getSmallScoutStats();
        String[] names = {"small-scout-0", "small-scout-1", "small-scout-2", "small-scout-2"};
        shipStats.fillJpg(names);
        return new ShipStatsToShipEntityConverter().convert(shipStats);
    }
}