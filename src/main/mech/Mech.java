package mech;

import squadron.Squadron;

public abstract class Mech {
    protected Squadron squadron;

    public Mech(Squadron squadron) {
        this.squadron = squadron;
    }

    public abstract void deploy();
}
