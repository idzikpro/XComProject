package pl.idzikpro.xcom.service.aliens;

import pl.idzikpro.xcom.entity.AlienEntity;
import pl.idzikpro.xcom.mapper.AlienStatsToAlienEntityConverter;

public class AddEthereal implements AddAlienInterface {
    @Override
    public AlienEntity add(String rank) {
        AlienStats alienStats= AlienStatsRepository.getEtherealStats();
        alienStats.drawUnitStats();
        alienStats.setRank(rank);
        return new AlienStatsToAlienEntityConverter().convert(alienStats);
    }
}
