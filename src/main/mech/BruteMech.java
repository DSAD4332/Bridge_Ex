package mech;

import squadron.Squadron;

public class BruteMech extends Mech {
    public BruteMech(Squadron squadron) {
        super(squadron);
    }

    public void deploy() {
        System.out.println("Deploying Brute Mech.");
        this.squadron.configureBrute();
        System.out.println("Brute Mech equipped with " + this.squadron.getBruteWeapon());
    }
}