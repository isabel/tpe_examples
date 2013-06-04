/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner1;

public class UseOuter {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.doSomething(15);
        double a = 2 * Outer.Inner.PI * 5.0 * 5.0;
    }
}
