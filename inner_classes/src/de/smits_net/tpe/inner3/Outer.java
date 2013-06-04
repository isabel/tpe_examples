/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner3;

public class Outer {

    private int i;

    public void methode(int i) {

        final int j = 0;

        class Inner {
            private int k;

            public void doSomething(int i) {
                k = i + j + Outer.this.i;
            }
        }

        Inner inner = new Inner();
        inner.doSomething(i);
    }
}
