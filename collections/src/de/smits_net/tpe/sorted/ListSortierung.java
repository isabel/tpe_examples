/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ReverseComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;
    }
}

public class ListSortierung {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Seeler");
        list.add("Mueller");
        list.add("Zander");
        list.add("Beckenbauer");
        list.add("Schumacher");

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new ReverseComparator());
        System.out.println(list);

    }
}
