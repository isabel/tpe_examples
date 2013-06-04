/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.equals;

public class EqualsDemo {

    public static void main(String[] args) {
        MeinDatum d1 = new MeinDatum(5, 12, 2009);
        MeinDatum d2 = new MeinDatum(5, 12, 2009);
        MeinDatum d3 = new MeinDatum(3,  7, 1970);

        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));

        d2 = d1;

        System.out.println(d1 == d2);
    }
}
