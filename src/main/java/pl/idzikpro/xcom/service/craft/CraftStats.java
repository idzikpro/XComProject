package pl.idzikpro.xcom.service.craft;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Builder
public class CraftStats {
    private String name;
    private int maxSpeed;
    private int acceleration;
    private int fuelCapacity;
    private int damageCapacity;
    private int cargoSpace;
    private int hwpCapacity;
    private int weaponPods;
    private String jpg0;
    private String jpg1;
    private String jpg2;
    private String jpg3;

    public void fillJpg(String [] jpg){
        jpg0=jpg[0];
        jpg1=jpg[1];
        jpg2=jpg[2];
        jpg3=jpg[3];
    }
}
