/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.callback;

public class TestBerechnung {

    int k;

    private static int[][] zahlen = {{ 1,2 }, { 2,4 }};

    public static void main(String[] args) {

        int[] ergebnis;

        ergebnis = Berechnung.berechne(zahlen, new Funktion() {
            public int apply(int o1, int o2) {
                return o1 - o2;
            }
        });

        ergebnis = Berechnung.berechne(zahlen,  new Funktion() {
            public int apply(int o1, int o2) {
                return o1 + o2;
            }
        });
    }
}
