/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.methoden;

public class Zusammenfasser2 {

    public static <T> SimpleStack<T> fasseZusammen(SimpleStack<T> s1, SimpleStack<T> s2) {

        SimpleStack<T> ergebnis = new SimpleStack<T>(s1.getSize() + s2.getSize());


        for (int i = s1.getSize(); i >= 0; i--) {
            ergebnis.push(s1.pop());
        }

        for (int i = s2.getSize(); i >= 0; i--) {
            ergebnis.push(s2.pop());
        }

        return ergebnis;
    }
}
