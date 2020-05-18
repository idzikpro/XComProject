package pl.idzikpro.xcom.tools;

import org.springframework.stereotype.Service;
import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.service.ship.*;

@Service
public class ShipService {

    public static ShipEntity addShip(String name) {
        ShipEntity shipEntity;
        AddShip addShip = new AddShip();
        switch (name) {
            case "smallscout": {
                addShip.setShip(new AddSmallScout());
                break;
            }
            case "mediumscout": {
                addShip.setShip(new AddMediumScout());
                break;
            }
            case "largescout": {
                addShip.setShip(new AddLargeScout());
                break;
            }
            case "abductor": {
                addShip.setShip(new AddAbductor());
                break;
            }
            case "battleship": {
                addShip.setShip(new AddBattleship());
                break;
            }
            case "harvester": {
                addShip.setShip(new AddHarvester());
                break;
            }
            case "supplyship": {
                addShip.setShip(new AddSupplyShip());
                break;
            }
            case "terrorship": {
                addShip.setShip(new AddTerrorShip());
                break;
            }
            default:
                addShip.setShip(new AddSmallScout());
        }
        return addShip.add();
    }
}