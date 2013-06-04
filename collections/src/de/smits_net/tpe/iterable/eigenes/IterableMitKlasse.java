/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.iterable.eigenes;

import java.util.Iterator;

public class IterableMitKlasse implements Iterable<String> {

    private String[] stringListe;

    public IterableMitKlasse(String[] stringListe) {
        this.stringListe = stringListe;
    }

    public Iterator<String> iterator() {
        return new MyIterator(stringListe);
    }

    public static void main(String[] args) {
        String[] strings = new String[] { "A", "B", "C", "D" };
        IterableMitKlasse liste = new IterableMitKlasse(strings);
        for (String string : liste) {
            System.out.println(string);
        }
    }
}

class MyIterator implements Iterator<String> {

    private int pos = 0;

    private String[] stringListe;

    public MyIterator(String[] stringListe) {
        this.stringListe = stringListe;
    }

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

