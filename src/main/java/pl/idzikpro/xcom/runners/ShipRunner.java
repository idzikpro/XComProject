package pl.idzikpro.xcom.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.repository.ShipRepository;
import pl.idzikpro.xcom.tools.ShipService;

import java.util.Arrays;
import java.util.List;

@Component
public class ShipRunner implements CommandLineRunner {
    @Autowired
    ShipRepository shipRepository;

    @Override
    public void run(String... args) throws Exception {
        List<ShipEntity> shipEntityList = Arrays.asList(
                ShipService.addShip("abductor"),
                ShipService.addShip("battleship"),
                ShipService.addShip("harvester"),
                ShipService.addShip("largescout"),
                ShipService.addShip("mediumscout"),
                ShipService.addShip("smallscout"),
                ShipService.addShip("supplyship"),
                ShipService.addShip("terrorship")
        );
        for (ShipEntity shipEntity : shipEntityList
        ) {
            shipRepository.save(shipEntity);
        }
    }
}