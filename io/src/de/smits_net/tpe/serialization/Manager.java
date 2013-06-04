/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.serialization;

import java.io.Serializable;
import java.util.Date;

public class Manager extends Mitarbeiter implements Serializable {
    public String abteilung;

    public Manager(String name, double gehalt, Date geburtsdatum, String abteilung) {
        super(name, gehalt, geburtsdatum);
        this.abteilung = abteilung;
    }

    public String getDetails() {
        return super.getDetails() +
                " und leitet die Abteilung " + abteilung;
    }
}
