/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz;

public class Puzzles {

    public static void main(String[] args) {

        {
            // Integer Division
            int i = 1;
            double d;

            d = i / 2;

            System.out.println(d);

            d = (double) i / 2;

            System.out.println(d);

            d = i / 2.0;

            System.out.println(d);
        }

        {
            // If und Zuweisung
            boolean b = false;

            if (b = true) {
                System.out.println("Oops");
            }
        }

        {
            // Case fallthru
            int x = 3;

            switch (x) {

            case 1:
                System.out.println("1");

            case 2:
                System.out.println("2");

            case 3:
                System.out.println("3");

            case 4:
                System.out.println("4");

            default:
                System.out.println("Passt nicht");
            }
        }

        {
            // Wetebreich
            byte b = 127;
            b++;

            System.out.println(b);
        }

        {
//            // Array-Indizes
//            int[] array = new int[5];
//
//            for (int i = 1; i < 6; i++) {
//                array[i] = i;
//            }
        }

        {
//            // Und / Oder ohne Kurzschluss
//            String s = null;
//
//            if ((s != null) & (s.length() > 0)) {
//                System.out.println(s.charAt(0));
//            }
        }
    }

    void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }

    void testSwap() {
        String a = "Hallo";
        String b = "Welt";
        swap(a, b);
        System.out.println(a + " " + b);
    }

    /* Swap funktioniert nicht :-(
    void methodeMitKommentaren() {
        // Erzeuge zwei Strings mit sinnvollem Inhalt
        String a = "Hallo";
        String b = "Welt";

        // Vertausche die Variablen
        swap(a, b);

        // Drucke Ergebnis aus
        System.out.println(a + " " + b);
    }
    */
}
