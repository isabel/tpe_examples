/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

class A {
    static int wert = 5;
}

class B extends X {
    static int wert = 6;
}

public class C {
    void method(X a) {
        // System.out.println(a.wert);
    }

    public static void main(String[] args) {
        new C().method(new B());
        System.out.print((int) 1.5f);
    }
}