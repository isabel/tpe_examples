/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.enummethoden;

public class Verwender {

    public static void main(String[] args) {
        String name = Planet.ERDE.name();
        Planet planet = Planet.valueOf(name);
        System.out.printf("Wir leben auf der %s, sie ist " +
        		"der %d Planet%n", planet, planet.ordinal() + 1);

        System.out.printf("Wir haben %d Planeten im Sonnensystem%n",
                Planet.values().length);
    }
}
