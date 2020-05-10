package pl.idzikpro.xcom.service.ship;

import pl.idzikpro.xcom.entity.ShipEntity;

public class AddShip {
    private AddShipInterface ship;

    public void setShip(AddShipInterface ship) {
        this.ship = ship;
    }

    public ShipEntity add() {
        return this.ship.add();
    }
}
