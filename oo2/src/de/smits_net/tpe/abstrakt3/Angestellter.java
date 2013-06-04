/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.abstrakt3;

public class Angestellter extends Mitarbeiter {

    private int monatsgehalt;

    public int berechneZahlung() {
        return monatsgehalt;
    }
}
