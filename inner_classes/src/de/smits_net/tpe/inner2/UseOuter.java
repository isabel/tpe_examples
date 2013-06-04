/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner2;

public class UseOuter {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.testInner();

        Outer.Inner inner = outer.new Inner();
        inner.doSomething(10);
    }
}
