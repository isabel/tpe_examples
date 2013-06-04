/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        list1.add("Element 1");
        list1.add("Element 2");
        list1.add("Element 3");
        list1.add("Element 4");

        System.out.println(list1.get(3)); // --> Element 4
        list1.remove(0);
        System.out.println(list1);  // --> [Element 2, Element 3, Element 4]

        list1.add(2, "Eigefuegt");
        System.out.println(list1);  // --> [Element 2, Element 3, Eigefuegt, Element 4]

        List<String> list2 = list1.subList(1, 3);
        System.out.println(list2);  // --> [Element 3, Eigefuegt]

        list2.set(1, "Ausgetauscht");
        System.out.println(list2);  // --> [Element 3, Ausgetauscht]

        list2.add(2, "Eingefuegt");
        System.out.println(list2);  // --> [Element 3, Ausgetauscht, Eingefuegt]

        System.out.println(list2.indexOf("Element 3"));  // --> 0



    }
}
