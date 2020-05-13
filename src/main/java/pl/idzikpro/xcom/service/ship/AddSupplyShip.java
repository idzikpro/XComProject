package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.converters.ShipStatsToShipEntityConverter;

public class AddSupplyShip implements AddShipInterface {
    @Override
    public ShipEntity add() {
        ShipStats shipStats= ShipStatsRepository.getSupplyStats();
        String [] names={"supply-ship-0","supply-ship-1","supply-ship-2","supply-ship-3"};
        shipStats.fillJpg(names);
        return new ShipStatsToShipEntityConverter().convert(shipStats);
    }
}
