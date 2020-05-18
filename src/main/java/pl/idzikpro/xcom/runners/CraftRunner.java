package pl.idzikpro.xcom.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.repository.CraftRepository;
import pl.idzikpro.xcom.tools.CraftService;

import java.util.Arrays;
import java.util.List;

@Component
public class CraftRunner implements CommandLineRunner {
    @Autowired
    CraftRepository craftRepository;

    @Override
    public void run(String... args) throws Exception {
        List<CraftEntity> craftEntityList = Arrays.asList(
                CraftService.addCraft("skyranger"),
                CraftService.addCraft("interceptor"),
                CraftService.addCraft("firestorm"),
                CraftService.addCraft("lightning"),
                CraftService.addCraft("avenger")
        );
        for (CraftEntity craftEntity : craftEntityList
        ) {
            craftRepository.save(craftEntity);
        }
    }
}