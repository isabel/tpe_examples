/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.wrapperundboxing;

public class BoxingFailure {

    public static boolean compare(Integer i1, Integer i2) {
        return i1 == i2;
    }

    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        System.out.println(i1 + " == " + i2 + " : " + compare(i1, i2));

        i1 = 2000;
        i2 = 2000;
        System.out.println(i1 + " == " + i2 + " : " + compare(i1, i2));
    }
}
