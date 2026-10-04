package squadron;

public class RustingHulks implements Squadron {
    public RustingHulks() {
    }

    public void configureBrute() {
        System.out.println("Rusting Hulks: configuring Brute mech.");
    }

    public void configureRanged() {
        System.out.println("Rusting Hulks: configuring Ranged mech.");
    }

    public void configureArtillery() {
        System.out.println("Rusting Hulks: configuring Artillery mech.");
    }

    public void configureScience() {
        System.out.println("Rusting Hulks: configuring Science mech.");
    }

    public String getBruteWeapon() {
        return "Aerial Bombs";
    }

    public String getRangedWeapon() {
        return "Rocket Artillery";
    }

    public String getArtilleryWeapon() {
        return "Storm Generator";
    }

    public String getScienceWeapon() {
        return "Repulse";
    }
}
