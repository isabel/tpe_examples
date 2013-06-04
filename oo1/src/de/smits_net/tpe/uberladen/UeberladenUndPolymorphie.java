/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.uberladen;

public class UeberladenUndPolymorphie {

    public void method(A a) {
        System.out.println("method(C a) gerufen");
    }

    public void method(B b) {
        System.out.println("method(B b) gerufen");
    }

    public static void main(String[] args) {
        UeberladenUndPolymorphie u = new UeberladenUndPolymorphie();

        A a1 = new A();
        A a2 = new B();

        u.method(a1);
        u.method(a2);
    }
}

class A {}
class B extends A {}
class C extends B {}
