/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("Element A");
        set.add("Element B");
        set.add("Element C");
        set.add("Element A");
        set.add("Element B");

        for (String element : set) {
            System.out.println(element);
        }
    }
}
