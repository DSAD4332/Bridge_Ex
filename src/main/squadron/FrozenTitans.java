package squadron;

public class FrozenTitans implements Squadron {
    public FrozenTitans() {
    }

    public void configureBrute() {
        System.out.println("Frozen Titans: configuring Brute mech.");
    }

    public void configureRanged() {
        System.out.println("Frozen Titans: configuring Ranged mech.");
    }

    public void configureArtillery() {
        System.out.println("Frozen Titans: configuring Artillery mech.");
    }

    public void configureScience() {
        System.out.println("Frozen Titans: configuring Science mech.");
    }

    public String getBruteWeapon() {
        return "Spartan Shield";
    }

    public String getRangedWeapon() {
        return "Janus Cannon";
    }

    public String getArtilleryWeapon() {
        return "Cryo-Launcher";
    }

    public String getScienceWeapon() {
        return "Electric Whip";
    }
}