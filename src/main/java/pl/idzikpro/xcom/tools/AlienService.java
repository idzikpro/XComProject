package pl.idzikpro.xcom.tools;

import org.springframework.stereotype.Service;
import pl.idzikpro.xcom.entity.AlienEntity;
import pl.idzikpro.xcom.service.aliens.*;

@Service
public class AlienService {

    public static AlienEntity addAlien(String race, String rank) {
        AlienEntity alienEntity;
        AddRandomAlienByRank addRandomAlienByRank = new AddRandomAlienByRank(rank);

        switch (race) {
            case "celatid": {
                addRandomAlienByRank.setAlien(new AddCelatid());
                break;
            }
            case "chryssalid": {
                addRandomAlienByRank.setAlien(new AddChryssalid());
                break;
            }
            case "cyberdisc": {
                addRandomAlienByRank.setAlien(new AddCyberdisc());
                break;
            }
            case "ethereal": {
                addRandomAlienByRank.setAlien(new AddEthereal());
                break;
            }
            case "floater": {
                addRandomAlienByRank.setAlien(new AddFloater());
                break;
            }
            case "muton": {
                addRandomAlienByRank.setAlien(new AddMuton());
                ;
                break;
            }
            case "reaper": {
                addRandomAlienByRank.setAlien(new AddReaper());
                break;
            }
            case "sectoid": {
                addRandomAlienByRank.setAlien(new AddSectoid());
                break;
            }
            case "sectopod": {
                addRandomAlienByRank.setAlien(new AddSectopod());
                break;
            }
            case "silacoid": {
                addRandomAlienByRank.setAlien(new AddSilacoid());
                break;
            }
            case "snakeman": {
                addRandomAlienByRank.setAlien(new AddSnakeman());
                break;
            }
            default:
                addRandomAlienByRank.setAlien(new AddZombie());
        }
        alienEntity = addRandomAlienByRank.add();
        return alienEntity;
    }
}