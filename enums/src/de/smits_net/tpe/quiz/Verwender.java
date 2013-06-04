/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz;

public class Verwender {

    public static void main(String[] args) {
        Geschlecht g1 = Geschlecht.valueOf("MAENNLICH");
        Geschlecht g2 = Geschlecht.values()[0];
        Geschlecht g3 = Geschlecht.MAENNLICH;

        System.out.println(g1 == g2);
        System.out.println(g1 == g3);
        System.out.println(g1.equals(g3));
    }
}
