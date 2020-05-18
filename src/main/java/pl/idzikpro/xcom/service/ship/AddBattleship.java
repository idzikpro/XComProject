package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.converters.ShipStatsToShipEntityConverter;

public class AddBattleship implements AddShipInterface {
    @Override
    public ShipEntity add() {
        ShipStats shipStats = ShipStatsRepository.getBattleStats();
        String[] names = {"battleship-0", "battleship-1", "battleship-2", "battleship-3"};
        shipStats.fillJpg(names);
        return new ShipStatsToShipEntityConverter().convert(shipStats);
    }
}