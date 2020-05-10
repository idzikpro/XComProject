package pl.idzikpro.xcom.tools;

import org.springframework.stereotype.Service;
import pl.idzikpro.xcom.entity.CraftEntity;
import pl.idzikpro.xcom.service.craft.*;

@Service
public class CraftService {
    public static CraftEntity addCraft(String name) {
        CraftEntity craftEntity;
        AddCraft addCraft = new AddCraft();
        switch (name) {
            case "skyranger": {
                addCraft.setCraft(new AddSkyranger());
                break;
            }
            case "interceptor": {
                addCraft.setCraft(new AddInterceptor());
                break;
            }
            case "lightning": {
                addCraft.setCraft(new AddLightning());
                break;
            }
            case "firestorm": {
                addCraft.setCraft(new AddFirestorm());
                break;
            }
            case "avenger": {
                addCraft.setCraft(new AddAvenger());
                break;
            }
            default:
                addCraft.setCraft(new AddSkyranger());
        }
        return addCraft.add();
    }
}