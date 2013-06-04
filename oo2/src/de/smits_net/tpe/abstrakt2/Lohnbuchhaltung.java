/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.abstrakt2;

public class Lohnbuchhaltung {

    public void ueberweisung(Mitarbeiter[] mitarbeiter) {

        for (int i = 0; i < mitarbeiter.length; i++) {
            int zahlbetrag = mitarbeiter[i].berechneZahlung();
            // Zahlung durchf�hren
        }
    }
}
