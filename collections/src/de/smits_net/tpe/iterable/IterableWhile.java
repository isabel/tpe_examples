/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableWhile {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Eintrag 1");
        list.add("Eintrag 2");
        list.add("Eintrag 3");

        Iterable<String> iterable = list;

        Iterator<String> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            String wert = iterator.next();
            System.out.println(wert);
        }
    }
}
