package pl.idzikpro.xcom.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.idzikpro.xcom.entity.SoldierEntity;
import pl.idzikpro.xcom.repository.SoldierRepository;
import pl.idzikpro.xcom.stats.soldier.*;

import java.util.*;

@Service
public class SoldierService {
    @Autowired
    SoldierRepository soldierRepository;

    static Random random = new Random();
    static List<String> americanSetOfNames = new ArrayList<>();
    static List<String> britishSetOfNames = new ArrayList<>();
    static List<String> frenchSetOfNames = new ArrayList<>();
    static List<String> germanSetOfNames = new ArrayList<>();
    static List<String> japaneseSetOfNames = new ArrayList<>();
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
        String name = selectRandomName(nationality);
        String myRank = "rookie";
        int timeUnits = drawNumber(RookieStats.TIME_UNITS_MIN, RookieStats.TIME_UNITS_MAX);
        int energy = drawNumber(RookieStats.ENERGY_MIN, RookieStats.ENERGY_MAX);
        int health = drawNumber(RookieStats.HEALTH_MIN, RookieStats.HEALTH_MAX);
        int bravery = drawNumber(RookieStats.BRAVERY_MIN, RookieStats.BRAVERY_MAX);
        int reactions = drawNumber(RookieStats.REACTIONS_MIN, RookieStats.REACTIONS_MAX);
        int firingAccuracy = drawNumber(RookieStats.FIRING_ACCURACY_MIN, RookieStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy = drawNumber(RookieStats.THROWING_ACCURACY_MIN, RookieStats.THROWING_ACCURACY_MAX);
        int strength = drawNumber(RookieStats.STRENGTH_MIN, RookieStats.STRENGTH_MAX);
        int psiSkill = drawNumber(RookieStats.PSI_SKILL_MIN, RookieStats.PSI_SKILL_MAX);
        int psiStrength = drawNumber(RookieStats.PSI_STRENGTH_MIN, RookieStats.PSI_STRENGTH_MAX);
        int meleeAccuracy = drawNumber(RookieStats.MELEE_ACCURACY_MIN, RookieStats.MELEE_ACCURACY_MAX);
        int missions = drawNumber(RookieStats.MISSIONS_MIN, RookieStats.MISSIONS_MAX);
        int killed = drawNumber(RookieStats.KILLED_MIN, RookieStats.KILLED_MAX);
        String armourType = "no-armour";
        String picture = "no-armour";

        SoldierEntity soldierEntity = SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits).nationality(nationality)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }


    public static SoldierEntity addSquaddie(String nationality) {
        String name = selectRandomName(nationality);
        String myRank = "squaddie";
        int timeUnits = drawNumber(SquaddieStats.TIME_UNITS_MIN, SquaddieStats.TIME_UNITS_MAX);
        int energy = drawNumber(SquaddieStats.ENERGY_MIN, SquaddieStats.ENERGY_MAX);
        int health = drawNumber(SquaddieStats.HEALTH_MIN, SquaddieStats.HEALTH_MAX);
        int bravery = drawNumber(SquaddieStats.BRAVERY_MIN, SquaddieStats.BRAVERY_MAX);
        int reactions = drawNumber(SquaddieStats.REACTIONS_MIN, SquaddieStats.REACTIONS_MAX);
        int firingAccuracy = drawNumber(SquaddieStats.FIRING_ACCURACY_MIN, SquaddieStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy = drawNumber(SquaddieStats.THROWING_ACCURACY_MIN, SquaddieStats.THROWING_ACCURACY_MAX);
        int strength = drawNumber(SquaddieStats.STRENGTH_MIN, SquaddieStats.STRENGTH_MAX);
        int psiSkill = drawNumber(SquaddieStats.PSI_SKILL_MIN, SquaddieStats.PSI_SKILL_MAX);
        int psiStrength = drawNumber(SquaddieStats.PSI_STRENGTH_MIN, SquaddieStats.PSI_STRENGTH_MAX);
        int meleeAccuracy = drawNumber(SquaddieStats.MELEE_ACCURACY_MIN, SquaddieStats.MELEE_ACCURACY_MAX);
        int missions = drawNumber(SquaddieStats.MISSIONS_MIN, SquaddieStats.MISSIONS_MAX);
        int killed = drawNumber(SquaddieStats.KILLED_MIN, SquaddieStats.KILLED_MAX);
        String armourType = "no-armour";
        String picture = "no-armour";

        SoldierEntity soldierEntity = SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits).nationality(nationality)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }

    public static SoldierEntity addSergeant(String nationality) {
        String name = selectRandomName(nationality);
        String myRank = "sergeant";
        int timeUnits = drawNumber(SergeantStats.TIME_UNITS_MIN, SergeantStats.TIME_UNITS_MAX);
        int energy = drawNumber(SergeantStats.ENERGY_MIN, SergeantStats.ENERGY_MAX);
        int health = drawNumber(SergeantStats.HEALTH_MIN, SergeantStats.HEALTH_MAX);
        int bravery = drawNumber(SergeantStats.BRAVERY_MIN, SergeantStats.BRAVERY_MAX);
        int reactions = drawNumber(SergeantStats.REACTIONS_MIN, SergeantStats.REACTIONS_MAX);
        int firingAccuracy = drawNumber(SergeantStats.FIRING_ACCURACY_MIN, SergeantStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy = drawNumber(SergeantStats.THROWING_ACCURACY_MIN, SergeantStats.THROWING_ACCURACY_MAX);
        int strength = drawNumber(SergeantStats.STRENGTH_MIN, SergeantStats.STRENGTH_MAX);
        int psiSkill = drawNumber(SergeantStats.PSI_SKILL_MIN, SergeantStats.PSI_SKILL_MAX);
        int psiStrength = drawNumber(SergeantStats.PSI_STRENGTH_MIN, SergeantStats.PSI_STRENGTH_MAX);
        int meleeAccuracy = drawNumber(SergeantStats.MELEE_ACCURACY_MIN, SergeantStats.MELEE_ACCURACY_MAX);
        int missions = drawNumber(SergeantStats.MISSIONS_MIN, SergeantStats.MISSIONS_MAX);
        int killed = drawNumber(SergeantStats.KILLED_MIN, SergeantStats.KILLED_MAX);
        String armourType = "personal armour";
        String picture = "personal armour";

        SoldierEntity soldierEntity = SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits).nationality(nationality)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }

    public static SoldierEntity addCaptain(String nationality) {
        String name = selectRandomName(nationality);
        String myRank = "captain";
        int timeUnits = drawNumber(CaptainStats.TIME_UNITS_MIN, CaptainStats.TIME_UNITS_MAX);
        int energy = drawNumber(CaptainStats.ENERGY_MIN, CaptainStats.ENERGY_MAX);
        int health = drawNumber(CaptainStats.HEALTH_MIN, CaptainStats.HEALTH_MAX);
        int bravery = drawNumber(CaptainStats.BRAVERY_MIN, CaptainStats.BRAVERY_MAX);
        int reactions = drawNumber(CaptainStats.REACTIONS_MIN, CaptainStats.REACTIONS_MAX);
        int firingAccuracy = drawNumber(CaptainStats.FIRING_ACCURACY_MIN, CaptainStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy = drawNumber(CaptainStats.THROWING_ACCURACY_MIN, CaptainStats.THROWING_ACCURACY_MAX);
        int strength = drawNumber(CaptainStats.STRENGTH_MIN, CaptainStats.STRENGTH_MAX);
        int psiSkill = drawNumber(CaptainStats.PSI_SKILL_MIN, CaptainStats.PSI_SKILL_MAX);
        int psiStrength = drawNumber(CaptainStats.PSI_STRENGTH_MIN, CaptainStats.PSI_STRENGTH_MAX);
        int meleeAccuracy = drawNumber(CaptainStats.MELEE_ACCURACY_MIN, CaptainStats.MELEE_ACCURACY_MAX);
        int missions = drawNumber(CaptainStats.MISSIONS_MIN, CaptainStats.MISSIONS_MAX);
        int killed = drawNumber(CaptainStats.KILLED_MIN, CaptainStats.KILLED_MAX);
        String armourType = "power suit";
        String picture = "power suit";

        SoldierEntity soldierEntity = SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits).nationality(nationality)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }

    public static SoldierEntity addColonel(String nationality) {
        String name = selectRandomName(nationality);
        String myRank = "colonel";
        int timeUnits = drawNumber(ColonelStats.TIME_UNITS_MIN, ColonelStats.TIME_UNITS_MAX);
        int energy = drawNumber(ColonelStats.ENERGY_MIN, ColonelStats.ENERGY_MAX);
        int health = drawNumber(ColonelStats.HEALTH_MIN, ColonelStats.HEALTH_MAX);
        int bravery = drawNumber(ColonelStats.BRAVERY_MIN, ColonelStats.BRAVERY_MAX);
        int reactions = drawNumber(ColonelStats.REACTIONS_MIN, ColonelStats.REACTIONS_MAX);
        int firingAccuracy = drawNumber(ColonelStats.FIRING_ACCURACY_MIN, ColonelStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy = drawNumber(ColonelStats.THROWING_ACCURACY_MIN, ColonelStats.THROWING_ACCURACY_MAX);
        int strength = drawNumber(ColonelStats.STRENGTH_MIN, ColonelStats.STRENGTH_MAX);
        int psiSkill = drawNumber(ColonelStats.PSI_SKILL_MIN, ColonelStats.PSI_SKILL_MAX);
        int psiStrength = drawNumber(ColonelStats.PSI_STRENGTH_MIN, ColonelStats.PSI_STRENGTH_MAX);
        int meleeAccuracy = drawNumber(ColonelStats.MELEE_ACCURACY_MIN, ColonelStats.MELEE_ACCURACY_MAX);
        int missions = drawNumber(ColonelStats.MISSIONS_MIN, ColonelStats.MISSIONS_MAX);
        int killed = drawNumber(ColonelStats.KILLED_MIN, ColonelStats.KILLED_MAX);
        String armourType = "flying suit";
        String picture = "flying suit";

        SoldierEntity soldierEntity = SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits).nationality(nationality)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
    }

    public static SoldierEntity addCommander(String nationality) {
        String name = selectRandomName(nationality);
        String myRank = "commander";
        int timeUnits = drawNumber(CommanderStats.TIME_UNITS_MIN, CommanderStats.TIME_UNITS_MAX);
        int energy = drawNumber(CommanderStats.ENERGY_MIN, CommanderStats.ENERGY_MAX);
        int health = drawNumber(CommanderStats.HEALTH_MIN, CommanderStats.HEALTH_MAX);
        int bravery = drawNumber(CommanderStats.BRAVERY_MIN, CommanderStats.BRAVERY_MAX);
        int reactions = drawNumber(CommanderStats.REACTIONS_MIN, CommanderStats.REACTIONS_MAX);
        int firingAccuracy = drawNumber(CommanderStats.FIRING_ACCURACY_MIN, CommanderStats.FIRING_ACCURACY_MAX);
        int throwingAccuracy = drawNumber(CommanderStats.THROWING_ACCURACY_MIN, CommanderStats.THROWING_ACCURACY_MAX);
        int strength = drawNumber(CommanderStats.STRENGTH_MIN, CommanderStats.STRENGTH_MAX);
        int psiSkill = drawNumber(CommanderStats.PSI_SKILL_MIN, CommanderStats.PSI_SKILL_MAX);
        int psiStrength = drawNumber(CommanderStats.PSI_STRENGTH_MIN, CommanderStats.PSI_STRENGTH_MAX);
        int meleeAccuracy = drawNumber(CommanderStats.MELEE_ACCURACY_MIN, CommanderStats.MELEE_ACCURACY_MAX);
        int missions = drawNumber(CommanderStats.MISSIONS_MIN, CommanderStats.MISSIONS_MAX);
        int killed = drawNumber(CommanderStats.KILLED_MIN, CommanderStats.KILLED_MAX);
        String armourType = "flying suit";
        String picture = "flying suit";

        SoldierEntity soldierEntity = SoldierEntity.builder()
                .name(name).rank(myRank).timeUnits(timeUnits).nationality(nationality)
                .energy(energy).health(health).bravery(bravery).reactions(reactions)
                .firingAccuracy(firingAccuracy).throwingAccuracy(throwingAccuracy)
                .strength(strength).psiSkill(psiSkill).psiStrength(psiStrength)
                .meleeAccuracy(meleeAccuracy).armourType(armourType)
                .missions(missions).killed(killed).picture(picture)
                .build();
        return soldierEntity;
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

    public static List<String> getAmericanSetOfNames() {
        return americanSetOfNames;
    }

    public static List<String> getBritishSetOfNames() {
        return britishSetOfNames;
    }

    public static List<String> getFrenchSetOfNames() {
        return frenchSetOfNames;
    }

    public static List<String> getGermanSetOfNames() {
        return germanSetOfNames;
    }

    public static List<String> getJapaneseSetOfNames() {
        return japaneseSetOfNames;
    }

    public static List<String> getRussianSetOfNames() {
        return russianSetOfNames;
    }
}