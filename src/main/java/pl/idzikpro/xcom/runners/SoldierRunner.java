package pl.idzikpro.xcom.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.repository.SoldierRepository;
import pl.idzikpro.xcom.tools.SoldierService;

import java.util.Arrays;
import java.util.List;

@Component
public class SoldierRunner implements CommandLineRunner {
    @Autowired
    SoldierRepository soldierRepository;

    @Override
    public void run(String... args) throws Exception {
        List<SoldierEntity> soldierEntityList = Arrays.asList(
                SoldierService.addCaptain("ru"),
                SoldierService.addColonel("ru"),
                SoldierService.addCommander("de"),
                SoldierService.addRookie("de"),
                SoldierService.addSergeant("jp"),
                SoldierService.addSquaddie("fr")
        );
        for (SoldierEntity soldierEntity : soldierEntityList
        ) {
            soldierRepository.save(soldierEntity);
        }
    }
}
