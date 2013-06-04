/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.clone;

import java.util.Date;

public class Mitarbeiter implements Cloneable {
    public String name;
    public double gehalt;
    public Date geburtsdatum;

    public Mitarbeiter(String name, double gehalt, Date geburtsdatum) {
        this.name = name;
        this.gehalt = gehalt;
        this.geburtsdatum = geburtsdatum;
    }

    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cannot happen");
        }
    }
}
