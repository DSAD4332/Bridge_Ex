package mech;

import squadron.Squadron;

public class ScienceMech extends Mech {
    public ScienceMech(Squadron squadron) {
        super(squadron);
    }

    public void deploy() {
        System.out.println("Deploying Science Mech.");
        this.squadron.configureScience();
        System.out.println("Science Mech equipped with " + this.squadron.getScienceWeapon());
    }
}