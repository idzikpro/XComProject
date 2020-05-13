package pl.idzikpro.xcom.mappers;

import pl.idzikpro.xcom.entity.ShipEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShipResultToShipEntityMapper {
    public static ShipEntity convert(ShipEntity input, ShipEntity output){
        List<String> names=new ArrayList<>(Arrays.asList("abductor","battleship","harvester",
                "large scout","medium scout","small scout","supply ship","terror ship"));
        List<String> sizes=new ArrayList<>(Arrays.asList("very small","small","medium","large","very large"));
        if (names.contains(input.getName().toLowerCase())){
            output.setName(input.getName().toLowerCase());
        }
        else output.setName("large scout");
        switch (input.getName()){
            case "small scout":{
                output.setSize("very small");
                break;
            }
            case "medium scout": case "large scout":{
                output.setSize("small");
                break;
            }
            case "abductor": case "harvester":{
                output.setSize("medium");
                break;
            }
            case "terror ship": case "supply ship":{
                output.setSize("large");
                break;
            }
            case "battleship":{
                output.setSize("very large");
                break;
            }
            default:output.setSize("small");
        }
        output.setMaxSpeed(input.getMaxSpeed());
        output.setWeaponPower(input.getWeaponPower());
        output.setWeaponRangeKm(input.getWeaponRangeKm());
        output.setWeaponRangeUnits(input.getWeaponRangeUnits());
        output.setDamageCapacity(input.getDamageCapacity());
        output.setDownedPoints(input.getDownedPoints());
        output.setDestroyedPoints(input.getDestroyedPoints());
        output.setEscapeTime(input.getEscapeTime());
        output.setFiringInterval(input.getFiringInterval());

        switch (input.getName()){
            case "abductor":{
                output.setJpg0("abductor-0");
                output.setJpg1("abductor-1");
                output.setJpg2("abductor-2");
                output.setJpg3("abductor-2");
                break;
            }
            case "battleship":{
                output.setJpg0("battleship-0");
                output.setJpg1("battleship-1");
                output.setJpg2("battleship-2");
                output.setJpg3("battleship-3");
                break;
            }
            case "harvester":{
                output.setJpg0("harvester-0");
                output.setJpg1("harvester-1");
                output.setJpg2("harvester-2");
                output.setJpg3("harvester-3");
                break;
            }
            case "large scout":{
                output.setJpg0("large-scout-0");
                output.setJpg1("large-scout-1");
                output.setJpg2("large-scout-1");
                output.setJpg3("large-scout-1");
                break;
            }
            case "medium scout":{
                output.setJpg0("medium-scout-0");
                output.setJpg1("medium-scout-1");
                output.setJpg2("medium-scout-1");
                output.setJpg3("medium-scout-1");
                break;
            }
            case "small scout":{
                output.setJpg0("small-scout-0");
                output.setJpg1("small-scout-1");
                output.setJpg2("small-scout-2");
                output.setJpg3("small-scout-2");
                break;
            }
            case "supply ship":{
                output.setJpg0("supply-ship-0");
                output.setJpg1("supply-ship-1");
                output.setJpg2("supply-ship-2");
                output.setJpg3("supply-ship-3");
                break;
            }
            case "terror ship":{
                output.setJpg0("terror-ship-0");
                output.setJpg1("terror-ship-1");
                output.setJpg2("terror-ship-2");
                output.setJpg3("terror-ship-3");
            }
        }
        return output;
    }
}
