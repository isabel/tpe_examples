/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.enumset;

import java.util.EnumSet;

public class EnumSetDemo {

    public static void main(String[] args) {
        EnumSet<Planet> planeten = EnumSet.allOf(Planet.class);
        System.out.println("allOf: " + planeten);

        EnumSet<Planet> dieAnderen = EnumSet.complementOf(EnumSet.of(Planet.ERDE));
        System.out.println("complementOf: " + dieAnderen);

        EnumSet<Planet> leer = EnumSet.noneOf(Planet.class);
        System.out.println("noneOf: " + leer);

        EnumSet<Planet> aeussere = EnumSet.range(Planet.MARS, Planet.NEPTUN);
        System.out.println("range: " + aeussere);
    }
}
