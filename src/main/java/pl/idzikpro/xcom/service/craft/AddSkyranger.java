package pl.idzikpro.xcom.service.craft;

import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.mapper.CraftStatsToCraftEntityConverter;

public class AddSkyranger implements AddCraftInterface{
    @Override
    public CraftEntity add() {
        CraftStats craftStats= CraftStatsRepository.getSkryrangerStats();
        String [] names={"skyranger-0","skyranger-1","skyranger-2","skyranger-3"};
        craftStats.fillJpg(names);
        return new CraftStatsToCraftEntityConverter().convert(craftStats);
    }
}
