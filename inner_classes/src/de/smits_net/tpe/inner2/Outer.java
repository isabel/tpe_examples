/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner2;

public class Outer {

    private int i = 0;
    private int j = 5;

    public class Inner {

        public int doSomething(int i) {
            Outer.this.i += i;
            j++;
            return Outer.this.i;
        }
    }

    public void testInner() {
        Inner inner = new Inner();
        inner.doSomething(5);
    }
}
