import mech.Mech;

public class PlayerSquad {
    private final Mech[] mechs;

    public PlayerSquad(Mech first, Mech second, Mech third) {
        this.mechs = new Mech[]{first, second, third};
    }

    public void deploySquad() {
        System.out.println("=== Deploying Player Squad ===");

        for(Mech mech : this.mechs) {
            mech.deploy();
        }

    }
}
