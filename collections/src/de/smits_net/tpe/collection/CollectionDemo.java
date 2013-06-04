/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {

    public static void main(String[] args) {

        Collection<String> col1 = new ArrayList<String>();

        col1.add("Element 1");
        col1.add("Element 2");
        col1.add("Element 3");
        col1.add("Element 4");

        System.out.println(col1.size());  // --> 4
        System.out.println(col1.contains("Element 3"));  // --> true

        col1.remove("Element 3");

        System.out.println(col1.size());  // --> 3

        Collection<String> col2 = new ArrayList<String>();

        col2.addAll(col1);

        System.out.println(col2); // --> [Element 1, Element 2, Element 4]

        col1.clear();
        System.out.println(col1.size());  // --> 0

        col1.add("Element 2");
        col2.removeAll(col1);

        System.out.println(col2); // --> [Element 1, Element 4]

        String[] str1 = new String[col1.size()];
        str1 = col1.toArray(str1);

        String[] str2 = col2.toArray(new String[0]);

        System.out.println(Arrays.asList(str1)); // --> [Element 2]
        System.out.println(Arrays.asList(str2)); // --> [Element 1, Element 4]




    }
}
