package pl.idzikpro.xcom.service.craft;

import pl.idzikpro.xcom.entity.CraftEntity;

public class AddCraft {
    private AddCraftInterface craft;

    public void setCraft(AddCraftInterface craft) {
        this.craft = craft;
    }

    public AddCraft() {
    }

    public CraftEntity add() {
        return this.craft.add();
    }
}
