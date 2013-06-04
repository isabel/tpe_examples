/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe.konstruktorprobleme;

public class A {

    protected String name;

    public A() {
        name =  getDetails();
    }

    protected String getDetails() {
        return "Hans";
    }
}
