package squadron;

public interface Squadron {
    void configureBrute();

    void configureRanged();

    void configureArtillery();

    void configureScience();

    String getBruteWeapon();

    String getRangedWeapon();

    String getArtilleryWeapon();

    String getScienceWeapon();
}
