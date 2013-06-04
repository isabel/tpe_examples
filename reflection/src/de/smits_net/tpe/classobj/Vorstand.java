/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.classobj;

public class Vorstand extends Mitarbeiter {

    private double firmengewinn;

    public double zielbonus() {
        return 0.5*firmengewinn;
    }

    public double zielerreichung() {
        return 1.00;
    }
}
