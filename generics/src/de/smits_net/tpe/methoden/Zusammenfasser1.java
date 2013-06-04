/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.methoden;

public class Zusammenfasser1 {

    public static SimpleStack fasseZusammen(SimpleStack s1, SimpleStack s2) {

        SimpleStack ergebnis = new SimpleStack(s1.getSize() + s2.getSize());


        for (int i = s1.getSize(); i >= 0; i--) {
            ergebnis.push(s1.pop());
        }

        for (int i = s2.getSize(); i >= 0; i--) {
            ergebnis.push(s2.pop());
        }

        return ergebnis;
    }
}
