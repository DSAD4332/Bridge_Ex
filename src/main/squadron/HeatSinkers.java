package squadron;

public class HeatSinkers implements Squadron {
    public HeatSinkers() {
    }

    public void configureBrute() {
        System.out.println("Heat Sinkers: configuring Brute mech.");
    }

    public void configureRanged() {
        System.out.println("Heat Sinkers: configuring Ranged mech.");
    }

    public void configureArtillery() {
        System.out.println("Heat Sinkers: configuring Artillery mech.");
    }

    public void configureScience() {
        System.out.println("Heat Sinkers: configuring Science mech.");
    }

    public String getBruteWeapon() {
        return "Thermal Discharger";
    }

    public String getRangedWeapon() {
        return "Quick-Fire Rockets";
    }

    public String getArtilleryWeapon() {
        return "Firestorm Generator";
    }

    public String getScienceWeapon() {
        return "Heat Engines";
    }
}
