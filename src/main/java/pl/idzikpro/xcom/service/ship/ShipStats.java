package pl.idzikpro.xcom.service.ship;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Builder
public class ShipStats {
    private String name;
    private String size;
    private int maxSpeed;
    private int escapeTime;
    private int weaponPower;
    private int weaponRangeKm;
    private int weaponRangeUnits;
    private int firingInterval;
    private int damageCapacity;
    private int downedPoints;
    private int destroyedPoints;
    private String jpg0;
    private String jpg1;
    private String jpg2;
    private String jpg3;

    public void fillJpg(String[] jpg) {
        jpg0 = jpg[0];
        jpg1 = jpg[1];
        jpg2 = jpg[2];
        jpg3 = jpg[3];
    }
}