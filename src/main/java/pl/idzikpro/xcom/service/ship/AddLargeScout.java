package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.mapper.ShipStatsToShipEntityConverter;

public class AddLargeScout implements AddShipInterface{
    @Override
    public ShipEntity add() {
        ShipStats shipStats= ShipStatsRepository.getLargeScoutStats();
        String [] names={"large-scout-0","large-scout-1","large-scout-1","large-scout-1"};
        shipStats.fillJpg(names);
        return new ShipStatsToShipEntityConverter().convert(shipStats);
    }
}
