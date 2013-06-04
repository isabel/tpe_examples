/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Element A");
        list.add("Element B");
        list.add("Element C");
        list.add("Element A");
        list.add("Element B");

        for (String element : list) {
            System.out.println(element);
        }
    }
}
