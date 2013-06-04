/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.callback;

public class Berechnung {

    private static int[][] zahlen = {{ 1,2 }, { 2,4 }};

    public static int[] berechne(int[][] input, Funktion funktion) {

        int[] ergebnis = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            ergebnis[i] = funktion.apply(input[i][0], input[i][1]);
        }

        return ergebnis;
    }

    public static void main(String[] args) {
        int[] ergebnis;
        ergebnis = berechne(zahlen, new Subtraktion());
        ergebnis = berechne(zahlen, new Addition());
    }
}
