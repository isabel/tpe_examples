/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vererbung2;

import java.util.Date;

public class Mitarbeiter {
    public String name;
    public double gehalt;
    public Date geburtsdatum;

    public String getDetails() {
        return name + ", geb. am " + geburtsdatum +
                " hat ein Gehalt von " + gehalt;
    }
}
