/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization;

import java.io.Serializable;
import java.util.Date;

public class Mitarbeiter  implements Serializable {

    public String name;
    public double gehalt;
    public Date geboren;

    public Mitarbeiter(String name, double gehalt, Date geboren) {
        this.name = name;
        this.gehalt = gehalt;
        this.geboren = geboren;
    }

    public Mitarbeiter(String name, double gehalt) {
        this(name, gehalt, null);
    }

    public Mitarbeiter(String name) {
        this(name, 0.0d, null);
    }
    /*
    public Mitarbeiter() {

    }
    */
    public String getDetails() {
        return name + ", geb. am " + geboren +
                " hat ein Gehalt von " + gehalt;
    }
}
