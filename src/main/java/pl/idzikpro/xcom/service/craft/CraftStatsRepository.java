package pl.idzikpro.xcom.service.craft;

import lombok.Data;

@Data
public class CraftStatsRepository {

    public static CraftStats getAvengerStats() {
        return avengerStats;
    }

    public static CraftStats getFirestormStats() {
        return firestormStats;
    }

    public static CraftStats getInterceptorStats() {
        return interceptorStats;
    }

    public static CraftStats getLightningStats() {
        return lightningStats;
    }

    public static CraftStats getSkryrangerStats() {
        return skryrangerStats;
    }


    private static CraftStats avengerStats = CraftStats.builder()
            .name("avenger")
            .maxSpeed(5400)
            .acceleration(10)
            .fuelCapacity(60)
            .damageCapacity(1200)
            .cargoSpace(26)
            .hwpCapacity(4)
            .weaponPods(1)
            .build();

    private static CraftStats firestormStats = CraftStats.builder()
            .name("firestorm")
            .maxSpeed(4200)
            .acceleration(9)
            .fuelCapacity(20)
            .damageCapacity(500)
            .cargoSpace(0)
            .hwpCapacity(0)
            .weaponPods(2)
            .build();

    private static CraftStats interceptorStats = CraftStats.builder()
            .name("interceptor")
            .maxSpeed(2100)
            .acceleration(3)
            .fuelCapacity(1000)
            .damageCapacity(100)
            .cargoSpace(0)
            .hwpCapacity(0)
            .weaponPods(2)
            .build();

    private static CraftStats lightningStats = CraftStats.builder()
            .name("lightning")
            .maxSpeed(3100)
            .acceleration(8)
            .fuelCapacity(30)
            .damageCapacity(800)
            .cargoSpace(12)
            .hwpCapacity(0)
            .weaponPods(1)
            .build();

    private static CraftStats skryrangerStats = CraftStats.builder()
            .name("skyranger")
            .maxSpeed(760)
            .acceleration(2)
            .fuelCapacity(1500)
            .damageCapacity(150)
            .cargoSpace(14)
            .hwpCapacity(3)
            .weaponPods(0)
            .build();
}