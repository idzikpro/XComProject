package pl.idzikpro.xcom.service.craft;

import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.mapper.CraftStatsToCraftEntityConverter;

public class AddLightning implements AddCraftInterface{
    @Override
    public CraftEntity add() {
        CraftStats craftStats= CraftStatsRepository.getLightningStats();
        String [] names={"lightning-0","lightning-1","lightning-2","lightning-3"};
        craftStats.fillJpg(names);
        return new CraftStatsToCraftEntityConverter().convert(craftStats);
    }
}
