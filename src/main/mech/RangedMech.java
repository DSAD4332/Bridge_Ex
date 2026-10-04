package mech;

import squadron.Squadron;

public class RangedMech extends Mech {
    public RangedMech(Squadron squadron) {
        super(squadron);
    }

    public void deploy() {
        System.out.println("Deploying Ranged Mech.");
        this.squadron.configureRanged();
        System.out.println("Ranged Mech equipped with " + this.squadron.getRangedWeapon());
    }
}
