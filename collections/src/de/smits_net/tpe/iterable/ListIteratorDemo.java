/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.iterable;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Eintrag 1");
        list.add("Eintrag 2");
        list.add("Eintrag 3");

        ListIterator<String> iterator = list.listIterator();

        iterator.next();
        iterator.next();
        iterator.previous();
        iterator.set("Neuer Eintrag 2");
        iterator.next();
        iterator.next();
        iterator.add("Neuer Eintrag 4");

        iterator = list.listIterator();

        for (String wert : list) {
            System.out.println(wert);
        }
    }
}
