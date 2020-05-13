package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.converters.ShipStatsToShipEntityConverter;

public class AddTerrorShip implements AddShipInterface{
    @Override
    public ShipEntity add() {
        ShipStats shipStats= ShipStatsRepository.getTerrorStats();
        String [] names={"terror-ship-0","terror-ship-1","terror-ship-2","terror-ship-3"};
        shipStats.fillJpg(names);
        return new ShipStatsToShipEntityConverter().convert(shipStats);
    }
}
