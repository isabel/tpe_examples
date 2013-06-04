/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.inner1;

public class Outer {

    private static int CONSTANT = 15;

    public static class Inner {

        public static final double PI = 3.14159265;

        public int doSomething(int i) {
            return i * CONSTANT;
        }
    }
}
