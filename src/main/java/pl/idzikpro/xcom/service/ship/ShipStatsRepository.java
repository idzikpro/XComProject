package pl.idzikpro.xcom.service.ship;

import lombok.Data;
import pl.idzikpro.xcom.entity.ShipEntity;
import pl.idzikpro.xcom.service.craft.CraftStats;

@Data
public class ShipStatsRepository {
    public static ShipStats getAbductorStats() {
        return abductorStats;
    }
    public static ShipStats getBattleStats() {
        return battleStats;
    }
    public static ShipStats getHarvesterStats() {
        return harvesterStats;
    }
    public static ShipStats getLargeScoutStats() {
        return largeScoutStats;
    }
    public static ShipStats getMediumScoutStats() {
        return mediumScoutStats;
    }
    public static ShipStats getSmallScoutStats() {
        return smallScoutStats;
    }
    public static ShipStats getSupplyStats() {
        return supplyStats;
    }
    public static ShipStats getTerrorStats() {return terrorStats;}


    private static ShipStats abductorStats = ShipStats.builder()
            .size("medium").name("abductor")
            .maxSpeed(4300).escapeTime(500).weaponPower(40)
            .weaponRangeKm(40).weaponRangeUnits(22)
            .firingInterval(48).damageCapacity(500)
            .downedPoints(250).destroyedPoints(-1)
            .build();

    private static ShipStats battleStats = ShipStats.builder()
            .size("very large").name("battleship")
            .maxSpeed(5000).escapeTime(4000).weaponPower(140)
            .weaponRangeKm(65).weaponRangeUnits(520)
            .firingInterval(24).damageCapacity(3000)
            .downedPoints(700).destroyedPoints(-1)
            .build();

    private static ShipStats harvesterStats = ShipStats.builder()
            .size("medium").name("harvester")
            .maxSpeed(4000).escapeTime(500).weaponPower(40)
            .weaponRangeKm(20).weaponRangeUnits(160)
            .firingInterval(32).damageCapacity(500)
            .downedPoints(250).destroyedPoints(-1)
            .build();

    private static ShipStats largeScoutStats = ShipStats.builder()
            .size("small").name("large scout")
            .maxSpeed(2700).escapeTime(300).weaponPower(20)
            .weaponRangeKm(34).weaponRangeUnits(272)
            .firingInterval(48).damageCapacity(250)
            .downedPoints(125).destroyedPoints(250)
            .build();

    private static ShipStats mediumScoutStats = ShipStats.builder()
            .size("small").name("medium scout")
            .maxSpeed(2400).escapeTime(250).weaponPower(20)
            .weaponRangeKm(15).weaponRangeUnits(120)
            .firingInterval(56).damageCapacity(200)
            .downedPoints(75).destroyedPoints(150)
            .build();

    private static ShipStats smallScoutStats = ShipStats.builder()
            .size("very small").name("small scout")
            .maxSpeed(2200).escapeTime(200).weaponPower(0)
            .weaponRangeKm(0).weaponRangeUnits(0)
            .firingInterval(0).damageCapacity(50)
            .downedPoints(50).destroyedPoints(100)
            .build();

    private static ShipStats supplyStats = ShipStats.builder()
            .size("large").name("supply ship")
            .maxSpeed(3200).escapeTime(3000).weaponPower(60)
            .weaponRangeKm(36).weaponRangeUnits(288)
            .firingInterval(24).damageCapacity(2200)
            .downedPoints(400).destroyedPoints(-1)
            .build();

    private static ShipStats terrorStats = ShipStats.builder()
            .size("large").name("terror ship")
            .maxSpeed(4800).escapeTime(2000).weaponPower(120)
            .weaponRangeKm(42).weaponRangeUnits(336)
            .firingInterval(24).damageCapacity(1200)
            .downedPoints(500).destroyedPoints(-1)
            .build();
}