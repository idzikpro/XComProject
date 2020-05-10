package pl.idzikpro.xcom.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.idzikpro.xcom.entity.AlienEntity;
import pl.idzikpro.xcom.repository.AlienRepository;
import pl.idzikpro.xcom.tools.AlienService;

import java.util.Arrays;
import java.util.List;

@Component
public class AlienRunner implements CommandLineRunner {
    @Autowired
    AlienRepository alienRepository;

    @Override
    public void run(String... args) throws Exception {
        List<AlienEntity> alienEntityList= Arrays.asList(
                AlienService.addAlien("celatid","terrorist"),
                AlienService.addAlien("chryssalid","terrorist"),
                AlienService.addAlien("cyberdisc","terrorist"),
                AlienService.addAlien("ethereal","navigator"),
                AlienService.addAlien("floater","medic"),
                AlienService.addAlien("muton","engineer"),
                AlienService.addAlien("reaper","navigator"),
                AlienService.addAlien("sectoid","leader"),
                AlienService.addAlien("sectopod","terrorist"),
                AlienService.addAlien("silacoid","terrorist"),
                AlienService.addAlien("snakeman","navigator"),
                AlienService.addAlien("zombie","terrorist")
        );
        for (AlienEntity alienEntity:alienEntityList
        ) {
            alienRepository.save(alienEntity);
        }
    }
}
