/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.iterable.eigenes;

import java.util.Iterator;

public class IterableInnereKlasse implements Iterable<String> {

    private String[] stringListe;

    public IterableInnereKlasse(String[] stringListe) {
        this.stringListe = stringListe;
    }

    public Iterator<String> iterator() {

        return new Iterator<String>() {
            private int pos = 0;

            public boolean hasNext() {
                return (pos < stringListe.length);
            }

            public String next() {
                return stringListe[pos++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        String[] strings = new String[] { "A", "B", "C", "D" };
        IterableInnereKlasse liste = new IterableInnereKlasse(strings);
        for (String string : liste) {
            System.out.println(string);
        }
    }
}

