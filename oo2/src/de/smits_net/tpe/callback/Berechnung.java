/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.callback;

public class Berechnung {

    public static int berechne(int input1, int input2, Funktion funktion) {
        int ergebnis = funktion.apply(input1, input2);
        return ergebnis;
    }

    public static void main(String[] args) {
        Funktion sub = new Subtraktion();
        Funktion add = new Addition();

        System.out.println(berechne(5, 3, sub));
        System.out.println(berechne(1, 7, add));
    }
}
