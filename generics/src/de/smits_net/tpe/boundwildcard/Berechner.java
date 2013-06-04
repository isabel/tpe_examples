/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.boundwildcard;

public class Berechner {

    public double berechneFlaeche(SimpleStack<? extends Form> formen) {

        double summe = 0;

        for (int i = formen.getSize(); i >= 0; i--) {
            summe += formen.pop().flaeche();
        }

        return summe;
    }
}
