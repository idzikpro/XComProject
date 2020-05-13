package pl.idzikpro.xcom.converters;

import org.springframework.core.convert.converter.Converter;
import pl.idzikpro.xcom.entity.AlienEntity;
import pl.idzikpro.xcom.service.aliens.AlienStats;

public class AlienStatsToAlienEntityConverter implements Converter<AlienStats, AlienEntity> {
    @Override
    public AlienEntity convert(AlienStats alienStats) {
            return  AlienEntity.builder()
                    .breed(alienStats.getName())
                    .rank(alienStats.getRank())
                    .timeUnits(alienStats.getTimeUnits()).health(alienStats.getHealth()).energy(alienStats.getEnergy()).reactions(alienStats.getReactions())
                    .strength(alienStats.getStrength()).bravery(alienStats.getBravery()).firingAccuracy(alienStats.getFiringAccuracy()).throwingAccuracy(alienStats.getThrowingAccuracy())
                    .psiSkill(alienStats.getPsiSkill()).psiStrength(alienStats.getPsiStrength()).meleeAccuracy(alienStats.getMeleeAccuracy())
                    .armourFront(alienStats.getArmourFront()).armourLeft(alienStats.getArmourLeft()).armourRight(alienStats.getArmourRight()).armourRear(alienStats.getArmourRear()).armourUnder(alienStats.getArmourUnder())
                    .energyRecovery(alienStats.getEnergyRecovery()).victoryPoints(alienStats.getVictoryPoints()).aggression(alienStats.getAggression()).intelligence(alienStats.getIntelligence())
                    .heightStanding(alienStats.getHeightStanding()).heightKneeling(alienStats.getHeightKneeling())
                    .build();
    }
}
