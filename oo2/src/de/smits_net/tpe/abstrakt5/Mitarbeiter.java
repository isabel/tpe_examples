/* (c) 2010 Thomas Smits */
package de.smits_net.tpe.abstrakt5;

import java.util.Date;

public abstract class Mitarbeiter {

    protected String name;
    protected double gehalt;
    protected Date geboren;

    public Mitarbeiter(String name, double gehalt, Date geboren) {
        this.name = name;
        this.gehalt = gehalt;
        this.geboren = geboren;
    }

    public Date getGeburtsdatum() {
        return geboren;
    }

    protected abstract int berechneZahlung();
}
