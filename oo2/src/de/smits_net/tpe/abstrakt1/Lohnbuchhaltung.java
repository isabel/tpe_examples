/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.abstrakt1;

public class Lohnbuchhaltung {

    public void ueberweisung(Mitarbeiter[] mitarbeiter) {

        for (int i = 0; i < mitarbeiter.length; i++) {
            Mitarbeiter m = mitarbeiter[i];

            int zahlbetrag;

            if (m instanceof Arbeiter) {
                Arbeiter a = (Arbeiter) m;
                zahlbetrag = a.berechneZahlung();
            }
            else if (m instanceof Angestellter) {
                Angestellter a = (Angestellter) m;
                zahlbetrag = a.berechneZahlung();
            }
            else {
                System.out.println("Fehler");
            }

            // Zahlung durchf�hren

        }
    }
}
