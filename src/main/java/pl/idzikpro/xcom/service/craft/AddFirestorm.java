package pl.idzikpro.xcom.service.craft;

import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.mapper.CraftStatsToCraftEntityConverter;

public class AddFirestorm implements AddCraftInterface{
    @Override
    public CraftEntity add() {
        CraftStats craftStats= CraftStatsRepository.getFirestormStats();
        String [] names={"firestorm-3","firestorm-3","firestorm-3","firestorm-3"};
        craftStats.fillJpg(names);
        return new CraftStatsToCraftEntityConverter().convert(craftStats);
    }
}
