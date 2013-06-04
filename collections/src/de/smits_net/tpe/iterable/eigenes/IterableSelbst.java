/*
 *
 */
package de.smits_net.tpe.iterable.eigenes;

import java.util.Iterator;

public class IterableSelbst implements Iterable<String>, Iterator<String> {

    private String[] stringListe;

    public IterableSelbst(String[] stringListe) {
        this.stringListe = stringListe;
    }

    public Iterator<String> iterator() {
        return this;
    }

    public static void main(String[] args) {
        String[] strings = new String[] { "A", "B", "C", "D" };
        IterableSelbst liste = new IterableSelbst(strings);
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

