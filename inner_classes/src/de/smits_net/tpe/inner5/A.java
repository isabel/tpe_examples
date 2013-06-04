/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner5;

public class A {

    private int i;
    private int j;

    private class B {
        private int i;
        private int j;

        private void methodB(String s) {
            i = A.this.i + A.this.j + j;
            methodA("Welt");
        }
    }

    private int methodA(String s) {
        B b = new B();
        b.i = 5;
        b.methodB("Hallo");
        return b.i + b.j;
    }
}