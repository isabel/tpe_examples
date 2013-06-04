/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.inner1;

public class PrivaterZugriff {

    private static int a = 5;

    static class InnereKlasse {

        private static int b = 7;

        private static void innen() {
            b = a;
            aussen2();
        }
    }

    private static void aussen1() {
        InnereKlasse.innen();
    }

    private static void aussen2() {
        InnereKlasse.b = 17;
    }
}