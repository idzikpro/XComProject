package pl.idzikpro.xcom.service.aliens;

import pl.idzikpro.xcom.entity.AlienEntity;
import pl.idzikpro.xcom.converters.AlienStatsToAlienEntityConverter;

public class AddCyberdisc implements AddAlienInterface {
    @Override
    public AlienEntity add(String rank) {
        AlienStats alienStats = AlienStatsRepository.getCyberdiscStats();
        alienStats.drawUnitStats();
        alienStats.setRank(rank);
        return new AlienStatsToAlienEntityConverter().convert(alienStats);
    }
}