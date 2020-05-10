package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.mapper.ShipStatsToShipEntityConverter;

public class AddMediumScout implements AddShipInterface{
    @Override
    public ShipEntity add() {
        ShipStats shipStats= ShipStatsRepository.getMediumScoutStats();
        String [] names={"medium-scout-0","medium-scout-1","medium-scout-1","medium-scout-1"};
        shipStats.fillJpg(names);
        return new ShipStatsToShipEntityConverter().convert(shipStats);
    }
}
