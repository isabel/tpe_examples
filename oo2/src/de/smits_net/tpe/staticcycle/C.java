/* (c) 2012 Thomas Smits */
package de.smits_net.tpe.staticcycle;

public class C {

    public static void main(String[] args) throws Exception {
        System.out.println("main: A.b = " + A.b);
        System.out.println("main: B.a = " + B.a);
    }
}
