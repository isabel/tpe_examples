/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.singleton;

public class Firma2 {

    private static final Firma2 instanz;

    static {
        instanz = new Firma2();
    }

    public static Firma2 getInstance() {
        return instanz;
    }

    private Firma2() {
        // Keine Instanzen dieser Klasse!
    }
}
