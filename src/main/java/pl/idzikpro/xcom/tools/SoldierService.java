package pl.idzikpro.xcom.tools;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.repository.SoldierRepository;
import pl.idzikpro.xcom.service.soldiers.*;
import pl.idzikpro.xcom.stats.soldier.*;

import java.util.*;

@Service
public class SoldierService {
    @Autowired
    SoldierRepository soldierRepository;


    public static SoldierEntity addRookie(String nationality) {
        AddRandomSoldier addRandomSoldier = new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddRookie());
        return addRandomSoldier.add(nationality);
    }


    public static SoldierEntity addSquaddie(String nationality) {
        AddRandomSoldier addRandomSoldier = new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddSquaddie());
        return addRandomSoldier.add(nationality);
    }

    public static SoldierEntity addSergeant(String nationality) {
        AddRandomSoldier addRandomSoldier = new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddSergeant());
        return addRandomSoldier.add(nationality);
    }

    public static SoldierEntity addCaptain(String nationality) {
        AddRandomSoldier addRandomSoldier = new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddCaptain());
        return addRandomSoldier.add(nationality);
    }

    public static SoldierEntity addColonel(String nationality) {
        AddRandomSoldier addRandomSoldier = new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddColonel());
        return addRandomSoldier.add(nationality);
    }

    public static SoldierEntity addCommander(String nationality) {
        AddRandomSoldier addRandomSoldier = new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddCommander());
        return addRandomSoldier.add(nationality);
    }


    public static SoldierEntity addRandomSoldier(String rank) {
        SoldierEntity resultSoldier = null;
        SoldierEntity soldierEntity = new SoldierEntity();

        String[] names = {"us", "gb", "fr", "de", "jp", "ru"};
        String nationality = names[SoldierNameService.drawNumber(0, names.length - 1)];

        switch (rank) {
            case "squaddie": {
                soldierEntity = addSquaddie(nationality);
                break;
            }
            case "sergeant": {
                soldierEntity = addSergeant(nationality);
                break;
            }
            case "captain": {
                soldierEntity = addCaptain(nationality);
                break;
            }
            case "colonel": {
                soldierEntity = addColonel(nationality);
                break;
            }
            case "commander": {
                soldierEntity = addCommander(nationality);
                break;
            }
            default:
                soldierEntity = addRookie(nationality);
        }
        resultSoldier = soldierEntity;

        return resultSoldier;
    }
}