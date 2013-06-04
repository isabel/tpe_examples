/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner4;

import java.util.Arrays;
import java.util.Comparator;

public class Outer2 {

    private int i;

    public void sortSpecial(String[] strings) {

        final int k = 1;

        class DontCare implements Comparator {

            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                int result = s1.toUpperCase().compareTo(s2.toUpperCase());
                result = result * i * k;
                return result;
            }
        }

        Comparator c = new DontCare();

        Arrays.sort(strings, c);
    }
}
