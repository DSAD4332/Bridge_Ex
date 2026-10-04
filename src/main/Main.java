import mech.ArtilleryMech;
import mech.BruteMech;
import mech.Mech;
import mech.RangedMech;
import squadron.FrozenTitans;
import squadron.HeatSinkers;
import squadron.RustingHulks;
import squadron.Squadron;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Squadron rustingHulks = new RustingHulks();
        Squadron frozenTitans = new FrozenTitans();
        Squadron heatSinkers = new HeatSinkers();
        Mech firstMech = new BruteMech(rustingHulks);
        Mech secondMech = new RangedMech(frozenTitans);
        Mech thirdMech = new ArtilleryMech(heatSinkers);
        PlayerSquad squad = new PlayerSquad(firstMech, secondMech, thirdMech);
        squad.deploySquad();
    }
}