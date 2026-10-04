package mech;

import squadron.Squadron;

public class ArtilleryMech extends Mech {
    public ArtilleryMech(Squadron squadron) {
        super(squadron);
    }

    public void deploy() {
        System.out.println("Deploying Artillery Mech.");
        this.squadron.configureArtillery();
        System.out.println("Artillery mech equipped with " + this.squadron.getArtilleryWeapon());
    }
}
