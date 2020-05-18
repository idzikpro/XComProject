package pl.idzikpro.xcom.service.aliens;

import pl.idzikpro.xcom.entity.AlienEntity;

public class AddRandomAlienByRank {
    private String rank;
    private AddAlienInterface alien;

    public void setAlien(AddAlienInterface alien) {
        this.alien = alien;
    }

    public AddRandomAlienByRank(String rank) {
        this.rank = rank;
    }

    public AlienEntity add() {
        return this.alien.add(rank);
    }
}