/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.staticfactory;

public class Factory {

    public static Erzeugter create(int wert) {
        return new Erzeugter(wert);
    }
}
