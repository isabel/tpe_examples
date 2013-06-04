/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vererbung4;

import java.io.Serializable;

public class Manager extends Mitarbeiter {
    public String abteilung;

    public String getDetails() {
        return super.getDetails() +
                " und leitet die Abteilung " + abteilung;
    }
}
