/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.mitkonstruktor;

public class Ausgabe {

    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("%s -> %,.0f km/h%n",
                    planet.name(), planet.bahngeschwindigkeit());
        }
    }
}
