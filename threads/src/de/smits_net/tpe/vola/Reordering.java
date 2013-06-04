/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.vola;

public class Reordering {

    public static void main(String[] args) {
        {
            int i, k, m;
            i = 15;
            i++;
            k = 18;
            k++;
            m = i + k;
        }
        {

            int i, k, m;
            k = 18;
            i = 15;
            k++;
            i++;
            m = i + k;

        }
    }
}
