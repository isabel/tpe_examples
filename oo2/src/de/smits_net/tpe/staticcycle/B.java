/* (c) 2012 Thomas Smits */
package de.smits_net.tpe.staticcycle;

public class B {

    static A a;

    static {
        a = new A();
        System.out.println("static B");
    }

    B() {
        System.out.println("B():" + a);
    }
}
