/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.statisch4;

public class Test {

    public static void main(String[] args) {
        A a1 = new A();
        B b = new B();
        A a2 = new B();
        a1.tuWas();
        b.tuWas();
        a2.tuWas();
    }
}
