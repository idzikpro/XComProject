package pl.idzikpro.xcom.service.soldiers;

import pl.idzikpro.xcom.entity.SoldierEntity;

public class AddRandomSoldier {
    private String nationality;
    private AddSoldierInterface soldier;

    public AddRandomSoldier(String nationality) {
        this.nationality = nationality;
    }

    public void setSoldier(AddSoldierInterface soldier) {
        this.soldier = soldier;
    }
    public SoldierEntity add(String nationality){
        return this.soldier.add(nationality);
    }
}
