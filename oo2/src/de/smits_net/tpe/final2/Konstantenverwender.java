/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.final2;

import java.util.Arrays;

public class Konstantenverwender {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Konstanten.PRIMZAHLEN));
        Konstanten.PRIMZAHLEN[2] = 8;
        System.out.println(Arrays.toString(Konstanten.PRIMZAHLEN));
    }
}
