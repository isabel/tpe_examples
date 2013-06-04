/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner6;

public class A {

    private int i;
    private int j;

    public A() {}

    private int methodA(String s) {
        A$B b = new A$B(this);      // B b = new B();
        A$B.access$0(b, 5);       // b.i = 5;
        A$B.access$1(b, "Hallo"); // b.methodB("Hallo");
        return A$B.access$2(b) + A$B.access$3(b); // return b.i + b.j;
    }

    static int access$0(A a) { return a.i; }
    static int access$1(A a) { return a.j; }
    static int access$2(A a, String s) { return a.methodA(s); }
}