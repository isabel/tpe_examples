/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.classobj;


public class Manager extends Mitarbeiter {
    public String abteilung;

    @Override
    public String getDetails() {
        return super.getDetails() +
                " und leitet die Abteilung " + abteilung;
    }
}
