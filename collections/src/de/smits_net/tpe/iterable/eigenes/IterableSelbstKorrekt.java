/*
 *
 */
package de.smits_net.tpe.iterable.eigenes;

import java.util.Iterator;

public class IterableSelbstKorrekt implements Iterable<String>, Iterator<String> {

    private String[] stringListe;

    public IterableSelbstKorrekt(int size) {
        stringListe = new String[size];
    }

    private IterableSelbstKorrekt(String[] stringListe) {
        this.stringListe = stringListe;
    }

    public Iterator<String> iterator() {
        return new IterableSelbstKorrekt(stringListe);
    }

    public static void main(String[] args) {
        String[] strings = new String[] { "A", "B", "C", "D" };
        IterableSelbstKorrekt liste = new IterableSelbstKorrekt(strings);
        for (String string : liste) {
            System.out.println(string);
        }
    }

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
}

