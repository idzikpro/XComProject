package pl.idzikpro.xcom.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import pl.idzikpro.xcom.tools.SoldierService;

@Component
@Order(0)
public class SoldierNamesRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        String names[] = {"american", "british", "french", "german", "japanese", "russian"};
        for (String name : names
        ) {
            SoldierService.fillNames(name);
        }
    }
}
