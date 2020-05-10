package pl.idzikpro.xcom.mapper;

import pl.idzikpro.xcom.entity.CraftEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CraftResultToCraftEntityMapper {

    public static CraftEntity convert(CraftEntity input, CraftEntity output) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "skyranger", "interceptor", "firestorm", "lightning", "avenger"
        ));
        if (names.contains(input.getName().toLowerCase())) {
            output.setName(input.getName().toLowerCase());
        } else output.setName("skyranger");
        switch (input.getName()){
            case "skyranger":{
                output.setJpg0("skyranger-0");
                output.setJpg1("skyranger-1");
                output.setJpg2("skyranger-2");
                output.setJpg3("skyranger-3");
                break;
            }
            case "interceptor":{
                output.setJpg0("interceptor-3");
                output.setJpg1("interceptor-3");
                output.setJpg2("interceptor-3");
                output.setJpg3("interceptor-3");
                break;
            }
            case "firestorm":{
                output.setJpg0("firestorm-3");
                output.setJpg1("firestorm-3");
                output.setJpg2("firestorm-3");
                output.setJpg3("firestorm-3");
                break;
            }
            case "lightning":{
                output.setJpg0("lightning-0");
                output.setJpg1("lightning-1");
                output.setJpg2("lightning-2");
                output.setJpg3("lightning-3");
                break;
            }
            case "avenger":{
                output.setJpg0("avenger-0");
                output.setJpg1("avenger-1");
                output.setJpg2("avenger-2");
                output.setJpg3("avenger-3");
                break;
            }
        }
        output.setMaxSpeed(input.getMaxSpeed());
        output.setAcceleration(input.getAcceleration());
        output.setFuelCapacity(input.getFuelCapacity());
        output.setDamageCapacity(input.getDamageCapacity());
        output.setCargoSpace(input.getCargoSpace());
        output.setHwpCapacity(input.getHwpCapacity());
        output.setWeaponPods(input.getWeaponPods());
        return output;
    }
}