/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.verdecken;

public class A {
    public int i = 5;

    public void doIt() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.doIt();
        b.doIt();
        b.doItNew();
    }
}
