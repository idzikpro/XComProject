package pl.idzikpro.xcom.tools;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class ImageList {
    @Getter
    private static List<String> alienList = Arrays.asList(
            "celatid",
            "chryssalid",
            "cyberdisc",
            "ethereal",
            "floater",
            "muton",
            "reaper",
            "sectoid",
            "sectopod",
            "silacoid",
            "snakeman",
            "zombie"
    );

    @Getter
    private static List<String> armourList = Arrays.asList(
            "personal-armour",
            "power-suit",
            "flying-suit",
            "no-armour"
    );

    @Getter
    private static List<String> craftlist = Arrays.asList(
            "avenger-0",
            "avenger-1",
            "avenger-2",
            "avenger-3",
            "firestorm-3",
            "interceptor-3",
            "lightning-0",
            "lightning-1",
            "lightning-2",
            "lightning-3",
            "skyranger-0",
            "skyranger-1",
            "skyranger-2",
            "skyranger-3"
    );

    @Getter
    private static List<String> shipList = Arrays.asList(
            "abductor-0",
            "abductor-1",
            "abductor-2",
            "abductor-3",
            "battleship-0",
            "battleship-1",
            "battleship-2",
            "battleship-3",
            "harvester-0",
            "harvester-1",
            "harvester-2",
            "harvester-3",
            "large-scout-0",
            "large-scout-1",
            "large-scout-2",
            "large-scout-3",
            "medium-scout-0",
            "medium-scout-1",
            "medium-scout-2",
            "medium-scout-3",
            "small-scout-0",
            "small-scout-1",
            "small-scout-2",
            "small-scout-3",
            "supply-ship-0",
            "supply-ship-1",
            "supply-ship-2",
            "supply-ship-3",
            "terror-ship-0",
            "terror-ship-1",
            "terror-ship-2"
    );

    @Getter
    private static List<String> soldierList = Arrays.asList(
            "squaddie",
            "sergeant",
            "captain",
            "colonel",
            "commander",
            "rookie"
    );
}