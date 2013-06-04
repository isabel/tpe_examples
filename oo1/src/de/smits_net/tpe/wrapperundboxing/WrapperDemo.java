/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.wrapperundboxing;

public class WrapperDemo {

    public static void main(String[] args) {
        int i = 5;
        Integer i1 = new Integer(i);
        int j = i1.intValue();

        Integer i2 = Integer.valueOf("42");
        int i3 = Integer.parseInt("42");
    }
}
