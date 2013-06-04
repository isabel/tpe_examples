/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz.polymorphie;

class A {
    public void f() {
        System.out.println("A");
    }
}

class B extends A {
    public void f() {
        System.out.println("B");
    }
}

public class Polymorphie {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();

        a1.f();
        a2.f();
        b.f();
    }
}
