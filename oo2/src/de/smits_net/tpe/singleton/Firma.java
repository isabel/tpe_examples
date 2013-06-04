/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.singleton;

public class Firma {

    private static final Firma instanz = new Firma();

    public static Firma getInstance() {
        return instanz;
    }

    private Firma() {
        // Keine Instanzen dieser Klasse!
    }
}
