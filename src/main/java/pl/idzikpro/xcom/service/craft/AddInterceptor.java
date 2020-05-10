package pl.idzikpro.xcom.service.craft;

import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.mapper.CraftStatsToCraftEntityConverter;

public class AddInterceptor implements AddCraftInterface{
    @Override
    public CraftEntity add() {
        CraftStats craftStats= CraftStatsRepository.getInterceptorStats();
        String [] names={"interceptor-3","interceptor-3","interceptor-3","interceptor-3"};
        craftStats.fillJpg(names);
        return new CraftStatsToCraftEntityConverter().convert(craftStats);
    }
}
