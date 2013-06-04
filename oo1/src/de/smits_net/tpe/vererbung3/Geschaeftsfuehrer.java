/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vererbung3;

public class Geschaeftsfuehrer extends Manager {
    public boolean prokura = true;

    public String getDetails() {
        return name + ", geb. am " + geburtsdatum +
                " hat ein Gehalt von " + gehalt +
                " und leitet die Abteilung " + abteilung +
                " und hat Prokura " + prokura;
    }
}
