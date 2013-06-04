/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vererbung4;

public class Geschaeftsfuehrer extends Manager {
    public boolean prokura = true;

    public String getDetails() {
        return super.getDetails() +
            " und hat Prokura " + prokura;
    }
}
