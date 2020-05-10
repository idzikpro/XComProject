package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.mapper.ShipStatsToShipEntityConverter;

public class AddAbductor implements AddShipInterface{
    @Override
    public ShipEntity add() {
        ShipStats shipStats= ShipStatsRepository.getAbductorStats();
        String [] names={"abductor-0","abductor-1","abductor-2","abductor-2"};
        shipStats.fillJpg(names);
        return new ShipStatsToShipEntityConverter().convert(shipStats);
    }
}
