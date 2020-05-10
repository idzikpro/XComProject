package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.mapper.ShipStatsToShipEntityConverter;

public class AddHarvester implements AddShipInterface{
    @Override
    public ShipEntity add() {
        ShipStats shipStats= ShipStatsRepository.getHarvesterStats();
        String [] names={"harvester-0","harvester-1","harvester-2","harvester-3"};
        shipStats.fillJpg(names);
        return new ShipStatsToShipEntityConverter().convert(shipStats);
    }
}
