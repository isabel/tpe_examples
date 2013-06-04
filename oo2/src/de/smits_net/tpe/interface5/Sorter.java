/* (c) 2011 Thomas Smits */
package de.smits_net.tpe.interface5;

import java.util.Arrays;

public class Sorter {

    public static void main(String[] args) {
        Telefonnummer[] nummern = {
                new Telefonnummer(6221, 72643),
                new Telefonnummer(7262, 5558912),
                new Telefonnummer(6221, 71263),
                new Telefonnummer(7261, 5558912) };

        Arrays.sort(nummern);

        System.out.println(Arrays.asList(nummern).toString());
    }
}
