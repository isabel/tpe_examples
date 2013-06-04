/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.abstrakt2;

public class Arbeiter extends Mitarbeiter {

    private int akkordlohn;
    private int grundlohn;
    private int akkordStueckzahl;

    public int berechneZahlung() {
        return grundlohn + akkordlohn * akkordStueckzahl;
    }
}
