/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.abstrakt4;

public abstract class Mitarbeiter {

    public final double bonus() {
        return zielbonus() * zielerreichung();
    }

    public abstract double zielerreichung();
    public abstract double zielbonus();
}
