/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.verdecken;

public class B extends A {
    public String i = "Ein String in B";

    public void doItNew() {
        System.out.println(i);
        System.out.println(super.i);
    }
}
