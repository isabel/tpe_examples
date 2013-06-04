/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.sorted;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<String>();

        set.add("Seeler");
        set.add("Mueller");
        set.add("Zander");
        set.add("Beckenbauer");
        set.add("Schumacher");

        System.out.printf("Elemente: %s%n", set);
        System.out.printf("Erstes Element: %s%n", set.first());
        System.out.printf("Letztes Element: %s%n", set.last());


    }
}
