/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.singleton;

public class Broken {

    private static Broken instanz;

    private Broken() {
        // Keine Instanzen!
    }

    public static Broken getInstance() {
        if (instanz == null) {
            synchronized (Broken.class) {
                if (instanz == null) {
                    instanz = new Broken();
                }
            }
        }

        return instanz;
    }
}
