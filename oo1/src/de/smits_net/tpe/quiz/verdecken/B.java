/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.quiz.verdecken;

public class B extends A {

    private int j = 3000;

    public static void main(String[] args) {

        A a = new A();
        A b = new B();
        B b2 = new B();

        System.out.printf("%d %d %d%n", a.j, b.j, b2.j);
        a.f();
    }
}
