/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.abstrakt4;

public class Angestellter extends Mitarbeiter {

    private double zielbonus = 1000.0;
    private double zielerreichung = 0.98;

    public double zielbonus() {
        return zielbonus;
    }

    public double zielerreichung() {
        return zielerreichung;
    }
}
