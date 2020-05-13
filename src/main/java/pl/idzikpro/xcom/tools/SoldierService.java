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

    static Random random = new Random();
    @Getter
    static List<String> americanSetOfNames = new ArrayList<>();
    @Getter
    static List<String> britishSetOfNames = new ArrayList<>();
    @Getter
    static List<String> frenchSetOfNames = new ArrayList<>();
    @Getter
    static List<String> germanSetOfNames = new ArrayList<>();
    @Getter
    static List<String> japaneseSetOfNames = new ArrayList<>();
    @Getter
    static List<String> russianSetOfNames = new ArrayList<>();

    public static int drawNumber(int left, int right) {
        return random.nextInt(right - left + 1) + left;
    }


    public static String selectRandomName(String nationality) {
        String result;
        int nameIndex;
        switch (nationality) {
            case "us": {
                nameIndex = drawNumber(0, americanSetOfNames.size() - 1);
                result = americanSetOfNames.get(nameIndex);
                americanSetOfNames.remove(nameIndex);
                break;
            }
            case "gb": {
                nameIndex = drawNumber(0, britishSetOfNames.size() - 1);
                result = britishSetOfNames.get(nameIndex);
                britishSetOfNames.remove(nameIndex);
                break;
            }
            case "fr": {
                nameIndex = drawNumber(0, frenchSetOfNames.size() - 1);
                result = frenchSetOfNames.get(nameIndex);
                frenchSetOfNames.remove(nameIndex);
                break;
            }
            case "de": {
                nameIndex = drawNumber(0, germanSetOfNames.size() - 1);
                result = germanSetOfNames.get(nameIndex);
                germanSetOfNames.remove(nameIndex);
                break;
            }
            case "jp": {
                nameIndex = drawNumber(0, japaneseSetOfNames.size() - 1);
                result = japaneseSetOfNames.get(nameIndex);
                japaneseSetOfNames.remove(nameIndex);
                break;
            }
            default: {
                nameIndex = drawNumber(0, russianSetOfNames.size() - 1);
                result = russianSetOfNames.get(nameIndex);
                russianSetOfNames.remove(nameIndex);
            }
        }
        return result;
    }

    public static void deleteNames() {
        americanSetOfNames.clear();
        britishSetOfNames.clear();
        frenchSetOfNames.clear();
        germanSetOfNames.clear();
        japaneseSetOfNames.clear();
        russianSetOfNames.clear();
    }

    public static void addOneNameToList(String name, String nationality) {
        switch (nationality) {
            case "us": {
                americanSetOfNames.add(name);
                break;
            }
            case "gb": {
                britishSetOfNames.add(name);
                break;
            }
            case "fr": {
                frenchSetOfNames.add(name);
                break;
            }
            case "de": {
                germanSetOfNames.add(name);
                break;
            }
            case "jp": {
                japaneseSetOfNames.add(name);
                break;
            }
            default: {
                russianSetOfNames.add(name);
                break;
            }
        }
    }

    public static void showNames() {
        System.out.println("US-" + SoldierService.getAmericanSetOfNames().size() + ", " +
                "GB-" + SoldierService.getBritishSetOfNames().size() + ", " +
                "FR-" + SoldierService.getFrenchSetOfNames().size() + ", " +
                "DE-" + SoldierService.getGermanSetOfNames().size() + ", " +
                "JP-" + SoldierService.getJapaneseSetOfNames().size() + ", " +
                "RU-" + SoldierService.getRussianSetOfNames().size()
        );
    }

    public static void fillNames(String nationality) {
        //todo trzeba dodać czyszczenie listy
        switch (nationality) {
            case "american": {
                americanSetOfNames.addAll(Arrays.asList(
                        "Austin,Bradley",
                        "Barbara,Bryant",
                        "Calvin,Carr",
                        "Carl,Crossett",
                        "Catherine,Dodge",
                        "Clarence,Gallagher",
                        "Donald,Homburger",
                        "Dwight,Horton",
                        "Ed,Hudson",
                        "Evelyn,Johnson",
                        "Kevin,Kemp",
                        "Lester,King",
                        "Mark,McNeil",
                        "Oscar,Miller",
                        "Patricia,Mitchell",
                        "Samuel,Nash",
                        "Sigourney,Stephens",
                        "Spencer,Stoddard",
                        "Tom,Thompson",
                        "Virgil,Webb"
                ));
                break;
            }
            case "british": {
                britishSetOfNames.addAll(Arrays.asList(
                        "Adam,Bailey",
                        "Alan,Blake",
                        "Andrea,Davies",
                        "Arthur,Day",
                        "Brett,Evans",
                        "Damien,Hill",
                        "David,Jones",
                        "Frank,Jonlan",
                        "Helen,Martin",
                        "James,Parker",
                        "Jane,Pearce",
                        "John,Reynolds",
                        "Maria,Robinson",
                        "Michael,Sharpe",
                        "Neil,Smith",
                        "Patrick,Stewart",
                        "Paul,Taylor",
                        "Robert,Watson",
                        "Sarah,White",
                        "Scott,Wright"
                ));
                break;
            }
            case "french": {
                frenchSetOfNames.addAll(Arrays.asList(
                        "Armand,Bouissou",
                        "Bernard,Bouton",
                        "Claude,Buchard",
                        "Danielle,Coicaud",
                        "Emile,Collignon",
                        "Gaston,Cuvelier",
                        "Gerard,Dagallier",
                        "Henri,Dreyfus",
                        "Jacqueline,Dujardin",
                        "Jacques,Gaudin",
                        "Jean,Gautier",
                        "Leon,Gressier",
                        "Louis,Guerin",
                        "Marc,Laroyenne",
                        "Marcel,Lecointe",
                        "Marielle,Lefevre",
                        "Micheline,Luget",
                        "Pierre,Marcelle",
                        "Rene,Pecheux",
                        "Sylvie,Revenu"
                ));
                break;
            }
            case "german": {
                germanSetOfNames.addAll(Arrays.asList(
                        "Christel,Berger",
                        "Dieter,Brehme",
                        "Franz,Esser",
                        "Gerhard,Faerber",
                        "Gudrun,Geisler",
                        "Gunter,Gunkel",
                        "Hans,Hafner",
                        "Helga,Heinsch",
                        "Jurgen,Keller",
                        "Karin,Krause",
                        "Klaus,Mederow",
                        "Manfred,Meyer",
                        "Matthias,Richter",
                        "Otto,Schultz",
                        "Rudi,Seidler",
                        "Siegfried,Steinbach",
                        "Stefan,Ulbricht",
                        "Uta,Unger",
                        "Werner,Vogel",
                        "Wolfgang,Zander"
                ));
                break;
            }
            case "japanese": {
                japaneseSetOfNames.addAll(Arrays.asList(
                        "Akinori,Akira",
                        "Isao,Fujimoto",
                        "Jungo,Ishii",
                        "Kenji,Iwahara",
                        "Mariko,Iwasaki",
                        "Masaharu,Kojima",
                        "Masanori,Koyama",
                        "Michiko,Matsumara",
                        "Naohiro,Morita",
                        "Sata,Noguchi",
                        "Shigeo,Okabe",
                        "Shigeru,Okamoto",
                        "Shuji,Sato",
                        "Sumie,Shimaoka",
                        "Tatsuo,Shoji",
                        "Toshio,Tanida",
                        "Yasuaki,Tanikawa",
                        "Yataka,Yamanaka",
                        "Yoko,Yamashita",
                        "Yuzo,Yamazaki"
                ));
                break;
            }
            default: {
                russianSetOfNames.addAll(Arrays.asList(
                        "Anatoly,Andianov",
                        "Andrei,Belov",
                        "Astra,Chukarin",
                        "Boris,Gorokhova",
                        "Dmitriy,Kolotov",
                        "Galina,Korkia",
                        "Gennadi,Likhachev",
                        "Grigoriy,Maleev",
                        "Igor,Mikhailov",
                        "Ivan,Petrov",
                        "Leonid,Ragulin",
                        "Lyudmila,Romanov",
                        "Mikhail,Samusenko",
                        "Nikolai,Scharov",
                        "Olga,Shadrin",
                        "Sergei,Shalimov",
                        "Tatyana,Torban",
                        "Victor,Voronin",
                        "Vladimir,Yakubik",
                        "Yuri,Zhdanovich"
                ));
            }
        }
    }


    public static SoldierEntity addRookie(String nationality) {
        AddRandomSoldier addRandomSoldier=new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddRookie());
        return addRandomSoldier.add(nationality);
    }


    public static SoldierEntity addSquaddie(String nationality) {
        AddRandomSoldier addRandomSoldier=new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddSquaddie());
        return addRandomSoldier.add(nationality);
    }

    public static SoldierEntity addSergeant(String nationality) {
        AddRandomSoldier addRandomSoldier=new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddSergeant());
        return addRandomSoldier.add(nationality);
    }

    public static SoldierEntity addCaptain(String nationality) {
        AddRandomSoldier addRandomSoldier=new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddCaptain());
        return addRandomSoldier.add(nationality);
    }

    public static SoldierEntity addColonel(String nationality) {
        AddRandomSoldier addRandomSoldier=new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddColonel());
        return addRandomSoldier.add(nationality);
    }

    public static SoldierEntity addCommander(String nationality) {
        AddRandomSoldier addRandomSoldier=new AddRandomSoldier(nationality);
        addRandomSoldier.setSoldier(new AddCommander());
        return addRandomSoldier.add(nationality);
    }


    public static SoldierEntity addRandomSoldier(String rank) {
        SoldierEntity resultSoldier=null;
        SoldierEntity soldierEntity = new SoldierEntity();

        String[] names = {"us", "gb", "fr", "de", "jp", "ru"};

        Map<String, Integer> map = new HashMap<>();
        map.put("us", americanSetOfNames.size());
        map.put("gb", britishSetOfNames.size());
        map.put("fr", frenchSetOfNames.size());
        map.put("de", germanSetOfNames.size());
        map.put("jp", japaneseSetOfNames.size());
        map.put("ru", russianSetOfNames.size());
        int result = -1;
        String nationality = "";
        while (result < 0) {
            nationality = names[drawNumber(0, 5)];
            System.out.println("Selected nationality " + nationality);
            if (map.containsKey(nationality) && map.get(nationality) > 0) {
                map.replace(nationality, map.get(nationality) - 1);
                result = 0;
            }
            if (map.containsKey(nationality) && map.get(nationality) == 0) {
                map.remove(nationality);
            }

            if (map.size() == 0) {
                result = 1;
            }

        }

        if (result == 0) System.out.println("SUCCESS");
        if (result == 1) System.out.println("ALL ARE 0");
        if (result == 0) {
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
            resultSoldier=soldierEntity;
        }
        return resultSoldier;
    }
}