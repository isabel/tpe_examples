/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.iterable;

import java.util.ArrayList;

public class IterableFor {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Eintrag 1");
        list.add("Eintrag 2");
        list.add("Eintrag 3");

        for (String wert : list) {
            System.out.println(wert);
        }
    }
}
