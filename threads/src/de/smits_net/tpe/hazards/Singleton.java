/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.hazards;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
