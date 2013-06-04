/* (c) 2012 Thomas Smits */
package de.smits_net.tpe.staticcycle;

public class A {

    static B b;

    static {
        b = new B();
        System.out.println("static A");
    }

    A() {
        System.out.println("A():" + b);
    }
}
