package pl.idzikpro.xcom.service.craft;

import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.mapper.AlienStatsToAlienEntityConverter;
import pl.idzikpro.xcom.mapper.CraftStatsToCraftEntityConverter;
import pl.idzikpro.xcom.service.aliens.AlienStats;
import pl.idzikpro.xcom.service.aliens.AlienStatsRepository;

import java.util.Arrays;
import java.util.List;

public class AddAvenger implements AddCraftInterface{
    @Override
    public CraftEntity add() {
        CraftStats craftStats= CraftStatsRepository.getAvengerStats();
        String [] names={"avenger-0","avenger-1","avenger-2","avenger-3"};
        craftStats.fillJpg(names);
        return new CraftStatsToCraftEntityConverter().convert(craftStats);
    }
}
