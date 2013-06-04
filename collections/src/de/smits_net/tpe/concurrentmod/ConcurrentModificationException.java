/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.concurrentmod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ConcurrentModificationException {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "A", "B", "C", "D", "E", "X", "F");

        for (String element : list) {
            if ("X".equals(element)) {
                list.remove(element);
            }
        }

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String element = it.next();

            if ("X".equals(element)) {
                it.remove();
            }
        }
    }
}
