/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.konstruktorprobleme;

public class B extends A {

    protected String info = "Eine Information";

    public B() {
    }

    protected String getDetails() {
        return name + info.length();
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getDetails());
    }
}
