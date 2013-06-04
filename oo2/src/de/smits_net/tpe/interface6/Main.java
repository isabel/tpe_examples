/*
 * (c) 2010 Thomas Smits
 */
package de.smits_net.tpe.interface6;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a instanceof I1); // --> true
        System.out.println(a instanceof I2); // --> false
        System.out.println(b instanceof A);  // --> true
        System.out.println(b instanceof I1); // --> true
        System.out.println(b instanceof I2); // --> true

    }
}
